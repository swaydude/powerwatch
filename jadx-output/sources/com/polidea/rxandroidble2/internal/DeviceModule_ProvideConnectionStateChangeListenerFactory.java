package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceModule_ProvideConnectionStateChangeListenerFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> {
    private final bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> connectionStateBehaviorRelayProvider;

    public DeviceModule_ProvideConnectionStateChangeListenerFactory(bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provider) {
        this.connectionStateBehaviorRelayProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener get() {
        return (com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideConnectionStateChangeListener(this.connectionStateBehaviorRelayProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateChangeListenerFactory create(bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provider) {
        return new com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateChangeListenerFactory(provider);
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener proxyProvideConnectionStateChangeListener(com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> behaviorRelay) {
        return (com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideConnectionStateChangeListener(behaviorRelay), "Cannot return null from a non-@Nullable @Provides method");
    }
}
