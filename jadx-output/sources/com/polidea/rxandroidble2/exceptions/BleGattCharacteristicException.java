package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattCharacteristicException extends com.polidea.rxandroidble2.exceptions.BleGattException {
    public final android.bluetooth.BluetoothGattCharacteristic characteristic;

    public BleGattCharacteristicException(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(bluetoothGatt, i, bleGattOperationType);
        this.characteristic = bluetoothGattCharacteristic;
    }
}
