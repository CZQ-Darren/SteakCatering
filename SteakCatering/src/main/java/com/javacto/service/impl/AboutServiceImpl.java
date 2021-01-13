package com.javacto.service.impl;

import com.javacto.dao.AboutDao;
import com.javacto.dao.impl.AboutDaoImpl;
import com.javacto.po.About;
import com.javacto.service.AboutService;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-13 11:27
 * Description：
 **/
public class AboutServiceImpl implements AboutService {

    private AboutDao aboutDao = new AboutDaoImpl();

    /**
     * 关于我们页面查询
     * @param about about
     * @return List<About>
     */
    @Override
    public List<About> aboutQuery(About about){
        return aboutDao.aboutQuery(about);
    }

}
