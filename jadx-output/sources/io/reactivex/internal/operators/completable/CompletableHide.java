package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableHide extends io.reactivex.Completable {
    final io.reactivex.CompletableSource source;

    public CompletableHide(io.reactivex.CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableHide.HideCompletableObserver(completableObserver));
    }

    static final class HideCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver downstream;
        io.reactivex.disposables.Disposable upstream;

        HideCompletableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
