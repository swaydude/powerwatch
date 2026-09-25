package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    public ObservableFlatMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver(observer, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }

    static final class MergeObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.Observer<? super U> downstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[]> observers;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;
        java.util.Queue<io.reactivex.ObservableSource<? extends U>> sources;
        long uniqueId;
        io.reactivex.disposables.Disposable upstream;
        int wip;
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] EMPTY = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[0];
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] CANCELLED = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[0];

        MergeObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new java.util.ArrayDeque(i);
            }
            this.observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
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
            if (this.done) {
                return;
            }
            try {
                io.reactivex.ObservableSource<? extends U> observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.wip;
                        if (i == this.maxConcurrency) {
                            this.sources.offer(observableSource);
                            return;
                        }
                        this.wip = i + 1;
                    }
                }
                subscribeInner(observableSource);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        void subscribeInner(io.reactivex.ObservableSource<? extends U> observableSource) {
            io.reactivex.ObservableSource<? extends U> observableSourcePoll;
            while (observableSource instanceof java.util.concurrent.Callable) {
                if (!tryEmitScalar((java.util.concurrent.Callable) observableSource) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                boolean z = false;
                synchronized (this) {
                    observableSourcePoll = this.sources.poll();
                    if (observableSourcePoll == null) {
                        this.wip--;
                        z = true;
                    }
                }
                if (z) {
                    drain();
                    return;
                }
                observableSource = observableSourcePoll;
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<>(this, j);
            if (addInner(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        boolean addInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver) {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[length + 1];
                java.lang.System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!this.observers.compareAndSet(innerObserverArr, (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[]) innerObserverArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver) {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerObserverArr[i2] == innerObserver) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr3 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[length - 1];
                    java.lang.System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    java.lang.System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!this.observers.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        boolean tryEmitScalar(java.util.concurrent.Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    io.reactivex.internal.fuseable.SimplePlainQueue<U> spscArrayQueue = this.queue;
                    if (spscArrayQueue == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            spscArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(this.bufferSize);
                        } else {
                            spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(this.maxConcurrency);
                        }
                        this.queue = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(uCall)) {
                        onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }

        void tryEmit(U u, io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.fuseable.SimpleQueue spscLinkedArrayQueue = innerObserver.queue;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.bufferSize);
                    innerObserver.queue = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            java.lang.Throwable thTerminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (thTerminate = this.errors.terminate()) == null || thTerminate == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(thTerminate);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code duplicated, block: B:120:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[PHI: r4
          0x00f1: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:72:0x00d0, B:84:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            int size;
            boolean z;
            io.reactivex.Observer<? super U> observer = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
                if (simplePlainQueue != null) {
                    while (!checkTerminate()) {
                        U uPoll = simplePlainQueue.poll();
                        if (uPoll != null) {
                            observer.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z2 = this.done;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                int i = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.sources.size();
                    }
                } else {
                    size = 0;
                }
                if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                    java.lang.Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.lastId;
                    int i2 = this.lastIndex;
                    if (length <= i2 || innerObserverArr[i2].id != j) {
                        if (length <= i2) {
                            i2 = 0;
                        }
                        for (int i3 = 0; i3 < length && innerObserverArr[i2].id != j; i3++) {
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.lastIndex = i2;
                        this.lastId = innerObserverArr[i2].id;
                    }
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (checkTerminate()) {
                            return;
                        }
                        io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver = innerObserverArr[i2];
                        io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = innerObserver.queue;
                        if (simpleQueue != null) {
                            do {
                                try {
                                    U uPoll2 = simpleQueue.poll();
                                    if (uPoll2 != null) {
                                        observer.onNext(uPoll2);
                                    } else {
                                        z = innerObserver.done;
                                        io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue2 = innerObserver.queue;
                                        if (z && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                            removeInner(innerObserver);
                                            if (checkTerminate()) {
                                                return;
                                            } else {
                                                i4++;
                                            }
                                        }
                                        i2++;
                                        if (i2 == length) {
                                            i2 = 0;
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    innerObserver.dispose();
                                    this.errors.addThrowable(th);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    removeInner(innerObserver);
                                    i4++;
                                    i2++;
                                    if (i2 == length) {
                                    }
                                }
                            } while (!checkTerminate());
                            return;
                        }
                        z = innerObserver.done;
                        io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue3 = innerObserver.queue;
                        if (z) {
                            removeInner(innerObserver);
                            if (checkTerminate()) {
                                return;
                            } else {
                                i4++;
                            }
                        }
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                    }
                    this.lastIndex = i2;
                    this.lastId = innerObserverArr[i2].id;
                    i = i4;
                }
                if (i != 0) {
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i6 = i - 1;
                            if (i != 0) {
                                synchronized (this) {
                                    io.reactivex.ObservableSource<? extends U> observableSourcePoll = this.sources.poll();
                                    if (observableSourcePoll == null) {
                                        this.wip--;
                                    } else {
                                        subscribeInner(observableSourcePoll);
                                    }
                                }
                                i = i6;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            java.lang.Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            java.lang.Throwable thTerminate = this.errors.terminate();
            if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        boolean disposeAll() {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }
    }

    static final class InnerObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver, long j) {
            this.id = j;
            this.parent = mergeObserver;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) && (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable)) {
                io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                if (!this.parent.delayErrors) {
                    this.parent.disposeAll();
                }
                this.done = true;
                this.parent.drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }
    }
}
