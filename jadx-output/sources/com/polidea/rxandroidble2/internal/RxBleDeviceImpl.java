package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.DeviceScope
class RxBleDeviceImpl implements com.polidea.rxandroidble2.RxBleDevice {
    private final android.bluetooth.BluetoothDevice bluetoothDevice;
    private final com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> connectionStateRelay;
    private final com.polidea.rxandroidble2.internal.connection.Connector connector;
    private java.util.concurrent.atomic.AtomicBoolean isConnected = new java.util.concurrent.atomic.AtomicBoolean(false);

    @bleshadow.javax.inject.Inject
    RxBleDeviceImpl(android.bluetooth.BluetoothDevice bluetoothDevice, com.polidea.rxandroidble2.internal.connection.Connector connector, com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> behaviorRelay) {
        this.bluetoothDevice = bluetoothDevice;
        this.connector = connector;
        this.connectionStateRelay = behaviorRelay;
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> observeConnectionStateChanges() {
        return this.connectionStateRelay.distinctUntilChanged().skip(1L);
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState getConnectionState() {
        return this.connectionStateRelay.getValue();
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> establishConnection(boolean z) {
        return establishConnection(new com.polidea.rxandroidble2.ConnectionSetup.Builder().setAutoConnect(z).setSuppressIllegalOperationCheck(true).build());
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> establishConnection(boolean z, com.polidea.rxandroidble2.Timeout timeout) {
        return establishConnection(new com.polidea.rxandroidble2.ConnectionSetup.Builder().setAutoConnect(z).setOperationTimeout(timeout).setSuppressIllegalOperationCheck(true).build());
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> establishConnection(final com.polidea.rxandroidble2.ConnectionSetup connectionSetup) {
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable<io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection>>() { // from class: com.polidea.rxandroidble2.internal.RxBleDeviceImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection> call() throws java.lang.Exception {
                if (com.polidea.rxandroidble2.internal.RxBleDeviceImpl.this.isConnected.compareAndSet(false, true)) {
                    return com.polidea.rxandroidble2.internal.RxBleDeviceImpl.this.connector.prepareConnection(connectionSetup).doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.RxBleDeviceImpl.1.1
                        @Override // io.reactivex.functions.Action
                        public void run() {
                            com.polidea.rxandroidble2.internal.RxBleDeviceImpl.this.isConnected.set(false);
                        }
                    });
                }
                return io.reactivex.Observable.error(new com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException(com.polidea.rxandroidble2.internal.RxBleDeviceImpl.this.bluetoothDevice.getAddress()));
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public java.lang.String getName() {
        return this.bluetoothDevice.getName();
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public java.lang.String getMacAddress() {
        return this.bluetoothDevice.getAddress();
    }

    @Override // com.polidea.rxandroidble2.RxBleDevice
    public android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.polidea.rxandroidble2.internal.RxBleDeviceImpl) {
            return this.bluetoothDevice.equals(((com.polidea.rxandroidble2.internal.RxBleDeviceImpl) obj).bluetoothDevice);
        }
        return false;
    }

    public int hashCode() {
        return this.bluetoothDevice.hashCode();
    }

    public java.lang.String toString() {
        return "RxBleDeviceImpl{" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.bluetoothDevice.getAddress()) + ", name=" + this.bluetoothDevice.getName() + '}';
    }
}
