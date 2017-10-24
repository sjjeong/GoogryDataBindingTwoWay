package com.googry.googrydatabindingtwowaybinding.ui.known;

import com.googry.googrydatabindingtwowaybinding.base.BasePresenter;
import com.googry.googrydatabindingtwowaybinding.base.BaseView;
import com.googry.googrydatabindingtwowaybinding.data.User;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public interface KnownContract {
    interface Presenter extends BasePresenter {
        void save();
    }

    interface View extends BaseView<Presenter> {
        void setUser(User user);

        void showSaveResult(User user);
    }

}
