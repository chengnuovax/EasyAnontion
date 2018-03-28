package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import morexcess.chengnuovax.easyanontion.FrameActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EActivity;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Extra;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2018/03/28 0028 10:21
 * 邮箱：1129943175@qq.com
 */
@EActivity(R.layout.activity_fragment)
public class FragmentActivity extends FrameActivity {
    @ViewById
    FrameLayout mContent;

    @Extra
    String data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        OneFragment oneFragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putString("data", data);
        oneFragment.setArguments(bundle);

        transaction.add(R.id.mContent, oneFragment);
        transaction.show(oneFragment);
        transaction.commitAllowingStateLoss();
    }
}
