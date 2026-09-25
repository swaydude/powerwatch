package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> boundarySupplier;
    final java.util.concurrent.Callable<U> bufferSupplier;

    public ObservableBufferBoundarySupplier(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable, java.util.concurrent.Callable<U> callable2) {
        super(observableSource);
        this.boundarySupplier = callable;
        this.bufferSupplier = callable2;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver(new io.reactivex.observers.SerializedObserver(observer), this.bufferSupplier, this.boundarySupplier));
    }

    static final class BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> boundarySupplier;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;
        io.reactivex.disposables.Disposable upstream;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            accept((io.reactivex.Observer<? super java.util.Collection>) observer, (java.util.Collection) obj);
        }

        BufferBoundarySupplierObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable2) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.other = new java.util.concurrent.atomic.AtomicReference<>();
            this.bufferSupplier = callable;
            this.boundarySupplier = callable2;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                io.reactivex.Observer<? super V> observer = this.downstream;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary ObservableSource supplied is null");
                        io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver(this);
                        this.other.set(bufferBoundaryObserver);
                        observer.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        observableSource.subscribe(bufferBoundaryObserver);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        disposable.dispose();
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                this.buffer = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            disposeOther();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeOther() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
        }

        void next() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                try {
                    io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary ObservableSource supplied is null");
                    io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver(this);
                    if (io.reactivex.internal.disposables.DisposableHelper.replace(this.other, bufferBoundaryObserver)) {
                        synchronized (this) {
                            U u2 = this.buffer;
                            if (u2 == null) {
                                return;
                            }
                            this.buffer = u;
                            observableSource.subscribe(bufferBoundaryObserver);
                            fastPathEmit(u2, false, this);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    this.upstream.dispose();
                    this.downstream.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                dispose();
                this.downstream.onError(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(io.reactivex.Observer<? super U> observer, U u) {
            this.downstream.onNext((java.lang.Object) u);
        }
    }

    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        boolean once;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> parent;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> bufferBoundarySupplierObserver) {
            this.parent = bufferBoundarySupplierObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.once) {
                return;
            }
            this.once = true;
            dispose();
            this.parent.next();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.once) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.once = true;
                this.parent.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.once) {
                return;
            }
            this.once = true;
            this.parent.next();
        }
    }
}
