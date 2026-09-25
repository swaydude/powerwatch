package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_ProvidesOperationTimeoutConfFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.Timeout> operationTimeoutProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> timeoutSchedulerProvider;

    public ConnectionModule_ProvidesOperationTimeoutConfFactory(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.Timeout> provider2) {
        this.timeoutSchedulerProvider = provider;
        this.operationTimeoutProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration get() {
        return (com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.providesOperationTimeoutConf(this.timeoutSchedulerProvider.get(), this.operationTimeoutProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvidesOperationTimeoutConfFactory create(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.Timeout> provider2) {
        return new com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvidesOperationTimeoutConfFactory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration proxyProvidesOperationTimeoutConf(io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.Timeout timeout) {
        return (com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.providesOperationTimeoutConf(scheduler, timeout), "Cannot return null from a non-@Nullable @Provides method");
    }
}
