package com.javacto.service;

import com.javacto.po.MeiShiSort;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface MeiShiSortsevice {
    /**
     * 菜品分类分页查询
     */
    public List<MeiShiSort> queryAllPage(PageInfo pageInfo, MeiShiSort meiShiSort);

    /**
     * 菜品分类总条数
     */
    public int getTotalCount(MeiShiSort meiShiSort);

    /**
     * id查询总条数
     */
    public MeiShiSort findMsById(int sdcId);
}
