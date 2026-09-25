package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFromFuture<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public MaybeFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        T t;
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            long j = this.timeout;
            if (j <= 0) {
                t = this.future.get();
            } else {
                t = this.future.get(j, this.unit);
            }
            if (disposableEmpty.isDisposed()) {
                return;
            }
            if (t == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t);
            }
        } catch (java.lang.Throwable th) {
            th = th;
            if (th instanceof java.util.concurrent.ExecutionException) {
                th = th.getCause();
            }
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (disposableEmpty.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
