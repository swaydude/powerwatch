package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public ObservableDebounceTimed(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver(new io.reactivex.observers.SerializedObserver(observer), this.timeout, this.unit, this.scheduler.createWorker()));
    }

    static final class DebounceTimedObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.Observer<? super T> downstream;
        volatile long index;
        final long timeout;
        io.reactivex.disposables.Disposable timer;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            io.reactivex.disposables.Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter debounceEmitter = new io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter(t, j, this);
            this.timer = debounceEmitter;
            debounceEmitter.setResource(this.worker.schedule(debounceEmitter, this.timeout, this.unit));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            io.reactivex.disposables.Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            io.reactivex.disposables.Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter debounceEmitter = (io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        void emit(long j, T t, io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter<T> debounceEmitter) {
            if (j == this.index) {
                this.downstream.onNext(t);
                debounceEmitter.dispose();
            }
        }
    }

    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
        final io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> parent;
        final T value;

        DebounceEmitter(T t, long j, io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> debounceTimedObserver) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.emit(this.idx, this.value, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        public void setResource(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }
    }
}
