package com.javacto.action;

import com.javacto.po.About;
import com.javacto.service.AboutService;
import com.javacto.service.impl.AboutServiceImpl;

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
 * @date 2021-01-13 11:27
 * Description：
 **/
@WebServlet(urlPatterns = "*.sa")
public class AboutAction extends HttpServlet {

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
        String aboutQueryUrl = "aboutQuery";

        // 获取uri
        String uri = req.getRequestURI();
        // 截取url
        String url = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf("."));

        // 创建about业务层对象
        AboutService aboutService = new AboutServiceImpl();

        if (aboutQueryUrl.equals(url)){
            /**
             * 关于我们页面查询
             */

            // 查询
            List<About> aboutList = aboutService.aboutQuery(null);

            // 存入req对象中
            req.setAttribute("aboutList", aboutList);

            // 转发
            req.getRequestDispatcher("/about-us.jsp").forward(req, resp);

        }
    }

}
