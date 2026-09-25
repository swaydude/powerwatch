package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidScanObjectsConverter_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;

    public AndroidScanObjectsConverter_Factory(bleshadow.javax.inject.Provider<java.lang.Integer> provider) {
        this.deviceSdkProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter get() {
        return new com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter(this.deviceSdkProvider.get().intValue());
    }

    public static com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter_Factory create(bleshadow.javax.inject.Provider<java.lang.Integer> provider) {
        return new com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter_Factory(provider);
    }
}
