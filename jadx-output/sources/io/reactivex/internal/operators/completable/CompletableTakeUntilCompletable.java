package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableTakeUntilCompletable extends io.reactivex.Completable {
    final io.reactivex.CompletableSource other;
    final io.reactivex.Completable source;

    public CompletableTakeUntilCompletable(io.reactivex.Completable completable, io.reactivex.CompletableSource completableSource) {
        this.source = completable;
        this.other = completableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver takeUntilMainObserver = new io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver(completableObserver);
        completableObserver.onSubscribe(takeUntilMainObserver);
        this.other.subscribe(takeUntilMainObserver.other);
        this.source.subscribe(takeUntilMainObserver);
    }

    static final class TakeUntilMainObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3533011714830024923L;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver.OtherObserver other = new io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver.OtherObserver(this);
        final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();

        TakeUntilMainObserver(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.once.get();
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void innerComplete() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.downstream.onComplete();
            }
        }

        void innerError(java.lang.Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5176264485428790318L;
            final io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver parent;

            OtherObserver(io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver takeUntilMainObserver) {
                this.parent = takeUntilMainObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(th);
            }
        }
    }
}
