package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattCannotStartException extends com.polidea.rxandroidble2.exceptions.BleGattException {
    @java.lang.Deprecated
    public BleGattCannotStartException(com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super((android.bluetooth.BluetoothGatt) null, bleGattOperationType);
    }

    public BleGattCannotStartException(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(bluetoothGatt, bleGattOperationType);
    }
}
