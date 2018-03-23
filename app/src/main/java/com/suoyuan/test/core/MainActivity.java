package com.suoyuan.test.core;

import android.widget.TextView;

import com.jlenx.core.android.ui.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.tv_text)
    TextView tvText;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        this.tvText.setText(R.string.app_name);
    }

}
