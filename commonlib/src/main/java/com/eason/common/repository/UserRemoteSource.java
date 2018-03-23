package com.eason.common.repository;

import io.reactivex.Observable;

/**
 * Created by Eason on 2018/3/22.
 */

public interface UserRemoteSource extends ISource<UserRemoteSource> {

    @OnIOThread(true)
    Observable<String> getUserName(int id);
}
