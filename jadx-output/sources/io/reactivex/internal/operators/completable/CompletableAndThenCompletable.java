package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableAndThenCompletable extends io.reactivex.Completable {
    final io.reactivex.CompletableSource next;
    final io.reactivex.CompletableSource source;

    public CompletableAndThenCompletable(io.reactivex.CompletableSource completableSource, io.reactivex.CompletableSource completableSource2) {
        this.source = completableSource;
        this.next = completableSource2;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableAndThenCompletable.SourceObserver(completableObserver, this.next));
    }

    static final class SourceObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4101678820158072998L;
        final io.reactivex.CompletableObserver actualObserver;
        final io.reactivex.CompletableSource next;

        SourceObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.CompletableSource completableSource) {
            this.actualObserver = completableObserver;
            this.next = completableSource;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.actualObserver.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.next.subscribe(new io.reactivex.internal.operators.completable.CompletableAndThenCompletable.NextObserver(this, this.actualObserver));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    static final class NextObserver implements io.reactivex.CompletableObserver {
        final io.reactivex.CompletableObserver downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        public NextObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.CompletableObserver completableObserver) {
            this.parent = atomicReference;
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.parent, disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
