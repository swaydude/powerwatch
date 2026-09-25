package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class DisconnectionRouter_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.DisconnectionRouter> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> adapterStateObservableProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> adapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<java.lang.String> macAddressProvider;

    public DisconnectionRouter_Factory(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider3) {
        this.macAddressProvider = provider;
        this.adapterWrapperProvider = provider2;
        this.adapterStateObservableProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.DisconnectionRouter get() {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectionRouter(this.macAddressProvider.get(), this.adapterWrapperProvider.get(), this.adapterStateObservableProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.DisconnectionRouter_Factory create(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider3) {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectionRouter_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.connection.DisconnectionRouter newDisconnectionRouter(java.lang.String str, com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable) {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectionRouter(str, rxBleAdapterWrapper, observable);
    }
}
