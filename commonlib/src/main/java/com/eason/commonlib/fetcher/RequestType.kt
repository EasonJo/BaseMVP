package com.eason.commonlib.fetcher

/**
 * 标示当前请求的类型.以便于记录不同的请求类型的状态.
 */
enum class RequestType {

    AUTH,
    POPULAR_SHOTS,
    RECENT_SHOTS,
    FOLLOWINGS_SHOTS,
    LIKED_SHOTS,
    COMMENTS,
    LIKE,
    TYPE_NONE
}