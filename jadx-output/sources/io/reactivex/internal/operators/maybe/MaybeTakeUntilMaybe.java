package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeTakeUntilMaybe<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<U> other;

    public MaybeTakeUntilMaybe(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.MaybeSource<U> maybeSource2) {
        super(maybeSource);
        this.other = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(takeUntilMainMaybeObserver);
        this.other.subscribe(takeUntilMainMaybeObserver.other);
        this.source.subscribe(takeUntilMainMaybeObserver);
    }

    static final class TakeUntilMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<U> other = new io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<>(this);

        TakeUntilMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        void otherError(java.lang.Throwable th) {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void otherComplete() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        static final class TakeUntilOtherMaybeObserver<U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> parent;

            TakeUntilOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(java.lang.Object obj) {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.otherComplete();
            }
        }
    }
}
