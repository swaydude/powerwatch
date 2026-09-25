package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceModule_ProvidesDisconnectTimeoutConfFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> timeoutSchedulerProvider;

    public DeviceModule_ProvidesDisconnectTimeoutConfFactory(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        this.timeoutSchedulerProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration get() {
        return (com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.providesDisconnectTimeoutConf(this.timeoutSchedulerProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.DeviceModule_ProvidesDisconnectTimeoutConfFactory create(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        return new com.polidea.rxandroidble2.internal.DeviceModule_ProvidesDisconnectTimeoutConfFactory(provider);
    }

    public static com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration proxyProvidesDisconnectTimeoutConf(io.reactivex.Scheduler scheduler) {
        return (com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.providesDisconnectTimeoutConf(scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }
}
