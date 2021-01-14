package com.javacto.dao;

import com.javacto.po.StoreFront;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * 店面分页查询
 */
public interface StoreFrontDao {
    /**
     * 店面分类分页查询
     */

    public List<StoreFront> queryAllPage(PageInfo pageInfo, StoreFront storeFront);

    /**
     * 店面分类查询总条数
     */

    public int getTotalCount(StoreFront storeFront);

    /**
     * 根据id查询
     */
    public StoreFront findById(int sscId);
}
