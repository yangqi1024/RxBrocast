package com.yq.rxbroadcast;

import io.reactivex.Observable;
import io.reactivex.Observer;


/**
 * Description ...
 *
 * @author gsz
 * @create 2017/11/29
 * @since V1.0.1
 */
public abstract class InitialValueObservable<T> extends Observable<T> {
    @Override
    protected void subscribeActual(Observer<? super T> observer) {
        subscribeListener(observer);
    }

    protected abstract void subscribeListener(Observer<? super T> observer);
}
