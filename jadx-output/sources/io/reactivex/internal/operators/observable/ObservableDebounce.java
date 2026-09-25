package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDebounce<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> debounceSelector;

    public ObservableDebounce(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
        super(observableSource);
        this.debounceSelector = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver(new io.reactivex.observers.SerializedObserver(observer), this.debounceSelector));
    }

    static final class DebounceObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> debounceSelector;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> debouncer = new java.util.concurrent.atomic.AtomicReference<>();
        boolean done;
        final io.reactivex.Observer<? super T> downstream;
        volatile long index;
        io.reactivex.disposables.Disposable upstream;

        DebounceObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
            this.downstream = observer;
            this.debounceSelector = function;
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
            io.reactivex.disposables.Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.debounceSelector.apply(t), "The ObservableSource supplied is null");
                io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver debounceInnerObserver = new io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver(this, j, t);
                if (this.debouncer.compareAndSet(disposable, debounceInnerObserver)) {
                    observableSource.subscribe(debounceInnerObserver);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            io.reactivex.disposables.Disposable disposable = this.debouncer.get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                ((io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver) disposable).emit();
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.debouncer);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void emit(long j, T t) {
            if (j == this.index) {
                this.downstream.onNext(t);
            }
        }

        static final class DebounceInnerObserver<T, U> extends io.reactivex.observers.DisposableObserver<U> {
            boolean done;
            final long index;
            final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
            final io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> parent;
            final T value;

            DebounceInnerObserver(io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> debounceObserver, long j, T t) {
                this.parent = debounceObserver;
                this.index = j;
                this.value = t;
            }

            @Override // io.reactivex.Observer
            public void onNext(U u) {
                if (this.done) {
                    return;
                }
                this.done = true;
                dispose();
                emit();
            }

            void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                if (this.done) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } else {
                    this.done = true;
                    this.parent.onError(th);
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }
        }
    }
}
