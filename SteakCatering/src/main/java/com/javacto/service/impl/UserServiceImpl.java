package com.javacto.service.impl;

import com.javacto.dao.UserDao;
import com.javacto.dao.impl.UserDaoImpl;
import com.javacto.po.User;
import com.javacto.service.UserService;

/**
 * @author CZQ
 * @date 2021-01-09 15:24
 * Description：
 **/
public class UserServiceImpl implements UserService {
    /**
     * 创建userDao对象
     */
    private UserDao userDao = new UserDaoImpl();

    /**
     * 添加用户
     * @param user 用户对象
     * @return  添加成功的条数
     */
    @Override
    public int addUser(User user){
        return userDao.addUser(user);
    }

    /**
     * 根据userName查询用户
     * @param userName 用户名
     * @return 查询到的user对象
     */
    @Override
    public User findUserByName(String userName){
        return userDao.findUserByName(userName);
    }

    /**
     * 根据email查询用户
     * @param email 用户邮箱
     * @return 查询到的user对象
     */
    @Override
    public User findUserByEmail(String email){
        return userDao.findUserByEmail(email);
    }

    /**
     * 根据mobile查询用户
     * @param mobile 用户手机号
     * @return 查询到的user对象
     */
    @Override
    public User findUserByMobile(String mobile){
        return userDao.findUserByMobile(mobile);
    }

}
