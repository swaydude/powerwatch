package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class DisconnectAction_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.DisconnectAction> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> clientOperationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.DisconnectOperation> operationDisconnectProvider;

    public DisconnectAction_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.DisconnectOperation> provider2) {
        this.clientOperationQueueProvider = provider;
        this.operationDisconnectProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.DisconnectAction get() {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectAction(this.clientOperationQueueProvider.get(), this.operationDisconnectProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.DisconnectAction_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.DisconnectOperation> provider2) {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectAction_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.connection.DisconnectAction newDisconnectAction(com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue, com.polidea.rxandroidble2.internal.operations.DisconnectOperation disconnectOperation) {
        return new com.polidea.rxandroidble2.internal.connection.DisconnectAction(clientOperationQueue, disconnectOperation);
    }
}
