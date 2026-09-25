package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class LoggingIllegalOperationHandler extends com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler {
    @bleshadow.javax.inject.Inject
    public LoggingIllegalOperationHandler(com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator illegalOperationMessageCreator) {
        super(illegalOperationMessageCreator);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler
    public com.polidea.rxandroidble2.internal.BleIllegalOperationException handleMismatchData(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        com.polidea.rxandroidble2.internal.RxBleLog.w(this.messageCreator.createMismatchMessage(bluetoothGattCharacteristic, i), new java.lang.Object[0]);
        return null;
    }
}
