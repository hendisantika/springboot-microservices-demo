package com.hendisantika.microservices.profilemicroserviceconsumer.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:34
 */
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String name;

    public Profile() {
        // TODO Auto-generated constructor stub
    }

    public Profile(String userId, String name) {
        super();
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profile [userId=" + userId + ", name=" + name + "]";
    }

}

