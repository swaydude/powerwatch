package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableError extends io.reactivex.Completable {
    final java.lang.Throwable error;

    public CompletableError(java.lang.Throwable th) {
        this.error = th;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.disposables.EmptyDisposable.error(this.error, completableObserver);
    }
}
