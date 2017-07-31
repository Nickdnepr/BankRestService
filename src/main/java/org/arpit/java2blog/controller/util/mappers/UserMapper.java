package org.arpit.java2blog.controller.util.mappers;

import org.arpit.java2blog.controller.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nick on 31.07.17.
 */
public class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getString("name"), resultSet.getString("password"));
    }
}
