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
     * 菜品分类查询
     */
    @Override
    public List<MeiShiSort> sort(MeiShiSort meiShiSort) {
        return s.sort(meiShiSort);
    }

    /**
     * 菜品分类总条数
     */
    @Override
    public int getTotalCount(MeiShiSort meiShiSort) {
        return s.getTotalCount(meiShiSort);
    }

    /**
     * id查询分类总条数
     */
    @Override
    public MeiShiSort findMsById(int sdcId) {
        return s.findMsById(sdcId);
    }
}
