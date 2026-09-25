package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDefer<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> maybeSupplier;

    public MaybeDefer(java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> callable) {
        this.maybeSupplier = callable;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        try {
            ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.maybeSupplier.call(), "The maybeSupplier returned a null MaybeSource")).subscribe(maybeObserver);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
        }
    }
}
