package org.arpit.java2blog.controller.controller;

import org.arpit.java2blog.controller.util.Response;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nick on 26.07.17.
 */


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public Response hello(@PathVariable String name) {
        String result = "Hello " + name;
        return new Response(name, name + name);
    }


}
