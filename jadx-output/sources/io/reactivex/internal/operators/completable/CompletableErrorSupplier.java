package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableErrorSupplier extends io.reactivex.Completable {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> errorSupplier;

    public CompletableErrorSupplier(java.util.concurrent.Callable<? extends java.lang.Throwable> callable) {
        this.errorSupplier = callable;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            th = (java.lang.Throwable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorSupplier.call(), "The error returned is null");
        } catch (java.lang.Throwable th) {
            th = th;
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        }
        io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
    }
}
