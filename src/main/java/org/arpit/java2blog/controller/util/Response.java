package org.arpit.java2blog.controller.util;

/**
 * Created by nick on 27.07.17.
 */
public class Response {
    private String name;
    private String doubleName;

    public Response(String name, String doubleName) {
        this.name = name;
        this.doubleName = doubleName;
    }

    public String getName() {
        return name;
    }

    public String getDoubleName() {
        return doubleName;
    }
}
