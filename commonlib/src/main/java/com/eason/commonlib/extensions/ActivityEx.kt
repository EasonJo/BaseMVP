package com.eason.commonlib.extensions

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.support.v4.content.ContextCompat

/**
 * @see [ContextCompat.startActivity]
 */
inline fun <reified T> Activity.start() {
    this.startActivity(Intent(this, T::class.java))
}

/**
 * 是否是竖屏
 */
fun Activity.isPortrait() = this.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT

/**
 * 获取颜色
 */
infix fun Activity.takeColor(colorId: Int) = ContextCompat.getColor(this, colorId)
