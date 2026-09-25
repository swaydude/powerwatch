package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceDiscoveryOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<com.polidea.rxandroidble2.RxBleDeviceServices> {
    private final com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices bleServicesLogger;
    private final android.bluetooth.BluetoothGatt bluetoothGatt;

    ServiceDiscoveryOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices loggerUtilBluetoothServices, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.SERVICE_DISCOVERY, timeoutConfiguration);
        this.bluetoothGatt = bluetoothGatt;
        this.bleServicesLogger = loggerUtilBluetoothServices;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnServicesDiscovered().firstOrError().doOnSuccess(new io.reactivex.functions.Consumer<com.polidea.rxandroidble2.RxBleDeviceServices>() { // from class: com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.1
            @Override // io.reactivex.functions.Consumer
            public void accept(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices) throws java.lang.Exception {
                com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.this.bleServicesLogger.log(rxBleDeviceServices, com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.this.bluetoothGatt.getDevice());
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    /* JADX INFO: renamed from: com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation$2, reason: invalid class name */
    class AnonymousClass2 implements java.util.concurrent.Callable<io.reactivex.SingleSource<? extends com.polidea.rxandroidble2.RxBleDeviceServices>> {
        final /* synthetic */ android.bluetooth.BluetoothGatt val$bluetoothGatt;
        final /* synthetic */ io.reactivex.Scheduler val$timeoutScheduler;

        AnonymousClass2(android.bluetooth.BluetoothGatt bluetoothGatt, io.reactivex.Scheduler scheduler) {
            this.val$bluetoothGatt = bluetoothGatt;
            this.val$timeoutScheduler = scheduler;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.SingleSource<? extends com.polidea.rxandroidble2.RxBleDeviceServices> call() throws java.lang.Exception {
            if (this.val$bluetoothGatt.getServices().size() == 0) {
                return io.reactivex.Single.error(new com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException(this.val$bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType.SERVICE_DISCOVERY));
            }
            return io.reactivex.Single.timer(5L, java.util.concurrent.TimeUnit.SECONDS, this.val$timeoutScheduler).flatMap(new io.reactivex.functions.Function<java.lang.Long, io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices>>() { // from class: com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.2.1
                @Override // io.reactivex.functions.Function
                public io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> apply(java.lang.Long l) {
                    return io.reactivex.Single.fromCallable(new java.util.concurrent.Callable<com.polidea.rxandroidble2.RxBleDeviceServices>() { // from class: com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.2.1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public com.polidea.rxandroidble2.RxBleDeviceServices call() throws java.lang.Exception {
                            return new com.polidea.rxandroidble2.RxBleDeviceServices(com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.AnonymousClass2.this.val$bluetoothGatt.getServices());
                        }
                    });
                }
            });
        }
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> timeoutFallbackProcedure(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, io.reactivex.Scheduler scheduler) {
        return io.reactivex.Single.defer(new com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation.AnonymousClass2(bluetoothGatt, scheduler));
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "ServiceDiscoveryOperation{" + super.toString() + '}';
    }
}
