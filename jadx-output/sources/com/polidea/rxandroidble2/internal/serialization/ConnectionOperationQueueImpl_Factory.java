package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionOperationQueueImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> callbackSchedulerProvider;
    private final bleshadow.javax.inject.Provider<java.lang.String> deviceMacAddressProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput> disconnectionRouterOutputProvider;
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> executorServiceProvider;

    public ConnectionOperationQueueImpl_Factory(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput> provider2, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider3, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider4) {
        this.deviceMacAddressProvider = provider;
        this.disconnectionRouterOutputProvider = provider2;
        this.executorServiceProvider = provider3;
        this.callbackSchedulerProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl get() {
        return new com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl(this.deviceMacAddressProvider.get(), this.disconnectionRouterOutputProvider.get(), this.executorServiceProvider.get(), this.callbackSchedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl_Factory create(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput> provider2, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider3, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider4) {
        return new com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl newConnectionOperationQueueImpl(java.lang.String str, com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput disconnectionRouterOutput, java.util.concurrent.ExecutorService executorService, io.reactivex.Scheduler scheduler) {
        return new com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl(str, disconnectionRouterOutput, executorService, scheduler);
    }
}
