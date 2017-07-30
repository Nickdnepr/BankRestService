package org.arpit.java2blog.controller.service;

import org.arpit.java2blog.controller.dao.UserDao;
import org.arpit.java2blog.controller.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

/**
 * Created by nick on 30.07.17.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void addUser(User user){
        userDao.addUser(user);
    }

}
