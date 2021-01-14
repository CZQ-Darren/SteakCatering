package com.javacto.dao.impl;

import com.javacto.dao.AboutDao;
import com.javacto.po.About;
import com.javacto.utils.BaseDao;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-13 11:26
 * Description：
 **/
public class AboutDaoImpl implements AboutDao {

    /**
     * 关于我们页面查询
     * @param about about
     * @return List<About>
     */
    @Override
    public List<About> aboutQuery(About about){
        // 定义SQL语句
        String sql = "SELECT * FROM steak_about";
        // 定义数组
        Object[] obj = {};

        return BaseDao.queryAboutList(sql, obj);
    }

}
