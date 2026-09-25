package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDetach extends io.reactivex.Completable {
    final io.reactivex.CompletableSource source;

    public CompletableDetach(io.reactivex.CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableDetach.DetachCompletableObserver(completableObserver));
    }

    static final class DetachCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        io.reactivex.CompletableObserver downstream;
        io.reactivex.disposables.Disposable upstream;

        DetachCompletableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.downstream = null;
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
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.CompletableObserver completableObserver = this.downstream;
            if (completableObserver != null) {
                this.downstream = null;
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.CompletableObserver completableObserver = this.downstream;
            if (completableObserver != null) {
                this.downstream = null;
                completableObserver.onComplete();
            }
        }
    }
}
