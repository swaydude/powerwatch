package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFlatMapCompletable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;

    public ObservableFlatMapCompletable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver(observer, this.mapper, this.delayErrors));
    }

    static final class FlatMapCompletableMainObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.disposables.CompositeDisposable set = new io.reactivex.disposables.CompositeDisposable();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return i & 2;
        }

        FlatMapCompletableMainObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
            lazySet(1);
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
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.InnerObserver innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.InnerObserver();
                if (this.disposed || !this.set.add(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
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
                    if (decrementAndGet() == 0) {
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (decrementAndGet() == 0) {
                java.lang.Throwable thTerminate = this.errors.terminate();
                if (thTerminate != null) {
                    this.downstream.onError(thTerminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void innerComplete(io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            onComplete();
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, java.lang.Throwable th) {
            this.set.delete(innerObserver);
            onError(th);
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.this.innerComplete(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.this.innerError(this, th);
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }
        }
    }
}
