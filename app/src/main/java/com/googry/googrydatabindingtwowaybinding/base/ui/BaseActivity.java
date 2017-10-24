package com.googry.googrydatabindingtwowaybinding.base.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.googry.googrydatabindingtwowaybinding.util.FragmentUtil;


/**
 * Created by seokjunjeong on 2017. 5. 27..
 */

public abstract class BaseActivity<F extends Fragment> extends AppCompatActivity {
    protected F mFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mFragment = getFragment();
        FragmentUtil.addFragment(this, getFragmentContentId(), mFragment);
        initView();
        initToolbar(savedInstanceState);
    }

    protected abstract int getLayoutId();

    protected abstract int getFragmentContentId();

    protected abstract void initView();

    protected abstract void initToolbar(@Nullable Bundle savedInstanceState);

    protected abstract F getFragment();
}
