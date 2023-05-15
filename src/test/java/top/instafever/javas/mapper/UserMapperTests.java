package top.instafever.javas.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import top.instafever.javas.entity.User;

@SpringBootTest
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("jay");
        user.setAge(18);
        int i = userMapper.insert(user);
        System.out.println(i);
    }

}
