package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class MtuBasedPayloadSizeLimit_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> gattWriteMtuOverheadProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> rxBleConnectionProvider;

    public MtuBasedPayloadSizeLimit_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        this.rxBleConnectionProvider = provider;
        this.gattWriteMtuOverheadProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit get() {
        return new com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit(this.rxBleConnectionProvider.get(), this.gattWriteMtuOverheadProvider.get().intValue());
    }

    public static com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        return new com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit newMtuBasedPayloadSizeLimit(com.polidea.rxandroidble2.RxBleConnection rxBleConnection, int i) {
        return new com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit(rxBleConnection, i);
    }
}
