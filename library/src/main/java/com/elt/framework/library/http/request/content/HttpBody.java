package com.elt.framework.library.http.request.content;

import com.elt.framework.library.http.listener.HttpListener;
import com.elt.framework.library.http.request.AbstractRequest;

/**
 * 作者：addison on 15/12/15 19:16
 * 邮箱：gengxin@elongtian.com
 */
public abstract class HttpBody {
    protected HttpListener httpListener;
    protected AbstractRequest request;
    public String contentType;

    public String getContentType() {
        return contentType;
    }

    public HttpListener getHttpListener() {
        return httpListener;
    }

    public void setHttpListener(HttpListener httpListener) {
        this.httpListener = httpListener;
    }

    public AbstractRequest getRequest() {
        return request;
    }

    public void setRequest(AbstractRequest request) {
        this.request = request;
        setHttpListener(request.getHttpListener());
    }
}
