import com.javacto.po.StoreCategory;
import com.javacto.service.StoreCategoryService;
import com.javacto.service.impl.StoreCategoryServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-15 21:07
 * Description：
 **/
public class StoreCategoryTest {

    @Test
    public void StoreCategoryServiceTest(){
        StoreCategoryService storeCategoryService = new StoreCategoryServiceImpl();
        List<StoreCategory> storeCategoryList = storeCategoryService.storeCategoryQueryAll(null);
        for (StoreCategory sc : storeCategoryList){
            System.out.println(sc);
        }
    }

}
