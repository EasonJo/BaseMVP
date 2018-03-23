package com.eason.common.repository;

import io.reactivex.Observable;

/**
 * 远程 Source 的实现类
 * Created by Eason on 2018/3/22.
 */
public class UserRemote extends BaseSource<UserRemoteSource> implements UserRemoteSource {
    public UserRemote(Class<UserRemoteSource> cls) {
        super(cls);
    }

    @Override
    public Observable<String> getUserName(int id) {
        return null;
    }
}
