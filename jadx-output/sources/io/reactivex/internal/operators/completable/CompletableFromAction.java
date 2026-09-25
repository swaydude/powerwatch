package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromAction extends io.reactivex.Completable {
    final io.reactivex.functions.Action run;

    public CompletableFromAction(io.reactivex.functions.Action action) {
        this.run = action;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        completableObserver.onSubscribe(disposableEmpty);
        try {
            this.run.run();
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
