package com.eason.common.repository;

/**
 * Created by Eason on 2018/3/22.
 */

public abstract class BaseRemoteSource<Remote> extends BaseSource<Remote> {

    public BaseRemoteSource(Class<Remote> cls) {
        super(cls);
    }
}
