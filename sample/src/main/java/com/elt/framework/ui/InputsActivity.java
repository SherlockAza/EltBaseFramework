package com.elt.framework.ui;

import android.os.Bundle;
import android.view.View;

import com.elt.framework.R;
import com.elt.framework.library.base.BaseActivity;
import com.elt.framework.library.bean.ErrorBean;
import com.elt.framework.library.eventbus.EventCenter;
import com.elt.framework.library.netstatus.NetUtils;

/**
 * 作者：addison on 28/12/15 18:02
 * 邮箱：gengxin@elongtian.com
 */
public class InputsActivity extends BaseActivity {
    @Override
    protected boolean isApplyKitKatTranslucency() {
        return true;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.act_inputs;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.RIGHT;
    }

    @Override
    public void showBusinessError(ErrorBean error) {

    }

    @Override
    public void showDialogLoading(String msg) {

    }

    @Override
    public void dismissDialogLoading() {

    }
}
