package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFromFuture<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public ObservableFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j;
        this.unit = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.observers.DeferredScalarDisposable deferredScalarDisposable = new io.reactivex.internal.observers.DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            java.util.concurrent.TimeUnit timeUnit = this.unit;
            deferredScalarDisposable.complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get(), "Future returned null"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            observer.onError(th);
        }
    }
}
