package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattCallbackTimeoutException extends com.polidea.rxandroidble2.exceptions.BleGattException {
    public BleGattCallbackTimeoutException(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(bluetoothGatt, bleGattOperationType);
    }
}
