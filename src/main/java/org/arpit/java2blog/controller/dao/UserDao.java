package org.arpit.java2blog.controller.dao;

import org.arpit.java2blog.controller.model.User;
import org.arpit.java2blog.controller.util.mappers.UserMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserDao extends JdbcDaoSupport {

    private final String sql = "INSERT INTO users" + "(name, password) VALUES (?,?)";

    public void addUser(User user){
        getJdbcTemplate().update(sql, new Object[]{user.getName(), user.getPassword()});
    }

    public List<User> getAllUsers(){
        String querySql = "SELECT name, password from users";
        return getJdbcTemplate().query(querySql, new UserMapper());

    }

}
