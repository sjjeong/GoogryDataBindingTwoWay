package com.googry.googrydatabindingtwowaybinding.data.source;

import com.googry.googrydatabindingtwowaybinding.data.User;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public interface UserDataSource {
    void saveUser(User user);

    User getUser();
}
