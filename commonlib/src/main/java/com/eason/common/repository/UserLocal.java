package com.eason.common.repository;

import io.reactivex.Observable;

/**
 * Created by Eason on 2018/3/22.
 */
class UserLocal extends BaseSource<UserLocalSource> implements UserLocalSource {
    public UserLocal(Class<UserLocalSource> cls) {
        super(cls);
    }

    @Override
    public Observable<String> getAge(int id) {
        return null;
    }
}
