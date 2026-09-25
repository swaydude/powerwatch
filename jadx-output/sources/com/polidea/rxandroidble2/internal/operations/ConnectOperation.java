package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectOperation extends com.polidea.rxandroidble2.internal.QueueOperation<android.bluetooth.BluetoothGatt> {
    private final boolean autoConnect;
    private final android.bluetooth.BluetoothDevice bluetoothDevice;
    private final com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration connectTimeout;
    private final com.polidea.rxandroidble2.internal.util.BleConnectionCompat connectionCompat;
    private final com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangedAction;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;

    @bleshadow.javax.inject.Inject
    ConnectOperation(android.bluetooth.BluetoothDevice bluetoothDevice, com.polidea.rxandroidble2.internal.util.BleConnectionCompat bleConnectionCompat, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.CONNECT_TIMEOUT) com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.connection.ConnectionComponent.NamedBooleans.AUTO_CONNECT) boolean z, com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangeListener) {
        this.bluetoothDevice = bluetoothDevice;
        this.connectionCompat = bleConnectionCompat;
        this.rxBleGattCallback = rxBleGattCallback;
        this.bluetoothGattProvider = bluetoothGattProvider;
        this.connectTimeout = timeoutConfiguration;
        this.autoConnect = z;
        this.connectionStateChangedAction = connectionStateChangeListener;
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected void protectedRun(io.reactivex.ObservableEmitter<android.bluetooth.BluetoothGatt> observableEmitter, final com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        observableEmitter.setDisposable((io.reactivex.observers.DisposableSingleObserver) getConnectedBluetoothGatt().compose(wrapWithTimeoutWhenNotAutoconnecting()).doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.1
            @Override // io.reactivex.functions.Action
            public void run() {
                queueReleaseInterface.release();
            }
        }).subscribeWith(com.polidea.rxandroidble2.internal.util.DisposableUtil.disposableSingleObserverFromEmitter(observableEmitter)));
        if (this.autoConnect) {
            queueReleaseInterface.release();
        }
    }

    private io.reactivex.SingleTransformer<android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGatt> wrapWithTimeoutWhenNotAutoconnecting() {
        return new io.reactivex.SingleTransformer<android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.2
            @Override // io.reactivex.SingleTransformer
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public io.reactivex.SingleSource<android.bluetooth.BluetoothGatt> apply2(io.reactivex.Single<android.bluetooth.BluetoothGatt> single) {
                return com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.autoConnect ? single : single.timeout(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectTimeout.timeout, com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectTimeout.timeoutTimeUnit, com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectTimeout.timeoutScheduler, com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.prepareConnectionTimeoutError());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Single<android.bluetooth.BluetoothGatt> prepareConnectionTimeoutError() {
        return io.reactivex.Single.fromCallable(new java.util.concurrent.Callable<android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public android.bluetooth.BluetoothGatt call() {
                throw new com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.bluetoothGattProvider.getBluetoothGatt(), com.polidea.rxandroidble2.exceptions.BleGattOperationType.CONNECTION_STATE);
            }
        });
    }

    private io.reactivex.Single<android.bluetooth.BluetoothGatt> getConnectedBluetoothGatt() {
        return io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe<android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.4
            @Override // io.reactivex.SingleOnSubscribe
            public void subscribe(io.reactivex.SingleEmitter<android.bluetooth.BluetoothGatt> singleEmitter) throws java.lang.Exception {
                singleEmitter.setDisposable((io.reactivex.observers.DisposableSingleObserver) com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.getBluetoothGattAndChangeStatusToConnected().delaySubscription(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.rxBleGattCallback.getOnConnectionStateChange().filter(new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.4.1
                    @Override // io.reactivex.functions.Predicate
                    public boolean test(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState rxBleConnectionState) throws java.lang.Exception {
                        return rxBleConnectionState == com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.CONNECTED;
                    }
                })).mergeWith(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.rxBleGattCallback.observeDisconnect().firstOrError()).firstOrError().subscribeWith(com.polidea.rxandroidble2.internal.util.DisposableUtil.disposableSingleObserverFromEmitter(singleEmitter)));
                com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectionStateChangedAction.onConnectionStateChange(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.CONNECTING);
                com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.bluetoothGattProvider.updateBluetoothGatt(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectionCompat.connectGatt(com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.bluetoothDevice, com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.autoConnect, com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.rxBleGattCallback.getBluetoothGattCallback()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Single<android.bluetooth.BluetoothGatt> getBluetoothGattAndChangeStatusToConnected() {
        return io.reactivex.Single.fromCallable(new java.util.concurrent.Callable<android.bluetooth.BluetoothGatt>() { // from class: com.polidea.rxandroidble2.internal.operations.ConnectOperation.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public android.bluetooth.BluetoothGatt call() {
                com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.connectionStateChangedAction.onConnectionStateChange(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.CONNECTED);
                return com.polidea.rxandroidble2.internal.operations.ConnectOperation.this.bluetoothGattProvider.getBluetoothGatt();
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
        return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(deadObjectException, this.bluetoothDevice.getAddress(), -1);
    }

    public java.lang.String toString() {
        return "ConnectOperation{" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.bluetoothDevice.getAddress()) + ", autoConnect=" + this.autoConnect + '}';
    }
}
