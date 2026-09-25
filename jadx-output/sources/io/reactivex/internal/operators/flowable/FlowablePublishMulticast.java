package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> selector;

    public FlowablePublishMulticast(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.selector = function;
        this.prefetch = i;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor multicastProcessor = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor(this.prefetch, this.delayError);
        try {
            ((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.OutputCanceller(subscriber, multicastProcessor));
            this.source.subscribe((io.reactivex.FlowableSubscriber) multicastProcessor);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static final class OutputCanceller<R> implements io.reactivex.FlowableSubscriber<R>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> processor;
        org.reactivestreams.Subscription upstream;

        OutputCanceller(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> multicastProcessor) {
            this.downstream = subscriber;
            this.processor = multicastProcessor;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
            this.processor.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
            this.processor.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            this.processor.dispose();
        }
    }

    static final class MulticastProcessor<T> extends io.reactivex.Flowable<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] EMPTY = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[0];
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] TERMINATED = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[0];
        int consumed;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final int limit;
        final int prefetch;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicInteger wip = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

        MulticastProcessor(int i, boolean z) {
            this.prefetch = i;
            this.limit = i - (i >> 2);
            this.delayError = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.prefetch);
                        return;
                    }
                }
                this.queue = io.reactivex.internal.util.QueueDrainHelper.createQueue(this.prefetch);
                io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.prefetch);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            if (this.wip.getAndIncrement() != 0 || (simpleQueue = this.queue) == null) {
                return;
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0 && !this.queue.offer(t)) {
                this.upstream.get().cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException());
            } else {
                drain();
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
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription) {
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.subscribers.get();
                if (multicastSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[length + 1];
                java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription) {
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.subscribers.get();
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
                    multicastSubscriptionArr2 = EMPTY;
                } else {
                    io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[length - 1];
                    java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                    java.lang.System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<>(subscriber, this);
            subscriber.onSubscribe(multicastSubscription);
            if (add(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    remove(multicastSubscription);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            java.lang.Throwable th = this.error;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }

        void drain() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference;
            java.lang.Throwable th;
            java.lang.Throwable th2;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
            int i = this.consumed;
            int i2 = this.limit;
            boolean z = this.sourceMode != 1;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i3 = 0;
                    while (i3 < length2) {
                        io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i3];
                        java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j3 = multicastSubscription.get() - multicastSubscription.emitted;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i3++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (true) {
                        if (j2 != j4) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z2 = this.done;
                            if (z2 && !this.delayError && (th2 = this.error) != null) {
                                errorAll(th2);
                                return;
                            }
                            try {
                                T tPoll = simpleQueue.poll();
                                boolean z3 = tPoll == null;
                                if (z2 && z3) {
                                    java.lang.Throwable th3 = this.error;
                                    if (th3 != null) {
                                        errorAll(th3);
                                        return;
                                    } else {
                                        completeAll();
                                        return;
                                    }
                                }
                                if (!z3) {
                                    int length3 = multicastSubscriptionArr.length;
                                    int i4 = 0;
                                    boolean z4 = false;
                                    while (i4 < length3) {
                                        io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i4];
                                        long j5 = multicastSubscription2.get();
                                        if (j5 != Long.MIN_VALUE) {
                                            if (j5 != j) {
                                                multicastSubscription2.emitted++;
                                            }
                                            multicastSubscription2.downstream.onNext(tPoll);
                                        } else {
                                            z4 = true;
                                        }
                                        i4++;
                                        j = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                                    }
                                    j2--;
                                    if (z && (i = i + 1) == i2) {
                                        this.upstream.get().request(i2);
                                        i = 0;
                                    }
                                    io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                                    if (z4 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                        multicastSubscriptionArr = multicastSubscriptionArr2;
                                    } else {
                                        j4 = 0;
                                        j = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                                    }
                                }
                                atomicReference2 = atomicReference;
                            } catch (java.lang.Throwable th4) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                                errorAll(th4);
                                return;
                            }
                        }
                        if (j2 == j4) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z5 = this.done;
                            if (z5 && !this.delayError && (th = this.error) != null) {
                                errorAll(th);
                                return;
                            }
                            if (z5 && simpleQueue.isEmpty()) {
                                java.lang.Throwable th5 = this.error;
                                if (th5 != null) {
                                    errorAll(th5);
                                    return;
                                } else {
                                    completeAll();
                                    return;
                                }
                            }
                        }
                    }
                }
                this.consumed = i;
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.queue;
                }
                multicastSubscriptionArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        void errorAll(java.lang.Throwable th) {
            for (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th);
                }
            }
        }

        void completeAll() {
            for (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }
    }

    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        long emitted;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> parent;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> multicastProcessor) {
            this.downstream = subscriber;
            this.parent = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
                this.parent.drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }
    }
}
