package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDefer extends io.reactivex.Completable {
    final java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> completableSupplier;

    public CompletableDefer(java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> callable) {
        this.completableSupplier = callable;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            ((io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.completableSupplier.call(), "The completableSupplier returned a null CompletableSource")).subscribe(completableObserver);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
        }
    }
}
