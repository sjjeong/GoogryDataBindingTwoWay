package com.googry.googrydatabindingtwowaybinding.data;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class User {
    public String name;
    public String email;
    public String phone;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
