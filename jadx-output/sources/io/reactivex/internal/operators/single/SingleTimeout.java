package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleTimeout<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public SingleTimeout(io.reactivex.SingleSource<T> singleSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.SingleSource<? extends T> singleSource2) {
        this.source = singleSource;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = singleSource2;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver timeoutMainObserver = new io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver(singleObserver, this.other, this.timeout, this.unit);
        singleObserver.onSubscribe(timeoutMainObserver);
        io.reactivex.internal.disposables.DisposableHelper.replace(timeoutMainObserver.task, this.scheduler.scheduleDirect(timeoutMainObserver, this.timeout, this.unit));
        this.source.subscribe(timeoutMainObserver);
    }

    static final class TimeoutMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 37497744973048446L;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<T> fallback;
        io.reactivex.SingleSource<? extends T> other;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> task = new java.util.concurrent.atomic.AtomicReference<>();
        final long timeout;
        final java.util.concurrent.TimeUnit unit;

        static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final io.reactivex.SingleObserver<? super T> downstream;

            TimeoutFallbackObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
                this.downstream = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.downstream.onError(th);
            }
        }

        TimeoutMainObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<? extends T> singleSource, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.downstream = singleObserver;
            this.other = singleSource;
            this.timeout = j;
            this.unit = timeUnit;
            if (singleSource != null) {
                this.fallback = new io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<>(singleObserver);
            } else {
                this.fallback = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.SingleSource<? extends T> singleSource = this.other;
            if (singleSource == null) {
                this.downstream.onError(new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
            } else {
                this.other = null;
                singleSource.subscribe(this.fallback);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.task);
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.task);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.task);
            io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
            if (timeoutFallbackObserver != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
