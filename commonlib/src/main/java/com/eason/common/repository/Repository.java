package com.eason.common.repository;

/**
 * Created by Eason on 2018/3/22.
 */

public class Repository extends BaseRepository<UserRemote,UserLocal> {

    public Repository(UserRemote userRemote, UserLocal userLocal) {
        super(userRemote, userLocal);
    }
}
