package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableWindowBoundary<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int capacityHint;
    final io.reactivex.ObservableSource<B> other;

    public ObservableWindowBoundary(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, int i) {
        super(observableSource);
        this.other = observableSource2;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver windowBoundaryMainObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver(observer, this.capacityHint);
        observer.onSubscribe(windowBoundaryMainObserver);
        this.other.subscribe(windowBoundaryMainObserver.boundaryObserver);
        this.source.subscribe(windowBoundaryMainObserver);
    }

    static final class WindowBoundaryMainObserver<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object NEXT_WINDOW = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> downstream;
        io.reactivex.subjects.UnicastSubject<T> window;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryInnerObserver<T, B> boundaryObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryInnerObserver<>(this);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger windows = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> queue = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean stopWindows = new java.util.concurrent.atomic.AtomicBoolean();

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, int i) {
            this.downstream = observer;
            this.capacityHint = i;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable)) {
                innerNext();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.boundaryObserver.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            }
        }

        void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        void innerError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void innerComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
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
                            observer.onNext(unicastSubjectCreate);
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
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.done) {
                return;
            }
            this.parent.innerNext();
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
