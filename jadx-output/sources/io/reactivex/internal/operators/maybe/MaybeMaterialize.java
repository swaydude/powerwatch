package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeMaterialize<T> extends io.reactivex.Single<io.reactivex.Notification<T>> {
    final io.reactivex.Maybe<T> source;

    public MaybeMaterialize(io.reactivex.Maybe<T> maybe) {
        this.source = maybe;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super io.reactivex.Notification<T>> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.mixed.MaterializeSingleObserver(singleObserver));
    }
}
