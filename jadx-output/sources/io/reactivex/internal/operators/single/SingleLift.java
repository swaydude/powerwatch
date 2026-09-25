package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleLift<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleOperator<? extends R, ? super T> onLift;
    final io.reactivex.SingleSource<T> source;

    public SingleLift(io.reactivex.SingleSource<T> singleSource, io.reactivex.SingleOperator<? extends R, ? super T> singleOperator) {
        this.source = singleSource;
        this.onLift = singleOperator;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        try {
            this.source.subscribe((io.reactivex.SingleObserver) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.onLift.apply(singleObserver), "The onLift returned a null SingleObserver"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
