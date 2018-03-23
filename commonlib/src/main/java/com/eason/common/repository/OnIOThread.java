package com.eason.common.repository;

/**
 * 自定义枚举,用来标示是否在 IO 线程上执行.
 * Created by Eason on 2018/3/23.
 */

public @interface OnIOThread {
    boolean value();
}
