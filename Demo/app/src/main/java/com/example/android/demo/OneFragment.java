package com.example.android.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Click;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EFragment;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.EFragmentArg;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2018/03/28 0028 11:48
 * 邮箱：1129943175@qq.com
 */
@EFragment(R.layout.fragment_one)
public class OneFragment extends BaseFragment {
    @ViewById
    TextView mText;
    @EFragmentArg
    String data;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "接收Activity传输到Fragment的数据:" + data, Toast.LENGTH_LONG).show();
    }


    @Click
    void mText() {
        Toast.makeText(getActivity(), "文字点击", Toast.LENGTH_LONG).show();
    }
}
