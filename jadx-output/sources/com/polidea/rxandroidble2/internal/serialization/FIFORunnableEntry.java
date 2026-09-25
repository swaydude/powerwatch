package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
class FIFORunnableEntry<T> implements java.lang.Comparable<com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry> {
    private static final java.util.concurrent.atomic.AtomicLong SEQUENCE = new java.util.concurrent.atomic.AtomicLong(0);
    final com.polidea.rxandroidble2.internal.operations.Operation<T> operation;
    final io.reactivex.ObservableEmitter<T> operationResultObserver;
    private final long seqNum = SEQUENCE.getAndIncrement();

    FIFORunnableEntry(com.polidea.rxandroidble2.internal.operations.Operation<T> operation, io.reactivex.ObservableEmitter<T> observableEmitter) {
        this.operation = operation;
        this.operationResultObserver = observableEmitter;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry) {
        int iCompareTo = this.operation.compareTo((T) fIFORunnableEntry.operation);
        if (iCompareTo != 0 || fIFORunnableEntry.operation == this.operation) {
            return iCompareTo;
        }
        return this.seqNum < fIFORunnableEntry.seqNum ? -1 : 1;
    }

    public void run(com.polidea.rxandroidble2.internal.serialization.QueueSemaphore queueSemaphore, io.reactivex.Scheduler scheduler) {
        if (this.operationResultObserver.isDisposed()) {
            com.polidea.rxandroidble2.internal.logger.LoggerUtil.logOperationSkippedBecauseDisposedWhenAboutToRun(this.operation);
            queueSemaphore.release();
        } else {
            this.operation.run(queueSemaphore).subscribeOn(scheduler).unsubscribeOn(scheduler).subscribe(new io.reactivex.Observer<T>() { // from class: com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry.1
                @Override // io.reactivex.Observer
                public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                    com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry.this.operationResultObserver.setDisposable(disposable);
                }

                @Override // io.reactivex.Observer
                public void onNext(T t) {
                    com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry.this.operationResultObserver.onNext(t);
                }

                @Override // io.reactivex.Observer
                public void onError(java.lang.Throwable th) {
                    com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry.this.operationResultObserver.tryOnError(th);
                }

                @Override // io.reactivex.Observer
                public void onComplete() {
                    com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry.this.operationResultObserver.onComplete();
                }
            });
        }
    }
}
