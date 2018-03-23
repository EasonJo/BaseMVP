package com.eason.common.repository;

/**
 * 数据源的基本接口,提供一个方法,可以将自己包装成另外一种数据源.比如加入 Rxjava 的支持.
 * Created by Eason on 2018/3/22.
 */
public interface ISource<Source_Interface> {

    /**
     * 对数据源进行包装
     * @return {@link Source_Interface}
     */
    Source_Interface wrap();
}
