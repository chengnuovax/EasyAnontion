package com.example.android.demo;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Map;

import morexcess.chengnuovax.easyanontion.adapter.BaseHolder;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Layout;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2018/03/27 0027 15:25
 * 邮箱：1129943175@qq.com
 */
@Layout(R.layout.two_list_item)
public class ListHolder extends BaseHolder<HolderListen> {
    /**
     * view绑定
     */
    @ViewById
    ImageView mImage;
    @ViewById
    TextView mText;

    @Override
    protected void setData(Context context, Object obj, Map<Object, Object> map, final int position, int size) {
        super.setData(context, obj, map, position, size);
        String data = (String) obj;
        mText.setText("第" + data + "项");
        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.OnItem(position);
                }
            }
        });
    }
}
