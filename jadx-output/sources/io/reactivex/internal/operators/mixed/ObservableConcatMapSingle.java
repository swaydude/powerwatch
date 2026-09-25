package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatMapSingle<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final int prefetch;
    final io.reactivex.Observable<T> source;

    public ObservableConcatMapSingle(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.source = observable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsSingle(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver(observer, this.mapper, this.prefetch, this.errorMode));
    }

    static final class ConcatMapSingleMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.ConcatMapSingleObserver<R> inner = new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.ConcatMapSingleObserver<>(this);
        R item;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        volatile int state;
        io.reactivex.disposables.Disposable upstream;

        ConcatMapSingleMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.errorMode = errorMode;
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(i);
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
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
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
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        void innerError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode != io.reactivex.internal.util.ErrorMode.END) {
                    this.upstream.dispose();
                }
                this.state = 0;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super R> observer = this.downstream;
            io.reactivex.internal.util.ErrorMode errorMode = this.errorMode;
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            int iAddAndGet = 1;
            while (true) {
                if (this.cancelled) {
                    simplePlainQueue.clear();
                    this.item = null;
                } else {
                    int i = this.state;
                    if (atomicThrowable.get() != null && (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE || (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && i == 0))) {
                        break;
                    }
                    if (i == 0) {
                        boolean z = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            java.lang.Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null SingleSource");
                                this.state = 1;
                                singleSource.subscribe(this.inner);
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.upstream.dispose();
                                simplePlainQueue.clear();
                                atomicThrowable.addThrowable(th);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i == 2) {
                        R r = this.item;
                        this.item = null;
                        observer.onNext(r);
                        this.state = 0;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.item = null;
            observer.onError(atomicThrowable.terminate());
        }

        static final class ConcatMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> parent;

            ConcatMapSingleObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.parent = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(th);
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
