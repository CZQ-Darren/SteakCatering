package com.javacto.dao.impl;

import com.javacto.dao.StoreDao;
import com.javacto.po.Store;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 20:31
 * Description：
 **/
public class StoreDaoImpl implements StoreDao {

    /**
     * 根据id查询店面
     * @param storeId storeId
     * @return Store
     */
    @Override
    public Store findStoreById(int storeId){
        // 创建store对象
        Store store = null;

        // 定义SQL语句
        String sql = "SELECT * FROM steak_store WHERE ss_store_id=?";
        // 定义数组
        Object[] obj = {storeId};

        // 根据id查询
        List<Store> storeList = BaseDao.queryStoreList(sql, obj);
        for (Store s : storeList){
            store = s;
        }

        return store;
    }

    /**
     * 查询全部店面
     * @param store store
     * @return List<Store>
     */
    @Override
    public List<Store> storeQueryAll(Store store){
        // 定义SQL语句
        String sql = "SELECT * FROM steak_store";
        // 定义数组
        Object[] obj = {};

        return BaseDao.queryStoreList(sql, obj);
    }

    /**
     * 店面分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return List<Store>
     */
    @Override
    public List<Store> storePageQuery(PageInfo pageInfo, Store store){
        int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
        int end = pageInfo.getPageSize();

        // 定义SQL语句
        String sql = "SELECT * FROM steak_store LIMIT ?,?";
        // 定义数组
        Object[] obj = {begin, end};

        return BaseDao.queryStoreList(sql, obj);
    }

    /**
     * 查询店面总条数
     * @param store store
     * @return int
     */
    @Override
    public int getTotalCount(Store store){
        // 定义SQL语句
        String sql = "SELECT COUNT(*) FROM steak_store";
        // 定义数组
        Object[] obj = {};

        return BaseDao.totalCount(sql, obj);
    }

    /**
     * 根据name查询店面，分页查询
     * @param pageInfo pageInfo
     * @param store store
     * @return Store
     */
    @Override
    public List<Store> findStoreByName(PageInfo pageInfo, Store store){
        int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
        int end = pageInfo.getPageSize();

        // 定义SQL语句
        String sql = "SELECT * FROM steak_store WHERE ss_store_name LIKE '%" + store.getSsStoreName() + "%' LIMIT ?,?";
        // 定义数组
        Object[] obj = {begin, end};

        return BaseDao.queryStoreList(sql, obj);
    }

    /**
     * 根据name查询店面，查询总条数
     * @param store store
     * @return int
     */
    @Override
    public int getFindTotalCount(Store store){
        // 定义SQL语句
        String sql = "SELECT COUNT(*) FROM steak_store WHERE ss_store_name LIKE '%" + store.getSsStoreName() + "%'";
        // 定义数组
        Object[] obj = {};

        return BaseDao.totalCount(sql, obj);
    }

}
