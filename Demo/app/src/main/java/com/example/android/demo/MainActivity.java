package com.example.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Click;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends FrameActivity {
    /**
     * 以下两种绑定View的方式
     */
    @ViewById(R.id.mButtonListView)
    Button mButtonListView;//查看ListView界面

    @ViewById
    Button mButtonRecyclerView;//查看RecyclerView界面

    @ViewById(R.id.mButtonFragment)
    Button mButtonFragment;//查看Fragment界面


    @Click(R.id.mButtonListView)
    void trans() {
        Intent intent = new Intent(this, ListViewActivity.class);
        intent.putExtra("data", 12);
        startActivity(intent);
    }

    @Click
    void mButtonRecyclerView() {

    }

    @Click
    void mButtonFragment() {
        Intent intent = new Intent(this, FragmentActivity.class);
        intent.putExtra("data", "跳转到Fragment界面");
        startActivity(intent);
    }
}
