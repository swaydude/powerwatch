package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableNever extends io.reactivex.Completable {
    public static final io.reactivex.Completable INSTANCE = new io.reactivex.internal.operators.completable.CompletableNever();

    private CompletableNever() {
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        completableObserver.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.NEVER);
    }
}
