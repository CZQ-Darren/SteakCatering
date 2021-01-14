package com.javacto.service;

import com.javacto.po.Front;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface FrontService {
    /**
     * 店面分页查询
     */
    public List<Front> queryAllPage(PageInfo pageInfo, Front front);

    /**
     * 店面分类总条数
     */
    public int getTotalCount(Front front);


    /**
     * 根据id查询总条数
     */
    public Front findFrontById(int ssStoreId);
}
