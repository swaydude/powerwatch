package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorWriter_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> operationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> operationsProvider;

    public DescriptorWriter_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider2) {
        this.operationQueueProvider = provider;
        this.operationsProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.DescriptorWriter get() {
        return new com.polidea.rxandroidble2.internal.connection.DescriptorWriter(this.operationQueueProvider.get(), this.operationsProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.DescriptorWriter_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider2) {
        return new com.polidea.rxandroidble2.internal.connection.DescriptorWriter_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.connection.DescriptorWriter newDescriptorWriter(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        return new com.polidea.rxandroidble2.internal.connection.DescriptorWriter(connectionOperationQueue, operationsProvider);
    }
}
