package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class UnicastSubject<T> extends io.reactivex.subjects.Subject<T> {
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> downstream;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final io.reactivex.internal.observers.BasicIntQueueDisposable<T> wip;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create() {
        return new io.reactivex.subjects.UnicastSubject<>(bufferSize(), true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i) {
        return new io.reactivex.subjects.UnicastSubject<>(i, true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i, java.lang.Runnable runnable) {
        return new io.reactivex.subjects.UnicastSubject<>(i, runnable, true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i, java.lang.Runnable runnable, boolean z) {
        return new io.reactivex.subjects.UnicastSubject<>(i, runnable, z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(boolean z) {
        return new io.reactivex.subjects.UnicastSubject<>(bufferSize(), z);
    }

    UnicastSubject(int i, boolean z) {
        this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.onTerminate = new java.util.concurrent.atomic.AtomicReference<>();
        this.delayError = z;
        this.downstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
        this.wip = new io.reactivex.subjects.UnicastSubject.UnicastQueueDisposable();
    }

    UnicastSubject(int i, java.lang.Runnable runnable) {
        this(i, runnable, true);
    }

    UnicastSubject(int i, java.lang.Runnable runnable, boolean z) {
        this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.onTerminate = new java.util.concurrent.atomic.AtomicReference<>(io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.delayError = z;
        this.downstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
        this.wip = new io.reactivex.subjects.UnicastSubject.UnicastQueueDisposable();
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            observer.onSubscribe(this.wip);
            this.downstream.lazySet(observer);
            if (this.disposed) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.IllegalStateException("Only a single observer allowed."), observer);
    }

    void doTerminate() {
        java.lang.Runnable runnable = this.onTerminate.get();
        if (runnable == null || !this.onTerminate.compareAndSet(runnable, null)) {
            return;
        }
        runnable.run();
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.done || this.disposed) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.disposed) {
            return;
        }
        this.queue.offer(t);
        drain();
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.disposed) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done || this.disposed) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    void drainNormal(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z = !this.delayError;
        boolean z2 = true;
        int iAddAndGet = 1;
        while (!this.disposed) {
            boolean z3 = this.done;
            T tPoll = this.queue.poll();
            boolean z4 = tPoll == null;
            if (z3) {
                if (z && z2) {
                    if (failedFast(spscLinkedArrayQueue, observer)) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (z4) {
                    errorOrComplete(observer);
                    return;
                }
            }
            if (!z4) {
                observer.onNext(tPoll);
            } else {
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    void drainFused(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int iAddAndGet = 1;
        boolean z = !this.delayError;
        while (!this.disposed) {
            boolean z2 = this.done;
            if (z && z2 && failedFast(spscLinkedArrayQueue, observer)) {
                return;
            }
            observer.onNext(null);
            if (z2) {
                errorOrComplete(observer);
                return;
            } else {
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    void errorOrComplete(io.reactivex.Observer<? super T> observer) {
        this.downstream.lazySet(null);
        java.lang.Throwable th = this.error;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    boolean failedFast(io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue, io.reactivex.Observer<? super T> observer) {
        java.lang.Throwable th = this.error;
        if (th == null) {
            return false;
        }
        this.downstream.lazySet(null);
        simpleQueue.clear();
        observer.onError(th);
        return true;
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        io.reactivex.Observer<? super T> observer = this.downstream.get();
        int iAddAndGet = 1;
        while (observer == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                observer = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(observer);
        } else {
            drainNormal(observer);
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    final class UnicastQueueDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            io.reactivex.subjects.UnicastSubject.this.enableOperatorFusion = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            return io.reactivex.subjects.UnicastSubject.this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return io.reactivex.subjects.UnicastSubject.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            io.reactivex.subjects.UnicastSubject.this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (io.reactivex.subjects.UnicastSubject.this.disposed) {
                return;
            }
            io.reactivex.subjects.UnicastSubject.this.disposed = true;
            io.reactivex.subjects.UnicastSubject.this.doTerminate();
            io.reactivex.subjects.UnicastSubject.this.downstream.lazySet(null);
            if (io.reactivex.subjects.UnicastSubject.this.wip.getAndIncrement() == 0) {
                io.reactivex.subjects.UnicastSubject.this.downstream.lazySet(null);
                io.reactivex.subjects.UnicastSubject.this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.subjects.UnicastSubject.this.disposed;
        }
    }
}
