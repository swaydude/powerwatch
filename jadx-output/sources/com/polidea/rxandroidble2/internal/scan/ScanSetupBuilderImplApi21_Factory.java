package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanSetupBuilderImplApi21_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> androidScanObjectsConverterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> internalScanResultCreatorProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> scanSettingsEmulatorProvider;

    public ScanSetupBuilderImplApi21_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider4) {
        this.rxBleAdapterWrapperProvider = provider;
        this.internalScanResultCreatorProvider = provider2;
        this.scanSettingsEmulatorProvider = provider3;
        this.androidScanObjectsConverterProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21 get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21(this.rxBleAdapterWrapperProvider.get(), this.internalScanResultCreatorProvider.get(), this.scanSettingsEmulatorProvider.get(), this.androidScanObjectsConverterProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider4) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21 newScanSetupBuilderImplApi21(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator scanSettingsEmulator, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21(rxBleAdapterWrapper, internalScanResultCreator, scanSettingsEmulator, androidScanObjectsConverter);
    }
}
