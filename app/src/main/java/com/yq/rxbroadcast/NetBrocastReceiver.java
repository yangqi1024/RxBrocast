package com.yq.rxbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import io.reactivex.Observer;

import static android.content.Context.CONNECTIVITY_SERVICE;


/**
 * Description ...
 *
 * @author gsz
 * @create 2017/11/29
 * @since V1.0.1
 */
public class NetBrocastReceiver extends BroadcastReceiver {
    private Observer<? super Boolean> mObserver;

    public void setObserver(Observer<? super Boolean> observer) {
        this.mObserver = observer;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectionManager = (ConnectivityManager) context.getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
        if(mObserver != null){
            mObserver.onNext(networkInfo != null && networkInfo.isAvailable());
        }
    }
}
