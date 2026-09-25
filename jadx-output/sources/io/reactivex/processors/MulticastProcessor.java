package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
@io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
@io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
public final class MulticastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] EMPTY = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[0];
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] TERMINATED = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile java.lang.Throwable error;
    int fusionMode;
    final int limit;
    final java.util.concurrent.atomic.AtomicBoolean once;
    volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
    final boolean refcount;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
    final java.util.concurrent.atomic.AtomicInteger wip;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create() {
        return new io.reactivex.processors.MulticastProcessor<>(bufferSize(), false);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(boolean z) {
        return new io.reactivex.processors.MulticastProcessor<>(bufferSize(), z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int i) {
        return new io.reactivex.processors.MulticastProcessor<>(i, false);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int i, boolean z) {
        return new io.reactivex.processors.MulticastProcessor<>(i, z);
    }

    MulticastProcessor(int i, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "bufferSize");
        this.bufferSize = i;
        this.limit = i - (i >> 2);
        this.wip = new java.util.concurrent.atomic.AtomicInteger();
        this.subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.refcount = z;
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public void start() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE)) {
            this.queue = new io.reactivex.internal.queue.SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE)) {
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
            if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    subscription.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new io.reactivex.internal.queue.SpscArrayQueue(this.bufferSize);
            subscription.request(this.bufferSize);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                onError(new io.reactivex.exceptions.MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    public boolean offer(T t) {
        if (this.once.get()) {
            return false;
        }
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            this.done = true;
            drain();
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.once.get() && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.once.get() && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        java.lang.Throwable th;
        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription = new io.reactivex.processors.MulticastProcessor.MulticastSubscription<>(subscriber, this);
        subscriber.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
    }

    boolean add(io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription) {
        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr;
        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[length + 1];
            java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    void remove(io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription) {
        while (true) {
            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (multicastSubscriptionArr[i2] == multicastSubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                if (this.refcount) {
                    if (this.subscribers.compareAndSet(multicastSubscriptionArr, TERMINATED)) {
                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                        this.once.set(true);
                        return;
                    }
                } else if (this.subscribers.compareAndSet(multicastSubscriptionArr, EMPTY)) {
                    return;
                }
            } else {
                io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr2 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[length - 1];
                java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i);
                java.lang.System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr2, i, (length - i) - 1);
                if (this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            }
        }
    }

    void drain() {
        T tPoll;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i = this.consumed;
        int i2 = this.limit;
        int i3 = this.fusionMode;
        int iAddAndGet = 1;
        while (true) {
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j = -1;
                    long jMin = -1;
                    int i4 = 0;
                    while (i4 < length) {
                        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i4];
                        long j2 = multicastSubscription.get();
                        if (j2 >= 0) {
                            if (jMin == j) {
                                jMin = j2 - multicastSubscription.emitted;
                            } else {
                                jMin = java.lang.Math.min(jMin, j2 - multicastSubscription.emitted);
                            }
                        }
                        i4++;
                        j = -1;
                    }
                    int i5 = i;
                    while (true) {
                        if (jMin > 0) {
                            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (multicastSubscriptionArr2 == TERMINATED) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr == multicastSubscriptionArr2) {
                                boolean z = this.done;
                                try {
                                    tPoll = simpleQueue.poll();
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                                    this.error = th;
                                    this.done = true;
                                    tPoll = null;
                                    z = true;
                                }
                                boolean z2 = tPoll == null;
                                if (z && z2) {
                                    java.lang.Throwable th2 = this.error;
                                    if (th2 != null) {
                                        for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription2 : atomicReference.getAndSet(TERMINATED)) {
                                            multicastSubscription2.onError(th2);
                                        }
                                        return;
                                    }
                                    for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription3 : atomicReference.getAndSet(TERMINATED)) {
                                        multicastSubscription3.onComplete();
                                    }
                                    return;
                                }
                                if (!z2) {
                                    for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription4 : multicastSubscriptionArr) {
                                        multicastSubscription4.onNext(tPoll);
                                    }
                                    jMin--;
                                    if (i3 != 1 && (i5 = i5 + 1) == i2) {
                                        this.upstream.get().request(i2);
                                        i5 = 0;
                                    }
                                }
                            }
                            i = i5;
                        }
                        if (jMin == 0) {
                            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                            if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                                i = i5;
                            } else if (this.done && simpleQueue.isEmpty()) {
                                java.lang.Throwable th3 = this.error;
                                if (th3 != null) {
                                    for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription5 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                        multicastSubscription5.onError(th3);
                                    }
                                    return;
                                }
                                for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription6 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                    multicastSubscription6.onComplete();
                                }
                                return;
                            }
                        }
                        i = i5;
                    }
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        long emitted;
        final io.reactivex.processors.MulticastProcessor<T> parent;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.MulticastProcessor<T> multicastProcessor) {
            this.downstream = subscriber;
            this.parent = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            long j2;
            long j3;
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    j3 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                    if (j2 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        return;
                    }
                    long j4 = j2 + j;
                    if (j4 >= 0) {
                        j3 = j4;
                    }
                } while (!compareAndSet(j2, j3));
                this.parent.drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        void onNext(T t) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t);
            }
        }

        void onError(java.lang.Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }
    }
}
