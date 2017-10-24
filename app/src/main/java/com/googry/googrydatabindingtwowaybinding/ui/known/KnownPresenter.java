package com.googry.googrydatabindingtwowaybinding.ui.known;


import com.googry.googrydatabindingtwowaybinding.data.User;
import com.googry.googrydatabindingtwowaybinding.data.source.UserDataSource;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class KnownPresenter implements KnownContract.Presenter {
    private KnownContract.View mView;

    private UserDataSource mUserDataSource;

    private User mUser;

    public KnownPresenter(KnownContract.View view,
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
    public void save() {
        mUserDataSource.saveUser(mUser);
        mView.showSaveResult(mUser);
    }
}
