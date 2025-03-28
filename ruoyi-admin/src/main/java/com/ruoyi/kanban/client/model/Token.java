package com.ruoyi.kanban.client.model;

/**
 * Wekan登录响应对象
 */
public class Token {
    private String token;
    private String id;
    private String tokenExpires;

    public void setToken(String token) {
        this.token = token;
    }

    public void setId(String id) {
        this.id = id;

    }

    public void setTokenExpires(String tokenExpires) {
        this.tokenExpires = tokenExpires;
    }

    public String getToken() {
        return this.token;
    }

    public String getId() {
        return this.id;
    }

    public String getTokenExpires() {
        return this.tokenExpires;
    }
} 