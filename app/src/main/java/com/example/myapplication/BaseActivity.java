package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
//Parent of main activity
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        setupViews();
    }

    protected abstract void initializeViews();

    protected abstract void implementViews();

    void setupViews(){
        ButterKnife.bind(this);
        initializeViews();
        implementViews();
    }
}
