import com.javacto.po.News;
import com.javacto.service.NewsService;
import com.javacto.service.impl.NewsServiceImpl;
import com.javacto.utils.PageInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-11 15:53
 * Description：
 **/
public class NewsTest {

    @Test
    public void NewsServiceTest(){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageSize(5);

        NewsService newsService = new NewsServiceImpl();
        List<News> newsList = newsService.newsPageQuery(pageInfo, null);

        for (News n : newsList){
            System.out.println(n);
        }

        int i = newsService.getTotalCount(null);
        System.out.println(i);
    }

}
