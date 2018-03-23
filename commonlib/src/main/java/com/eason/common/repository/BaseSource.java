package com.eason.common.repository;

/**
 * 默认使用 Observerable 对数据源进行包装,并且支持把当前 Source 转化为{@link Source_Interface}
 *
 * Created by Eason on 2018/3/22.
 */
public abstract class BaseSource<Source_Interface> implements ISource<Source_Interface> {

    private Class<Source_Interface> cls;

    public BaseSource(Class<Source_Interface> cls) {
        this.cls = cls;
    }

    @Override
    public Source_Interface wrap() {
        return SourceHelper.wrap(this,cls);
    }
}
