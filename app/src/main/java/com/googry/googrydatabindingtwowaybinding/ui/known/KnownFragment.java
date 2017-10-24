package com.googry.googrydatabindingtwowaybinding.ui.known;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import com.googry.googrydatabindingtwowaybinding.Injection;
import com.googry.googrydatabindingtwowaybinding.R;
import com.googry.googrydatabindingtwowaybinding.base.ui.BaseFragment;
import com.googry.googrydatabindingtwowaybinding.data.User;
import com.googry.googrydatabindingtwowaybinding.databinding.KnownFragmentBinding;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class KnownFragment extends BaseFragment<KnownFragmentBinding> implements KnownContract.View {
    private KnownContract.Presenter mPresenter;

    public static KnownFragment newInstance() {

        Bundle args = new Bundle();

        KnownFragment fragment = new KnownFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setPresenter(KnownContract.Presenter presenter) {
        mPresenter = presenter;
        mBinding.setPresenter(mPresenter);
    }

    @Override
    public void setUser(User user) {
        mBinding.setUser(user);
    }

    @Override
    public void showSaveResult(User user) {
        new AlertDialog.Builder(getContext())
                .setMessage(user.toString())
                .show();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.known_fragment;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void newPresenter() {
        new KnownPresenter(this, Injection.provideUserDataSource());
    }

    @Override
    protected void startPresenter() {
        mPresenter.start();
    }
}
