package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final io.reactivex.internal.util.ErrorMode delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

    public ObservableConcatMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = errorMode;
        this.bufferSize = java.lang.Math.max(8, i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        if (this.delayErrors == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver(new io.reactivex.observers.SerializedObserver(observer), this.mapper, this.bufferSize));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver(observer, this.mapper, this.bufferSize, this.delayErrors == io.reactivex.internal.util.ErrorMode.END));
        }
    }

    static final class SourceObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.Observer<? super U> downstream;
        int fusionMode;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.InnerObserver<U> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        io.reactivex.disposables.Disposable upstream;

        SourceObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, int i) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
            this.inner = new io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.InnerObserver<>(observer, this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        T tPoll = this.queue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            return;
                        } else if (!z2) {
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.active = true;
                                observableSource.subscribe(this.inner);
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th);
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        static final class InnerObserver<U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final io.reactivex.Observer<? super U> downstream;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> parent;

            InnerObserver(io.reactivex.Observer<? super U> observer, io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> sourceObserver) {
                this.downstream = observer;
                this.parent = sourceObserver;
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                this.parent.innerComplete();
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }

    static final class ConcatMapDelayErrorObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<R> observer;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        io.reactivex.disposables.Disposable upstream;

        ConcatMapDelayErrorObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<>(observer, this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super R> observer = this.downstream;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.cancelled = true;
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.cancelled = true;
                            java.lang.Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                observer.onError(thTerminate);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (observableSource instanceof java.util.concurrent.Callable) {
                                    try {
                                        android.R.bool boolVar = (java.lang.Object) ((java.util.concurrent.Callable) observableSource).call();
                                        if (boolVar != null && !this.cancelled) {
                                            observer.onNext(boolVar);
                                        }
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        atomicThrowable.addThrowable(th);
                                    }
                                } else {
                                    this.active = true;
                                    observableSource.subscribe(this.observer);
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                simpleQueue.clear();
                                atomicThrowable.addThrowable(th2);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th3);
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        static final class DelayErrorInnerObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final io.reactivex.Observer<? super R> downstream;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(io.reactivex.Observer<? super R> observer, io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = observer;
                this.parent = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (concatMapDelayErrorObserver.error.addThrowable(th)) {
                    if (!concatMapDelayErrorObserver.tillTheEnd) {
                        concatMapDelayErrorObserver.upstream.dispose();
                    }
                    concatMapDelayErrorObserver.active = false;
                    concatMapDelayErrorObserver.drain();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
