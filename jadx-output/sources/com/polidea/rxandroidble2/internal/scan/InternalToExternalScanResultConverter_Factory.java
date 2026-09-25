package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalToExternalScanResultConverter_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> deviceProvider;

    public InternalToExternalScanResultConverter_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> provider) {
        this.deviceProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter get() {
        return new com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter(this.deviceProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> provider) {
        return new com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter_Factory(provider);
    }
}
