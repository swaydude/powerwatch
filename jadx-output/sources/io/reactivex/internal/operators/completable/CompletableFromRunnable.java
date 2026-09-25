package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromRunnable extends io.reactivex.Completable {
    final java.lang.Runnable runnable;

    public CompletableFromRunnable(java.lang.Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        completableObserver.onSubscribe(disposableEmpty);
        try {
            this.runnable.run();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (!disposableEmpty.isDisposed()) {
                completableObserver.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
