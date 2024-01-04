package com.hejie.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hejie.test.dataObject.User;


@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User showUser(){
        String sql = "select * from users";
        List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));

        for (User user : list) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getPassword());
        }
        return list.get(0);
    }
}
