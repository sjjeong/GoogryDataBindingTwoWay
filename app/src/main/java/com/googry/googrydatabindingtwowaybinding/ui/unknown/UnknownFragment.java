package com.googry.googrydatabindingtwowaybinding.ui.unknown;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import com.googry.googrydatabindingtwowaybinding.Injection;
import com.googry.googrydatabindingtwowaybinding.R;
import com.googry.googrydatabindingtwowaybinding.base.ui.BaseFragment;
import com.googry.googrydatabindingtwowaybinding.data.User;
import com.googry.googrydatabindingtwowaybinding.databinding.UnknownFragmentBinding;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class UnknownFragment extends BaseFragment<UnknownFragmentBinding> implements UnknownContract.View {
    private UnknownContract.Presenter mPresenter;

    public static UnknownFragment newInstance() {

        Bundle args = new Bundle();

        UnknownFragment fragment = new UnknownFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setPresenter(UnknownContract.Presenter presenter) {
        mPresenter = presenter;
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
    public void onSaveClick() {
        mPresenter.save(
                mBinding.etName.getText().toString(),
                mBinding.etEmail.getText().toString(),
                mBinding.etPhone.getText().toString()
        );
    }

    @Override
    protected int getLayoutId() {
        return R.layout.unknown_fragment;
    }

    @Override
    protected void initView() {
        mBinding.setView(this);
    }

    @Override
    protected void newPresenter() {
        new UnknownPresenter(this, Injection.provideUserDataSource());
    }

    @Override
    protected void startPresenter() {
        mPresenter.start();
    }
}
