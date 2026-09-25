package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalScanResultCreator_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> uuidUtilProvider;

    public InternalScanResultCreator_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> provider) {
        this.uuidUtilProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator get() {
        return new com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator(this.uuidUtilProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.UUIDUtil> provider) {
        return new com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator_Factory(provider);
    }
}
