package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.impl.UserServiceImpl;
import com.javacto.utils.MD5Util;
import com.javacto.utils.UploadFileBase;
import com.javacto.utils.mail.SendEmail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author CZQ
 * @date 2021-01-09 14:32
 * Description：
 **/
@WebServlet(urlPatterns = "*.su")
public class UserAction extends HttpServlet {

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
        String addUserUrl = "addUser";
        String findUserByNameUrl = "findUserByName";
        String findUserByEmailUrl = "findUserByEmail";
        String findUserByMobileUrl = "findUserByMobile";
        String loginUrl = "login";
        String clearLoginUrl = "clearLogin";

        // 获取uri
        String uri = req.getRequestURI();
        // 截取url
        String url = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));

        // 创建user业务层对象
        UserService userService = new UserServiceImpl();

        if (addUserUrl.equals(url)){
            /**
             * 注册
             */

            // 获得页面上的数据
            Map<String, String> map = UploadFileBase.getSavePath(req);
            String userName = map.get("userName");
            String pwdStr = map.get("pwd");
            String email = map.get("email");
            String mobile = map.get("mobile");
            String sex = map.get("sex");
            String birthday = map.get("birthday");
            String img = map.get("img");
            // 加密密码
            String pwd = MD5Util.stringMD5(pwdStr);
            // 获得创建时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String createTime = simpleDateFormat.format(date);

            // 创建user对象
            User user = new User();
            user.setSuUserName(userName);
            user.setSuPassword(pwd);
            user.setSuEmail(email);
            user.setSuMobile(mobile);
            user.setSuSex(sex);
            user.setSuBirthday(birthday);
            user.setSuImg(img);
            user.setSuCreateTime(createTime);
            user.setSuCreateUser(userName);
            user.setSuStatus(1);

            // 添加用户
            int addUser = userService.addUser(user);

            // 注册成功发送邮件
            if (addUser>0){
                SendEmail.send(email);
            }

            // 存入req对象中
            req.setAttribute("addUser", addUser);

            // 转发
            req.getRequestDispatcher("/result/addUser_result.jsp").forward(req, resp);

        }else if (findUserByNameUrl.equals(url)){
            /**
             * 注册时用户名验证
             */

            // 获取userName
            String userName = req.getParameter("userName");

            // 根据userName查询用户
            User user = userService.findUserByName(userName);

            // 判断user是否为null
            if (user==null){
                // 用户名可用
                out.println("0");
            }else {
                // 用户名已存在
                out.println("1");
            }

        }else if (findUserByEmailUrl.equals(url)){
            /**
             * 注册时邮箱验证
             */

            // 获取email
            String email = req.getParameter("email");

            // 根据email查询用户
            User user = userService.findUserByEmail(email);

            // 判断user是否为null
            if (user==null){
                // email可用
                out.println("0");
            }else {
                // email已存在
                out.println("1");
            }

        }else if (findUserByMobileUrl.equals(url)){
            /**
             * 注册时手机号验证
             */

            // 获取mobile
            String mobile = req.getParameter("mobile");

            // 根据email查询用户
            User user = userService.findUserByMobile(mobile);

            // 判断user是否为null
            if (user==null){
                // mobile可用
                out.println("0");
            }else {
                // mobile已存在
                out.println("1");
            }

        }else if (loginUrl.equals(url)){
            /**
             * 登录验证
             */

            // 获取用户名
            String userName = req.getParameter("userName");
            // 获取密码并加密
            String pwd = MD5Util.stringMD5(req.getParameter("pwd"));

            // 登录验证
            User login = userService.login(userName, pwd);

            // 存入req对象中
            req.setAttribute("login", login);

            // 如果登录成功，把用户名存入session中，登录失败存入null
            if (login!=null){
                // 存入session对象中
                req.getSession().setAttribute("userName", userName);
                // 获取头像名
                String img = login.getSuImg();
                req.getSession().setAttribute("img", img);
            }else {
                // 存入session对象中
                req.getSession().setAttribute("userName", null);
                req.getSession().setAttribute("img", null);
            }

            // 转发
            req.getRequestDispatcher("/result/login_result.jsp").forward(req, resp);

        }else if (clearLoginUrl.equals(url)){
            /**
             * 退出登录
             */

            // 设置session中的userName为null
            req.getSession().setAttribute("userName", null);

            // 重定向
            String path = req.getContextPath();
            resp.sendRedirect(path + "/index.jsp");

        }



    }
}
