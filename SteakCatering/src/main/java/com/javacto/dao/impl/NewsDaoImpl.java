package com.javacto.dao.impl;

import com.javacto.dao.NewsDao;
import com.javacto.po.News;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-11 15:32
 * Description：
 **/
public class NewsDaoImpl implements NewsDao {

    /**
     * 新闻分页查询，根据创建时间作降序查询
     * @param pageInfo pageInfo
     * @param news news
     * @return List<News>
     */
    @Override
    public List<News> newsPageQuery(PageInfo pageInfo, News news){
        // 计算开始和结束
        int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
        int end = pageInfo.getPageSize();

        // 定义SQL语句
        String sql = "SELECT * FROM steak_news ORDER BY sn_create_time DESC LIMIT ?,?";
        // 定义数组
        Object[] obj = {begin, end};

        return BaseDao.queryNewsList(sql, obj);
    }

    /**
     * 获取新闻总条数
     * @param news news
     * @return int
     */
    @Override
    public int getTotalCount(News news){
        return BaseDao.totalCount("SELECT COUNT(*) FROM steak_news", new Object[]{});
    }

    /**
     * 根据id查询新闻
     * @param snId snId
     * @return News
     */
    @Override
    public News findNewsById(int snId){
        // 创建news对象
        News news = new News();

        // 定义SQL语句
        String sql = "SELECT * FROM steak_news WHERE sn_id=?";
        // 定义数组
        Object[] obj = {snId};

        // 查询
        List<News> newsList = BaseDao.queryNewsList(sql, obj);
        for (News n : newsList){
            news = n;
        }

        return news;
    }

}
