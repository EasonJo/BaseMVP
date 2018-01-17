package com.eason.commonlib.presenter


/**
 * Created by Chatikyan on 31.07.2017.
 */
interface BaseContract {

    interface View : io.armcha.arch.BaseMVPContract.View

    interface Presenter<V : io.armcha.arch.BaseMVPContract.View> : io.armcha.arch.BaseMVPContract.Presenter<V>
}