package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QueueOperation<T> implements com.polidea.rxandroidble2.internal.operations.Operation<T> {
    protected abstract void protectedRun(io.reactivex.ObservableEmitter<T> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) throws java.lang.Throwable;

    protected abstract com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException);

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.polidea.rxandroidble2.internal.operations.Operation<?> operation) {
        return compareTo2((com.polidea.rxandroidble2.internal.operations.Operation) operation);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.Operation
    public final io.reactivex.Observable<T> run(final com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<T>() { // from class: com.polidea.rxandroidble2.internal.QueueOperation.1
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(io.reactivex.ObservableEmitter<T> observableEmitter) {
                try {
                    com.polidea.rxandroidble2.internal.QueueOperation.this.protectedRun(observableEmitter, queueReleaseInterface);
                } catch (android.os.DeadObjectException e) {
                    observableEmitter.tryOnError(com.polidea.rxandroidble2.internal.QueueOperation.this.provideException(e));
                    com.polidea.rxandroidble2.internal.RxBleLog.e(e, "QueueOperation terminated with a DeadObjectException", new java.lang.Object[0]);
                } catch (java.lang.Throwable th) {
                    observableEmitter.tryOnError(th);
                    com.polidea.rxandroidble2.internal.RxBleLog.e(th, "QueueOperation terminated with an unexpected exception", new java.lang.Object[0]);
                }
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.operations.Operation
    public com.polidea.rxandroidble2.internal.Priority definedPriority() {
        return com.polidea.rxandroidble2.internal.Priority.NORMAL;
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        return operation.definedPriority().priority - definedPriority().priority;
    }
}
