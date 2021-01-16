package com.javacto.dao;

import com.javacto.po.StoreCategory;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 21:02
 * Description：
 **/
public interface StoreCategoryDao {

    /**
     * 查询全部店面分类
     * @param storeCategory storeCategory
     * @return List<StoreCategory>
     */
    public List<StoreCategory> storeCategoryQueryAll(StoreCategory storeCategory);

}
