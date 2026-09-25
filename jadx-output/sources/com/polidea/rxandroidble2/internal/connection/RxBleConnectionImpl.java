package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
public class RxBleConnectionImpl implements com.polidea.rxandroidble2.RxBleConnection {
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private final io.reactivex.Scheduler callbackScheduler;
    private final com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback gattCallback;
    private final com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker illegalOperationChecker;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> longWriteOperationBuilderProvider;
    private final com.polidea.rxandroidble2.internal.connection.MtuProvider mtuProvider;
    private final com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager notificationIndicationManager;
    private final com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue operationQueue;
    private final com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider;
    private final com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager serviceDiscoveryManager;

    @bleshadow.javax.inject.Inject
    public RxBleConnectionImpl(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager serviceDiscoveryManager, com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager notificationAndIndicationManager, com.polidea.rxandroidble2.internal.connection.MtuProvider mtuProvider, com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> provider, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker illegalOperationChecker) {
        this.operationQueue = connectionOperationQueue;
        this.gattCallback = rxBleGattCallback;
        this.bluetoothGatt = bluetoothGatt;
        this.serviceDiscoveryManager = serviceDiscoveryManager;
        this.notificationIndicationManager = notificationAndIndicationManager;
        this.mtuProvider = mtuProvider;
        this.descriptorWriter = descriptorWriter;
        this.operationsProvider = operationsProvider;
        this.longWriteOperationBuilderProvider = provider;
        this.callbackScheduler = scheduler;
        this.illegalOperationChecker = illegalOperationChecker;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder createNewLongWriteBuilder() {
        return this.longWriteOperationBuilderProvider.get();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Completable requestConnectionPriority(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (i == 2 || i == 0 || i == 1) {
            if (j <= 0) {
                return io.reactivex.Completable.error(new java.lang.IllegalArgumentException("Delay must be bigger than 0"));
            }
            return this.operationQueue.queue(this.operationsProvider.provideConnectionPriorityChangeOperation(i, j, timeUnit)).ignoreElements();
        }
        return io.reactivex.Completable.error(new java.lang.IllegalArgumentException("Connection priority must have valid value from BluetoothGatt (received " + i + ")"));
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<java.lang.Integer> requestMtu(int i) {
        return this.operationQueue.queue(this.operationsProvider.provideMtuChangeOperation(i)).firstOrError();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public int getMtu() {
        return this.mtuProvider.getMtu();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> discoverServices() {
        return this.serviceDiscoveryManager.getDiscoverServicesSingle(20L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> discoverServices(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.serviceDiscoveryManager.getDiscoverServicesSingle(j, timeUnit);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    @java.lang.Deprecated
    public io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> getCharacteristic(final java.util.UUID uuid) {
        return discoverServices().flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleDeviceServices, io.reactivex.Single<? extends android.bluetooth.BluetoothGattCharacteristic>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.1
            @Override // io.reactivex.functions.Function
            public io.reactivex.Single<? extends android.bluetooth.BluetoothGattCharacteristic> apply(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices) {
                return rxBleDeviceServices.getCharacteristic(uuid);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(java.util.UUID uuid) {
        return setupNotification(uuid, com.polidea.rxandroidble2.NotificationSetupMode.DEFAULT);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return setupNotification(bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode.DEFAULT);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(java.util.UUID uuid, final com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return getCharacteristic(uuid).flatMapObservable(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, io.reactivex.ObservableSource<? extends io.reactivex.Observable<byte[]>>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.2
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<? extends io.reactivex.Observable<byte[]>> apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.setupNotification(bluetoothGattCharacteristic, notificationSetupMode);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return this.illegalOperationChecker.checkAnyPropertyMatches(bluetoothGattCharacteristic, 16).andThen(this.notificationIndicationManager.setupServerInitiatedCharacteristicRead(bluetoothGattCharacteristic, notificationSetupMode, false));
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(java.util.UUID uuid) {
        return setupIndication(uuid, com.polidea.rxandroidble2.NotificationSetupMode.DEFAULT);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return setupIndication(bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode.DEFAULT);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(java.util.UUID uuid, final com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return getCharacteristic(uuid).flatMapObservable(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, io.reactivex.ObservableSource<? extends io.reactivex.Observable<byte[]>>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.3
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<? extends io.reactivex.Observable<byte[]>> apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.setupIndication(bluetoothGattCharacteristic, notificationSetupMode);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return this.illegalOperationChecker.checkAnyPropertyMatches(bluetoothGattCharacteristic, 32).andThen(this.notificationIndicationManager.setupServerInitiatedCharacteristicRead(bluetoothGattCharacteristic, notificationSetupMode, true));
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> readCharacteristic(java.util.UUID uuid) {
        return getCharacteristic(uuid).flatMap(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, io.reactivex.SingleSource<? extends byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.4
            @Override // io.reactivex.functions.Function
            public io.reactivex.SingleSource<? extends byte[]> apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.readCharacteristic(bluetoothGattCharacteristic);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> readCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.illegalOperationChecker.checkAnyPropertyMatches(bluetoothGattCharacteristic, 2).andThen(this.operationQueue.queue(this.operationsProvider.provideReadCharacteristic(bluetoothGattCharacteristic))).firstOrError();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> writeCharacteristic(java.util.UUID uuid, final byte[] bArr) {
        return getCharacteristic(uuid).flatMap(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, io.reactivex.SingleSource<? extends byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.5
            @Override // io.reactivex.functions.Function
            public io.reactivex.SingleSource<? extends byte[]> apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.writeCharacteristic(bluetoothGattCharacteristic, bArr);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return this.illegalOperationChecker.checkAnyPropertyMatches(bluetoothGattCharacteristic, 76).andThen(this.operationQueue.queue(this.operationsProvider.provideWriteCharacteristic(bluetoothGattCharacteristic, bArr))).firstOrError();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> readDescriptor(final java.util.UUID uuid, final java.util.UUID uuid2, final java.util.UUID uuid3) {
        return discoverServices().flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleDeviceServices, io.reactivex.SingleSource<android.bluetooth.BluetoothGattDescriptor>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.7
            @Override // io.reactivex.functions.Function
            public io.reactivex.SingleSource<android.bluetooth.BluetoothGattDescriptor> apply(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices) {
                return rxBleDeviceServices.getDescriptor(uuid, uuid2, uuid3);
            }
        }).flatMap(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattDescriptor, io.reactivex.SingleSource<byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.6
            @Override // io.reactivex.functions.Function
            public io.reactivex.SingleSource<byte[]> apply(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.readDescriptor(bluetoothGattDescriptor);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<byte[]> readDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        return this.operationQueue.queue(this.operationsProvider.provideReadDescriptor(bluetoothGattDescriptor)).firstOrError().map(new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>, byte[]>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.8
            @Override // io.reactivex.functions.Function
            public byte[] apply(com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor> byteAssociation) {
                return byteAssociation.second;
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Completable writeDescriptor(final java.util.UUID uuid, final java.util.UUID uuid2, final java.util.UUID uuid3, final byte[] bArr) {
        return discoverServices().flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleDeviceServices, io.reactivex.SingleSource<android.bluetooth.BluetoothGattDescriptor>>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.10
            @Override // io.reactivex.functions.Function
            public io.reactivex.SingleSource<android.bluetooth.BluetoothGattDescriptor> apply(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices) {
                return rxBleDeviceServices.getDescriptor(uuid, uuid2, uuid3);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattDescriptor, io.reactivex.CompletableSource>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.9
            @Override // io.reactivex.functions.Function
            public io.reactivex.CompletableSource apply(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
                return com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.writeDescriptor(bluetoothGattDescriptor, bArr);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Completable writeDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.descriptorWriter.writeDescriptor(bluetoothGattDescriptor, bArr);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Single<java.lang.Integer> readRssi() {
        return this.operationQueue.queue(this.operationsProvider.provideRssiReadOperation()).firstOrError();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public io.reactivex.Observable<com.polidea.rxandroidble2.ConnectionParameters> observeConnectionParametersUpdates() {
        return this.gattCallback.getConnectionParametersUpdates();
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public <T> io.reactivex.Observable<T> queue(com.polidea.rxandroidble2.RxBleCustomOperation<T> rxBleCustomOperation) {
        return queue(rxBleCustomOperation, com.polidea.rxandroidble2.internal.Priority.NORMAL);
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection
    public <T> io.reactivex.Observable<T> queue(final com.polidea.rxandroidble2.RxBleCustomOperation<T> rxBleCustomOperation, final com.polidea.rxandroidble2.internal.Priority priority) {
        return this.operationQueue.queue(new com.polidea.rxandroidble2.internal.QueueOperation<T>() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.11
            @Override // com.polidea.rxandroidble2.internal.QueueOperation
            protected void protectedRun(io.reactivex.ObservableEmitter<T> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) throws java.lang.Throwable {
                try {
                    io.reactivex.Observable<T> observableAsObservable = rxBleCustomOperation.asObservable(com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.gattCallback, com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.callbackScheduler);
                    if (observableAsObservable == null) {
                        queueReleaseInterface.release();
                        throw new java.lang.IllegalArgumentException("The custom operation asObservable method must return a non-null observable");
                    }
                    observableAsObservable.doOnTerminate(clearNativeCallbackReferenceAction()).subscribe(new com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper(observableEmitter, queueReleaseInterface));
                } catch (java.lang.Throwable th) {
                    queueReleaseInterface.release();
                    throw th;
                }
            }

            private io.reactivex.functions.Action clearNativeCallbackReferenceAction() {
                return new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.11.1
                    @Override // io.reactivex.functions.Action
                    public void run() {
                        com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.gattCallback.setNativeCallback(null);
                        com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.gattCallback.setHiddenNativeCallback(null);
                    }
                };
            }

            @Override // com.polidea.rxandroidble2.internal.QueueOperation
            protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
                return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(deadObjectException, com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl.this.bluetoothGatt.getDevice().getAddress(), -1);
            }

            @Override // com.polidea.rxandroidble2.internal.QueueOperation, com.polidea.rxandroidble2.internal.operations.Operation
            public com.polidea.rxandroidble2.internal.Priority definedPriority() {
                return priority;
            }
        });
    }
}
