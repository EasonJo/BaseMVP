package com.eason.common.repository;

import io.reactivex.Observable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理生成 Source_Interface 的代理类.
 * Created by Eason on 2018/3/22.
 */
public final class SourceHelper {

    /**
     * 生成一个Cls接口的代理类.代理BaseSource的子类.其中 BaseSource 的子类需要实现 cls 接口.
     *
     * @param baseSource {@link BaseSource}
     * @param cls        {@link Source_Interface}
     * @return Source_Interface
     */
    public static <Source_Interface> Source_Interface wrap(final BaseSource<Source_Interface> baseSource, Class<Source_Interface> cls) {
        return (Source_Interface) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(baseSource, args);
                if (isWrap(method) && invoke instanceof Observable) {
                    //See MVPDemo
                    //return ObservableHelper.wrap((Observable<AbsEntity>) invoke);
                }
                return invoke;
            }

            private boolean isWrap(Method method) {
                OnIOThread onIOThread = method.getAnnotation(OnIOThread.class);
                return onIOThread != null && onIOThread.value();
            }
        });
    }
}
