package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class ActiveCharacteristicNotification {
    public final boolean isIndication;
    public final io.reactivex.Observable<io.reactivex.Observable<byte[]>> notificationObservable;

    public ActiveCharacteristicNotification(io.reactivex.Observable<io.reactivex.Observable<byte[]>> observable, boolean z) {
        this.notificationObservable = observable;
        this.isIndication = z;
    }
}
