package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDefer<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> supplier;

    public ObservableDefer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            ((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.supplier.call(), "null ObservableSource supplied")).subscribe(observer);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }
}
