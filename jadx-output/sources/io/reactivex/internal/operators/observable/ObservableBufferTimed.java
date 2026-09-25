package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    public ObservableBufferTimed(io.reactivex.ObservableSource<T> observableSource, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, java.util.concurrent.Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i;
        this.restartTimerOnMaxSize = z;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactUnboundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        io.reactivex.Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }

    static final class BufferExactUnboundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            accept((io.reactivex.Observer<? super java.util.Collection>) observer, (java.util.Collection) obj);
        }

        BufferExactUnboundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timer = new java.util.concurrent.atomic.AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    io.reactivex.Scheduler scheduler = this.scheduler;
                    long j = this.timespan;
                    io.reactivex.disposables.Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.unit);
                    if (this.timer.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                        return;
                    }
                    disposableSchedulePeriodicallyDirect.dispose();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    dispose();
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
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.buffer;
                this.buffer = null;
            }
            if (u != null) {
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.buffer;
                    if (u != null) {
                        this.buffer = u2;
                    }
                }
                if (u == null) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
                } else {
                    fastPathEmit(u, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(io.reactivex.Observer<? super U> observer, U u) {
            this.downstream.onNext((java.lang.Object) u);
        }
    }

    static final class BufferSkipBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.Scheduler.Worker w;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            accept((io.reactivex.Observer<? super java.util.Collection>) observer, (java.util.Collection) obj);
        }

        BufferSkipBoundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.w = worker;
            this.buffers = new java.util.LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.buffers.add((U) collection);
                    this.downstream.onSubscribe(this);
                    io.reactivex.Scheduler.Worker worker = this.w;
                    long j = this.timeskip;
                    worker.schedulePeriodically(this, j, j, this.unit);
                    this.w.schedule(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.RemoveFromBufferEmit(collection), this.timespan, this.unit);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
                    this.w.dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<U> it = this.buffers.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.done = true;
            clear();
            this.downstream.onError(th);
            this.w.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onComplete() {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.buffers);
                this.buffers.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((java.util.Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.w, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            clear();
            this.upstream.dispose();
            this.w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.buffers.add((U) collection);
                    this.w.schedule(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.RemoveFromBuffer(collection), this.timespan, this.unit);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(io.reactivex.Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        final class RemoveFromBuffer implements java.lang.Runnable {
            private final U b;

            RemoveFromBuffer(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this) {
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this.buffers.remove(this.b);
                }
                io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver bufferSkipBoundedObserver = io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.b, false, bufferSkipBoundedObserver.w);
            }
        }

        final class RemoveFromBufferEmit implements java.lang.Runnable {
            private final U buffer;

            RemoveFromBufferEmit(U u) {
                this.buffer = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this) {
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this.buffers.remove(this.buffer);
                }
                io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver bufferSkipBoundedObserver = io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.buffer, false, bufferSkipBoundedObserver.w);
            }
        }
    }

    static final class BufferExactBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        io.reactivex.disposables.Disposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.Scheduler.Worker w;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            accept((io.reactivex.Observer<? super java.util.Collection>) observer, (java.util.Collection) obj);
        }

        BufferExactBoundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, int i, boolean z, io.reactivex.Scheduler.Worker worker) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.maxSize = i;
            this.restartTimerOnMaxSize = z;
            this.w = worker;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    io.reactivex.Scheduler.Worker worker = this.w;
                    long j = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
                    this.w.dispose();
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
                if (u.size() < this.maxSize) {
                    return;
                }
                this.buffer = null;
                this.producerIndex++;
                if (this.restartTimerOnMaxSize) {
                    this.timer.dispose();
                }
                fastPathOrderedEmit(u, false, this);
                try {
                    U u2 = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.buffer = u2;
                        this.consumerIndex++;
                    }
                    if (this.restartTimerOnMaxSize) {
                        io.reactivex.Scheduler.Worker worker = this.w;
                        long j = this.timespan;
                        this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.w.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            this.w.dispose();
            synchronized (this) {
                u = this.buffer;
                this.buffer = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(io.reactivex.Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.w.dispose();
            synchronized (this) {
                this.buffer = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u;
                        fastPathOrderedEmit(u2, false, this);
                    }
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }
}
