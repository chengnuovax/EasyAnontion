package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Extra;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2017/9/29 15:43
 * 邮箱：1129943175@qq.com
 */
@EActivity(R.layout.activity_two)
public class TwoActivity extends FrameActivity {
    @ViewById
    ModleLayout mModleLayout;
    @ViewById
    ListView mList;
    /**
     * 获取intent传输的数据
     */
    @Extra
    int data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
