package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleNever extends io.reactivex.Single<java.lang.Object> {
    public static final io.reactivex.Single<java.lang.Object> INSTANCE = new io.reactivex.internal.operators.single.SingleNever();

    private SingleNever() {
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Object> singleObserver) {
        singleObserver.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.NEVER);
    }
}
