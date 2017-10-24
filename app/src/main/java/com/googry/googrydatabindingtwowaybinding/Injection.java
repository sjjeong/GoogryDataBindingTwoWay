package com.googry.googrydatabindingtwowaybinding;

import com.googry.googrydatabindingtwowaybinding.data.source.UserDataRepository;
import com.googry.googrydatabindingtwowaybinding.data.source.UserDataSource;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class Injection {
    public static UserDataSource provideUserDataSource() {
        return new UserDataRepository();
    }
}
