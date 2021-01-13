package com.javacto.service.impl;

import com.javacto.dao.FrontDao;
import com.javacto.dao.impl.FrontDaolmpl;
import com.javacto.po.Front;
import com.javacto.service.FrontService;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * 店面分页查询  业务层实现类
 */
public class FrontSevicelmpl implements FrontService {

    //调用dao层
    private FrontDao frontDao = new FrontDaolmpl();

    /**
     * 店面分页查询
     * @param pageInfo
     * @param front
     * @return
     */
    @Override
    public List<Front> queryAllPage(PageInfo pageInfo, Front front) {
        return frontDao.queryAllPage(pageInfo, front);
    }


    /**
     * 查询总条数
     * @param front
     * @return
     */
    @Override
    public int getTotalCount(Front front) {
        return frontDao.getTotalCount(front);
    }

    /**
     * 根据id查询
     * @param ssStoreId
     * @return
     */
    @Override
    public Front findFrontById(int ssStoreId) {
        return frontDao.findNewsById(ssStoreId);
    }

}
