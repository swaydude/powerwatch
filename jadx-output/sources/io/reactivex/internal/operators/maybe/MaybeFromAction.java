package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFromAction<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final io.reactivex.functions.Action action;

    public MaybeFromAction(io.reactivex.functions.Action action) {
        this.action = action;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.disposables.Disposable disposableEmpty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            this.action.run();
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
        this.action.run();
        return null;
    }
}
