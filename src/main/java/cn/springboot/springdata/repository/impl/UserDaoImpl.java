package cn.springboot.springdata.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.springboot.springdata.entity.User;
import cn.springboot.springdata.repository.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<User> findAll() {
        return this.entityManager
                .createQuery("select t from User t", User.class)
                .getResultList();
    }

    @Override
    public User findUser(Long id) {
        return this.entityManager
                .createQuery("select t from User t where id = ?", User.class)
                .setParameter(1, id)
                .getSingleResult();
    }
    
}
