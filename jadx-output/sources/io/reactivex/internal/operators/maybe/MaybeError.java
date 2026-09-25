package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeError<T> extends io.reactivex.Maybe<T> {
    final java.lang.Throwable error;

    public MaybeError(java.lang.Throwable th) {
        this.error = th;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        maybeObserver.onError(this.error);
    }
}
