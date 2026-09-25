package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class ThrowingIllegalOperationHandler extends com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler {
    @bleshadow.javax.inject.Inject
    public ThrowingIllegalOperationHandler(com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator illegalOperationMessageCreator) {
        super(illegalOperationMessageCreator);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler
    public com.polidea.rxandroidble2.internal.BleIllegalOperationException handleMismatchData(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return new com.polidea.rxandroidble2.internal.BleIllegalOperationException(this.messageCreator.createMismatchMessage(bluetoothGattCharacteristic, i), bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), i);
    }
}
