package com.yq.rxbroadcast;

import io.reactivex.Observer;

/**
 * Description ...
 *
 * @author gsz
 * @create 2017/11/29
 * @since V1.0.1
 */
public class BroadcastObservable extends InitialValueObservable<Boolean>{
    private NetBrocastReceiver mBroadcastReceiver;
    public BroadcastObservable(NetBrocastReceiver receiver) {
        this.mBroadcastReceiver = receiver;
    }

    @Override
    protected void subscribeListener(Observer<? super Boolean> observer) {
        mBroadcastReceiver.setObserver(observer);
    }
}
