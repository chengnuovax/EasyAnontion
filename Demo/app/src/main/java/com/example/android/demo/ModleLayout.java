package com.example.android.demo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import morexcess.chengnuovax.easyanontion.FrameViewGroup;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.Layout;
import morexcess.chengnuovax.easyanontion.simpleannotion.annotion.ViewById;

/**
 * 作者：zhangshupei on 2017/9/29 15:35
 * 邮箱：1129943175@qq.com
 */
@Layout(R.layout.layout_module)
public class ModleLayout extends FrameViewGroup {
    @ViewById
    TextView mText;

    public ModleLayout(Context context) {
        super(context);
    }

    public ModleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
