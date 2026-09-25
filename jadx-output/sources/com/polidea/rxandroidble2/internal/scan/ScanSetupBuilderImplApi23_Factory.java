package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanSetupBuilderImplApi23_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> androidScanObjectsConverterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> internalScanResultCreatorProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;

    public ScanSetupBuilderImplApi23_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider3) {
        this.rxBleAdapterWrapperProvider = provider;
        this.internalScanResultCreatorProvider = provider2;
        this.androidScanObjectsConverterProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23 get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23(this.rxBleAdapterWrapperProvider.get(), this.internalScanResultCreatorProvider.get(), this.androidScanObjectsConverterProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider3) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23 newScanSetupBuilderImplApi23(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23(rxBleAdapterWrapper, internalScanResultCreator, androidScanObjectsConverter);
    }
}
