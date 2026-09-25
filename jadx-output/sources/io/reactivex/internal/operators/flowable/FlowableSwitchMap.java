package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;

    public FlowableSwitchMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber(subscriber, this.mapper, this.bufferSize, this.delayErrors));
    }

    static final class SwitchMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        volatile long unique;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R>> active = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();

        static {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> switchMapInnerSubscriber = new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        SwitchMapSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
            this.downstream = subscriber;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j = this.unique + 1;
            this.unique = j;
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The publisher returned is null");
                io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<>(this, j, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(switchMapInnerSubscriber, switchMapInnerSubscriber3));
                publisher.subscribe(switchMapInnerSubscriber3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (!this.done && this.error.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
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
                if (this.unique == 0) {
                    this.upstream.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        void disposeInner() {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> andSet;
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> switchMapInnerSubscriber2 = CANCELLED;
            if (switchMapInnerSubscriber == switchMapInnerSubscriber2 || (andSet = this.active.getAndSet((io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber2)) == switchMapInnerSubscriber2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        void drain() {
            boolean z;
            android.R.color colorVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            if (this.error.get() != null) {
                                subscriber.onError(this.error.terminate());
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    } else if (this.error.get() != null) {
                        disposeInner();
                        subscriber.onError(this.error.terminate());
                        return;
                    } else if (this.active.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.queue : null;
                if (simpleQueue != null) {
                    if (switchMapInnerSubscriber.done) {
                        if (!this.delayErrors) {
                            if (this.error.get() != null) {
                                disposeInner();
                                subscriber.onError(this.error.terminate());
                                return;
                            } else if (simpleQueue.isEmpty()) {
                                this.active.compareAndSet(switchMapInnerSubscriber, null);
                            }
                        } else if (simpleQueue.isEmpty()) {
                            this.active.compareAndSet(switchMapInnerSubscriber, null);
                        }
                    }
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 != j) {
                            if (!this.cancelled) {
                                boolean z2 = switchMapInnerSubscriber.done;
                                try {
                                    colorVarPoll = simpleQueue.poll();
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    switchMapInnerSubscriber.cancel();
                                    this.error.addThrowable(th);
                                    colorVarPoll = null;
                                    z2 = true;
                                }
                                boolean z3 = colorVarPoll == null;
                                if (switchMapInnerSubscriber == this.active.get()) {
                                    if (z2) {
                                        if (this.delayErrors) {
                                            if (z3) {
                                                this.active.compareAndSet(switchMapInnerSubscriber, null);
                                            }
                                        } else if (this.error.get() != null) {
                                            subscriber.onError(this.error.terminate());
                                            return;
                                        } else if (z3) {
                                            this.active.compareAndSet(switchMapInnerSubscriber, null);
                                        }
                                    }
                                    if (z3) {
                                        break;
                                    }
                                    subscriber.onNext(colorVarPoll);
                                    j2++;
                                }
                                z = true;
                                break;
                            }
                            return;
                        }
                        break;
                    }
                    if (j2 != 0 && !this.cancelled) {
                        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                        switchMapInnerSubscriber.get().request(j2);
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.active.lazySet(null);
        }
    }

    static final class SwitchMapInnerSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> queue;

        SwitchMapInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
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
        public void onNext(R r) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode == 0 && !this.queue.offer(r)) {
                    onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                } else {
                    switchMapSubscriber.drain();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique && switchMapSubscriber.error.addThrowable(th)) {
                if (!switchMapSubscriber.delayErrors) {
                    switchMapSubscriber.upstream.cancel();
                }
                this.done = true;
                switchMapSubscriber.drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }
    }
}
