package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
class RxBleClientImpl extends com.polidea.rxandroidble2.RxBleClient {

    @java.lang.Deprecated
    public static final java.lang.String TAG = "RxBleClient";
    private final com.polidea.rxandroidble2.scan.BackgroundScanner backgroundScanner;
    private final io.reactivex.Scheduler bluetoothInteractionScheduler;
    private final com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer clientComponentFinalizer;
    private final io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult> internalToExternalScanResultMapFunction;
    private final bleshadow.dagger.Lazy<com.polidea.rxandroidble2.internal.util.ClientStateObservable> lazyClientStateObservable;
    private final com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus;
    private final com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue operationQueue;
    private final java.util.Map<java.util.Set<java.util.UUID>, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult>> queuedScanOperations = new java.util.HashMap();
    private final io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> rxBleAdapterStateObservable;
    private final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;
    private final com.polidea.rxandroidble2.internal.RxBleDeviceProvider rxBleDeviceProvider;
    private final com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier scanPreconditionVerifier;
    private final com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder scanSetupBuilder;
    private final com.polidea.rxandroidble2.internal.util.UUIDUtil uuidUtil;

    @bleshadow.javax.inject.Inject
    RxBleClientImpl(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable, com.polidea.rxandroidble2.internal.util.UUIDUtil uUIDUtil, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus, bleshadow.dagger.Lazy<com.polidea.rxandroidble2.internal.util.ClientStateObservable> lazy, com.polidea.rxandroidble2.internal.RxBleDeviceProvider rxBleDeviceProvider, com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder scanSetupBuilder, com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier scanPreconditionsVerifier, io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult> function, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer clientComponentFinalizer, com.polidea.rxandroidble2.scan.BackgroundScanner backgroundScanner) {
        this.uuidUtil = uUIDUtil;
        this.operationQueue = clientOperationQueue;
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
        this.rxBleAdapterStateObservable = observable;
        this.locationServicesStatus = locationServicesStatus;
        this.lazyClientStateObservable = lazy;
        this.rxBleDeviceProvider = rxBleDeviceProvider;
        this.scanSetupBuilder = scanSetupBuilder;
        this.scanPreconditionVerifier = scanPreconditionsVerifier;
        this.internalToExternalScanResultMapFunction = function;
        this.bluetoothInteractionScheduler = scheduler;
        this.clientComponentFinalizer = clientComponentFinalizer;
        this.backgroundScanner = backgroundScanner;
    }

