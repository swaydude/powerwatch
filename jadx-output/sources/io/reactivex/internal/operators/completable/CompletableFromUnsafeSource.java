package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromUnsafeSource extends io.reactivex.Completable {
    final io.reactivex.CompletableSource source;

    public CompletableFromUnsafeSource(io.reactivex.CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(completableObserver);
    }
}
