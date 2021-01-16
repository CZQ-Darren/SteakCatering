package com.javacto.action;

import com.javacto.po.MeiShi;
import com.javacto.po.MeiShiSort;
import com.javacto.service.MeiShiSortsevice;
import com.javacto.service.MeiShiUserService;
import com.javacto.service.impl.MeiShiSortsevicelmpl;
import com.javacto.service.impl.MeiShiUserServicelmpl;
import com.javacto.utils.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;


@WebServlet(urlPatterns = "*.sd")
public class DishAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理编码问题
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 定义输出
        PrintWriter out = resp.getWriter();

        // 定义url
        String dishPageQueryUrl = "dishPageQuery";
        String findDishByIdUrl = "findDishById";
        String findDishByNameUrl = "findDishByName";

        // 获取uri
        String uri = req.getRequestURI();
        // 截取url
        String url = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf("."));

        // 创建meiShi业务层对象
        MeiShiUserService meiShiUserService = new MeiShiUserServicelmpl();
        // 创建meiShiSort业务层对象
        MeiShiSortsevice meiShiSortsevice = new MeiShiSortsevicelmpl();
        // 创建pageInfo对象
        PageInfo pageInfo = new PageInfo();

        if (dishPageQueryUrl.equals(url)){
            /**
             * 菜品页面查询
             */

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            //查询总条数
            int totalCount = meiShiUserService.getTotalCount(null);

            // 设置当前页
            pageInfo.setCurPageNo(curPageNo);
            // 设置每页显示6条数据
            pageInfo.setPageSize(6);
            // 设置总条数
            pageInfo.setTotalCount(totalCount);

            // 菜品分页查询
            List<MeiShi> meiShiList = meiShiUserService.dishPageQuery(pageInfo, null);
            // 菜品分类查询
            List<MeiShiSort> meiShiSortList = meiShiSortsevice.sort(null);
            // 菜品查询全部
            List<MeiShi> dishAllList = meiShiUserService.dishQueryAll(null);

            // 把pageInfo对象存入req对象中
            req.setAttribute("pageInfo", pageInfo);
            // 把meiShiList集合存入req对象中
            req.setAttribute("meiShiList", meiShiList);
            // 把meiShiSortList集合存入req对象中
            req.setAttribute("meiShiSortList", meiShiSortList);
            // 把dishAllList集合存入req对象中
            req.setAttribute("dishAllList", dishAllList);

            // 转发
            req.getRequestDispatcher("/meishi.jsp").forward(req, resp);

        }else if (findDishByIdUrl.equals(url)){
            /**
             * 根据id查询菜品
             */

            // 获取菜品id
            String dishIdStr = req.getParameter("sdDishId");
            // 默认设置菜品id为1
            int dishId = 1;
            if (!"".equals(dishIdStr) && dishIdStr!=null){
                dishId = Integer.parseInt(dishIdStr);
            }

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 默认设置当前页为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }

            // 根据id查询
            MeiShi meiShi = meiShiUserService.findDishById(dishId);

            // 存入req对象中
            req.setAttribute("meiShi", meiShi);
            req.setAttribute("curPageNo", curPageNo);

            // 转发
            req.getRequestDispatcher("/meishi-con.jsp").forward(req, resp);

        }else if (findDishByNameUrl.equals(url)){
            /**
             * 根据name查询菜品
             */

            // 获取当前页
            String curPageNoStr = req.getParameter("curPageNo");
            // 当前页默认设置为1
            int curPageNo = 1;
            if (!"".equals(curPageNoStr) && curPageNoStr!=null){
                curPageNo = Integer.parseInt(curPageNoStr);
            }
            // 获取name
            String dishName = req.getParameter("dishName");

            //查询总条数
            int totalCount = meiShiUserService.getFindTotalCount(dishName, null);

            // 设置当前页
            pageInfo.setCurPageNo(curPageNo);
            // 设置每页显示6条数据
            pageInfo.setPageSize(6);
            // 设置总条数
            pageInfo.setTotalCount(totalCount);

            // 根据name查询
            List<MeiShi> dishFindList = meiShiUserService.findDishByName(pageInfo, dishName);

            // 把dishName存入req对象中
            req.setAttribute("dishName", dishName);
            // 把pageInfo对象存入req对象中
            req.setAttribute("pageInfo", pageInfo);
            // 把dishFindList集合存入req对象中
            req.setAttribute("dishFindList", dishFindList);

            // 转发
            req.getRequestDispatcher("/meishi-find.jsp").forward(req, resp);

        }

    }

}
