package com.javacto.action;

import com.javacto.po.StoreFront;
import com.javacto.service.StoreFrontSevice;
import com.javacto.service.impl.StoreFrontSevicelmpl;
import com.javacto.utils.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 店面分类
 */
@WebServlet("/sbqAction.do")
public class FrontAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 定义输出
        PrintWriter out = resp.getWriter();
        //创建对象
        StoreFrontSevice storeFrontSevice = new StoreFrontSevicelmpl();
        PageInfo pageInfo = new PageInfo();
        //获取当前页
        String curPageNoStr = req.getParameter("curPageNo");
        Integer curPageNo=1;//当前页默认设置为1
        if(null!=curPageNoStr){
            curPageNo=Integer.parseInt(curPageNoStr);
        }
        //查询总条数
        int totalCount = storeFrontSevice.getTotalCount(null);
        //再把 totalCount 存入  PageInfo对象
        pageInfo.setTotalCount(totalCount);
        pageInfo.setCurPageNo(curPageNo);
        pageInfo.setPageSize(5);

        //分页查询
        List<StoreFront> list = storeFrontSevice.frontPage(pageInfo, null);
        //必需要存
        req.setAttribute("sbqlist",list);
        // 必需把  pageInfo 存入到HttpServletRequest  因为页面需要获取这个值
        req.setAttribute("sbqPage",pageInfo);

        //跳转
        req.getRequestDispatcher("/meishi-con.jsp").forward(req,resp);

    }
}
