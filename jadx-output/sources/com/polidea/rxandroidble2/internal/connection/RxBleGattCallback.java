package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
public class RxBleGattCallback {
    private final com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider;
    private final io.reactivex.Scheduler callbackScheduler;
    private final com.polidea.rxandroidble2.internal.connection.DisconnectionRouter disconnectionRouter;
    private final com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher nativeCallbackDispatcher;
    private final com.jakewharton.rxrelay2.PublishRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> connectionStatePublishRelay = com.jakewharton.rxrelay2.PublishRelay.create();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.RxBleDeviceServices> servicesDiscoveredOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> readCharacteristicOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> writeCharacteristicOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.jakewharton.rxrelay2.Relay<com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent> changedCharacteristicSerializedPublishRelay = com.jakewharton.rxrelay2.PublishRelay.create().toSerialized();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> readDescriptorOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> writeDescriptorOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<java.lang.Integer> readRssiOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<java.lang.Integer> changedMtuOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<com.polidea.rxandroidble2.ConnectionParameters> updatedConnectionOutput = new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<>();
    private final io.reactivex.functions.Function<com.polidea.rxandroidble2.exceptions.BleGattException, io.reactivex.Observable<?>> errorMapper = new io.reactivex.functions.Function<com.polidea.rxandroidble2.exceptions.BleGattException, io.reactivex.Observable<?>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.1
        @Override // io.reactivex.functions.Function
        public io.reactivex.Observable<?> apply(com.polidea.rxandroidble2.exceptions.BleGattException bleGattException) {
            return io.reactivex.Observable.error(bleGattException);
        }
    };
    private android.bluetooth.BluetoothGattCallback bluetoothGattCallback = new android.bluetooth.BluetoothGattCallback() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.2
        private boolean isDisconnectedOrDisconnecting(int i) {
            return i == 0 || i == 3;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onConnectionStateChange", bluetoothGatt, i, i2);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeConnectionStateCallback(bluetoothGatt, i, i2);
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.bluetoothGattProvider.updateBluetoothGatt(bluetoothGatt);
            if (isDisconnectedOrDisconnecting(i2)) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.disconnectionRouter.onDisconnectedException(new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(bluetoothGatt.getDevice().getAddress(), i));
            } else if (i != 0) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.disconnectionRouter.onGattConnectionStateException(new com.polidea.rxandroidble2.exceptions.BleGattException(bluetoothGatt, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CONNECTION_STATE));
            }
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.connectionStatePublishRelay.accept(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.mapConnectionStateToRxBleConnectionStatus(i2));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onServicesDiscovered", bluetoothGatt, i);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeServicesDiscoveredCallback(bluetoothGatt, i);
            super.onServicesDiscovered(bluetoothGatt, i);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.servicesDiscoveredOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred(rxBleGattCallback.servicesDiscoveredOutput, bluetoothGatt, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.SERVICE_DISCOVERY)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.servicesDiscoveredOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.RxBleDeviceServices(bluetoothGatt.getServices()));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onCharacteristicRead", bluetoothGatt, i, bluetoothGattCharacteristic, true);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeReadCallback(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readCharacteristicOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred((com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?>) rxBleGattCallback.readCharacteristicOutput, bluetoothGatt, bluetoothGattCharacteristic, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_READ)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readCharacteristicOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.internal.util.ByteAssociation(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onCharacteristicWrite", bluetoothGatt, i, bluetoothGattCharacteristic, false);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeWriteCallback(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.writeCharacteristicOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred((com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?>) rxBleGattCallback.writeCharacteristicOutput, bluetoothGatt, bluetoothGattCharacteristic, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_WRITE)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.writeCharacteristicOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.internal.util.ByteAssociation(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onCharacteristicChanged", bluetoothGatt, bluetoothGattCharacteristic, true);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeChangedCallback(bluetoothGatt, bluetoothGattCharacteristic);
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.changedCharacteristicSerializedPublishRelay.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.changedCharacteristicSerializedPublishRelay.accept(new com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent(bluetoothGattCharacteristic.getUuid(), java.lang.Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onDescriptorRead", bluetoothGatt, i, bluetoothGattDescriptor, true);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeDescriptorReadCallback(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readDescriptorOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred((com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?>) rxBleGattCallback.readDescriptorOutput, bluetoothGatt, bluetoothGattDescriptor, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.DESCRIPTOR_READ)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readDescriptorOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.internal.util.ByteAssociation(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onDescriptorWrite", bluetoothGatt, i, bluetoothGattDescriptor, false);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeDescriptorWriteCallback(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.writeDescriptorOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred((com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?>) rxBleGattCallback.writeDescriptorOutput, bluetoothGatt, bluetoothGattDescriptor, i, com.polidea.rxandroidble2.exceptions.BleGattOperationType.DESCRIPTOR_WRITE)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.writeDescriptorOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.internal.util.ByteAssociation(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onReliableWriteCompleted", bluetoothGatt, i);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeReliableWriteCallback(bluetoothGatt, i);
            super.onReliableWriteCompleted(bluetoothGatt, i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onMtuChanged", bluetoothGatt, i2, i);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeReadRssiCallback(bluetoothGatt, i, i2);
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readRssiOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred(rxBleGattCallback.readRssiOutput, bluetoothGatt, i2, com.polidea.rxandroidble2.exceptions.BleGattOperationType.READ_RSSI)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.readRssiOutput.valueRelay.accept((T) java.lang.Integer.valueOf(i));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logCallback("onMtuChanged", bluetoothGatt, i2, i);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeMtuChangedCallback(bluetoothGatt, i, i2);
            super.onMtuChanged(bluetoothGatt, i, i2);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.changedMtuOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred(rxBleGattCallback.changedMtuOutput, bluetoothGatt, i2, com.polidea.rxandroidble2.exceptions.BleGattOperationType.ON_MTU_CHANGED)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.changedMtuOutput.valueRelay.accept((T) java.lang.Integer.valueOf(i));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void onConnectionUpdated(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logConnectionUpdateCallback("onConnectionUpdated", bluetoothGatt, i4, i, i2, i3);
            com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.nativeCallbackDispatcher.notifyNativeParamsUpdateCallback(bluetoothGatt, i, i2, i3, i4);
            if (com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.updatedConnectionOutput.hasObservers()) {
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback = com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this;
                if (rxBleGattCallback.propagateErrorIfOccurred(rxBleGattCallback.updatedConnectionOutput, bluetoothGatt, i4, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CONNECTION_PRIORITY_CHANGE)) {
                    return;
                }
                com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.this.updatedConnectionOutput.valueRelay.accept((T) new com.polidea.rxandroidble2.internal.connection.ConnectionParametersImpl(i, i2, i3));
            }
        }
    };

    private boolean isException(int i) {
        return i != 0;
    }

    @bleshadow.javax.inject.Inject
    public RxBleGattCallback(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_CALLBACKS) io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, com.polidea.rxandroidble2.internal.connection.DisconnectionRouter disconnectionRouter, com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher nativeCallbackDispatcher) {
        this.callbackScheduler = scheduler;
        this.bluetoothGattProvider = bluetoothGattProvider;
        this.disconnectionRouter = disconnectionRouter;
        this.nativeCallbackDispatcher = nativeCallbackDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState mapConnectionStateToRxBleConnectionStatus(int i) {
        if (i == 1) {
            return com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.CONNECTING;
        }
        if (i == 2) {
            return com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.CONNECTED;
        }
        if (i == 3) {
            return com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTING;
        }
        return com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean propagateErrorIfOccurred(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?> output, android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        return isException(i) && propagateStatusError(output, new com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException(bluetoothGatt, bluetoothGattCharacteristic, i, bleGattOperationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean propagateErrorIfOccurred(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?> output, android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        return isException(i) && propagateStatusError(output, new com.polidea.rxandroidble2.exceptions.BleGattDescriptorException(bluetoothGatt, bluetoothGattDescriptor, i, bleGattOperationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean propagateErrorIfOccurred(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?> output, android.bluetooth.BluetoothGatt bluetoothGatt, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        return isException(i) && propagateStatusError(output, new com.polidea.rxandroidble2.exceptions.BleGattException(bluetoothGatt, i, bleGattOperationType));
    }

    private boolean propagateStatusError(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<?> output, com.polidea.rxandroidble2.exceptions.BleGattException bleGattException) {
        output.errorRelay.accept(bleGattException);
        return true;
    }

    private <T> io.reactivex.Observable<T> withDisconnectionHandling(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback.Output<T> output) {
        return io.reactivex.Observable.merge(this.disconnectionRouter.asErrorOnlyObservable(), output.valueRelay, output.errorRelay.flatMap(this.errorMapper));
    }

    public android.bluetooth.BluetoothGattCallback getBluetoothGattCallback() {
        return this.bluetoothGattCallback;
    }

    public <T> io.reactivex.Observable<T> observeDisconnect() {
        return this.disconnectionRouter.asErrorOnlyObservable();
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> getOnConnectionStateChange() {
        return this.connectionStatePublishRelay.observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleDeviceServices> getOnServicesDiscovered() {
        return withDisconnectionHandling(this.servicesDiscoveredOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<java.lang.Integer> getOnMtuChanged() {
        return withDisconnectionHandling(this.changedMtuOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> getOnCharacteristicRead() {
        return withDisconnectionHandling(this.readCharacteristicOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> getOnCharacteristicWrite() {
        return withDisconnectionHandling(this.writeCharacteristicOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent> getOnCharacteristicChanged() {
        return io.reactivex.Observable.merge(this.disconnectionRouter.asErrorOnlyObservable(), this.changedCharacteristicSerializedPublishRelay).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> getOnDescriptorRead() {
        return withDisconnectionHandling(this.readDescriptorOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> getOnDescriptorWrite() {
        return withDisconnectionHandling(this.writeDescriptorOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<java.lang.Integer> getOnRssiRead() {
        return withDisconnectionHandling(this.readRssiOutput).observeOn(this.callbackScheduler);
    }

    public io.reactivex.Observable<com.polidea.rxandroidble2.ConnectionParameters> getConnectionParametersUpdates() {
        return withDisconnectionHandling(this.updatedConnectionOutput).observeOn(this.callbackScheduler);
    }

    public void setNativeCallback(android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        this.nativeCallbackDispatcher.setNativeCallback(bluetoothGattCallback);
    }

    public void setHiddenNativeCallback(com.polidea.rxandroidble2.HiddenBluetoothGattCallback hiddenBluetoothGattCallback) {
        this.nativeCallbackDispatcher.setNativeCallabackHidden(hiddenBluetoothGattCallback);
    }

    private static class Output<T> {
        final com.jakewharton.rxrelay2.PublishRelay<T> valueRelay = com.jakewharton.rxrelay2.PublishRelay.create();
        final com.jakewharton.rxrelay2.PublishRelay<com.polidea.rxandroidble2.exceptions.BleGattException> errorRelay = com.jakewharton.rxrelay2.PublishRelay.create();

        Output() {
        }

        boolean hasObservers() {
            return this.valueRelay.hasObservers() || this.errorRelay.hasObservers();
        }
    }
}
