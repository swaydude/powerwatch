package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMaterialize<T> extends io.reactivex.Single<io.reactivex.Notification<T>> {
    final io.reactivex.Completable source;

    public CompletableMaterialize(io.reactivex.Completable completable) {
        this.source = completable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super io.reactivex.Notification<T>> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.mixed.MaterializeSingleObserver(singleObserver));
    }
}
