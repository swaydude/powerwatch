package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;

    public ObservableSwitchMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.mapper = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver(observer, this.mapper, this.bufferSize, this.delayErrors));
    }

    static final class SwitchMapObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        volatile long unique;
        io.reactivex.disposables.Disposable upstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> active = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();

        static {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> switchMapInnerObserver = new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<>(null, -1L, 1);
            CANCELLED = switchMapInnerObserver;
            switchMapInnerObserver.cancel();
        }

        SwitchMapObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
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
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j = this.unique + 1;
            this.unique = j;
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            if (switchMapInnerObserver2 != null) {
                switchMapInnerObserver2.cancel();
            }
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The ObservableSource returned is null");
                io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver3 = new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<>(this, j, this.bufferSize);
                do {
                    switchMapInnerObserver = this.active.get();
                    if (switchMapInnerObserver == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(switchMapInnerObserver, switchMapInnerObserver3));
                observableSource.subscribe(switchMapInnerObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (!this.done && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
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
            disposeInner();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeInner() {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> andSet;
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> switchMapInnerObserver2 = CANCELLED;
            if (switchMapInnerObserver == switchMapInnerObserver2 || (andSet = this.active.getAndSet((io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>) switchMapInnerObserver2)) == switchMapInnerObserver2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
        void drain() {
            io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueue;
            android.R.color colorVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super R> observer = this.downstream;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> atomicReference = this.active;
            boolean z = this.delayErrors;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            java.lang.Throwable th = this.errors.get();
                            if (th != null) {
                                observer.onError(th);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.errors.get() != null) {
                        observer.onError(this.errors.terminate());
                        return;
                    } else if (z2) {
                        observer.onComplete();
                        return;
                    }
                }
                io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.queue) != null) {
                    if (switchMapInnerObserver.done) {
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (z) {
                            if (zIsEmpty) {
                                atomicReference.compareAndSet(switchMapInnerObserver, null);
                            }
                        } else if (this.errors.get() != null) {
                            observer.onError(this.errors.terminate());
                            return;
                        } else if (zIsEmpty) {
                            atomicReference.compareAndSet(switchMapInnerObserver, null);
                        }
                    }
                    boolean z3 = false;
                    while (!this.cancelled) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z && this.errors.get() != null) {
                                observer.onError(this.errors.terminate());
                                return;
                            }
                            boolean z4 = switchMapInnerObserver.done;
                            try {
                                colorVarPoll = simpleQueue.poll();
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.errors.addThrowable(th2);
                                atomicReference.compareAndSet(switchMapInnerObserver, null);
                                if (!z) {
                                    disposeInner();
                                    this.upstream.dispose();
                                    this.done = true;
                                } else {
                                    switchMapInnerObserver.cancel();
                                }
                                colorVarPoll = null;
                                z3 = true;
                            }
                            boolean z5 = colorVarPoll == null;
                            if (z4 && z5) {
                                atomicReference.compareAndSet(switchMapInnerObserver, null);
                            } else if (!z5) {
                                observer.onNext(colorVarPoll);
                            }
                            if (z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (z3) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver, java.lang.Throwable th) {
            if (switchMapInnerObserver.index == this.unique && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                }
                switchMapInnerObserver.done = true;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    static final class SwitchMapInnerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> queue;

        SwitchMapInnerObserver(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.parent = switchMapObserver;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.queue = queueDisposable;
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.bufferSize);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        public void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }
    }
}
