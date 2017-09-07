package cn.springboot.springdata.repository;

import java.util.List;

import cn.springboot.springdata.entity.User;

public interface UserDao {
    
    List<User> findAll();
    
    User findUser(Long id);
}
