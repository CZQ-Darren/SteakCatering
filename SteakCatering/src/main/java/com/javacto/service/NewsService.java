package com.javacto.service;

import com.javacto.po.News;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-11 15:32
 * Description：
 **/
public interface NewsService {

    /**
     * 新闻分页查询，根据创建时间作降序查询
     * @param pageInfo pageInfo
     * @param news news
     * @return List<News>
     */
    public List<News> newsPageQuery(PageInfo pageInfo, News news);

    /**
     * 获取新闻总条数
     * @param news news
     * @return int
     */
    public int getTotalCount(News news);

    /**
     * 根据id查询新闻
     * @param snId snId
     * @return News
     */
    public News findNewsById(int snId);

    /**
     * 首页新闻查询，根据创建时间作降序查询
     * @param news news
     * @return List<News>
     */
    public List<News> indexNewsQuery(News news);

}
