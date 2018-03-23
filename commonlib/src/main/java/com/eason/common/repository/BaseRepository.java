package com.eason.common.repository;

/**
 * 基本的数据仓库,其中包含了远程仓库和本地仓库
 *
 * Created by Eason on 2018/3/22.
 */
public abstract class BaseRepository<Remote,Local> {
    private Remote remote;
    private Local local;

    public BaseRepository(Remote remote, Local local) {
        this.remote = remote;
        this.local = local;
    }

    public Remote remote(){
        return remote;
    }

    public Local local(){
        return local;
    }
}
