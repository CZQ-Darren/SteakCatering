package com.javacto.action;

import com.javacto.po.News;
import com.javacto.service.NewsService;
import com.javacto.service.impl.NewsServiceImpl;
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
 * @date 2021-01-09 14:32
 * Description：
 **/
@WebServlet(urlPatterns = "*.sn")
public class NewsAction extends HttpServlet {

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
        String newsPageQueryUrl = "newsPageQuery";
        String newsConQueryUrl = "newsConQuery";

        // 获取uri
        String uri = req.getRequestURI();
        // 截取url
        String url = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));

        // 创建news业务层对象
        NewsService newsService = new NewsServiceImpl();
        // 创建pageInfo对象
        PageInfo pageInfo = new PageInfo();

        if (newsPageQueryUrl.equals(url)){
            /**
             * 新闻资讯页面，分页查询，每页5条数据
             */

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            // 查询总条数
            int totalCount = newsService.getTotalCount(null);

            // 设置当前页
            pageInfo.setCurPageNo(curPageNo);
            // 设置每页显示5条数据
            pageInfo.setPageSize(5);
            // 设置总条数
            pageInfo.setTotalCount(totalCount);

            // 分页查询
            List<News> newsList = newsService.newsPageQuery(pageInfo, null);

            // 把pageInfo对象存入req对象中
            req.setAttribute("pageInfo", pageInfo);
            // 把newsList集合存入req对象中
            req.setAttribute("newsList", newsList);

            // 转发
            req.getRequestDispatcher("/news.jsp").forward(req, resp);

        }else if (newsConQueryUrl.equals(url)){
            /**
             * 新闻详情页面查询
             * 根据新闻id查询
             */

            // 获取新闻id
            String snIdStr = req.getParameter("snId");
            // 新闻id默认设置为1
            int snId = 1;
            if (!"".equals(snIdStr) && snIdStr!=null){
                snId = Integer.parseInt(snIdStr);
            }

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            // 根据id查询
            News news = newsService.findNewsById(snId);

            // 把news存入req对象中
            req.setAttribute("news", news);
            // 把当前页存入req对象中
            req.setAttribute("curPageNo", curPageNo);

            // 转发
            req.getRequestDispatcher("/news-con.jsp").forward(req, resp);

        }


    }
}
