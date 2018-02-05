import com.uncub.common.dao.Pagination;
import com.uncub.condition.UserConditions;
import com.uncub.dao.UserMapper;
import com.uncub.dto.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"}) //加载配置文件
public class TestJava {
    @Autowired
    UserMapper userMapper;

   /* @Test
    public void testUserAdd(){
        User user = userMapper.selectUserById(1);
        Assert.assertNotNull(user.getUserNo());
    }

    @Test
    public void testQueryUser(){
        Pagination pagination = new Pagination(1,10);
        User user = new User();
        user.setUserName("李四");
        List<User> users = userMapper.queryUser(user, pagination);
        System.out.println("总记录数" + pagination.getTotal());
        System.out.println("总页数" + pagination.getPages());
        Assert.assertTrue(users.size() > 0);
    }

    @Test
    public void queryUserByConditions(){
        Pagination pagination = new Pagination(1,10);
        UserConditions userConditions = new UserConditions();
        userConditions.createCriteria().andIdGreaterThan(1);
        List<User> users = userMapper.queryUserByConditions(userConditions, pagination);
        System.out.println("总记录数" + pagination.getTotal());
        System.out.println("总页数" + pagination.getPages());
        Assert.assertTrue(users.size() > 0);
    }*/

    @Test
    public void insertUser(){
        User user = new User();
        user.setUserName("张三");
        user.setUserNo("zhangsna");
        user.setPassword("56789");
        int num = userMapper.insert(user);
        Assert.assertTrue(num > 0);
    }

}
