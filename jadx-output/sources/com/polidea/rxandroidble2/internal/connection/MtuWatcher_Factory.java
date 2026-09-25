package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class MtuWatcher_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.MtuWatcher> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> initialValueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;

    public MtuWatcher_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        this.rxBleGattCallbackProvider = provider;
        this.initialValueProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.MtuWatcher get() {
        return new com.polidea.rxandroidble2.internal.connection.MtuWatcher(this.rxBleGattCallbackProvider.get(), this.initialValueProvider.get().intValue());
    }

    public static com.polidea.rxandroidble2.internal.connection.MtuWatcher_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        return new com.polidea.rxandroidble2.internal.connection.MtuWatcher_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.connection.MtuWatcher newMtuWatcher(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, int i) {
        return new com.polidea.rxandroidble2.internal.connection.MtuWatcher(rxBleGattCallback, i);
    }
}
