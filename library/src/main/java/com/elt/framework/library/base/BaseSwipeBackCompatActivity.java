package com.elt.framework.library.base;

import android.os.Bundle;
import android.view.View;

import com.elt.framework.library.swipeback.SwipeBackActivityBase;
import com.elt.framework.library.swipeback.SwipeBackActivityHelper;
import com.elt.framework.library.swipeback.SwipeBackLayout;
import com.elt.framework.library.swipeback.SwipeBackUtils;

/**
 * 作者：addison on 15/12/15 09:28
 * 邮箱：gengxin@elongtian.com
 * 可滑动返回的baseactivity
 */
public abstract class BaseSwipeBackCompatActivity extends BaseAppCompatActivity implements SwipeBackActivityBase {
    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
    }

    @Override
    public View findViewById(int id) {
        View v = super.findViewById(id);
        if (v == null && mHelper != null)
            return mHelper.findViewById(id);
        return v;
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        SwipeBackUtils.convertActivityToTranslucent(this);
        getSwipeBackLayout().scrollToFinishActivity();
    }
}
