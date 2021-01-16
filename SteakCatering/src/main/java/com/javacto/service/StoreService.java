package com.javacto.service;

import com.javacto.po.Store;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 20:37
 * Description：
 **/
public interface StoreService {

    /**
     * 根据id查询店面
     * @param storeId storeId
     * @return Store
     */
    public Store findStoreById(int storeId);

    /**
     * 查询全部店面
     * @param store store
     * @return List<Store>
     */
    public List<Store> storeQueryAll(Store store);

    /**
     * 店面分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return List<Store>
     */
    public List<Store> storePageQuery(PageInfo pageInfo, Store store);

    /**
     * 查询店面总条数
     * @param store store
     * @return int
     */
    public int getTotalCount(Store store);

    /**
     * 根据name查询店面，分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return Store
     */
    public List<Store> findStoreByName(PageInfo pageInfo, Store store);

    /**
     * 根据name查询店面，查询总条数
     * @param store store
     * @return int
     */
    public int getFindTotalCount(Store store);

}
