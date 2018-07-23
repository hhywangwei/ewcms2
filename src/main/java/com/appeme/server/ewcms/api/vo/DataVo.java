package com.appeme.server.ewcms.api.vo;

import java.util.List;

/**
 * 集合数据输出
 *
 * @author WangWei
 */
public class DataVo<T> {
    private final List<T> data;

    public DataVo(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }
}
