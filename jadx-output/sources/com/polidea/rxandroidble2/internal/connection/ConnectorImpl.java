package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectorImpl implements com.polidea.rxandroidble2.internal.connection.Connector {
    private final io.reactivex.Scheduler callbacksScheduler;
    private final com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue;
    private final com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder connectionComponentBuilder;

    @bleshadow.javax.inject.Inject
    public ConnectorImpl(com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue clientOperationQueue, com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder builder, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_CALLBACKS) io.reactivex.Scheduler scheduler) {
        this.clientOperationQueue = clientOperationQueue;
        this.connectionComponentBuilder = builder;
        this.callbacksScheduler = scheduler;
    }

    @Override // com.polidea.rxandroidble2.internal.connection.Connector
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> prepareConnection(final com.polidea.rxandroidble2.ConnectionSetup connectionSetup) {
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable<io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection>>() { // from class: com.polidea.rxandroidble2.internal.connection.ConnectorImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection> call() throws java.lang.Exception {
                com.polidea.rxandroidble2.internal.connection.ConnectionComponent connectionComponentBuild = com.polidea.rxandroidble2.internal.connection.ConnectorImpl.this.connectionComponentBuilder.autoConnect(connectionSetup.autoConnect).suppressOperationChecks(connectionSetup.suppressOperationCheck).operationTimeout(connectionSetup.operationTimeout).build();
                final java.util.Set<com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher> setConnectionSubscriptionWatchers = connectionComponentBuild.connectionSubscriptionWatchers();
                return com.polidea.rxandroidble2.internal.connection.ConnectorImpl.obtainRxBleConnection(connectionComponentBuild).mergeWith(com.polidea.rxandroidble2.internal.connection.ConnectorImpl.observeDisconnections(connectionComponentBuild)).delaySubscription(com.polidea.rxandroidble2.internal.connection.ConnectorImpl.this.enqueueConnectOperation(connectionComponentBuild)).doOnSubscribe(new io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable>() { // from class: com.polidea.rxandroidble2.internal.connection.ConnectorImpl.1.2
                    @Override // io.reactivex.functions.Consumer
                    public void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
                        java.util.Iterator it = setConnectionSubscriptionWatchers.iterator();
                        while (it.hasNext()) {
                            ((com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher) it.next()).onConnectionSubscribed();
                        }
                    }
                }).doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.ConnectorImpl.1.1
                    @Override // io.reactivex.functions.Action
                    public void run() throws java.lang.Exception {
                        java.util.Iterator it = setConnectionSubscriptionWatchers.iterator();
                        while (it.hasNext()) {
                            ((com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher) it.next()).onConnectionUnsubscribed();
                        }
                    }
                }).subscribeOn(com.polidea.rxandroidble2.internal.connection.ConnectorImpl.this.callbacksScheduler).unsubscribeOn(com.polidea.rxandroidble2.internal.connection.ConnectorImpl.this.callbacksScheduler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> obtainRxBleConnection(final com.polidea.rxandroidble2.internal.connection.ConnectionComponent connectionComponent) {
        return io.reactivex.Observable.fromCallable(new java.util.concurrent.Callable<com.polidea.rxandroidble2.RxBleConnection>() { // from class: com.polidea.rxandroidble2.internal.connection.ConnectorImpl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.polidea.rxandroidble2.RxBleConnection call() throws java.lang.Exception {
                return connectionComponent.rxBleConnection();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observeDisconnections(com.polidea.rxandroidble2.internal.connection.ConnectionComponent connectionComponent) {
        return connectionComponent.gattCallback().observeDisconnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.Observable<android.bluetooth.BluetoothGatt> enqueueConnectOperation(com.polidea.rxandroidble2.internal.connection.ConnectionComponent connectionComponent) {
        return this.clientOperationQueue.queue(connectionComponent.connectOperation());
    }
}
