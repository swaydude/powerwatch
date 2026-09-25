package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattDescriptorException extends com.polidea.rxandroidble2.exceptions.BleGattException {
    public final android.bluetooth.BluetoothGattDescriptor descriptor;

    public BleGattDescriptorException(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(bluetoothGatt, i, bleGattOperationType);
        this.descriptor = bluetoothGattDescriptor;
    }
}
