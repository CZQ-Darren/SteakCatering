package com.javacto.service;

import com.javacto.po.About;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-13 11:27
 * Description：
 **/
public interface AboutService {

    /**
     * 关于我们页面查询
     * @param about about
     * @return List<About>
     */
    public List<About> aboutQuery(About about);

}
