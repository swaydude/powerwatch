package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public interface RxBleRadioOperationCustom<T> extends com.polidea.rxandroidble2.RxBleCustomOperation<T> {
    @Override // com.polidea.rxandroidble2.RxBleCustomOperation
    io.reactivex.Observable<T> asObservable(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, io.reactivex.Scheduler scheduler) throws java.lang.Throwable;
}
