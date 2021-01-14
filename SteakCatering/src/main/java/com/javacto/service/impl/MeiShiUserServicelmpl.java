package com.javacto.service.impl;



import com.javacto.dao.MeiShiUserDao;
import com.javacto.dao.impl.MeiShiUserDaolmpl;
import com.javacto.po.MeiShi;
import com.javacto.service.MeiShiUserService;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * 菜品  业务层  实现类
 */
public class MeiShiUserServicelmpl implements MeiShiUserService {

    //调用dao层
    private MeiShiUserDao ms = new MeiShiUserDaolmpl();



    //分页查询
    @Override
    public List<MeiShi> queryAllPage(PageInfo pageInfo, MeiShi meiShi) {
        return ms.queryAllPage(pageInfo, meiShi);
    }

    //查询总条数
    @Override
    public int getTotalCount(MeiShi meiShi) {
        return ms.getTotalCount(meiShi);
    }
}
