package org.arpit.java2blog.controller.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.arpit.java2blog.controller.model.User;
import org.arpit.java2blog.controller.service.UserService;
import org.arpit.java2blog.controller.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by nick on 26.07.17.
 */


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public Response hello(@PathVariable String name) {
        String result = "Hello " + name;
        return new Response(name, name + name);
    }



    //get метод потому, что с post не мог протестить через браузер, вылетала ошибка типа не поддерживается
    @RequestMapping(value = "/addUser/{name}/{password}", method = RequestMethod.GET)
    public Response addUser(@PathVariable String name, @PathVariable String password){
        userService.addUser(new User(name, password));

        return new Response("ok", "added");
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }




}
