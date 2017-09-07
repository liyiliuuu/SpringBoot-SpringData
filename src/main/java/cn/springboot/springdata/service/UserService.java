package cn.springboot.springdata.service;

import java.util.List;

import cn.springboot.springdata.entity.User;

public interface UserService {
    
    public List<User> findAllUsers();
    
    public User findUserById(Long id);
}
