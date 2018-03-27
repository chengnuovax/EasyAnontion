package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.adapter.SimpleBaseAdapter;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Extra;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2017/9/29 15:43
 * 邮箱：1129943175@qq.com
 */
@EActivity(R.layout.activity_two)
public class TwoActivity extends FrameActivity implements HolderListen {
    @ViewById
    ModleLayout mModleLayout;
    @ViewById
    ListView mList;
    /**
     * 适配器
     */
    BaseAdapter baseAdapter;
    List datas;
    /**
     * 获取intent传输的数据(跟intent传输数据一样)
     */
    @Extra
    int data;

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
        baseAdapter = new SimpleBaseAdapter<ListHolder, HolderListen>(datas, ListHolder.class, this);
        mList.setAdapter(baseAdapter);
        Toast.makeText(this, "从MainActivity携带过来的参数：" + data, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnItem(int postion) {
        mModleLayout.setText("第" + postion + "图片被点击");
    }
}
