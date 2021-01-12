package com.javacto.dao.impl;

import com.javacto.dao.UserDao;
import com.javacto.po.User;
import com.javacto.utils.BaseDao;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-09 15:23
 * Description：
 **/
public class UserDaoImpl implements UserDao {

    /**
     * 添加用户
     * @param user 用户对象
     * @return  添加成功的条数
     */
    @Override
    public int addUser(User user){
        // 定义SQL语句
        String sql = "INSERT steak_user(su_user_name,su_email,su_password,su_sex,su_birthday,su_mobile,su_img," +
                "su_create_time,su_create_user,su_status) values(?,?,?,?,?,?,?,?,?,?)";
        // 定义数组
        Object[] obj = {
                user.getSuUserName(), user.getSuEmail(), user.getSuPassword(), user.getSuSex(),
                user.getSuBirthday(), user.getSuMobile(),user.getSuImg(), user.getSuCreateTime(),
                user.getSuCreateUser(), user.getSuStatus()
        };

        return BaseDao.mySqlDML(sql, obj);
    }

    /**
     * 根据userName查询用户
     * @param userName 用户名
     * @return 查询到的user对象
     */
    @Override
    public User findUserByName(String userName){
        // 创建user对象
        User user = null;

        // 定义SQL语句
        String sql = "SELECT * FROM steak_user where su_user_name=?";
        // 定义数组
        Object[] obj = {userName};

        // 查询用户
        List<User> users = BaseDao.queryUserList(sql, obj);
        for (User u : users){
            // 把查询到的用户赋给user对象
            user = u;
        }

        return user;
    }

    /**
     * 根据email查询用户
     * @param email 用户邮箱
     * @return 查询到的user对象
     */
    @Override
    public User findUserByEmail(String email){
        // 创建user对象
        User user = null;

        // 定义SQL语句
        String sql = "SELECT * FROM steak_user where su_email=?";
        // 定义数组
        Object[] obj = {email};

        // 查询用户
        List<User> users = BaseDao.queryUserList(sql, obj);
        for (User u : users){
            // 把查询到的用户赋给user对象
            user = u;
        }

        return user;
    }

    /**
     * 根据mobile查询用户
     * @param mobile 用户手机号
     * @return 查询到的user对象
     */
    @Override
    public User findUserByMobile(String mobile){
        // 创建user对象
        User user = null;

        // 定义SQL语句
        String sql = "SELECT * FROM steak_user where su_mobile=?";
        // 定义数组
        Object[] obj = {mobile};

        // 查询用户
        List<User> users = BaseDao.queryUserList(sql, obj);
        for (User u : users){
            // 把查询到的用户赋给user对象
            user = u;
        }

        return user;
    }

    /**
     * 登录验证
     * @param userName 用户名
     * @param pwd 密码
     * @return  user对象
     */
    @Override
    public User login(String userName, String pwd){
        // 创建user
        User user = null;


        // 定义SQL语句
        String sql = "SELECT * FROM steak_user WHERE su_user_name=? AND su_password=?";
        // 定义数组
        Object[] obj = {userName, pwd};

        // 查询用户
        List<User> userList = BaseDao.queryUserList(sql, obj);

        // 再次验证用户名、密码是否一致
        for (User u : userList){
            if (userName.equals(u.getSuUserName()) && pwd.equals(u.getSuPassword())){
                user = u;
            }
        }

        return user;
    }

}
