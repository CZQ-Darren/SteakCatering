package com.javacto.service.impl;

import com.javacto.dao.StoreCategoryDao;
import com.javacto.dao.impl.StoreCategoryDaoImpl;
import com.javacto.po.StoreCategory;
import com.javacto.service.StoreCategoryService;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 21:03
 * Description：
 **/
public class StoreCategoryServiceImpl implements StoreCategoryService {
    /**
     * 创建storeCategoryDao对象
     */
    private StoreCategoryDao storeCategoryDao = new StoreCategoryDaoImpl();

    /**
     * 查询全部店面分类
     * @param storeCategory storeCategory
     * @return List<StoreCategory>
     */
    @Override
    public List<StoreCategory> storeCategoryQueryAll(StoreCategory storeCategory){
        return storeCategoryDao.storeCategoryQueryAll(storeCategory);
    }

}
