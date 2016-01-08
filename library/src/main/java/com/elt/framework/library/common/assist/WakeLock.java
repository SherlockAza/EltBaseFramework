package com.elt.framework.library.common.assist;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;

/**
 * 作者：addison on 8/1/16 10:56
 * 邮箱：gengxin@elongtian.com
 * 屏幕管理， 点亮、关闭屏幕，判断屏幕是否点亮
 * 需要<uses-permission android:name="android.permission.WAKE_LOCK"/>
 */
public class WakeLock {
    PowerManager powerManager;
    PowerManager.WakeLock wakeLock;

    public WakeLock(Context context, String tag) {
        ////获取电源的服务 声明电源管理器
        powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP | PowerManager.FULL_WAKE_LOCK, tag);
    }

    /**
     * Call requires API level 7
     */
    public boolean isScreenOn() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.ECLAIR_MR1) {
            Log.e("Log : ", "can not call isScreenOn if SDK_INT < 7 ");
            return false;
        } else {
            return powerManager.isScreenOn();
        }
    }

    public void turnScreenOn() {
        //点亮亮屏
        Log.i("Log : ", "PowerManager.WakeLock : wakeLock.isHeld: " + wakeLock.isHeld());
        if (!wakeLock.isHeld()) {
            Log.i("Log : ", "PowerManager.WakeLock : 点亮屏幕");
            wakeLock.acquire();
        }
    }

    public void turnScreenOff() {
        //释放亮屏
        Log.i("Log : ", "PowerManager.WakeLock : wakeLock.isHeld: " + wakeLock.isHeld());
        if (wakeLock.isHeld()) {
            Log.i("Log : ", "PowerManager.WakeLock : 灭掉屏幕");
            try {
                wakeLock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void release() {
        if (wakeLock != null && wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public PowerManager.WakeLock getWakeLock() {
        return wakeLock;
    }

    public void setWakeLock(PowerManager.WakeLock wakeLock) {
        this.wakeLock = wakeLock;
    }

    public PowerManager getPowerManager() {
        return powerManager;
    }

    public void setPowerManager(PowerManager powerManager) {
        this.powerManager = powerManager;
    }

}
