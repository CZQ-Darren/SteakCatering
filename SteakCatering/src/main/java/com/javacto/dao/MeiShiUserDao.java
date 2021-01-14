package com.javacto.dao;


import com.javacto.po.MeiShi;
import com.javacto.utils.PageInfo;


import java.util.List;

/**
 * 菜品  dao层接口
 */
public interface MeiShiUserDao {


    /**
     * 分页查询
     */
    public List<MeiShi> queryAllPage(PageInfo pageInfo, MeiShi meiShi);

    /**
     * 查询总条数
     */
    public int getTotalCount(MeiShi meiShi);


}
