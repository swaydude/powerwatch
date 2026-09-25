package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int prefetch;

    interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(java.lang.Throwable th);

        void innerNext(T t);
    }

    public FlowableConcatMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode;
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[io.reactivex.internal.util.ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[io.reactivex.internal.util.ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[io.reactivex.internal.util.ErrorMode.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static <T, R> org.reactivestreams.Subscriber<T> subscribe(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        int i2 = io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        if (i2 == 1) {
            return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapDelayed(subscriber, function, i, false);
        }
        if (i2 == 2) {
            return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapDelayed(subscriber, function, i, true);
        }
        return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapImmediate(subscriber, function, i);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, this.mapper, this.prefetch, this.errorMode));
    }

    static abstract class BaseConcatMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapInner<R> inner = new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapInner<>(this);
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();

        abstract void drain();

        abstract void subscribeActual();

        BaseConcatMapSubscriber(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i) {
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscArrayQueue(this.prefetch);
                subscribeActual();
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.sourceMode != 2 && !this.queue.offer(t)) {
                this.upstream.cancel();
                onError(new java.lang.IllegalStateException("Queue full?!"));
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }
    }

    static final class ConcatMapImmediate<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final java.util.concurrent.atomic.AtomicInteger wip;

        ConcatMapImmediate(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i) {
            super(function, i);
            this.downstream = subscriber;
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (publisher instanceof java.util.concurrent.Callable) {
                                        try {
                                            java.lang.Object objCall = ((java.util.concurrent.Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.downstream.onNext(objCall);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.downstream.onError(this.errors.terminate());
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.active = true;
                                                this.inner.setSubscription(new io.reactivex.internal.operators.flowable.FlowableConcatMap.WeakScalarSubscription(objCall, this.inner));
                                            }
                                        } catch (java.lang.Throwable th) {
                                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        publisher.subscribe(this.inner);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class WeakScalarSubscription<T> implements org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> downstream;
        boolean once;
        final T value;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        WeakScalarSubscription(T t, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.value = t;
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (j <= 0 || this.once) {
                return;
            }
            this.once = true;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            subscriber.onNext(this.value);
            subscriber.onComplete();
        }
    }

    static final class ConcatMapDelayed<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final boolean veryEnd;

        ConcatMapDelayed(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.downstream = subscriber;
            this.veryEnd = z;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        if (z && !this.veryEnd && this.errors.get() != null) {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.queue.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                java.lang.Throwable thTerminate = this.errors.terminate();
                                if (thTerminate != null) {
                                    this.downstream.onError(thTerminate);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (publisher instanceof java.util.concurrent.Callable) {
                                        try {
                                            java.lang.Object objCall = ((java.util.concurrent.Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                this.downstream.onNext(objCall);
                                            } else {
                                                this.active = true;
                                                this.inner.setSubscription(new io.reactivex.internal.operators.flowable.FlowableConcatMap.WeakScalarSubscription(objCall, this.inner));
                                            }
                                        } catch (java.lang.Throwable th) {
                                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        publisher.subscribe(this.inner);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class ConcatMapInner<R> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> parent;
        long produced;

        ConcatMapInner(io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.produced++;
            this.parent.innerNext(r);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerComplete();
        }
    }
}
