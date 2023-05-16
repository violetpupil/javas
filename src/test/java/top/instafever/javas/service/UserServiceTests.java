package top.instafever.javas.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import top.instafever.javas.entity.User;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void testCount() {
        LambdaQueryWrapper<User> wrapper = Wrappers.<User>lambdaQuery()
                .in(User::getAge, 18, 19);
        long c = userService.count(wrapper);
        System.out.println(c);
    }

}
