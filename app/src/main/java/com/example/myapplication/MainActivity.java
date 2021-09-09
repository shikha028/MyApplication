package com.example.myapplication;

import static com.example.myapplication.Days.MONDAY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.MyViewPager.MyPagerActivity;
import com.example.myapplication.useButterKnife.HomeActivity;
import com.example.myapplication.viewPager.MyActivity;
import com.example.myapplication.viewPager.MyPagerAdapter;

import butterknife.BindView;

public class MainActivity extends ViewStateActivity {

    @BindView(R.id.tv_name)
    TextView textView;
    @BindView(R.id.btn_changeText)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initializeViews() {
        //textView = findViewById(R.id.tv_name);
        //button = findViewById(R.id.btn_changeText);
    }

    @Override
    protected void implementViews() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello Shikha...");
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        try {
            int res = 4 / 0;
            showSuccess();
        } catch (ArithmeticException ex) {
            showError();
        }


    }

    protected void translate(Days day){
        switch (day){
            case MONDAY:
                showToast("सोमवार");
                break;
            case TUESDAY:
                showToast("मंगलवार");
                break;
            case WEDNESDAY:
                showToast("बुधवार");
                break;
            case THURSDAY:
                showToast("गुरूवार");
                break;
            case FRIDAY:
                showToast("शुक्रवार");
                break;
            case SATURDAY:
                showToast("शनिवार");
                break;
            case SUNDAY:
                showToast("रविवार");
                break;
        }
    }
}