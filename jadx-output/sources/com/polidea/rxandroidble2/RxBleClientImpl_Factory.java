package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleClientImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.RxBleClientImpl> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> adapterStateObservableProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.scan.BackgroundScanner> backgroundScannerProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> bluetoothInteractionSchedulerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer> clientComponentFinalizerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.ClientStateObservable> clientStateObservableProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult>> internalToExternalScanResultMapFunctionProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> locationServicesStatusProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> operationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> rxBleDeviceProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier> scanPreconditionVerifierProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder> scanSetupBuilderProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> uuidUtilProvider;

    public RxBleClientImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.ClientStateObservable> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> provider7, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder> provider8, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier> provider9, bleshadow.javax.inject.Provider<io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult>> provider10, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider11, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer> provider12, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.scan.BackgroundScanner> provider13) {
        this.rxBleAdapterWrapperProvider = provider;
        this.operationQueueProvider = provider2;
        this.adapterStateObservableProvider = provider3;
        this.uuidUtilProvider = provider4;
        this.locationServicesStatusProvider = provider5;
        this.clientStateObservableProvider = provider6;
        this.rxBleDeviceProvider = provider7;
        this.scanSetupBuilderProvider = provider8;
        this.scanPreconditionVerifierProvider = provider9;
        this.internalToExternalScanResultMapFunctionProvider = provider10;
        this.bluetoothInteractionSchedulerProvider = provider11;
        this.clientComponentFinalizerProvider = provider12;
        this.backgroundScannerProvider = provider13;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.RxBleClientImpl get() {
        return new com.polidea.rxandroidble2.RxBleClientImpl(this.rxBleAdapterWrapperProvider.get(), this.operationQueueProvider.get(), this.adapterStateObservableProvider.get(), this.uuidUtilProvider.get(), this.locationServicesStatusProvider.get(), bleshadow.dagger.internal.DoubleCheck.lazy(this.clientStateObservableProvider), this.rxBleDeviceProvider.get(), this.scanSetupBuilderProvider.get(), this.scanPreconditionVerifierProvider.get(), this.internalToExternalScanResultMapFunctionProvider.get(), this.bluetoothInteractionSchedulerProvider.get(), this.clientComponentFinalizerProvider.get(), this.backgroundScannerProvider.get());
    }

    public static com.polidea.rxandroidble2.RxBleClientImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.ClientStateObservable> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> provider7, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder> provider8, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier> provider9, bleshadow.javax.inject.Provider<io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult>> provider10, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider11, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer> provider12, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.scan.BackgroundScanner> provider13) {
        return new com.polidea.rxandroidble2.RxBleClientImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static com.polidea.rxandroidble2.RxBleClientImpl newRxBleClientImpl(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable, com.polidea.rxandroidble2.internal.util.UUIDUtil uUIDUtil, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus, bleshadow.dagger.Lazy<com.polidea.rxandroidble2.internal.util.ClientStateObservable> lazy, com.polidea.rxandroidble2.internal.RxBleDeviceProvider rxBleDeviceProvider, com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder scanSetupBuilder, com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier scanPreconditionsVerifier, io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult> function, io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer clientComponentFinalizer, com.polidea.rxandroidble2.scan.BackgroundScanner backgroundScanner) {
        return new com.polidea.rxandroidble2.RxBleClientImpl(rxBleAdapterWrapper, clientOperationQueue, observable, uUIDUtil, locationServicesStatus, lazy, rxBleDeviceProvider, scanSetupBuilder, scanPreconditionsVerifier, function, scheduler, clientComponentFinalizer, backgroundScanner);
    }
}
