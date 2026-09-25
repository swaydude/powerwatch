package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanSetupBuilderImplApi18_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> internalScanResultCreatorProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> scanSettingsEmulatorProvider;

    public ScanSetupBuilderImplApi18_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> provider3) {
        this.rxBleAdapterWrapperProvider = provider;
        this.internalScanResultCreatorProvider = provider2;
        this.scanSettingsEmulatorProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18 get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18(this.rxBleAdapterWrapperProvider.get(), this.internalScanResultCreatorProvider.get(), this.scanSettingsEmulatorProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> provider3) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18 newScanSetupBuilderImplApi18(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator scanSettingsEmulator) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18(rxBleAdapterWrapper, internalScanResultCreator, scanSettingsEmulator);
    }
}
