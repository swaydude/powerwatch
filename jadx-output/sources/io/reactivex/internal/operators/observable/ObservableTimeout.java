package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> itemTimeoutIndicator;
    final io.reactivex.ObservableSource<? extends T> other;

    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long j, java.lang.Throwable th);
    }

    public ObservableTimeout(io.reactivex.Observable<T> observable, io.reactivex.ObservableSource<U> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> function, io.reactivex.ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.firstTimeoutIndicator = observableSource;
        this.itemTimeoutIndicator = function;
        this.other = observableSource2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (this.other == null) {
            io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutObserver timeoutObserver = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutObserver(observer, this.itemTimeoutIndicator);
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.startFirstTimeout(this.firstTimeoutIndicator);
            this.source.subscribe(timeoutObserver);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver timeoutFallbackObserver = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver(observer, this.itemTimeoutIndicator, this.other);
        observer.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startFirstTimeout(this.firstTimeoutIndicator);
        this.source.subscribe(timeoutFallbackObserver);
    }

    static final class TimeoutObserver<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> function) {
            this.downstream = observer;
            this.itemTimeoutIndicator = function;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j = get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(j2, this);
                        if (this.task.replace(timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.upstream.get().dispose();
                        getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        void startFirstTimeout(io.reactivex.ObservableSource<?> observableSource) {
            if (observableSource != null) {
                io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    observableSource.subscribe(timeoutConsumer);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new java.util.concurrent.TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j, java.lang.Throwable th) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.upstream.get());
        }
    }

    static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = -7508389464265974549L;
        final io.reactivex.Observer<? super T> downstream;
        io.reactivex.ObservableSource<? extends T> fallback;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicLong index = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutFallbackObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> function, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.itemTimeoutIndicator = function;
            this.fallback = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j = this.index.get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(j2, this);
                        if (this.task.replace(timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        void startFirstTimeout(io.reactivex.ObservableSource<?> observableSource) {
            if (observableSource != null) {
                io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    observableSource.subscribe(timeoutConsumer);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                io.reactivex.ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.FallbackObserver(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j, java.lang.Throwable th) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport parent;

        TimeoutConsumer(long j, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j;
            this.parent = timeoutSelectorSupport;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            io.reactivex.disposables.Disposable disposable = (io.reactivex.disposables.Disposable) get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                disposable.dispose();
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.parent.onTimeoutError(this.idx, th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
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
