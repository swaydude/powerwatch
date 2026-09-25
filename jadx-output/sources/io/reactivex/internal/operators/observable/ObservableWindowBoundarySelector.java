package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> close;
    final io.reactivex.ObservableSource<B> open;

    public ObservableWindowBoundarySelector(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> function, int i) {
        super(observableSource);
        this.open = observableSource2;
        this.close = function;
        this.bufferSize = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver(new io.reactivex.observers.SerializedObserver(observer), this.open, this.close, this.bufferSize));
    }

    static final class WindowBoundaryMainObserver<T, B, V> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> close;
        final io.reactivex.ObservableSource<B> open;
        final io.reactivex.disposables.CompositeDisposable resources;
        final java.util.concurrent.atomic.AtomicBoolean stopWindows;
        io.reactivex.disposables.Disposable upstream;
        final java.util.concurrent.atomic.AtomicLong windows;
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> ws;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, java.lang.Object obj) {
        }

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, io.reactivex.ObservableSource<B> observableSource, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> function, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.boundary = new java.util.concurrent.atomic.AtomicReference<>();
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new java.util.concurrent.atomic.AtomicBoolean();
            this.open = observableSource;
            this.close = function;
            this.bufferSize = i;
            this.resources = new io.reactivex.disposables.CompositeDisposable();
            this.ws = new java.util.ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.stopWindows.get()) {
                    return;
                }
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryOpenObserver operatorWindowBoundaryOpenObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryOpenObserver(this);
                if (this.boundary.compareAndSet(null, operatorWindowBoundaryOpenObserver)) {
                    this.open.subscribe(operatorWindowBoundaryOpenObserver);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = this.ws.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        void error(java.lang.Throwable th) {
            this.upstream.dispose();
            this.resources.dispose();
            onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        void disposeBoundary() {
            this.resources.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.downstream;
            java.util.List<io.reactivex.subjects.UnicastSubject<T>> list = this.ws;
            int iLeave = 1;
            while (true) {
                boolean z = this.done;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    disposeBoundary();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (objPoll instanceof io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation) {
                        io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation windowOperation = (io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation) objPoll;
                        if (windowOperation.w != null) {
                            if (list.remove(windowOperation.w)) {
                                windowOperation.w.onComplete();
                                if (this.windows.decrementAndGet() == 0) {
                                    disposeBoundary();
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.stopWindows.get()) {
                            io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                            list.add(unicastSubjectCreate);
                            observer.onNext(unicastSubjectCreate);
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The ObservableSource supplied is null");
                                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver operatorWindowBoundaryCloseObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver(this, unicastSubjectCreate);
                                if (this.resources.add(operatorWindowBoundaryCloseObserver)) {
                                    this.windows.getAndIncrement();
                                    observableSource.subscribe(operatorWindowBoundaryCloseObserver);
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.stopWindows.set(true);
                                observer.onError(th2);
                            }
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                        }
                    }
                } else {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void open(B b) {
            this.queue.offer((U) new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation(null, b));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void close(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver<T, V> operatorWindowBoundaryCloseObserver) {
            this.resources.delete(operatorWindowBoundaryCloseObserver);
            this.queue.offer((U) new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation(operatorWindowBoundaryCloseObserver.w, null));
            if (enter()) {
                drainLoop();
            }
        }
    }

    static final class WindowOperation<T, B> {
        final B open;
        final io.reactivex.subjects.UnicastSubject<T> w;

        WindowOperation(io.reactivex.subjects.UnicastSubject<T> unicastSubject, B b) {
            this.w = unicastSubject;
            this.open = b;
        }
    }

    static final class OperatorWindowBoundaryOpenObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> parent;

        OperatorWindowBoundaryOpenObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            this.parent.open(b);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.onComplete();
        }
    }

    static final class OperatorWindowBoundaryCloseObserver<T, V> extends io.reactivex.observers.DisposableObserver<V> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> parent;
        final io.reactivex.subjects.UnicastSubject<T> w;

        OperatorWindowBoundaryCloseObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver, io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
            this.parent = windowBoundaryMainObserver;
            this.w = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onNext(V v) {
            dispose();
            onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.error(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }
    }
}
