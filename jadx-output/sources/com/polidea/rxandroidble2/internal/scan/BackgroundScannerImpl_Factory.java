package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundScannerImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> internalScanResultCreatorProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter> internalToExternalScanResultConverterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> scanObjectsConverterProvider;

    public BackgroundScannerImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter> provider4) {
        this.rxBleAdapterWrapperProvider = provider;
        this.scanObjectsConverterProvider = provider2;
        this.internalScanResultCreatorProvider = provider3;
        this.internalToExternalScanResultConverterProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl get() {
        return new com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl(this.rxBleAdapterWrapperProvider.get(), this.scanObjectsConverterProvider.get(), this.internalScanResultCreatorProvider.get(), this.internalToExternalScanResultConverterProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter> provider4) {
        return new com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl newBackgroundScannerImpl(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter internalToExternalScanResultConverter) {
        return new com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl(rxBleAdapterWrapper, androidScanObjectsConverter, internalScanResultCreator, internalToExternalScanResultConverter);
    }
}
