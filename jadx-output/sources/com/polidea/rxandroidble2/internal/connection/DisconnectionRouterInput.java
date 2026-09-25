package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
interface DisconnectionRouterInput {
    void onDisconnectedException(com.polidea.rxandroidble2.exceptions.BleDisconnectedException bleDisconnectedException);

    void onGattConnectionStateException(com.polidea.rxandroidble2.exceptions.BleGattException bleGattException);
}
