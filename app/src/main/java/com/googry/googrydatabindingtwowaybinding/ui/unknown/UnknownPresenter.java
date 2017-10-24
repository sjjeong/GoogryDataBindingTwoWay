package com.googry.googrydatabindingtwowaybinding.ui.unknown;


import com.googry.googrydatabindingtwowaybinding.data.User;
import com.googry.googrydatabindingtwowaybinding.data.source.UserDataSource;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class UnknownPresenter implements UnknownContract.Presenter {
    private UnknownContract.View mView;

    private UserDataSource mUserDataSource;

    private User mUser;

    public UnknownPresenter(UnknownContract.View view,
                            UserDataSource userDataSource) {
        mView = view;
        mView.setPresenter(this);

        mUserDataSource = userDataSource;
        mUser = mUserDataSource.getUser();
    }

    @Override
    public void start() {
        mView.setUser(mUser);
    }

    @Override
    public void save(String name, String email, String phone) {
        mUser.name = name;
        mUser.email = email;
        mUser.phone = phone;

        mUserDataSource.saveUser(mUser);
        mView.showSaveResult(mUser);
    }
}
