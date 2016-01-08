package com.elt.framework;

import com.elt.framework.library.BaseApplication;
import com.elt.framework.library.http.EltHttp;
import com.elt.framework.library.http.HttpConfig;
import com.elt.framework.library.common.log.Elog;

/**
 * 作者：addison on 14/12/15 14:47
 * 邮箱：gengxin@elongtian.com
 */
public class EltApplication extends BaseApplication {

    /**网络请求工具类*/
    private EltHttp mEltHttp;
    /**连接超时时间*/
    private static final int CONNECT_TIMEOUT_DEFAULT = 10000;
    /**读取超时时间*/
    private static final int SOCKET_TIMEOUT_DEFAULT = 10000;


    @Override
    public void onCreate() {
        super.onCreate();
        Elog.init(true);
        initHttpConfig();
    }

    /**
     * 网络初始化
     */
    private void initHttpConfig() {
        if(null == mEltHttp){
            HttpConfig config = new HttpConfig(this)
                    .setDebugged(true)
                    .setDetectNetwork(true)              //探测网络状态
                    .setDoStatistics(true)               // 数据统计分析
                    .setUserAgent("Mozilla/5.0 (...)")   // User-Agent
                    .setTimeOut(CONNECT_TIMEOUT_DEFAULT, SOCKET_TIMEOUT_DEFAULT);
            mEltHttp = EltHttp.newApacheHttpClient(config);
        } else{
            mEltHttp.getConfig()
                    .setDebugged(true)
                    .setDetectNetwork(true)              //探测网络状态
                    .setDoStatistics(true)               // 数据统计分析
                    .setUserAgent("Mozilla/5.0 (...)")   // User-Agent
                    .setTimeOut(CONNECT_TIMEOUT_DEFAULT, SOCKET_TIMEOUT_DEFAULT);
        }
    }
}
