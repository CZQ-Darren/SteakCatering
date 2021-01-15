package com.javacto.service;

import com.javacto.po.MeiShiSort;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface MeiShiSortsevice {
    /**
     * 菜品分类
     */
    public List<MeiShiSort> sort(MeiShiSort meiShiSort);

    /**
     * 菜品分类总条数
     */
    public int getTotalCount(MeiShiSort meiShiSort);

    /**
     * 根据ID查询
     */
    public MeiShiSort findMsById(int sdcId);
}
