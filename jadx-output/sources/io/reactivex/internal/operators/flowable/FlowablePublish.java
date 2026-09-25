package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowablePublish<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
    final org.reactivestreams.Publisher<T> onSubscribe;
    final io.reactivex.Flowable<T> source;

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, int i) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowablePublish(new io.reactivex.internal.operators.flowable.FlowablePublish.FlowablePublisher(atomicReference, i), flowable, atomicReference, i));
    }

    private FlowablePublish(org.reactivestreams.Publisher<T> publisher, io.reactivex.Flowable<T> flowable, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
        this.onSubscribe = publisher;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferSize = i;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.onSubscribe.subscribe(subscriber);
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber2 = new io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<>(this.current, this.bufferSize);
            if (this.current.compareAndSet(publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z = !publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(publishSubscriber);
            if (z) {
                this.source.subscribe((io.reactivex.FlowableSubscriber) publishSubscriber);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static final class PublishSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] EMPTY = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[0];
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] TERMINATED = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        volatile java.lang.Object terminalEvent;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect = new java.util.concurrent.atomic.AtomicBoolean();

        PublishSubscriber(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.bufferSize = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2 = TERMINATED;
            if (innerSubscriberArr == innerSubscriberArr2 || this.subscribers.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            this.current.compareAndSet(this, null);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.terminalEvent = io.reactivex.internal.util.NotificationLite.complete();
                        dispatch();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
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
            if (this.sourceMode == 0 && !this.queue.offer(t)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                dispatch();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = io.reactivex.internal.util.NotificationLite.error(th);
                dispatch();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = io.reactivex.internal.util.NotificationLite.complete();
                dispatch();
            }
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[length + 1];
                java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerSubscriberArr[i2].equals(innerSubscriber)) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr3 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[length - 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        boolean checkTerminated(java.lang.Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                    java.lang.Throwable error = io.reactivex.internal.util.NotificationLite.getError(obj);
                    this.current.compareAndSet(this, null);
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(error);
                            i++;
                        }
                    } else {
                        io.reactivex.plugins.RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z) {
                    this.current.compareAndSet(this, null);
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].child.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        void dispatch() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[]> atomicReference = this.subscribers;
            int i = 1;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                java.lang.Object obj = this.terminalEvent;
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.queue;
                boolean z = simpleQueue == null || simpleQueue.isEmpty();
                if (checkTerminated(obj, z)) {
                    return;
                }
                if (!z) {
                    int length = innerSubscriberArr.length;
                    int i2 = 0;
                    long jMin = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                    for (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber : innerSubscriberArr) {
                        long j = innerSubscriber.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = java.lang.Math.min(jMin, j - innerSubscriber.emitted);
                        } else {
                            i2++;
                        }
                    }
                    if (length == i2) {
                        java.lang.Object objError = this.terminalEvent;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            this.upstream.get().cancel();
                            objError = io.reactivex.internal.util.NotificationLite.error(th);
                            this.terminalEvent = objError;
                            tPoll = null;
                        }
                        if (checkTerminated(objError, tPoll == null)) {
                            return;
                        }
                        if (this.sourceMode != i) {
                            this.upstream.get().request(1L);
                        }
                    } else {
                        int i3 = 0;
                        while (true) {
                            long j2 = i3;
                            if (j2 < jMin) {
                                java.lang.Object objError2 = this.terminalEvent;
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.upstream.get().cancel();
                                    objError2 = io.reactivex.internal.util.NotificationLite.error(th2);
                                    this.terminalEvent = objError2;
                                    tPoll2 = null;
                                }
                                boolean z2 = tPoll2 == null;
                                if (checkTerminated(objError2, z2)) {
                                    return;
                                }
                                if (z2) {
                                    z = z2;
                                } else {
                                    java.lang.Object value = io.reactivex.internal.util.NotificationLite.getValue(tPoll2);
                                    int length2 = innerSubscriberArr.length;
                                    int i4 = 0;
                                    boolean z3 = false;
                                    while (i4 < length2) {
                                        io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr[i4];
                                        long j3 = innerSubscriber2.get();
                                        if (j3 != Long.MIN_VALUE) {
                                            if (j3 != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                                innerSubscriber2.emitted++;
                                            }
                                            innerSubscriber2.child.onNext(value);
                                        } else {
                                            z3 = true;
                                        }
                                        i4++;
                                        simpleQueue = simpleQueue;
                                        z2 = z2;
                                    }
                                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = simpleQueue;
                                    boolean z4 = z2;
                                    i3++;
                                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
                                    if (z3 || innerSubscriberArr2 != innerSubscriberArr) {
                                        if (i3 != 0 && this.sourceMode != 1) {
                                            this.upstream.get().request(i3);
                                        }
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i = 1;
                                    } else {
                                        simpleQueue = simpleQueue2;
                                        z = z4;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                i = 1;
                                if (this.sourceMode != 1) {
                                    this.upstream.get().request(j2);
                                }
                            } else {
                                i = 1;
                            }
                            if (jMin == 0 || z) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    innerSubscriberArr = atomicReference.get();
                }
            }
        }
    }

    static final class InnerSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.Subscriber<? super T> child;
        long emitted;
        volatile io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> parent;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.child = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.parent) == null) {
                return;
            }
            publishSubscriber.remove(this);
            publishSubscriber.dispatch();
        }
    }

    static final class FlowablePublisher<T> implements org.reactivestreams.Publisher<T> {
        private final int bufferSize;
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> curr;

        FlowablePublisher(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
            this.curr = atomicReference;
            this.bufferSize = i;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<>(subscriber);
            subscriber.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.curr.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber2 = new io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<>(this.curr, this.bufferSize);
                    if (this.curr.compareAndSet(publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                if (publishSubscriber.add(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.remove(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }
    }
}
