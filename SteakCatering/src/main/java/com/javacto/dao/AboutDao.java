package com.javacto.dao;

import com.javacto.po.About;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-13 11:26
 * Description：
 **/
public interface AboutDao {

    /**
     * 关于我们页面查询
     * @param about about
     * @return List<About>
     */
    public List<About> aboutQuery(About about);

}
