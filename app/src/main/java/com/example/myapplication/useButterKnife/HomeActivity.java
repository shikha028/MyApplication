package com.example.myapplication.useButterKnife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ViewStateActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends ViewStateActivity {

    @BindView(R.id.tv_heading)
    TextView textView;

    @BindView(R.id.click)
    Button cliCk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //ButterKnife.bind(this);
    }

    @Override
    protected void initializeViews() {

    }

    @Override
    protected void implementViews() {

    }

    @OnClick(R.id.click)
    public void buttonClick(){
        textView.setText("Yippee! we're using butterKnife..");
        showSuccess();
        loadFrag(ButterknifeFragment.newInstance("Testing","Butterknife"));
    }

    public void loadFrag(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_container,fragment);
        transaction.commit();
    }
}