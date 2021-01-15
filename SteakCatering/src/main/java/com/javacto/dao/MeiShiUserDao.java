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
    public List<MeiShi> dishPageQuery(PageInfo pageInfo, MeiShi meiShi);

    /**
     * 查询总条数
     */
    public int getTotalCount(MeiShi meiShi);

    /**
     * 根据id查询菜品
     * @param id id
     * @return MeiShi对象
     */
    public MeiShi findDishById(int id);

    /**
     * 查询全部菜品
     * @return
     */
    public List<MeiShi> dishQueryAll(MeiShi meiShi);

    /**
     * 根据关键字-模糊查询菜名
     * @param dishName dishName
     * @param pageInfo pageInfo
     * @return List<MeiShi>
     */
    public List<MeiShi> findDishByName(PageInfo pageInfo, String dishName);

    /**
     * 查询搜索结果的总条数
     */
    public int getFindTotalCount(String dishName, MeiShi meiShi);

}
