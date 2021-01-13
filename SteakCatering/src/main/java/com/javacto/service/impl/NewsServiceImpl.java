package com.javacto.service.impl;

import com.javacto.dao.NewsDao;
import com.javacto.dao.impl.NewsDaoImpl;
import com.javacto.po.News;
import com.javacto.service.NewsService;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-11 15:33
 * Description：
 **/
public class NewsServiceImpl implements NewsService {

    /**
     * 创建newsDao对象
     */
    private NewsDao newsDao = new NewsDaoImpl();

    /**
     * 新闻分页查询，根据创建时间作降序查询
     * @param pageInfo pageInfo
     * @param news news
     * @return List<News>
     */
    @Override
    public List<News> newsPageQuery(PageInfo pageInfo, News news){
        /**
         * 截取新闻内容，作为新闻资讯页面的简介
         */
        List<News> newsList = newsDao.newsPageQuery(pageInfo, news);

        // 循环遍历
        for (News n : newsList){
            String content = n.getSnContent();
            String snContent = content.substring(0, 40);
            n.setSnContent(snContent);
        }

        return newsList;
    }

    /**
     * 获取新闻总条数
     * @param news news
     * @return int
     */
    @Override
    public int getTotalCount(News news){
        return newsDao.getTotalCount(news);
    }

    /**
     * 根据id查询新闻
     * @param snId snId
     * @return News
     */
    @Override
    public News findNewsById(int snId){
        return newsDao.findNewsById(snId);
    }

    /**
     * 首页新闻查询，根据创建时间作降序查询
     * @param news news
     * @return List<News>
     */
    @Override
    public List<News> indexNewsQuery(News news){
        return newsDao.indexNewsQuery(news);
    }

}
