package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceModule_ProvideConnectionStateRelayFactory implements bleshadow.dagger.internal.Factory<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> {
    private static final com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateRelayFactory INSTANCE = new com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateRelayFactory();

    @Override // bleshadow.javax.inject.Provider
    public com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> get() {
        return (com.jakewharton.rxrelay2.BehaviorRelay) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideConnectionStateRelay(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateRelayFactory create() {
        return INSTANCE;
    }

    public static com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> proxyProvideConnectionStateRelay() {
        return (com.jakewharton.rxrelay2.BehaviorRelay) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideConnectionStateRelay(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
