package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class DisconnectAction implements com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher {
    private final com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue;
    private final com.polidea.rxandroidble2.internal.operations.DisconnectOperation operationDisconnect;

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionSubscribed() {
    }

    @bleshadow.javax.inject.Inject
    DisconnectAction(com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue, com.polidea.rxandroidble2.internal.operations.DisconnectOperation disconnectOperation) {
        this.clientOperationQueue = clientOperationQueue;
        this.operationDisconnect = disconnectOperation;
    }

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionUnsubscribed() {
        this.clientOperationQueue.queue(this.operationDisconnect).subscribe(io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer());
    }
}
