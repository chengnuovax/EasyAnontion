package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.adapter.RecycleBaseAdapter;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2018/03/28 0028 09:47
 * 邮箱：1129943175@qq.com
 */
@EActivity(R.layout.activity_recycler)
public class RecyclerActivity extends FrameActivity implements HolderListen{
    @ViewById
    TextView mText;
    @ViewById
    RecyclerView mRecyclerView;
    RecycleBaseAdapter baseAdapter;
    List datas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datas = new ArrayList<String>();
        datas.add("一");
        datas.add("二");
        datas.add("三");
        datas.add("四");
        datas.add("五");
        datas.add("六");
        datas.add("七");
        datas.add("八");
        datas.add("九");
        datas.add("十");
        datas.add("十一");
        datas.add("十二");
        datas.add("十三");
        datas.add("十四");
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        //设置RecyclerView 布局
        mRecyclerView.setLayoutManager(layoutmanager);
        baseAdapter = new RecycleBaseAdapter(datas, ListHolder.class, this);
        mRecyclerView.setAdapter(baseAdapter);
    }

    @Override
    public void OnItem(int postion) {
        Toast.makeText(this, "点击第" + postion + "个", Toast.LENGTH_LONG).show();
    }
}
