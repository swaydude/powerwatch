package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionPriorityChangeOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<java.lang.Long> {
    private final int connectionPriority;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration successTimeoutConfiguration;

    private java.lang.String connectionPriorityToString(int i) {
        return i != 2 ? "CONNECTION_PRIORITY_BALANCED" : "CONNECTION_PRIORITY_LOW_POWER";
    }

    @bleshadow.javax.inject.Inject
    ConnectionPriorityChangeOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, int i, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration2) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CONNECTION_PRIORITY_CHANGE, timeoutConfiguration);
        this.connectionPriority = i;
        this.successTimeoutConfiguration = timeoutConfiguration2;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<java.lang.Long> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return io.reactivex.Single.timer(this.successTimeoutConfiguration.timeout, this.successTimeoutConfiguration.timeoutTimeUnit, this.successTimeoutConfiguration.timeoutScheduler);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) throws com.polidea.rxandroidble2.exceptions.BleGattCannotStartException, java.lang.IllegalArgumentException {
        return bluetoothGatt.requestConnectionPriority(this.connectionPriority);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "ConnectionPriorityChangeOperation{" + super.toString() + ", connectionPriority=" + connectionPriorityToString(this.connectionPriority) + ", successTimeout=" + this.successTimeoutConfiguration + '}';
    }
}
