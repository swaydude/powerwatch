package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
public class ClientOperationQueueImpl implements com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue {
    private com.polidea.rxandroidble2.internal.serialization.OperationPriorityFifoBlockingQueue queue = new com.polidea.rxandroidble2.internal.serialization.OperationPriorityFifoBlockingQueue();

    @bleshadow.javax.inject.Inject
    public ClientOperationQueueImpl(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) final io.reactivex.Scheduler scheduler) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.1
            /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry<?> fIFORunnableEntryTake = com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.this.queue.take();
                        com.polidea.rxandroidble2.internal.operations.Operation<?> operation = fIFORunnableEntryTake.operation;
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationStarted(operation);
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationRunning(operation);
                        com.polidea.rxandroidble2.internal.serialization.QueueSemaphore queueSemaphore = new com.polidea.rxandroidble2.internal.serialization.QueueSemaphore();
                        fIFORunnableEntryTake.run(queueSemaphore, scheduler);
                        queueSemaphore.awaitRelease();
                        com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationFinished(operation, jCurrentTimeMillis, java.lang.System.currentTimeMillis());
                    } catch (java.lang.InterruptedException e) {
                        com.polidea.rxandroidble2.internal.RxBleLog.e(e, "Error while processing client operation queue", new java.lang.Object[0]);
                    }
                }
            }
        }).start();
    }

    @Override // com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue
    public <T> io.reactivex.Observable<T> queue(final com.polidea.rxandroidble2.internal.operations.Operation<T> operation) {
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<T>() { // from class: com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.2
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(io.reactivex.ObservableEmitter<T> observableEmitter) throws java.lang.Exception {
                final com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry = new com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry(operation, observableEmitter);
                observableEmitter.setDisposable(io.reactivex.disposables.Disposables.fromAction(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.2.1
                    @Override // io.reactivex.functions.Action
                    public void run() throws java.lang.Exception {
                        if (com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.this.queue.remove(fIFORunnableEntry)) {
                            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationRemoved(operation);
                        }
                    }
                }));
                com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationQueued(operation);
                com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl.this.queue.add(fIFORunnableEntry);
            }
        });
    }
}
