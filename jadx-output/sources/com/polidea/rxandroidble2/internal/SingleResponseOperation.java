package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SingleResponseOperation<T> extends com.polidea.rxandroidble2.internal.QueueOperation<T> {
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private final com.polidea.rxandroidble2.exceptions.BleGattOperationType operationType;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration;

    protected abstract io.reactivex.Single<T> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback);

    protected abstract boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt);

    public SingleResponseOperation(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration) {
        this.bluetoothGatt = bluetoothGatt;
        this.rxBleGattCallback = rxBleGattCallback;
        this.operationType = bleGattOperationType;
        this.timeoutConfiguration = timeoutConfiguration;
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected final void protectedRun(io.reactivex.ObservableEmitter<T> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) throws java.lang.Exception {
        com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper queueReleasingEmitterWrapper = new com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper(observableEmitter, queueReleaseInterface);
        getCallback(this.rxBleGattCallback).timeout(this.timeoutConfiguration.timeout, this.timeoutConfiguration.timeoutTimeUnit, this.timeoutConfiguration.timeoutScheduler, timeoutFallbackProcedure(this.bluetoothGatt, this.rxBleGattCallback, this.timeoutConfiguration.timeoutScheduler)).toObservable().subscribe(queueReleasingEmitterWrapper);
        if (startOperation(this.bluetoothGatt)) {
            return;
        }
        queueReleasingEmitterWrapper.cancel();
        queueReleasingEmitterWrapper.onError(new com.polidea.rxandroidble2.exceptions.BleGattCannotStartException(this.bluetoothGatt, this.operationType));
    }

    protected io.reactivex.Single<T> timeoutFallbackProcedure(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, io.reactivex.Scheduler scheduler) {
        return io.reactivex.Single.error(new com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException(this.bluetoothGatt, this.operationType));
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
        return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(deadObjectException, this.bluetoothGatt.getDevice().getAddress(), -1);
    }

    public java.lang.String toString() {
        return com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.bluetoothGatt);
    }
}
