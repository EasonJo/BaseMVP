package com.eason.commonlib.extensions

import android.util.Log
import java.util.*

class LogUtils private constructor() {

    init {
        throw UnsupportedOperationException(this.javaClass.simpleName + " cannot be instantiated")
    }

    interface JsonFormatter {
        fun formatJson(content: String): String
    }

    private class DefaultFormatter : JsonFormatter {
        override fun formatJson(content: String): String {
            return content
        }
    }

    companion object {
        private var APP_TAG = "LogUtils"

        private val sCachedTag = HashMap<String, String>()
        private var sJsonFormatter: JsonFormatter = DefaultFormatter()

        fun Init(appTag: String) {
            APP_TAG = appTag
        }

        fun Init(appTag: String, formatter: JsonFormatter) {
            APP_TAG = appTag
            sJsonFormatter = formatter
        }

        fun i(message: String) {
            Log.i(buildTag(APP_TAG), buildMessage(message))
        }

        fun d(message: String) {
            Log.d(buildTag(APP_TAG), buildMessage(message))
        }

        fun w(message: String) {
            Log.w(buildTag(APP_TAG), buildMessage(message))
        }

        fun e(message: String) {
            Log.e(buildTag(APP_TAG), buildMessage(message))
        }

        fun v(message: String) {
            Log.v(buildTag(APP_TAG), buildMessage(message))
        }

        fun wtf(message: String) {
            Log.wtf(buildTag(APP_TAG), buildMessage(message))
        }

        fun json(message: String) {
            Log.v(buildTag(APP_TAG), buildMessage(message))
        }

        fun i(tag: String, message: String) {
            Log.i(buildTag(tag), buildMessage(message))
        }

        fun d(tag: String, message: String) {
            Log.d(buildTag(tag), buildMessage(message))
        }

        fun w(tag: String, message: String) {
            Log.w(buildTag(tag), buildMessage(message))
        }

        fun e(tag: String, message: String) {
            Log.e(buildTag(tag), buildMessage(message))
        }

        fun v(tag: String, message: String) {
            Log.v(buildTag(tag), buildMessage(message))
        }

        fun wtf(tag: String, message: String) {
            Log.wtf(buildTag(tag), buildMessage(message))
        }

        fun json(tag: String, content: String) {
            Log.v(buildTag(tag), buildMessage(formatJson(content)))
        }

        private fun buildTag(tag: String): String {
            val key = String.format(Locale.US, "%s@%s", tag, Thread.currentThread().name)

            if (!sCachedTag.containsKey(key)) {
                if (APP_TAG == tag) {
                    sCachedTag.put(key, String.format(Locale.US, "|%s|%s|",
                            tag,
                            Thread.currentThread().name
                    ))
                } else {
                    sCachedTag.put(key, String.format(Locale.US, "|%s_%s|%s|",
                            APP_TAG,
                            tag,
                            Thread.currentThread().name
                    ))
                }
            }

            return sCachedTag[key]!!
        }

        private fun buildMessage(message: String): String {
            val traceElements = Thread.currentThread().stackTrace

            if (traceElements == null || traceElements.size < 4) {
                return message
            }
            val traceElement = traceElements[4]

            return String.format(Locale.US, "%s.%s(%s:%d) %s",
                    traceElement.className.substring(traceElement.className.lastIndexOf(".") + 1),
                    traceElement.methodName,
                    traceElement.fileName,
                    traceElement.lineNumber,
                    message
            )
        }

        private fun formatJson(content: String): String {
            return String.format(Locale.US, "\n%s", sJsonFormatter.formatJson(content))
        }
    }
}