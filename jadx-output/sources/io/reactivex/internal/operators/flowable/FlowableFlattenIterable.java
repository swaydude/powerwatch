package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final int prefetch;

    public FlowableFlattenIterable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function, int i) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (this.source instanceof java.util.concurrent.Callable) {
            try {
                java.lang.Object objCall = ((java.util.concurrent.Callable) this.source).call();
                if (objCall == null) {
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                    return;
                }
                try {
                    io.reactivex.internal.operators.flowable.FlowableFromIterable.subscribe(subscriber, this.mapper.apply(objCall).iterator());
                    return;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    return;
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                return;
            }
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber(subscriber, this.mapper, this.prefetch));
    }

    static final class FlattenIterableSubscriber<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        java.util.Iterator<? extends R> current;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        int fusionMode;
        final int limit;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        FlattenIterableSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function, int i) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0 && !this.queue.offer(t)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (!this.done && io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
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
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0124 A[PHI: r6
          0x0124: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:30:0x0080, B:67:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x012b A[SYNTHETIC] */
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<?> subscriber = this.downstream;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
            boolean z = this.fusionMode != 1;
            java.util.Iterator<? extends R> it = this.current;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z2 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        if (checkTerminated(z2, tPoll == null, subscriber, simpleQueue)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.mapper.apply(tPoll).iterator();
                                if (!it.hasNext()) {
                                    consumedOne(z);
                                    it = null;
                                } else {
                                    this.current = it;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.upstream.cancel();
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th);
                                subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.error));
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        this.upstream.cancel();
                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th2);
                        java.lang.Throwable thTerminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.error);
                        this.current = null;
                        simpleQueue.clear();
                        subscriber.onError(thTerminate);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (checkTerminated(this.done, false, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (checkTerminated(this.done, false, subscriber, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    consumedOne(z);
                                    this.current = null;
                                    it = null;
                                    break;
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                this.current = null;
                                this.upstream.cancel();
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th3);
                                subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.error));
                                return;
                            }
                        } catch (java.lang.Throwable th4) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                            this.current = null;
                            this.upstream.cancel();
                            io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th4);
                            subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.error));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (checkTerminated(this.done, simpleQueue.isEmpty() && it == null, subscriber, simpleQueue)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        void consumedOne(boolean z) {
            if (z) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i);
                } else {
                    this.consumed = i;
                }
            }
        }

        boolean checkTerminated(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.fuseable.SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            java.lang.Throwable thTerminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.error);
            this.current = null;
            simpleQueue.clear();
            subscriber.onError(thTerminate);
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.current;
            while (it == null) {
                T tPoll = this.queue.poll();
                if (tPoll != null) {
                    it = this.mapper.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.current = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return r;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return ((i & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }
    }
}
