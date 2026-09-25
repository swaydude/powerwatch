package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectorImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.ConnectorImpl> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> callbacksSchedulerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> clientOperationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder> connectionComponentBuilderProvider;

    public ConnectorImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder> provider2, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider3) {
        this.clientOperationQueueProvider = provider;
        this.connectionComponentBuilderProvider = provider2;
        this.callbacksSchedulerProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.ConnectorImpl get() {
        return new com.polidea.rxandroidble2.internal.connection.ConnectorImpl(this.clientOperationQueueProvider.get(), this.connectionComponentBuilderProvider.get(), this.callbacksSchedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectorImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder> provider2, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider3) {
        return new com.polidea.rxandroidble2.internal.connection.ConnectorImpl_Factory(provider, provider2, provider3);
    }
}
