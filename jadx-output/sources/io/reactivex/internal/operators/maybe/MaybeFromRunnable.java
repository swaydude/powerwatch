package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFromRunnable<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final java.lang.Runnable runnable;

    public MaybeFromRunnable(java.lang.Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            this.runnable.run();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            maybeObserver.onComplete();
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
        this.runnable.run();
        return null;
    }
}
