import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.impl.UserServiceImpl;
import com.javacto.utils.BaseDao;
import org.junit.Test;

import java.util.List;

/**
 * @author CZQ
 * @date 2021-01-09 16:18
 * Description：
 **/
public class BaseDaoTest {

    @Test
    public void queryUser(){
        String sql = "SELECT * FROM steak_user";
        Object[] obj = {};

        List<User> userList = BaseDao.queryUserList(sql, obj);
        for (User u : userList){
            System.out.println(u);
        }
    }

    @Test
    public void findUserByName(){
        UserService userService = new UserServiceImpl();
        User user = userService.findUserByName("a");
        System.out.println(user);
    }

    @Test
    public void findUserByEmail(){
        UserService userService = new UserServiceImpl();
        User user = userService.findUserByEmail("aaa@qq.com");
        System.out.println(user);
    }

}
