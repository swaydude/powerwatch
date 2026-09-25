package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleMaterialize<T> extends io.reactivex.Single<io.reactivex.Notification<T>> {
    final io.reactivex.Single<T> source;

    public SingleMaterialize(io.reactivex.Single<T> single) {
        this.source = single;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super io.reactivex.Notification<T>> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.mixed.MaterializeSingleObserver(singleObserver));
    }
}
