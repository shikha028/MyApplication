package com.example.myapplication.viewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.myFrags.FirstFragment;
import com.example.myapplication.myFrags.SecondFragment;
import com.example.myapplication.myFrags.ThirdFragment;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter {

    List<Object> objectList;

    public MyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public MyPagerAdapter(@NonNull FragmentManager fm, List<Object> objectList) {
        super(fm);
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       /* switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
        }
        return null;*/
        return SecondFragment.newInstance("Hello", String.valueOf(position));
        //return SecondFragment.newInstance("Hello", (String) objectList.get(position));
    }

    @Override
    public int getCount() {
        //return objectList.size();
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Frag " + (position + 1);
    }
}
