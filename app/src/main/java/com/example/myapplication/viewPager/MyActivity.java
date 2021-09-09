package com.example.myapplication.viewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myapplication.R;

public class MyActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        viewPager = findViewById(R.id.myViewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        myPagerAdapter = new MyPagerAdapter(fragmentManager);
        viewPager.setAdapter(myPagerAdapter);
    }
}