package com.javacto.service;


import com.javacto.po.MeiShi;
import com.javacto.utils.PageInfo;


import java.util.List;

/**
 * 菜品业务层接口
 */
public interface MeiShiUserService {
    //分页查询
    public List<MeiShi> queryAllPage(PageInfo pageInfo, MeiShi meiShi);

    //查询总条数
    public int getTotalCount(MeiShi meiShi);
}
