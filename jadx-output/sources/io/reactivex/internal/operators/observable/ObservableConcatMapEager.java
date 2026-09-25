package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    public ObservableConcatMapEager(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i, int i2) {
        super(observableSource);
        this.mapper = function;
        this.errorMode = errorMode;
        this.maxConcurrency = i;
        this.prefetch = i2;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMapEager.ConcatMapEagerMainObserver(observer, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }

    static final class ConcatMapEagerMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.observers.InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        io.reactivex.internal.observers.InnerQueuedObserver<R> current;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> observers = new java.util.ArrayDeque<>();

        ConcatMapEagerMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode;
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
                this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.prefetch);
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
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            drainAndDispose();
        }

        void drainAndDispose() {
            if (getAndIncrement() == 0) {
                do {
                    this.queue.clear();
                    disposeAll();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeAll() {
            io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserverPoll = this.observers.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    innerQueuedObserverPoll.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.queue().offer(r);
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerError(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver, java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                if (this.errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.setDone();
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
            java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> arrayDeque = this.observers;
            io.reactivex.Observer<? super R> observer = this.downstream;
            io.reactivex.internal.util.ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                int i = this.activeCount;
                while (i != this.maxConcurrency) {
                    if (this.cancelled) {
                        simpleQueue.clear();
                        disposeAll();
                        return;
                    }
                    if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.error.get() != null) {
                        simpleQueue.clear();
                        disposeAll();
                        observer.onError(this.error.terminate());
                        return;
                    }
                    try {
                        T tPoll = simpleQueue.poll();
                        if (tPoll == null) {
                            break;
                        }
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                        io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver = new io.reactivex.internal.observers.InnerQueuedObserver<>(this, this.prefetch);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.subscribe(innerQueuedObserver);
                        i++;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.upstream.dispose();
                        simpleQueue.clear();
                        disposeAll();
                        this.error.addThrowable(th);
                        observer.onError(this.error.terminate());
                        return;
                    }
                }
                this.activeCount = i;
                if (this.cancelled) {
                    simpleQueue.clear();
                    disposeAll();
                    return;
                }
                if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.error.get() != null) {
                    simpleQueue.clear();
                    disposeAll();
                    observer.onError(this.error.terminate());
                    return;
                }
                io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && this.error.get() != null) {
                        simpleQueue.clear();
                        disposeAll();
                        observer.onError(this.error.terminate());
                        return;
                    }
                    boolean z = this.done;
                    io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z2 = innerQueuedObserverPoll == null;
                    if (z && z2) {
                        if (this.error.get() != null) {
                            simpleQueue.clear();
                            disposeAll();
                            observer.onError(this.error.terminate());
                            return;
                        }
                        observer.onComplete();
                        return;
                    }
                    if (!z2) {
                        this.current = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueueQueue = innerQueuedObserver2.queue();
                    while (true) {
                        if (this.cancelled) {
                            simpleQueue.clear();
                            disposeAll();
                            return;
                        }
                        boolean zIsDone = innerQueuedObserver2.isDone();
                        if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.error.get() != null) {
                            simpleQueue.clear();
                            disposeAll();
                            observer.onError(this.error.terminate());
                            return;
                        }
                        try {
                            R rPoll = simpleQueueQueue.poll();
                            boolean z3 = rPoll == null;
                            if (zIsDone && z3) {
                                this.current = null;
                                this.activeCount--;
                            } else if (!z3) {
                                observer.onNext(rPoll);
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            this.error.addThrowable(th2);
                            this.current = null;
                            this.activeCount--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
