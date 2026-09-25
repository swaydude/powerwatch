package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final int prefetch;
    final io.reactivex.Observable<T> source;

    public ObservableConcatMapCompletable(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.source = observable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsCompletable(this.source, this.mapper, completableObserver)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver(completableObserver, this.mapper, this.errorMode, this.prefetch));
    }

    static final class ConcatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver inner = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver(this);
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        io.reactivex.disposables.Disposable upstream;

        ConcatMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.errorMode = errorMode;
            this.prefetch = i;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
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
            if (t != null) {
                this.queue.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.disposed = true;
                    this.inner.dispose();
                    java.lang.Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        this.downstream.onError(thTerminate);
                    }
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        void innerError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.disposed = true;
                    this.upstream.dispose();
                    java.lang.Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        this.downstream.onError(thTerminate);
                    }
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.active = false;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        void drain() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            io.reactivex.internal.util.ErrorMode errorMode = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z2 = this.done;
                    io.reactivex.CompletableSource completableSource = null;
                    try {
                        T tPoll = this.queue.poll();
                        if (tPoll != null) {
                            completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z2 && z) {
                            this.disposed = true;
                            java.lang.Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                this.downstream.onError(thTerminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        }
                        if (!z) {
                            this.active = true;
                            completableSource.subscribe(this.inner);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th);
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        static final class ConcatMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
