package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
public class ConnectionOperationQueueImpl implements com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue, com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher {
    private final java.lang.String deviceMacAddress;
    private final com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput disconnectionRouterOutput;
    private io.reactivex.observers.DisposableObserver<com.polidea.rxandroidble2.exceptions.BleException> disconnectionThrowableSubscription;
    private final java.util.concurrent.Future<?> runnableFuture;
    private final com.polidea.rxandroidble2.internal.serialization.OperationPriorityFifoBlockingQueue queue = new com.polidea.rxandroidble2.internal.serialization.OperationPriorityFifoBlockingQueue();
    private volatile boolean shouldRun = true;
    private com.polidea.rxandroidble2.exceptions.BleException disconnectionException = null;

    @bleshadow.javax.inject.Inject
    ConnectionOperationQueueImpl(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.MAC_ADDRESS) final java.lang.String str, com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput disconnectionRouterOutput, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.CONNECTION_QUEUE) java.util.concurrent.ExecutorService executorService, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) final io.reactivex.Scheduler scheduler) {
        this.deviceMacAddress = str;
        this.disconnectionRouterOutput = disconnectionRouterOutput;
        this.runnableFuture = executorService.submit(new java.lang.Runnable() { // from class: com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.1
            @Override // java.lang.Runnable
            public void run() {
                while (com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.shouldRun) {
                    try {
                        com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry<?> fIFORunnableEntryTake = com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.queue.take();
                        com.polidea.rxandroidble2.internal.operations.Operation<?> operation = fIFORunnableEntryTake.operation;
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationStarted(operation);
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationRunning(operation);
                        com.polidea.rxandroidble2.internal.serialization.QueueSemaphore queueSemaphore = new com.polidea.rxandroidble2.internal.serialization.QueueSemaphore();
                        fIFORunnableEntryTake.run(queueSemaphore, scheduler);
                        queueSemaphore.awaitRelease();
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationFinished(operation, jCurrentTimeMillis, java.lang.System.currentTimeMillis());
                    } catch (java.lang.InterruptedException e) {
                        synchronized (com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this) {
                            if (!com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.shouldRun) {
                                com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.flushQueue();
                                com.polidea.rxandroidble2.internal.RxBleLog.v("Terminated (%s)", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(str));
                            }
                            com.polidea.rxandroidble2.internal.RxBleLog.e(e, "Error while processing connection operation queue", new java.lang.Object[0]);
                        }
                    }
                }
                com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.flushQueue();
                com.polidea.rxandroidble2.internal.RxBleLog.v("Terminated (%s)", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void flushQueue() {
        while (!this.queue.isEmpty()) {
            this.queue.takeNow().operationResultObserver.tryOnError(this.disconnectionException);
        }
    }

    @Override // com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue
    public synchronized <T> io.reactivex.Observable<T> queue(final com.polidea.rxandroidble2.internal.operations.Operation<T> operation) {
        if (!this.shouldRun) {
            return io.reactivex.Observable.error(this.disconnectionException);
        }
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<T>() { // from class: com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.2
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(io.reactivex.ObservableEmitter<T> observableEmitter) throws java.lang.Exception {
                final com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry = new com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry(operation, observableEmitter);
                observableEmitter.setCancellable(new io.reactivex.functions.Cancellable() { // from class: com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.2.1
                    @Override // io.reactivex.functions.Cancellable
                    public void cancel() throws java.lang.Exception {
                        if (com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.queue.remove(fIFORunnableEntry)) {
                            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationRemoved(operation);
                        }
                    }
                });
                com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationQueued(operation);
                com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.queue.add(fIFORunnableEntry);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue
    public synchronized void terminate(com.polidea.rxandroidble2.exceptions.BleException bleException) {
        if (this.disconnectionException != null) {
            return;
        }
        com.polidea.rxandroidble2.internal.RxBleLog.d(bleException, "Connection operations queue to be terminated (%s)", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.deviceMacAddress));
        this.shouldRun = false;
        this.disconnectionException = bleException;
        this.runnableFuture.cancel(true);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionSubscribed() {
        this.disconnectionThrowableSubscription = (io.reactivex.observers.DisposableObserver) this.disconnectionRouterOutput.asValueOnlyObservable().subscribeWith(new io.reactivex.observers.DisposableObserver<com.polidea.rxandroidble2.exceptions.BleException>() { // from class: com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.3
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
            }

            @Override // io.reactivex.Observer
            public void onNext(com.polidea.rxandroidble2.exceptions.BleException bleException) {
                com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl.this.terminate(bleException);
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionUnsubscribed() {
        this.disconnectionThrowableSubscription.dispose();
        this.disconnectionThrowableSubscription = null;
        terminate(new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(this.deviceMacAddress, -1));
    }
}
