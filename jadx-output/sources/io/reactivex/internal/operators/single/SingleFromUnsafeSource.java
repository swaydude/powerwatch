package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFromUnsafeSource<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> source;

    public SingleFromUnsafeSource(io.reactivex.SingleSource<T> singleSource) {
        this.source = singleSource;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(singleObserver);
    }
}
