package com.example.android.demo;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2018/03/28 0028 09:47
 * 邮箱：1129943175@qq.com
 */
@EActivity(R.layout.activity_recycler)
public class RecyclerActivity extends FrameActivity {
    @ViewById
    TextView mText;
    @ViewById
    RecyclerView mRecyclerView;
}
