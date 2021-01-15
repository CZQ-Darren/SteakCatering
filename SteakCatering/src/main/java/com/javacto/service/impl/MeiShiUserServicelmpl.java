package com.javacto.service.impl;



import com.javacto.dao.MeiShiUserDao;
import com.javacto.dao.impl.MeiShiUserDaolmpl;
import com.javacto.po.MeiShi;
import com.javacto.service.MeiShiUserService;
import com.javacto.utils.PageInfo;

import java.util.List;

public class MeiShiUserServicelmpl implements MeiShiUserService {

    //调用dao层
    private MeiShiUserDao ms = new MeiShiUserDaolmpl();


    //分页查询
    @Override
    public List<MeiShi> dishPageQuery(PageInfo pageInfo, MeiShi meiShi) {
        return ms.dishPageQuery(pageInfo, meiShi);
    }

    //查询总条数
    @Override
    public int getTotalCount(MeiShi meiShi) {
        return ms.getTotalCount(meiShi);
    }

    /**
     * 根据id查询菜品
     * @param id id
     * @return MeiShi对象
     */
    @Override
    public MeiShi findDishById(int id){
        return ms.findDishById(id);
    }

    /**
     * 查询全部菜品
     * @return
     */
    @Override
    public List<MeiShi> dishQueryAll(MeiShi meiShi){
        return ms.dishQueryAll(meiShi);
    }

    /**
     * 根据关键字-模糊查询菜名
     * @param dishName dishName
     * @param pageInfo pageInfo
     * @return List<MeiShi>
     */
    @Override
    public List<MeiShi> findDishByName(PageInfo pageInfo, String dishName){
        return ms.findDishByName(pageInfo, dishName);
    }

    /**
     * 查询搜索结果的总条数
     */
    @Override
    public int getFindTotalCount(String dishName, MeiShi meiShi){
        return ms.getFindTotalCount(dishName, meiShi);
    }
}
