package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableScalarXMap {
    private ObservableScalarXMap() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, R> boolean tryScalarXMapSubscribe(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof java.util.concurrent.Callable)) {
            return false;
        }
        try {
            android.R.bool boolVar = (java.lang.Object) ((java.util.concurrent.Callable) observableSource).call();
            if (boolVar == null) {
                io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                return true;
            }
            try {
                io.reactivex.ObservableSource observableSource2 = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(function.apply(boolVar), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object objCall = ((java.util.concurrent.Callable) observableSource2).call();
                        if (objCall == null) {
                            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                            return true;
                        }
                        io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable scalarDisposable = new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable(observer, objCall);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
                return true;
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.disposables.EmptyDisposable.error(th3, observer);
            return true;
        }
    }

    public static <T, U> io.reactivex.Observable<U> scalarXMap(T t, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarXMapObservable(t, function));
    }

    static final class ScalarXMapObservable<T, R> extends io.reactivex.Observable<R> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final T value;

        ScalarXMapObservable(T t, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function) {
            this.value = t;
            this.mapper = function;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(io.reactivex.Observer<? super R> observer) {
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null ObservableSource");
                if (observableSource instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object objCall = ((java.util.concurrent.Callable) observableSource).call();
                        if (objCall == null) {
                            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                            return;
                        }
                        io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable scalarDisposable = new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable(observer, objCall);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                        return;
                    }
                }
                observableSource.subscribe(observer);
            } catch (java.lang.Throwable th2) {
                io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
            }
        }
    }

    public static final class ScalarDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueDisposable<T>, java.lang.Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final io.reactivex.Observer<? super T> observer;
        final T value;

        public ScalarDisposable(io.reactivex.Observer<? super T> observer, T t) {
            this.observer = observer;
            this.value = t;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t, T t2) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }
}
