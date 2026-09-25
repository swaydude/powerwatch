package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public interface RxBleDevice {
    io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> establishConnection(boolean z);

    io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> establishConnection(boolean z, com.polidea.rxandroidble2.Timeout timeout);

    android.bluetooth.BluetoothDevice getBluetoothDevice();

    com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState getConnectionState();

    java.lang.String getMacAddress();

    java.lang.String getName();

    io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> observeConnectionStateChanges();
}
