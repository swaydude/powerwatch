package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public interface Connector {
    io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> prepareConnection(com.polidea.rxandroidble2.ConnectionSetup connectionSetup);
}
