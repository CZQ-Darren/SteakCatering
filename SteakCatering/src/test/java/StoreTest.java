import com.javacto.po.Store;
import com.javacto.service.StoreService;
import com.javacto.service.impl.StoreServiceImpl;
import com.javacto.utils.PageInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 20:52
 * Description：
 **/
public class StoreTest {

    @Test
    public void StoreServiceTest(){
        StoreService storeService = new StoreServiceImpl();
        /*Store store = storeService.findStoreById(3);
        System.out.println(store);

        List<Store> storeList = storeService.storeQueryAll(null);
        for (Store s : storeList){
            System.out.println(s);
        }*/

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageSize(5);
        List<Store> storePageQueryList = storeService.storePageQuery(pageInfo, null);
        for (Store s : storePageQueryList){
            System.out.println(s);
        }

        int storeTotalCount = storeService.getTotalCount(null);
        System.out.println(storeTotalCount);
    }

    @Test
    public void StoreSubTest(){
        StoreService storeService = new StoreServiceImpl();
        Store store = storeService.findStoreById(3);
        //System.out.println(store);

//        String s = store.getSsContent().substring(store.getSsContent().lastIndexOf("%分隔%"));
//        String s1 = store.getSsContent().substring(0, store.getSsContent().indexOf("%分隔%"));
//        String[] s1 = store.getSsContent().split("%分隔%");
//        System.out.println(s1);
//        System.out.println(s1[4]);

        String img = store.getSsImg().substring(store.getSsImg().lastIndexOf("%分隔%")+4);
        System.out.println(img);
    }

}
