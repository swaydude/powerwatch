package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
public final class UnicastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> downstream;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final java.util.concurrent.atomic.AtomicLong requested;
    final io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> wip;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create() {
        return new io.reactivex.processors.UnicastProcessor<>(bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i) {
        return new io.reactivex.processors.UnicastProcessor<>(i);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(boolean z) {
        return new io.reactivex.processors.UnicastProcessor<>(bufferSize(), null, z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i, java.lang.Runnable runnable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new io.reactivex.processors.UnicastProcessor<>(i, runnable);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i, java.lang.Runnable runnable, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new io.reactivex.processors.UnicastProcessor<>(i, runnable, z);
    }

    UnicastProcessor(int i) {
        this(i, null, true);
    }

    UnicastProcessor(int i, java.lang.Runnable runnable) {
        this(i, runnable, true);
    }

    UnicastProcessor(int i, java.lang.Runnable runnable, boolean z) {
        this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.onTerminate = new java.util.concurrent.atomic.AtomicReference<>(runnable);
        this.delayError = z;
        this.downstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
        this.wip = new io.reactivex.processors.UnicastProcessor.UnicastQueueSubscription();
        this.requested = new java.util.concurrent.atomic.AtomicLong();
    }

    void doTerminate() {
        java.lang.Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void drainRegular(org.reactivestreams.Subscriber<? super T> subscriber) {
        long j;
        io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z = !this.delayError;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z2 = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z3 = tPoll == null;
                j = j3;
                if (checkTerminated(z, z2, z3, subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (z3) {
                    break;
                }
                subscriber.onNext(tPoll);
                j3 = 1 + j;
            }
            if (j2 == j3 && checkTerminated(z, this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                return;
            }
            if (j != 0 && j2 != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.requested.addAndGet(-j);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    void drainFused(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int iAddAndGet = 1;
        boolean z = !this.delayError;
        while (!this.cancelled) {
            boolean z2 = this.done;
            if (z && z2 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                subscriber.onError(this.error);
                return;
            }
            subscriber.onNext(null);
            if (z2) {
                this.downstream.lazySet(null);
                java.lang.Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        spscLinkedArrayQueue.clear();
        this.downstream.lazySet(null);
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        org.reactivestreams.Subscriber<? super T> subscriber = this.downstream.get();
        while (subscriber == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                subscriber = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(subscriber);
        } else {
            drainRegular(subscriber);
        }
    }

    boolean checkTerminated(boolean z, boolean z2, boolean z3, org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            subscriber.onError(this.error);
            return true;
        }
        if (!z3) {
            return false;
        }
        java.lang.Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.done || this.cancelled) {
            subscription.cancel();
        } else {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t);
        drain();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            subscriber.onSubscribe(this.wip);
            this.downstream.set(subscriber);
            if (this.cancelled) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        io.reactivex.internal.subscriptions.EmptySubscription.error(new java.lang.IllegalStateException("This processor allows only a single Subscriber"), subscriber);
    }

    final class UnicastQueueSubscription extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
            return io.reactivex.processors.UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return io.reactivex.processors.UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            io.reactivex.processors.UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            io.reactivex.processors.UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(io.reactivex.processors.UnicastProcessor.this.requested, j);
                io.reactivex.processors.UnicastProcessor.this.drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (io.reactivex.processors.UnicastProcessor.this.cancelled) {
                return;
            }
            io.reactivex.processors.UnicastProcessor.this.cancelled = true;
            io.reactivex.processors.UnicastProcessor.this.doTerminate();
            if (io.reactivex.processors.UnicastProcessor.this.enableOperatorFusion || io.reactivex.processors.UnicastProcessor.this.wip.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.processors.UnicastProcessor.this.queue.clear();
            io.reactivex.processors.UnicastProcessor.this.downstream.lazySet(null);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }
}
