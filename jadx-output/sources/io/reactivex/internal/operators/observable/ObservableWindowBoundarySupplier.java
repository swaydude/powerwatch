package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int capacityHint;
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> other;

    public ObservableWindowBoundarySupplier(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable, int i) {
        super(observableSource);
        this.other = callable;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver(observer, this.capacityHint, this.other));
    }

    static final class WindowBoundaryMainObserver<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<java.lang.Object, java.lang.Object> BOUNDARY_DISPOSED = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<>(null);
        static final java.lang.Object NEXT_WINDOW = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> downstream;
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> other;
        io.reactivex.disposables.Disposable upstream;
        io.reactivex.subjects.UnicastSubject<T> window;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B>> boundaryObserver = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger windows = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> queue = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean stopWindows = new java.util.concurrent.atomic.AtomicBoolean();

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, int i, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable) {
            this.downstream = observer;
            this.capacityHint = i;
            this.other = callable;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            disposeBoundary();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        void disposeBoundary() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B>> atomicReference = this.boundaryObserver;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<java.lang.Object, java.lang.Object> windowBoundaryInnerObserver = BOUNDARY_DISPOSED;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B> andSet = atomicReference.getAndSet((io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B>) windowBoundaryInnerObserver);
            if (andSet == null || andSet == windowBoundaryInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        void innerNext(io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B> windowBoundaryInnerObserver) {
            this.boundaryObserver.compareAndSet(windowBoundaryInnerObserver, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        void innerError(java.lang.Throwable th) {
            this.upstream.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super io.reactivex.Observable<T>> observer = this.downstream;
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
                boolean z = this.done;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    java.lang.Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate);
                    }
                    observer.onError(thTerminate);
                    return;
                }
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    java.lang.Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate2);
                    }
                    observer.onError(thTerminate2);
                    return;
                }
                if (!z2) {
                    if (objPoll != NEXT_WINDOW) {
                        unicastSubject.onNext((T) objPoll);
                    } else {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.capacityHint, this);
                            this.window = unicastSubjectCreate;
                            this.windows.getAndIncrement();
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null ObservableSource");
                                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B> windowBoundaryInnerObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<>(this);
                                if (this.boundaryObserver.compareAndSet(null, windowBoundaryInnerObserver)) {
                                    observableSource.subscribe(windowBoundaryInnerObserver);
                                    observer.onNext(unicastSubjectCreate);
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                atomicThrowable.addThrowable(th);
                                this.done = true;
                            }
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }
    }

    static final class WindowBoundaryInnerObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.done) {
                return;
            }
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }
    }
}
