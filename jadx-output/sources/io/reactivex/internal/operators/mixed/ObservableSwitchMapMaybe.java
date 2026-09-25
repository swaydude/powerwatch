package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSwitchMapMaybe<T, R> extends io.reactivex.Observable<R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final io.reactivex.Observable<T> source;

    public ObservableSwitchMapMaybe(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsMaybe(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver(observer, this.mapper, this.delayErrors));
    }

    static final class SwitchMapMaybeMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> INNER_DISPOSED = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> inner = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
        io.reactivex.disposables.Disposable upstream;

        SwitchMapMaybeMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
            this.downstream = observer;
            this.mapper = function;
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
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
            if (switchMapMaybeObserver2 != null) {
                switchMapMaybeObserver2.dispose();
            }
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<>(this);
                do {
                    switchMapMaybeObserver = this.inner.get();
                    if (switchMapMaybeObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!this.inner.compareAndSet(switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.subscribe(switchMapMaybeObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                this.inner.getAndSet((io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>) INNER_DISPOSED);
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
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
            this.done = true;
            drain();
        }

        void disposeInner() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = INNER_DISPOSED;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            andSet.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void innerError(io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver, java.lang.Throwable th) {
            if (this.inner.compareAndSet(switchMapMaybeObserver, null) && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    disposeInner();
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void innerComplete(io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            if (this.inner.compareAndSet(switchMapMaybeObserver, null)) {
                drain();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super R> observer = this.downstream;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    observer.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
                if (z && z2) {
                    java.lang.Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        observer.onError(thTerminate);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (!z2 && switchMapMaybeObserver.item != null) {
                    atomicReference.compareAndSet(switchMapMaybeObserver, null);
                    observer.onNext(switchMapMaybeObserver.item);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        static final class SwitchMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> parent;

            SwitchMapMaybeObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.parent = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
