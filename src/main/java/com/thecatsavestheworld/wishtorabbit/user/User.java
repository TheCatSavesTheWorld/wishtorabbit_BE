package com.thecatsavestheworld.wishtorabbit.user;

public class User {
    private int uid;
    private String nickname;
    private String password;
    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
}
