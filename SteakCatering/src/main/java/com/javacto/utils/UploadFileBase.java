package com.javacto.utils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CZQ
 * @date 2021-01-04 17:42
 * Description：
 **/
public class UploadFileBase {

    public static Map<String, String> getSavePath(HttpServletRequest req) {
        // 创建map集合
        Map<String, String> map = new HashMap<String, String>();

        // 1.得到上传文件的保存目录
        String savePath = req.getServletContext().getRealPath("upload");

        // 2.创建File对象，并传递路径
        File file = new File(savePath);
        // 判断路径是否存在
        if (!file.exists()){
            // 不存在，创建
            file.mkdirs();
        }

        // 3.创建一个工厂类的实例
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 4.创建一个解析器
        ServletFileUpload sfu = new ServletFileUpload(factory);

        // 5.FileItem对象，一个表单域的数据对应于一个FileItem对象
        List<FileItem> items = null;
        try {
            // 6.使用解析器解析
            items = sfu.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        // 7.判断是否有上传的数据
        if (items!=null && items.size()>0){
            // 8.遍历items集合
            for (int i=0; i<items.size(); i++){
                FileItem item = items.get(i);

                // 读取表单域中的数据时，要区分表单域的类型
                if (item.isFormField()){
                    // 解决中文乱码问题
                    String name = item.getFieldName();
                    String value = null;
                    try {
                        value = item.getString("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    // 存入集合中
                    map.put(name, value);
                }else {
                    // 获取文件名
                    String fileName = item.getName();
                    // 由于浏览器的不同，获取的文件名的前缀可能不一致，需要处理一下
                    fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);

                    // 获取文件名，不包含后缀
                    String name  = fileName.substring(0, fileName.lastIndexOf("."));
                    // 获取文件后缀
                    String extension = fileName.substring(fileName.lastIndexOf("."));

                    // 重构文件名，文件名加上上传时的时间，解决文件上传覆盖
                    fileName = name + System.currentTimeMillis() + extension;
                    // 把文件名存入集合中
                    map.put(item.getFieldName(), fileName);

                    // 写入
                    File fileUpload = new File(savePath + "\\" + fileName);
                    try {
                        item.write(fileUpload);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return map;
    }

}
