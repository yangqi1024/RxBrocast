package com.yq.rxbroadcast;

import android.support.annotation.CheckResult;

import io.reactivex.annotations.NonNull;

/**
 * Description ...
 *
 * @author gsz
 * @create 2017/11/29
 * @since V1.0.1
 */
public class RxBroadcast {
    @CheckResult
    @NonNull
    public static BroadcastObservable netChanges(@NonNull NetBrocastReceiver receiver) {
        return new BroadcastObservable(receiver);
    }
}