    protected void finalize() throws java.lang.Throwable {
        this.clientComponentFinalizer.onFinalize();
        super.finalize();
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public com.polidea.rxandroidble2.RxBleDevice getBleDevice(java.lang.String str) {
        guardBluetoothAdapterAvailable();
        return this.rxBleDeviceProvider.getBleDevice(str);
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public java.util.Set<com.polidea.rxandroidble2.RxBleDevice> getBondedDevices() {
        guardBluetoothAdapterAvailable();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<android.bluetooth.BluetoothDevice> it = this.rxBleAdapterWrapper.getBondedDevices().iterator();
        while (it.hasNext()) {
            hashSet.add(getBleDevice(it.next().getAddress()));
        }
        return hashSet;
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public io.reactivex.Observable<com.polidea.rxandroidble2.scan.ScanResult> scanBleDevices(final com.polidea.rxandroidble2.scan.ScanSettings scanSettings, final com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr) {
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable<io.reactivex.ObservableSource<? extends com.polidea.rxandroidble2.scan.ScanResult>>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: call, reason: merged with bridge method [inline-methods] */
            public io.reactivex.ObservableSource<? extends com.polidea.rxandroidble2.scan.ScanResult> call2() {
                com.polidea.rxandroidble2.RxBleClientImpl.this.scanPreconditionVerifier.verify(scanSettings.shouldCheckLocationProviderState());
                com.polidea.rxandroidble2.internal.scan.ScanSetup scanSetupBuild = com.polidea.rxandroidble2.RxBleClientImpl.this.scanSetupBuilder.build(scanSettings, scanFilterArr);
                return com.polidea.rxandroidble2.RxBleClientImpl.this.operationQueue.queue(scanSetupBuild.scanOperation).unsubscribeOn(com.polidea.rxandroidble2.RxBleClientImpl.this.bluetoothInteractionScheduler).compose(scanSetupBuild.scanOperationBehaviourEmulatorTransformer).map(com.polidea.rxandroidble2.RxBleClientImpl.this.internalToExternalScanResultMapFunction).doOnNext(new io.reactivex.functions.Consumer<com.polidea.rxandroidble2.scan.ScanResult>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.1.1
                    @Override // io.reactivex.functions.Consumer
                    public void accept(com.polidea.rxandroidble2.scan.ScanResult scanResult) {
                        if (com.polidea.rxandroidble2.internal.RxBleLog.getShouldLogScannedPeripherals()) {
                            com.polidea.rxandroidble2.internal.RxBleLog.i("%s", scanResult);
                        }
                    }
                }).mergeWith(com.polidea.rxandroidble2.RxBleClientImpl.this.bluetoothAdapterOffExceptionObservable());
            }
        });
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public com.polidea.rxandroidble2.scan.BackgroundScanner getBackgroundScanner() {
        return this.backgroundScanner;
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult> scanBleDevices(final java.util.UUID... uuidArr) {
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable<io.reactivex.ObservableSource<? extends com.polidea.rxandroidble2.RxBleScanResult>>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public io.reactivex.ObservableSource<? extends com.polidea.rxandroidble2.RxBleScanResult> call() throws java.lang.Exception {
                com.polidea.rxandroidble2.RxBleClientImpl.this.scanPreconditionVerifier.verify(true);
                return com.polidea.rxandroidble2.RxBleClientImpl.this.initializeScan(uuidArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult> initializeScan(java.util.UUID[] uuidArr) {
        io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult> observableCreateScanOperationApi18;
        java.util.Set<java.util.UUID> distinctSet = this.uuidUtil.toDistinctSet(uuidArr);
        synchronized (this.queuedScanOperations) {
            observableCreateScanOperationApi18 = this.queuedScanOperations.get(distinctSet);
            if (observableCreateScanOperationApi18 == null) {
                observableCreateScanOperationApi18 = createScanOperationApi18(uuidArr);
                this.queuedScanOperations.put(distinctSet, observableCreateScanOperationApi18);
            }
        }
        return observableCreateScanOperationApi18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> io.reactivex.Observable<T> bluetoothAdapterOffExceptionObservable() {
        return this.rxBleAdapterStateObservable.filter(new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.4
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState bleAdapterState) throws java.lang.Exception {
                return bleAdapterState != com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_ON;
            }
        }).firstElement().flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState, io.reactivex.MaybeSource<T>>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.3
            @Override // io.reactivex.functions.Function
            public io.reactivex.MaybeSource<T> apply(com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState bleAdapterState) throws java.lang.Exception {
                return io.reactivex.Maybe.error(new com.polidea.rxandroidble2.exceptions.BleScanException(1));
            }
        }).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.polidea.rxandroidble2.RxBleScanResult convertToPublicScanResult(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy rxBleInternalScanResultLegacy) {
        return new com.polidea.rxandroidble2.RxBleScanResult(getBleDevice(rxBleInternalScanResultLegacy.getBluetoothDevice().getAddress()), rxBleInternalScanResultLegacy.getRssi(), rxBleInternalScanResultLegacy.getScanRecord());
    }

    private io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult> createScanOperationApi18(java.util.UUID[] uuidArr) {
        final java.util.Set<java.util.UUID> distinctSet = this.uuidUtil.toDistinctSet(uuidArr);
        return this.operationQueue.queue(new com.polidea.rxandroidble2.internal.operations.LegacyScanOperation(uuidArr, this.rxBleAdapterWrapper, this.uuidUtil)).doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.7
            @Override // io.reactivex.functions.Action
            public void run() throws java.lang.Exception {
                synchronized (com.polidea.rxandroidble2.RxBleClientImpl.this.queuedScanOperations) {
                    com.polidea.rxandroidble2.RxBleClientImpl.this.queuedScanOperations.remove(distinctSet);
                }
            }
        }).mergeWith(bluetoothAdapterOffExceptionObservable()).map(new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy, com.polidea.rxandroidble2.RxBleScanResult>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.6
            @Override // io.reactivex.functions.Function
            public com.polidea.rxandroidble2.RxBleScanResult apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy rxBleInternalScanResultLegacy) {
                return com.polidea.rxandroidble2.RxBleClientImpl.this.convertToPublicScanResult(rxBleInternalScanResultLegacy);
            }
        }).doOnNext(new io.reactivex.functions.Consumer<com.polidea.rxandroidble2.RxBleScanResult>() { // from class: com.polidea.rxandroidble2.RxBleClientImpl.5
            @Override // io.reactivex.functions.Consumer
            public void accept(com.polidea.rxandroidble2.RxBleScanResult rxBleScanResult) {
                com.polidea.rxandroidble2.internal.RxBleLog.i("%s", rxBleScanResult);
            }
        }).share();
    }

    private void guardBluetoothAdapterAvailable() {
        if (!this.rxBleAdapterWrapper.hasBluetoothAdapter()) {
            throw new java.lang.UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
        }
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> observeStateChanges() {
        return this.lazyClientStateObservable.get();
    }

    @Override // com.polidea.rxandroidble2.RxBleClient
    public com.polidea.rxandroidble2.RxBleClient.State getState() {
        if (!this.rxBleAdapterWrapper.hasBluetoothAdapter()) {
            return com.polidea.rxandroidble2.RxBleClient.State.BLUETOOTH_NOT_AVAILABLE;
        }
        if (!this.locationServicesStatus.isLocationPermissionOk()) {
            return com.polidea.rxandroidble2.RxBleClient.State.LOCATION_PERMISSION_NOT_GRANTED;
        }
        if (!this.rxBleAdapterWrapper.isBluetoothEnabled()) {
            return com.polidea.rxandroidble2.RxBleClient.State.BLUETOOTH_NOT_ENABLED;
        }
        if (!this.locationServicesStatus.isLocationProviderOk()) {
            return com.polidea.rxandroidble2.RxBleClient.State.LOCATION_SERVICES_NOT_ENABLED;
        }
        return com.polidea.rxandroidble2.RxBleClient.State.READY;
    }
}
