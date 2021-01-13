package com.javacto.service.impl;

import com.javacto.dao.StoreFrontDao;
import com.javacto.dao.impl.StoreFrontDaolmpl;
import com.javacto.po.StoreFront;
import com.javacto.service.StoreFrontSevice;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * 店面分类查询   业务层实现类
 */
public class StoreFrontSevicelmpl implements StoreFrontSevice {

    //调用dao层
    private StoreFrontDao stor = new StoreFrontDaolmpl();

    /**
     * 分页查询
     * @param pageInfo
     * @param storeFront
     * @return
     */
    @Override
    public List<StoreFront> frontPage(PageInfo pageInfo, StoreFront storeFront) {
        return stor.queryAllPage(pageInfo, storeFront);
    }

    /**
     * 查询总条数
     * @param storeFront
     * @return
     */
    @Override
    public int getTotalCount(StoreFront storeFront) {
        return stor.getTotalCount(storeFront);
    }

    /**
     * 根据id查询
     * @param sscId
     * @return
     */
    @Override
    public StoreFront findStrById(int sscId) {
        return stor.findById(sscId);
    }
}
