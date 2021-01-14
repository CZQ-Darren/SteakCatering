package com.javacto.dao;

import com.javacto.po.Front;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface FrontDao {
    /**
     * 分页查询
     */
    public List<Front> queryAllPage(PageInfo pageInfo, Front front);

    /**
     * 根据id查询
     */

    public int getTotalCount(Front front);

    /**
     * 查询总条数
     */


    public Front findNewsById(int ssStoreId);
}
