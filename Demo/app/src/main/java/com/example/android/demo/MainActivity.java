package com.example.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Click;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends FrameActivity {
    /**
     * 以下两种绑定View的方式
     */
    @ViewById
    TextView text;
    @ViewById(R.id.mButton)
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //以下是两种绑定view的点击方式
    @Click
    void text() {

    }

    @Click(R.id.mButton)
    void trans() {
        Intent intent = new Intent(this, TwoActivity.class);
        intent.putExtra("data", 12);
        startActivity(intent);
    }
}
