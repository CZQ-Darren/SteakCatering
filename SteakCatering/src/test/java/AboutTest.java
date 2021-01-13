import com.javacto.po.About;
import com.javacto.service.AboutService;
import com.javacto.service.impl.AboutServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-13 11:44
 * Description：
 **/
public class AboutTest {

    @Test
    public void aboutServiceTest(){
        AboutService aboutService = new AboutServiceImpl();
        List<About> aboutList = aboutService.aboutQuery(null);
        for (About a : aboutList){
            System.out.println(a);
        }
    }

}
