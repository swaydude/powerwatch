package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class ServiceDiscoveryManager {
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> deviceServicesObservable;
    private final com.polidea.rxandroidble2.internal.operations.OperationsProvider operationProvider;
    private final com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue operationQueue;
    private io.reactivex.subjects.Subject<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutBehaviorSubject = io.reactivex.subjects.BehaviorSubject.create().toSerialized();
    private boolean hasCachedResults = false;

    @bleshadow.javax.inject.Inject
    ServiceDiscoveryManager(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        this.operationQueue = connectionOperationQueue;
        this.bluetoothGatt = bluetoothGatt;
        this.operationProvider = operationsProvider;
        reset();
    }

    io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> getDiscoverServicesSingle(final long j, final java.util.concurrent.TimeUnit timeUnit) {
        if (this.hasCachedResults) {
            return this.deviceServicesObservable;
        }
        return this.deviceServicesObservable.doOnSubscribe(new io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable>() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.1
            @Override // io.reactivex.functions.Consumer
            public void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
                com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.timeoutBehaviorSubject.onNext(new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(j, timeUnit, io.reactivex.schedulers.Schedulers.computation()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset() {
        this.hasCachedResults = false;
        this.deviceServicesObservable = getListOfServicesFromGatt().map(wrapIntoRxBleDeviceServices()).switchIfEmpty((io.reactivex.SingleSource<? extends R>) getTimeoutConfiguration().flatMap(scheduleActualDiscoveryWithTimeout())).doOnSuccess(io.reactivex.internal.functions.Functions.actionConsumer(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.3
            @Override // io.reactivex.functions.Action
            public void run() throws java.lang.Exception {
                com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.hasCachedResults = true;
            }
        })).doOnError(io.reactivex.internal.functions.Functions.actionConsumer(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.2
            @Override // io.reactivex.functions.Action
            public void run() {
                com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.reset();
            }
        })).cache();
    }

    private io.reactivex.functions.Function<java.util.List<android.bluetooth.BluetoothGattService>, com.polidea.rxandroidble2.RxBleDeviceServices> wrapIntoRxBleDeviceServices() {
        return new io.reactivex.functions.Function<java.util.List<android.bluetooth.BluetoothGattService>, com.polidea.rxandroidble2.RxBleDeviceServices>() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.4
            @Override // io.reactivex.functions.Function
            public com.polidea.rxandroidble2.RxBleDeviceServices apply(java.util.List<android.bluetooth.BluetoothGattService> list) {
                return new com.polidea.rxandroidble2.RxBleDeviceServices(list);
            }
        };
    }

    private io.reactivex.Maybe<java.util.List<android.bluetooth.BluetoothGattService>> getListOfServicesFromGatt() {
        return io.reactivex.Single.fromCallable(new java.util.concurrent.Callable<java.util.List<android.bluetooth.BluetoothGattService>>() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.6
            @Override // java.util.concurrent.Callable
            public java.util.List<android.bluetooth.BluetoothGattService> call() {
                return com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.bluetoothGatt.getServices();
            }
        }).filter(new io.reactivex.functions.Predicate<java.util.List<android.bluetooth.BluetoothGattService>>() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.5
            @Override // io.reactivex.functions.Predicate
            public boolean test(java.util.List<android.bluetooth.BluetoothGattService> list) {
                return list.size() > 0;
            }
        });
    }

    private io.reactivex.Single<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> getTimeoutConfiguration() {
        return this.timeoutBehaviorSubject.firstOrError();
    }

    private io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration, io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices>> scheduleActualDiscoveryWithTimeout() {
        return new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration, io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices>>() { // from class: com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.7
            @Override // io.reactivex.functions.Function
            public io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> apply(com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration) {
                return com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.operationQueue.queue(com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager.this.operationProvider.provideServiceDiscoveryOperation(timeoutConfiguration.timeout, timeoutConfiguration.timeoutTimeUnit)).firstOrError();
            }
        };
    }
}
