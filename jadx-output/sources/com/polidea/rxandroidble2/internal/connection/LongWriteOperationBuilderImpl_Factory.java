package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class LongWriteOperationBuilderImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit> defaultMaxBatchSizeProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> operationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> operationsProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> rxBleConnectionProvider;

    public LongWriteOperationBuilderImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider4) {
        this.operationQueueProvider = provider;
        this.defaultMaxBatchSizeProvider = provider2;
        this.rxBleConnectionProvider = provider3;
        this.operationsProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl get() {
        return new com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl(this.operationQueueProvider.get(), this.defaultMaxBatchSizeProvider.get(), this.rxBleConnectionProvider.get(), this.operationsProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider4) {
        return new com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl newLongWriteOperationBuilderImpl(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, java.lang.Object obj, com.polidea.rxandroidble2.RxBleConnection rxBleConnection, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        return new com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl(connectionOperationQueue, (com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit) obj, rxBleConnection, operationsProvider);
    }
}
