package com.javacto.action;

import com.javacto.po.MeiShi;
import com.javacto.service.MeiShiUserService;
import com.javacto.service.impl.MeiShiUserServicelmpl;
import com.javacto.utils.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 美食
 */
@WebServlet("/action.do")
public class DishAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理编码格式
        resp.setContentType("text/html;charset=UTF-8");//响映编码
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");

        MeiShiUserService meiShiUserService = new MeiShiUserServicelmpl();
        PageInfo pageInfo = new PageInfo();

        //获取当前页
        String curPageNoStr = req.getParameter("curPageNo");
        Integer curPageNo=1;//当前页默认设置为1
        pageInfo.setPageSize(5);
        if(null!=curPageNoStr){
            curPageNo=Integer.parseInt(curPageNoStr);
        }

        //查询总条数
        int totalCount = meiShiUserService.getTotalCount(null);
        //再把 totalCount 存入  PageInfo对象
        pageInfo.setTotalCount(totalCount);

        //把当前面存入PageInfo对象,因为调用方法传的是对象
        pageInfo.setCurPageNo(curPageNo);
        //pageInfo.setPageSize(2);//我现在设置每页只显示2条

        //调用业务代码
        List<MeiShi> sbqList= meiShiUserService.queryAllPage(pageInfo,null);

        //必需要存
        req.setAttribute("sbqlist",sbqList);
        // 必需把  pageInfo 存入到HttpServletRequest  因为页面需要获取这个值
        req.setAttribute("sbqPage",pageInfo);

        //跳转
        req.getRequestDispatcher("/meishi-con.jsp").forward(req,resp);
    }
}
