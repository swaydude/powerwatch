package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableError<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> errorSupplier;

    public ObservableError(java.util.concurrent.Callable<? extends java.lang.Throwable> callable) {
        this.errorSupplier = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            th = (java.lang.Throwable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorSupplier.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        }
        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
    }
}
