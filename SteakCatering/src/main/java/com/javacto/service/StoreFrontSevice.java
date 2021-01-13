package com.javacto.service;

import com.javacto.po.StoreFront;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * 店面分类查询  业务层接口
 */
public interface StoreFrontSevice {
    /**
     * 店面分类分页查询
     */
    public List<StoreFront> frontPage(PageInfo pageInfo, StoreFront storeFront);

    /**
     * 店面分类查询总条数
     */
    public int getTotalCount(StoreFront storeFront);

    /**
     * 根据id查询
     */
    public StoreFront findStrById(int sscId);
}
