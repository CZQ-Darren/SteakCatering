package com.javacto.dao.impl;

import com.javacto.dao.StoreCategoryDao;
import com.javacto.po.StoreCategory;
import com.javacto.utils.BaseDao;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 21:02
 * Description：
 **/
public class StoreCategoryDaoImpl implements StoreCategoryDao {

    /**
     * 查询全部店面分类
     * @param storeCategory storeCategory
     * @return List<StoreCategory>
     */
    @Override
    public List<StoreCategory> storeCategoryQueryAll(StoreCategory storeCategory){
        // 定义SQL语句
        String sql = "SELECT * FROM steak_store_category";
        // 定义数组
        Object[] obj = {};

        return BaseDao.queryStoreCategoryList(sql, obj);
    }

}
