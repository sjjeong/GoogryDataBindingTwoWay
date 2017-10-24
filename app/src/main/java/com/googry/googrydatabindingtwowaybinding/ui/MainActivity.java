package com.googry.googrydatabindingtwowaybinding.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.googry.googrydatabindingtwowaybinding.R;
import com.googry.googrydatabindingtwowaybinding.ui.known.KnownActivity;
import com.googry.googrydatabindingtwowaybinding.ui.unknown.UnknownActivity;

/**
 * Created by seokjunjeong on 2017. 10. 24..
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        findViewById(R.id.btn_known).setOnClickListener(this);
        findViewById(R.id.btn_unknown).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_known:
                startActivity(new Intent(getApplicationContext(), KnownActivity.class));
                break;
            case R.id.btn_unknown:
                startActivity(new Intent(getApplicationContext(), UnknownActivity.class));
                break;
        }
    }
}
