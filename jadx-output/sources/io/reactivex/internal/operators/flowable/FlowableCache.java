package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> implements io.reactivex.FlowableSubscriber<T> {
    static final io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[] EMPTY = new io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[0];
    static final io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[] TERMINATED = new io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    java.lang.Throwable error;
    final io.reactivex.internal.operators.flowable.FlowableCache.Node<T> head;
    final java.util.concurrent.atomic.AtomicBoolean once;
    volatile long size;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[]> subscribers;
    io.reactivex.internal.operators.flowable.FlowableCache.Node<T> tail;
    int tailOffset;

    public FlowableCache(io.reactivex.Flowable<T> flowable, int i) {
        super(flowable);
        this.capacityHint = i;
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
        io.reactivex.internal.operators.flowable.FlowableCache.Node<T> node = new io.reactivex.internal.operators.flowable.FlowableCache.Node<>(i);
        this.head = node;
        this.tail = node;
        this.subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription = new io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<>(subscriber, this);
        subscriber.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) this);
        } else {
            replay(cacheSubscription);
        }
    }

    boolean isConnected() {
        return this.once.get();
    }

    boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    long cachedEventCount() {
        return this.size;
    }

    void add(io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription) {
        io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[] cacheSubscriptionArr;
        io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[length + 1];
            java.lang.System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!this.subscribers.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    void remove(io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription) {
        io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[] cacheSubscriptionArr;
        io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (cacheSubscriptionArr[i2] == cacheSubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = EMPTY;
            } else {
                io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T>[] cacheSubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription[length - 1];
                java.lang.System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(cacheSubscriptionArr, i + 1, cacheSubscriptionArr3, i, (length - i) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    void replay(io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j = cacheSubscription.index;
        int i = cacheSubscription.offset;
        io.reactivex.internal.operators.flowable.FlowableCache.Node<T> node = cacheSubscription.node;
        java.util.concurrent.atomic.AtomicLong atomicLong = cacheSubscription.requested;
        org.reactivestreams.Subscriber<? super T> subscriber = cacheSubscription.downstream;
        int i2 = this.capacityHint;
        int iAddAndGet = 1;
        while (true) {
            boolean z = this.done;
            boolean z2 = this.size == j;
            if (z && z2) {
                cacheSubscription.node = null;
                java.lang.Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            if (!z2) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j2 != j) {
                    if (i == i2) {
                        node = node.next;
                        i = 0;
                    }
                    subscriber.onNext(node.values[i]);
                    i++;
                    j++;
                }
            }
            cacheSubscription.index = j;
            cacheSubscription.offset = i;
            cacheSubscription.node = node;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        int i = this.tailOffset;
        if (i == this.capacityHint) {
            io.reactivex.internal.operators.flowable.FlowableCache.Node<T> node = new io.reactivex.internal.operators.flowable.FlowableCache.Node<>(i);
            node.values[0] = t;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i] = t;
            this.tailOffset = i + 1;
        }
        this.size++;
        for (io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        for (io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.done = true;
        for (io.reactivex.internal.operators.flowable.FlowableCache.CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    static final class CacheSubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        long index;
        io.reactivex.internal.operators.flowable.FlowableCache.Node<T> node;
        int offset;
        final io.reactivex.internal.operators.flowable.FlowableCache<T> parent;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        CacheSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowableCache<T> flowableCache) {
            this.downstream = subscriber;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this.requested, j);
                this.parent.replay(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }
    }

    static final class Node<T> {
        volatile io.reactivex.internal.operators.flowable.FlowableCache.Node<T> next;
        final T[] values;

        Node(int i) {
            this.values = (T[]) new java.lang.Object[i];
        }
    }
}
