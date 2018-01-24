package com.eason.commonlib.fetcher

/**
 * 密封类
 * [https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/mi_feng_lei.html]
 * @author Eason
 */
sealed class Status {
    object LOADING : Status()
    object ERROR : Status()
    object SUCCESS : Status()
    object EMPTY_SUCCESS : Status()
    object IDLE : Status()
}