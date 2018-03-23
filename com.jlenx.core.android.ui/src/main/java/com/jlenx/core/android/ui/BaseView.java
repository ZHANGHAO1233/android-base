package com.jlenx.core.android.ui;

public interface BaseView {
    /*******
     * 内嵌加载
     *******/
    void showLoading(String title);

    void stopLoading();

    void showErrorTip(String msg);
}
