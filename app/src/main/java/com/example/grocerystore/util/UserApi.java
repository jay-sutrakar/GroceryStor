package com.example.grocerystore.util;

import android.app.Application;

public class UserApi extends Application {
    private String username;
    private String userId;
    private static UserApi instance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static UserApi getInstance() {
        if(instance == null )
            instance = new UserApi();
        return instance;
    }
}
