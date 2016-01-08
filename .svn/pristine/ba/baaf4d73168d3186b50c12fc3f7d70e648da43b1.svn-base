package com.elt.framework.library.http.query;

import com.elt.framework.library.http.data.Json;

/**
 * 作者：addison on 15/12/15 19:30
 * 邮箱：gengxin@elongtian.com
 */
public class JsonQueryBuilder extends ModelQueryBuilder {

    @Override
    protected CharSequence buildSencondaryValue(Object model) {
        try {
            return Json.get().toJson(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
