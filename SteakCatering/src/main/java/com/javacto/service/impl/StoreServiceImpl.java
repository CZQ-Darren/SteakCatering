package com.javacto.service.impl;

import com.javacto.dao.StoreDao;
import com.javacto.dao.impl.StoreDaoImpl;
import com.javacto.po.Store;
import com.javacto.service.StoreService;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 20:37
 * Description：
 **/
public class StoreServiceImpl implements StoreService {
    /**
     * 创建storeDao对象
     */
    private StoreDao storeDao = new StoreDaoImpl();

    /**
     * 根据id查询店面
     * @param storeId storeId
     * @return Store
     */
    @Override
    public Store findStoreById(int storeId){
        return storeDao.findStoreById(storeId);
    }

    /**
     * 查询全部店面
     * @param store store
     * @return List<Store>
     */
    @Override
    public List<Store> storeQueryAll(Store store){
        return storeDao.storeQueryAll(store);
    }

    /**
     * 店面分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return List<Store>
     */
    @Override
    public List<Store> storePageQuery(PageInfo pageInfo, Store store){
        return storeDao.storePageQuery(pageInfo, store);
    }

    /**
     * 查询店面总条数
     * @param store store
     * @return int
     */
    @Override
    public int getTotalCount(Store store){
        return storeDao.getTotalCount(store);
    }

    /**
     * 根据name查询店面，分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return Store
     */
    @Override
    public List<Store> findStoreByName(PageInfo pageInfo, Store store){
        return storeDao.findStoreByName(pageInfo, store);
    }

    /**
     * 根据name查询店面，查询总条数
     * @param store store
     * @return int
     */
    @Override
    public int getFindTotalCount(Store store){
        return storeDao.getFindTotalCount(store);
    }

}
