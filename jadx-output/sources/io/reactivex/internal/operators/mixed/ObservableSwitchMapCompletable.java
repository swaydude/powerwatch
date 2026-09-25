package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSwitchMapCompletable<T> extends io.reactivex.Completable {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final io.reactivex.Observable<T> source;

    public ObservableSwitchMapCompletable(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsCompletable(this.source, this.mapper, completableObserver)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver(completableObserver, this.mapper, this.delayErrors));
    }

    static final class SwitchMapCompletableObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver INNER_DISPOSED = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(null);
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> inner = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        io.reactivex.disposables.Disposable upstream;

        SwitchMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.downstream = completableObserver;
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
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver;
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver2 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.inner.get();
                    if (switchMapInnerObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!this.inner.compareAndSet(switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.delayErrors) {
                    onComplete();
                    return;
                }
                disposeInner();
                java.lang.Throwable thTerminate = this.errors.terminate();
                if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.downstream.onError(thTerminate);
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (this.inner.get() == null) {
                java.lang.Throwable thTerminate = this.errors.terminate();
                if (thTerminate == null) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(thTerminate);
                }
            }
        }

        void disposeInner() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> atomicReference = this.inner;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver = INNER_DISPOSED;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            disposeInner();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.inner.get() == INNER_DISPOSED;
        }

        void innerError(io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver, java.lang.Throwable th) {
            if (this.inner.compareAndSet(switchMapInnerObserver, null) && this.errors.addThrowable(th)) {
                if (this.delayErrors) {
                    if (this.done) {
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                java.lang.Throwable thTerminate = this.errors.terminate();
                if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.downstream.onError(thTerminate);
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void innerComplete(io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver) {
            if (this.inner.compareAndSet(switchMapInnerObserver, null) && this.done) {
                java.lang.Throwable thTerminate = this.errors.terminate();
                if (thTerminate == null) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(thTerminate);
                }
            }
        }

        static final class SwitchMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
