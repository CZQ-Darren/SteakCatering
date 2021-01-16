package com.javacto.action;

import com.javacto.po.Store;
import com.javacto.po.StoreCategory;
import com.javacto.service.StoreCategoryService;
import com.javacto.service.StoreService;
import com.javacto.service.impl.StoreCategoryServiceImpl;
import com.javacto.service.impl.StoreServiceImpl;
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
 * @author CZQ
 * @date 2021-01-15 20:55
 * Description：
 **/
@WebServlet(urlPatterns = "*.ss")
public class StoreAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理编码问题
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 定义输出
        PrintWriter out = resp.getWriter();

        // 定义url
        String storePageQueryUrl = "storePageQuery";
        String findStoreByIdUrl = "findStoreById";
        String findStoreByNameUrl = "findStoreByName";

        // 获取uri
        String uri = req.getRequestURI();
        // 截取url
        String url = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));

        // 创建分页对象
        PageInfo pageInfo = new PageInfo();
        // 创建store业务层对象
        StoreService storeService = new StoreServiceImpl();
        // 创建storeCategory业务层对象
        StoreCategoryService storeCategoryService = new StoreCategoryServiceImpl();

        if (storePageQueryUrl.equals(url)){
            /**
             * 分页查询店面
             */

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            //查询总条数
            int totalCount = storeService.getTotalCount(null);

            // 设置当前页
            pageInfo.setCurPageNo(curPageNo);
            // 设置每页显示6条数据
            pageInfo.setPageSize(6);
            // 设置总条数
            pageInfo.setTotalCount(totalCount);

            // 查询全部店面
            List<Store> storeList = storeService.storeQueryAll(null);
            // 查询全部店面分类
            List<StoreCategory> storeCategoryList = storeCategoryService.storeCategoryQueryAll(null);
            // 分页查询店面
            List<Store> storePageQueryList = storeService.storePageQuery(pageInfo, null);

            // 遍历storeList，分隔出img
            for (Store s : storeList){
                String img = s.getSsImg().substring(0, s.getSsImg().lastIndexOf("%分隔%"));
                s.setSsImg(img);
            }
            // 遍历storePageQueryList，分隔出img
            for (Store s : storePageQueryList){
                String img = s.getSsImg().substring(0, s.getSsImg().lastIndexOf("%分隔%"));
                s.setSsImg(img);
            }

            // 存入req对象中
            req.setAttribute("pageInfo", pageInfo);
            req.setAttribute("storeList", storeList);
            req.setAttribute("storeCategoryList", storeCategoryList);
            req.setAttribute("storePageQueryList", storePageQueryList);

            // 转发
            req.getRequestDispatcher("/shop.jsp").forward(req, resp);

        }else if (findStoreByIdUrl.equals(url)){
            /**
             * 根据id查询店面
             */

            // 获取店面id
            String storeIdStr = req.getParameter("storeId");
            // 默认设置店面id为1
            int storeId = 1;
            if (!"".equals(storeIdStr) && storeIdStr!=null){
                storeId = Integer.parseInt(storeIdStr);
            }

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 默认设置当前页为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            // 根据id查询
            Store store = storeService.findStoreById(storeId);

            // 分隔出img
            String img = store.getSsImg().substring(store.getSsImg().lastIndexOf("%分隔%")+4);
            store.setSsImg(img);

            // 分隔出content
            String[] storeContent = store.getSsContent().split("%分隔%");

            // 存入req对象中
            req.setAttribute("store", store);
            req.setAttribute("storeContent", storeContent);
            req.setAttribute("curPageNo", curPageNo);

            // 转发
            req.getRequestDispatcher("/shop-con.jsp").forward(req, resp);

        }else if (findStoreByNameUrl.equals(url)){
            /**
             * 根据name查询店面
             */

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }
            // 获取name
            String storeName = req.getParameter("storeName");

            // 创建store对象
            Store store = new Store();
            // 设置name
            store.setSsStoreName(storeName);

            //查询总条数
            int totalCount = storeService.getFindTotalCount(store);

            // 设置当前页
            pageInfo.setCurPageNo(curPageNo);
            // 设置每页显示6条数据
            pageInfo.setPageSize(6);
            // 设置总条数
            pageInfo.setTotalCount(totalCount);

            // 根据name查询
            List<Store> storeFindList = storeService.findStoreByName(pageInfo, store);

            // 遍历storeList，分隔出img
            for (Store s : storeFindList){
                String img = s.getSsImg().substring(0, s.getSsImg().lastIndexOf("%分隔%"));
                s.setSsImg(img);
            }

            // 存入req对象中
            req.setAttribute("storeName", storeName);
            req.setAttribute("pageInfo", pageInfo);
            req.setAttribute("storeFindList", storeFindList);

            // 转发
            req.getRequestDispatcher("/shop-find.jsp").forward(req, resp);

        }
    }

}
