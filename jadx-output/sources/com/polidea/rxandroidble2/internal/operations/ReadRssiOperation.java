package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ReadRssiOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<java.lang.Integer> {
    @bleshadow.javax.inject.Inject
    ReadRssiOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.READ_RSSI, timeoutConfiguration);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<java.lang.Integer> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnRssiRead().firstOrError();
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "ReadRssiOperation{" + super.toString() + '}';
    }
}
