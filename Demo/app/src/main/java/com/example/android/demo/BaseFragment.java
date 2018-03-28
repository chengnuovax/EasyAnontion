package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import morexcess.chengnuovax.easyanontion.simpleannotion.AnnotionInit;

/**
 * 作者：zhangshupei on 2018/03/28 0028 10:22
 * 邮箱：1129943175@qq.com
 */
public abstract class BaseFragment extends Fragment {

    private View mView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = AnnotionInit.getInstance().initView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AnnotionInit.getInstance().init(this);
    }

}
