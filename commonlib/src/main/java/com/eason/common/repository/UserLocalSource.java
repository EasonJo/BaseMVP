package com.eason.common.repository;

import io.reactivex.Observable;

/**
 * Created by Eason on 2018/3/22.
 */

public interface UserLocalSource extends ISource<UserLocalSource> {
    @OnIOThread(true)
    Observable<String> getAge(int id);
}
