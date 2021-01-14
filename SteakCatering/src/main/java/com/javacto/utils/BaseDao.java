package com.javacto.utils;

import com.javacto.po.News;
import com.javacto.po.User;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * @author CZQ
 * @date 2020-12-10 21:32
 * Description：
 **/
public class BaseDao {
    private static String driver;
    private static String url;
    private static String user;
    private static String pwd;

    static {
        init();
    }

    private static void init() {
        // 1.创建Properties对象
        Properties ps = new Properties();

        // 2.获取db.properties路径
        String path = "db.properties";

        // 3.通过输入流读取
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(path);

        // 4.把值加载到properties对象中
        try {
            ps.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5.通过键获取值
        driver = ps.getProperty("db.driver");
        url = ps.getProperty("db.url");
        user = ps.getProperty("db.user");
        pwd = ps.getProperty("db.pwd");
    }

    /**
     * 建立连接方法
     */
    public static Connection getConnection(){
        Connection conn = null;

        try {
            // 加载驱动
            Class.forName(driver);
            // 建立连接
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    /**
     * 释放资源方法
     */
    public static void closeAll(Connection conn, Statement stm, ResultSet rs){
        try {
            if (rs!=null){
                rs.close();
            }
            if (stm!=null){
                stm.close();
            }
            if (conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 封装DML
     */
    public static int mySqlDML(String sql, Object[] obj){
        int num = 0;
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // 建立连接
            conn = getConnection();

            // 处理预编译SQL语句
            pstm = conn.prepareStatement(sql);

            // 给占位符赋值
            for (int i=0; i<obj.length; i++){
                pstm.setObject(i+1, obj[i]);
            }

            // 执行预编译SQL语句
            num = pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            closeAll(conn, pstm, null);
        }

        return num;
    }

    /**
     * User-DQL
     * @return 用户列表
     */
    public static List<User> queryUserList(String sql, Object[] obj){
        List<User> userList = new ArrayList<User>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            // 建立连接
            conn = BaseDao.getConnection();

            // 处理预编译SQL语句
            pstm = conn.prepareStatement(sql);

            // 循环给占位符赋值
            for (int i=0; i<obj.length; i++){
                pstm.setObject(i+1, obj[i]);
            }

            // 执行预编译SQL语句
            rs = pstm.executeQuery();

            // 循环遍历添加进list中
            while (rs.next()){
                User user = new User();
                user.setSuUserId(rs.getInt("su_user_id"));
                user.setSuUserName(rs.getString("su_user_name"));
                user.setSuEmail(rs.getString("su_email"));
                user.setSuPassword(rs.getString("su_password"));
                user.setSuSex(rs.getString("su_sex"));
                user.setSuBirthday(rs.getString("su_birthday"));
                user.setSuMobile(rs.getString("su_mobile"));
                user.setSuImg(rs.getString("su_img"));
                user.setSuCreateTime(rs.getString("su_create_time"));
                user.setSuCreateUser(rs.getString("su_create_user"));
                user.setSuUpdateTime(rs.getString("su_update_time"));
                user.setSuUpdateUser(rs.getString("su_update_user"));
                user.setSuStatus(rs.getInt("su_status"));
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            BaseDao.closeAll(conn, pstm, rs);
        }

        return userList;
    }

    /**
     * News-DQL
     * @return 新闻列表
     */
    public static List<News> queryNewsList(String sql, Object[] obj){
        List<News> newsList = new ArrayList<News>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            // 建立连接
            conn = BaseDao.getConnection();

            // 处理预编译SQL语句
            pstm = conn.prepareStatement(sql);

            // 循环给占位符赋值
            for (int i=0; i<obj.length; i++){
                pstm.setObject(i+1, obj[i]);
            }

            // 执行预编译SQL语句
            rs = pstm.executeQuery();

            // 循环遍历添加进list中
            while (rs.next()){
                News news = new News();
                news.setSnId(rs.getInt("sn_id"));
                news.setSnTitle(rs.getString("sn_title"));
                news.setSnContent(rs.getString("sn_content"));
                news.setSnImg(rs.getString("sn_img"));
                news.setSnCreateTime(rs.getString("sn_create_time"));
                news.setSnCreateUser(rs.getString("sn_create_user"));
                news.setSnUpdateTime(rs.getString("sn_update_time"));
                news.setSnUpdateUser(rs.getString("sn_update_user"));
                newsList.add(news);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            BaseDao.closeAll(conn, pstm, rs);
        }

        return newsList;
    }

    /**
     * 查询总条数
     */
    public static int totalCount(String sql, Object[] obj){
        int i = 0;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            // 建立连接
            conn = BaseDao.getConnection();

            // 处理预编译SQL语句
            pstm = conn.prepareStatement(sql);

            // 执行预编译SQL语句
            rs = pstm.executeQuery();

            // 循环遍历添加进list中
            while (rs.next()){
                i = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            BaseDao.closeAll(conn, pstm, rs);
        }

        return i;
    }



    /**
     * 测试
     */
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
