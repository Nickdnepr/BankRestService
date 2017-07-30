package org.arpit.java2blog.controller.dao;

import org.arpit.java2blog.controller.model.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;



public class UserDao extends JdbcDaoSupport {

    private final String sql = "INSERT INTO users" + "(name, password) VALUES (?,?)";

    public void addUser(User user){
        getJdbcTemplate().update(sql, new Object[]{user.getName(), user.getPassword()});
    }

}
