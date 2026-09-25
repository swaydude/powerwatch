package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.ObservableSource<B> boundary;
    final java.util.concurrent.Callable<U> bufferSupplier;

    public ObservableBufferExactBoundary(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.boundary = observableSource2;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver(new io.reactivex.observers.SerializedObserver(observer), this.bufferSupplier, this.boundary));
    }

    static final class BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.ObservableSource<B> boundary;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        io.reactivex.disposables.Disposable other;
        io.reactivex.disposables.Disposable upstream;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            accept((io.reactivex.Observer<? super java.util.Collection>) observer, (java.util.Collection) obj);
        }

        BufferExactBoundaryObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, io.reactivex.ObservableSource<B> observableSource) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferBoundaryObserver(this);
                    this.other = bufferBoundaryObserver;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    this.boundary.subscribe(bufferBoundaryObserver);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
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
            this.other.dispose();
            this.upstream.dispose();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void next() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = u;
                    fastPathEmit(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(io.reactivex.Observer<? super U> observer, U u) {
            this.downstream.onNext((java.lang.Object) u);
        }
    }

    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> parent;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> bufferExactBoundaryObserver) {
            this.parent = bufferExactBoundaryObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            this.parent.next();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.onComplete();
        }
    }
}
