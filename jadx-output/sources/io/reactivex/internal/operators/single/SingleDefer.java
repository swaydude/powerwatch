package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDefer<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> singleSupplier;

    public SingleDefer(java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> callable) {
        this.singleSupplier = callable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        try {
            ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.singleSupplier.call(), "The singleSupplier returned a null SingleSource")).subscribe(singleObserver);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
