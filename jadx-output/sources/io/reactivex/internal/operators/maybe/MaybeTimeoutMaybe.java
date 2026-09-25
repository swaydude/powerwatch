package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeTimeoutMaybe<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> fallback;
    final io.reactivex.MaybeSource<U> other;

    public MaybeTimeoutMaybe(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.MaybeSource<U> maybeSource2, io.reactivex.MaybeSource<? extends T> maybeSource3) {
        super(maybeSource);
        this.other = maybeSource2;
        this.fallback = maybeSource3;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver timeoutMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver(maybeObserver, this.fallback);
        maybeObserver.onSubscribe(timeoutMainMaybeObserver);
        this.other.subscribe(timeoutMainMaybeObserver.other);
        this.source.subscribe(timeoutMainMaybeObserver);
    }

    static final class TimeoutMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.MaybeSource<? extends T> fallback;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutOtherMaybeObserver<T, U> other = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutOtherMaybeObserver<>(this);
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<T> otherObserver;

        TimeoutMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.downstream = maybeObserver;
            this.fallback = maybeSource;
            this.otherObserver = maybeSource != null ? new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<>(maybeObserver) : null;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.otherObserver;
            if (timeoutFallbackMaybeObserver != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
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

        public void otherError(java.lang.Throwable th) {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        public void otherComplete() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                io.reactivex.MaybeSource<? extends T> maybeSource = this.fallback;
                if (maybeSource == null) {
                    this.downstream.onError(new java.util.concurrent.TimeoutException());
                } else {
                    maybeSource.subscribe(this.otherObserver);
                }
            }
        }
    }

    static final class TimeoutOtherMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<java.lang.Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver<T, U> parent;

        TimeoutOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.parent = timeoutMainMaybeObserver;
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

    static final class TimeoutFallbackMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.MaybeObserver<? super T> downstream;

        TimeoutFallbackMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
