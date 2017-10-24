package com.googry.googrydatabindingtwowaybinding.data.source;

import com.googry.googrydatabindingtwowaybinding.data.User;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class UserDataRepository implements UserDataSource {

    @Override
    public void saveUser(User user) {
        // TODO: 2017. 10. 24. Save User
    }

    @Override
    public User getUser() {
        return new User();
    }
}
