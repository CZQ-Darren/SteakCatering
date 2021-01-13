package com.javacto.dao;

import com.javacto.po.MeiShiSort;
import com.javacto.po.News;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface MeiShiDao {
    /**
     * 菜品分类分页查询
     */
    public List<MeiShiSort> sort(PageInfo pageInfo, MeiShiSort meiShiSort);

    /**
     * 菜品分类总条数
     */
    public int getTotalCount(MeiShiSort meiShiSort);

    /**
     * 根据ID查询
     */
    public MeiShiSort findNewsById(int sdcId);
}
