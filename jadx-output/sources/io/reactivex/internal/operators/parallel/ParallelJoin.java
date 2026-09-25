package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelJoin<T> extends io.reactivex.Flowable<T> {
    final boolean delayErrors;
    final int prefetch;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    public ParallelJoin(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, int i, boolean z) {
        this.source = parallelFlowable;
        this.prefetch = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase joinSubscription;
        if (this.delayErrors) {
            joinSubscription = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionDelayError(subscriber, this.source.parallelism(), this.prefetch);
        } else {
            joinSubscription = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscription(subscriber, this.source.parallelism(), this.prefetch);
        }
        subscriber.onSubscribe(joinSubscription);
        this.source.subscribe(joinSubscription.subscribers);
    }

    static abstract class JoinSubscriptionBase<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        volatile boolean cancelled;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] subscribers;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicInteger done = new java.util.concurrent.atomic.AtomicInteger();

        abstract void drain();

        abstract void onComplete();

        abstract void onError(java.lang.Throwable th);

        abstract void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t);

        JoinSubscriptionBase(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            this.downstream = subscriber;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                joinInnerSubscriberArr[i3] = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<>(this, i2);
            }
            this.subscribers = joinInnerSubscriberArr;
            this.done.lazySet(i);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                cleanup();
            }
        }

        void cancelAll() {
            for (io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.cancel();
            }
        }

        void cleanup() {
            for (io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.queue = null;
            }
        }
    }

    static final class JoinSubscription<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        JoinSubscription(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t);
                    if (this.requested.get() != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t)) {
                    cancelAll();
                    io.reactivex.exceptions.MissingBackpressureException missingBackpressureException = new io.reactivex.exceptions.MissingBackpressureException("Queue full?!");
                    if (this.errors.compareAndSet(null, missingBackpressureException)) {
                        this.downstream.onError(missingBackpressureException);
                        return;
                    } else {
                        io.reactivex.plugins.RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.getQueue().offer(t)) {
                cancelAll();
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(java.lang.Throwable th) {
            if (this.errors.compareAndSet(null, th)) {
                cancelAll();
                drain();
            } else if (th != this.errors.get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        void drainLoop() {
            boolean z;
            T tPoll;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            int i = 1;
            while (true) {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    java.lang.Throwable th = this.errors.get();
                    if (th != null) {
                        cleanup();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z2 = this.done.get() == 0;
                    boolean z3 = true;
                    for (io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                    }
                    if (!z2 || !z3) {
                        if (z3) {
                            break;
                        }
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    java.lang.Throwable th2 = this.errors.get();
                    if (th2 != null) {
                        cleanup();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z4 = this.done.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = true;
                            break;
                        }
                        io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i2].queue;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z4 && z) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = iAddAndGet;
                }
            }
        }
    }

    static final class JoinSubscriptionDelayError<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        JoinSubscriptionDelayError(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t);
                    if (this.requested.get() != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t)) {
                    joinInnerSubscriber.cancel();
                    this.errors.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.getQueue().offer(t) && joinInnerSubscriber.cancel()) {
                    this.errors.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onError(java.lang.Throwable th) {
            this.errors.addThrowable(th);
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        void drainLoop() {
            boolean z;
            T tPoll;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            int i = 1;
            while (true) {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z2 = this.done.get() == 0;
                    boolean z3 = true;
                    for (io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                    }
                    if (z2 && z3) {
                        if (this.errors.get() != null) {
                            subscriber.onError(this.errors.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z4 = this.done.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = true;
                            break;
                        }
                        io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i2].queue;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z4 && z) {
                        if (this.errors.get() != null) {
                            subscriber.onError(this.errors.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = iAddAndGet;
                }
            }
        }
    }

    static final class JoinInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> parent;
        final int prefetch;
        long produced;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;

        JoinInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> joinSubscriptionBase, int i) {
            this.parent = joinSubscriptionBase;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.prefetch);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.parent.onNext(this, t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.onComplete();
        }

        public void requestOne() {
            long j = this.produced + 1;
            if (j == this.limit) {
                this.produced = 0L;
                get().request(j);
            } else {
                this.produced = j;
            }
        }

        public void request(long j) {
            long j2 = this.produced + j;
            if (j2 >= this.limit) {
                this.produced = 0L;
                get().request(j2);
            } else {
                this.produced = j2;
            }
        }

        public boolean cancel() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        io.reactivex.internal.fuseable.SimplePlainQueue<T> getQueue() {
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(this.prefetch);
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }
    }
}
