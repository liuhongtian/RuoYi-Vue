package com.ruoyi.kanban.client.model;

/**
 * Wekan登录请求对象
 */
public class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;   
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
} 