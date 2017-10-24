package com.googry.googrydatabindingtwowaybinding.ui.known;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.googry.googrydatabindingtwowaybinding.R;
import com.googry.googrydatabindingtwowaybinding.base.ui.BaseActivity;

public class KnownActivity extends BaseActivity<KnownFragment> {

    @Override
    protected int getLayoutId() {
        return R.layout.simple_activity;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.content_frame;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initToolbar(@Nullable Bundle savedInstanceState) {

    }

    @Override
    protected KnownFragment getFragment() {
        return KnownFragment.newInstance();
    }

}
