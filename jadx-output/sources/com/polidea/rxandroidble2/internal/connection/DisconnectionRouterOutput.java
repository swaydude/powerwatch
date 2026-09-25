package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public interface DisconnectionRouterOutput {
    <T> io.reactivex.Observable<T> asErrorOnlyObservable();

    io.reactivex.Observable<com.polidea.rxandroidble2.exceptions.BleException> asValueOnlyObservable();
}
