package com.javacto.service.impl;

import com.javacto.dao.MeiShiDao;
import com.javacto.dao.impl.MeiShiSortDaolmpl;
import com.javacto.po.MeiShiSort;
import com.javacto.service.MeiShiSortsevice;
import com.javacto.utils.PageInfo;

import java.util.List;

public class MeiShiSortsevicelmpl implements MeiShiSortsevice {

    //调用dao层

    private MeiShiDao s = new MeiShiSortDaolmpl();

    /**
     * 菜品分类分页查询
     */
    public List<MeiShiSort> queryAllPage(PageInfo pageInfo, MeiShiSort meiShiSort) {
        return s.sort(pageInfo, meiShiSort);
    }

    /**
     * 菜品分类总条数
     */
    public int getTotalCount(MeiShiSort meiShiSort) {
        return s.getTotalCount(meiShiSort);
    }

    /**
     * id查询分类总条数
     */
    public MeiShiSort findMsById(int sdcId) {
        return s.findNewsById(sdcId);
    }
}
