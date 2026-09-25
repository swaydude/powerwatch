package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class QueueReleasingEmitterWrapper<T> implements io.reactivex.Observer<T>, io.reactivex.functions.Cancellable {
    private final io.reactivex.ObservableEmitter<T> emitter;
    private final java.util.concurrent.atomic.AtomicBoolean isEmitterCanceled = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface;

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public QueueReleasingEmitterWrapper(io.reactivex.ObservableEmitter<T> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        this.emitter = observableEmitter;
        this.queueReleaseInterface = queueReleaseInterface;
        observableEmitter.setCancellable(this);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.queueReleaseInterface.release();
        this.emitter.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        this.queueReleaseInterface.release();
        this.emitter.tryOnError(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.emitter.onNext(t);
    }

    @Override // io.reactivex.functions.Cancellable
    public synchronized void cancel() throws java.lang.Exception {
        this.isEmitterCanceled.set(true);
    }

    public synchronized boolean isWrappedEmitterUnsubscribed() {
        return this.isEmitterCanceled.get();
    }
}
