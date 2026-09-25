package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class DisconnectOperation extends com.polidea.rxandroidble2.internal.QueueOperation<java.lang.Void> {
    private final com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider;
    private final io.reactivex.Scheduler bluetoothInteractionScheduler;
    private final android.bluetooth.BluetoothManager bluetoothManager;
    private final com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangeListener;
    private final java.lang.String macAddress;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration;

    @bleshadow.javax.inject.Inject
    DisconnectOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.MAC_ADDRESS) java.lang.String str, android.bluetooth.BluetoothManager bluetoothManager, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) io.reactivex.Scheduler scheduler, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.DISCONNECT_TIMEOUT) com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangeListener) {
        this.rxBleGattCallback = rxBleGattCallback;
        this.bluetoothGattProvider = bluetoothGattProvider;
        this.macAddress = str;
        this.bluetoothManager = bluetoothManager;
        this.bluetoothInteractionScheduler = scheduler;
        this.timeoutConfiguration = timeoutConfiguration;
        this.connectionStateChangeListener = connectionStateChangeListener;
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected void protectedRun(final io.reactivex.ObservableEmitter<java.lang.Void> observableEmitter, final com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        this.connectionStateChangeListener.onConnectionStateChange(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTING);
        android.bluetooth.BluetoothGatt bluetoothGatt = this.bluetoothGattProvider.getBluetoothGatt();
        if (bluetoothGatt == null) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new java.lang.Object[0]);
            considerGattDisconnected(observableEmitter, queueReleaseInterface);
        } else {
            disconnectIfRequired(bluetoothGatt).observeOn(this.bluetoothInteractionScheduler).subscribe(new io.reactivex.SingleObserver<android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.DisconnectOperation.1
                @Override // io.reactivex.SingleObserver
                public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                }

                @Override // io.reactivex.SingleObserver
                public void onSuccess(android.bluetooth.BluetoothGatt bluetoothGatt2) {
                    bluetoothGatt2.close();
                    com.polidea.rxandroidble2.internal.operations.DisconnectOperation.this.considerGattDisconnected(observableEmitter, queueReleaseInterface);
                }

                @Override // io.reactivex.SingleObserver
                public void onError(java.lang.Throwable th) {
                    com.polidea.rxandroidble2.internal.RxBleLog.w(th, "Disconnect operation has been executed but finished with an error - considering disconnected.", new java.lang.Object[0]);
                    com.polidea.rxandroidble2.internal.operations.DisconnectOperation.this.considerGattDisconnected(observableEmitter, queueReleaseInterface);
                }
            });
        }
    }

    private io.reactivex.Single<android.bluetooth.BluetoothGatt> disconnectIfRequired(android.bluetooth.BluetoothGatt bluetoothGatt) {
        if (isDisconnected(bluetoothGatt)) {
            return io.reactivex.Single.just(bluetoothGatt);
        }
        return disconnect(bluetoothGatt);
    }

    void considerGattDisconnected(io.reactivex.Emitter<java.lang.Void> emitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        this.connectionStateChangeListener.onConnectionStateChange(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTED);
        queueReleaseInterface.release();
        emitter.onComplete();
    }

    private boolean isDisconnected(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return this.bluetoothManager.getConnectionState(bluetoothGatt.getDevice(), 7) == 0;
    }

    private io.reactivex.Single<android.bluetooth.BluetoothGatt> disconnect(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return new com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable(bluetoothGatt, this.rxBleGattCallback, this.bluetoothInteractionScheduler).timeout(this.timeoutConfiguration.timeout, this.timeoutConfiguration.timeoutTimeUnit, this.timeoutConfiguration.timeoutScheduler, io.reactivex.Single.just(bluetoothGatt));
    }

    private static class DisconnectGattObservable extends io.reactivex.Single<android.bluetooth.BluetoothGatt> {
        private final android.bluetooth.BluetoothGatt bluetoothGatt;
        private final io.reactivex.Scheduler disconnectScheduler;
        private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;

        DisconnectGattObservable(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, io.reactivex.Scheduler scheduler) {
            this.bluetoothGatt = bluetoothGatt;
            this.rxBleGattCallback = rxBleGattCallback;
            this.disconnectScheduler = scheduler;
        }

        @Override // io.reactivex.Single
        protected void subscribeActual(io.reactivex.SingleObserver<? super android.bluetooth.BluetoothGatt> singleObserver) {
            this.rxBleGattCallback.getOnConnectionStateChange().filter(new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>() { // from class: com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable.2
                @Override // io.reactivex.functions.Predicate
                public boolean test(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState rxBleConnectionState) {
                    return rxBleConnectionState == com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTED;
                }
            }).firstOrError().map(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState, android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable.1
                @Override // io.reactivex.functions.Function
                public android.bluetooth.BluetoothGatt apply(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState rxBleConnectionState) {
                    return com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable.this.bluetoothGatt;
                }
            }).subscribe(singleObserver);
            this.disconnectScheduler.createWorker().schedule(new java.lang.Runnable() { // from class: com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable.3
                @Override // java.lang.Runnable
                public void run() {
                    com.polidea.rxandroidble2.internal.operations.DisconnectOperation.DisconnectGattObservable.this.bluetoothGatt.disconnect();
                }
            });
        }
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
        return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(deadObjectException, this.macAddress, -1);
    }

    public java.lang.String toString() {
        return "DisconnectOperation{" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.macAddress) + '}';
    }
}
