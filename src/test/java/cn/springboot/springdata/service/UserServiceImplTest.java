package cn.springboot.springdata.service;

import cn.springboot.springdata.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void findAllUsersTest() {
        List<User> allUsers = userService.findAllUsers();
        System.out.println(allUsers);
    }
    
    @Test
    public void findUserByIdTest() {
        User user = userService.findUserById(1L);
        System.out.println(user);
    }
}
