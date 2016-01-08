package com.elt.framework.library.http.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * 作者：addison on 15/12/15 17:57
 * 邮箱：gengxin@elongtian.com
 * 缓存过期
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpCacheExpire {
    long value();

    TimeUnit unit();
}

