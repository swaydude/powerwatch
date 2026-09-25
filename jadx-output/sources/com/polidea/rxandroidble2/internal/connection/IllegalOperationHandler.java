package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IllegalOperationHandler {
    protected com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator messageCreator;

    public abstract com.polidea.rxandroidble2.internal.BleIllegalOperationException handleMismatchData(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    IllegalOperationHandler(com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator illegalOperationMessageCreator) {
        this.messageCreator = illegalOperationMessageCreator;
    }
}
