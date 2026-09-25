package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFromCallable<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public MaybeFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.callable = callable;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.callable.call();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            if (tCall == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(tCall);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (!disposableEmpty.isDisposed()) {
                maybeObserver.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
        return this.callable.call();
    }
}
