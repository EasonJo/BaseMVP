package io.armcha.arch;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.CallSuper;

/**
 * 此 Presenter 实现了{@link LifecycleObserver},可以监控 Activity 和 Fragment 的生命周期,所有具体的业务 Presenter
 * 都应该继承此 Presenter
 * @author Chatikyan on 20.05.2017.
 */
public abstract class BaseMVPPresenter<V extends BaseMVPContract.View> implements LifecycleObserver, BaseMVPContract.Presenter<V> {

    private Bundle stateBundle;
    private V view;

    @Override
    final public V getView() {
        return view;
    }

    @Override
    final public void attachLifecycle(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }

    @Override
    final public void detachLifecycle(Lifecycle lifecycle) {
        lifecycle.removeObserver(this);
    }

    @Override
    final public void attachView(V view) {
        this.view = view;
    }

    @Override
    final public void detachView() {
        view = null;
    }

    @Override
    final public boolean isViewAttached() {
        return view != null;
    }

    @Override
    final public Bundle getStateBundle() {
        return stateBundle == null
            ? stateBundle = new Bundle()
            : stateBundle;
    }

    @CallSuper
    @Override
    public void onPresenterDestroy() {
        if (stateBundle != null && !stateBundle.isEmpty()) {
            stateBundle.clear();
        }
    }

    @Override
    public void onPresenterCreate() {
        //NO-OP
    }
}
