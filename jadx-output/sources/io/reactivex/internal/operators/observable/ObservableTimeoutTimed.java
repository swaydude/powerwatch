package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    interface TimeoutSupport {
        void onTimeout(long j);
    }

    public ObservableTimeoutTimed(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.ObservableSource<? extends T> observableSource) {
        super(observable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = observableSource;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (this.other == null) {
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutObserver timeoutObserver = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutObserver(observer, this.timeout, this.unit, this.scheduler.createWorker());
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.startTimeout(0L);
            this.source.subscribe(timeoutObserver);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutFallbackObserver timeoutFallbackObserver = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutFallbackObserver(observer, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        observer.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startTimeout(0L);
        this.source.subscribe(timeoutFallbackObserver);
    }

    static final class TimeoutObserver<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.Observer<? super T> downstream;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j = get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutTask(j, this), this.timeout, this.unit));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.upstream.get());
        }
    }

    static final class TimeoutTask implements java.lang.Runnable {
        final long idx;
        final io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport parent;

        TimeoutTask(long j, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport timeoutSupport) {
            this.idx = j;
            this.parent = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }
    }

    static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.Observer<? super T> downstream;
        io.reactivex.ObservableSource<? extends T> fallback;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicLong index = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutFallbackObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j = this.index.get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutTask(j, this), this.timeout, this.unit));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                io.reactivex.ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.FallbackObserver(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    static final class FallbackObserver<T> implements io.reactivex.Observer<T> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> arbiter;
        final io.reactivex.Observer<? super T> downstream;

        FallbackObserver(io.reactivex.Observer<? super T> observer, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
            this.downstream = observer;
            this.arbiter = atomicReference;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.arbiter, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
