import com.javacto.po.MeiShi;
import com.javacto.service.MeiShiUserService;
import com.javacto.service.impl.MeiShiUserServicelmpl;
import com.javacto.utils.PageInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-14 20:10
 * Description：
 **/
public class DishTest {

    @Test
    public void DishQueryTest(){
        PageInfo pageInfo = new PageInfo();
        MeiShiUserService meiShiUserService = new MeiShiUserServicelmpl();
        List<MeiShi> dishList = meiShiUserService.findDishByName(pageInfo, "草莓");
        for (MeiShi m : dishList){
            System.out.println(m);
        }
    }

}
