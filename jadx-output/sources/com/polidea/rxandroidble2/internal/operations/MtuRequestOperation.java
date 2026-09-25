package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class MtuRequestOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<java.lang.Integer> {
    private final int mtu;

    @bleshadow.javax.inject.Inject
    MtuRequestOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, int i) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.ON_MTU_CHANGED, timeoutConfiguration);
        this.mtu = i;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<java.lang.Integer> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnMtuChanged().firstOrError();
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.mtu);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "MtuRequestOperation{" + super.toString() + ", mtu=" + this.mtu + '}';
    }
}
