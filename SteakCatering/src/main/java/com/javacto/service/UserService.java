package com.javacto.service;

import com.javacto.po.User;

/**
 * @author CZQ
 * @date 2021-01-09 15:23
 * Description：
 **/
public interface UserService {

    /**
     * 添加用户
     * @param user 用户对象
     * @return  添加成功的条数
     */
    public int addUser(User user);

    /**
     * 根据userName查询用户
     * @param userName 用户名
     * @return 查询到的user对象
     */
    public User findUserByName(String userName);

    /**
     * 根据email查询用户
     * @param email 用户邮箱
     * @return 查询到的user对象
     */
    public User findUserByEmail(String email);

    /**
     * 根据mobile查询用户
     * @param mobile 用户手机号
     * @return 查询到的user对象
     */
    public User findUserByMobile(String mobile);

    /**
     * 登录验证
     * @param userName 用户名
     * @param pwd 密码
     * @return user对象
     */
    public User login(String userName, String pwd);

}
