package com.javacto.service;

import com.javacto.po.StoreCategory;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 21:03
 * Description：
 **/
public interface StoreCategoryService {

    /**
     * 查询全部店面分类
     * @param storeCategory storeCategory
     * @return List<StoreCategory>
     */
    public List<StoreCategory> storeCategoryQueryAll(StoreCategory storeCategory);

}
