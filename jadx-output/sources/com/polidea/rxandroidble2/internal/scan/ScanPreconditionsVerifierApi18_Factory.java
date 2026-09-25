package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanPreconditionsVerifierApi18_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> locationServicesStatusProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;

    public ScanPreconditionsVerifierApi18_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider2) {
        this.rxBleAdapterWrapperProvider = provider;
        this.locationServicesStatusProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18 get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18(this.rxBleAdapterWrapperProvider.get(), this.locationServicesStatusProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider2) {
        return new com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18_Factory(provider, provider2);
    }
}
