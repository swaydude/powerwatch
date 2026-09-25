package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapEager<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    public FlowableConcatMapEager(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }

    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> subscribers;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        ConcatMapEagerDelayErrorSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
            this.downstream = subscriber;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode;
            this.subscribers = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(java.lang.Math.min(i2, i));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                subscription.request(i == Integer.MAX_VALUE ? kotlin.jvm.internal.LongCompanionObject.MAX_VALUE : i);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber = new io.reactivex.internal.subscribers.InnerQueuedSubscriber<>(this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(innerQueuedSubscriber);
                publisher.subscribe(innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    drainAndCancel();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
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

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            drainAndCancel();
        }

        void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        void cancelAll() {
            io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.subscribers.poll();
                if (innerQueuedSubscriberPoll == null) {
                    return;
                } else {
                    innerQueuedSubscriberPoll.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.queue().offer(r)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new io.reactivex.exceptions.MissingBackpressureException());
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber, java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                innerQueuedSubscriber.setDone();
                if (this.errorMode != io.reactivex.internal.util.ErrorMode.END) {
                    this.upstream.cancel();
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void drain() {
            int i;
            long j;
            boolean z;
            io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueueQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.current;
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.util.ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.requested.get();
                if (innerQueuedSubscriberPoll != null) {
                    innerQueuedSubscriberPoll = innerQueuedSubscriberPoll;
                } else {
                    if (errorMode != io.reactivex.internal.util.ErrorMode.END && this.errors.get() != null) {
                        cancelAll();
                        subscriber.onError(this.errors.terminate());
                        return;
                    }
                    boolean z2 = this.done;
                    innerQueuedSubscriberPoll = this.subscribers.poll();
                    if (z2 && innerQueuedSubscriberPoll == null) {
                        java.lang.Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            subscriber.onError(thTerminate);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriberPoll != null) {
                        this.current = innerQueuedSubscriberPoll;
                    }
                }
                if (innerQueuedSubscriberPoll == null || (simpleQueueQueue = innerQueuedSubscriberPoll.queue()) == null) {
                    i = iAddAndGet;
                    j = 0;
                    z = false;
                } else {
                    i = iAddAndGet;
                    j = 0;
                    while (true) {
                        if (j != j2) {
                            if (this.cancelled) {
                                cancelAll();
                                return;
                            }
                            if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.errors.get() != null) {
                                this.current = null;
                                innerQueuedSubscriberPoll.cancel();
                                cancelAll();
                                subscriber.onError(this.errors.terminate());
                                return;
                            }
                            boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                            try {
                                R rPoll = simpleQueueQueue.poll();
                                boolean z3 = rPoll == null;
                                if (zIsDone && z3) {
                                    this.current = null;
                                    this.upstream.request(1L);
                                    innerQueuedSubscriberPoll = null;
                                    z = true;
                                    break;
                                }
                                if (!z3) {
                                    subscriber.onNext(rPoll);
                                    j++;
                                    innerQueuedSubscriberPoll.requestOne();
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.current = null;
                                innerQueuedSubscriberPoll.cancel();
                                cancelAll();
                                subscriber.onError(th);
                                return;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (j == j2) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            subscriber.onError(this.errors.terminate());
                            return;
                        }
                        boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                        boolean zIsEmpty = simpleQueueQueue.isEmpty();
                        if (zIsDone2 && zIsEmpty) {
                            this.current = null;
                            this.upstream.request(1L);
                            innerQueuedSubscriberPoll = null;
                            z = true;
                        }
                    }
                }
                if (j != 0 && j2 != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j);
                }
                if (z) {
                    iAddAndGet = i;
                } else {
                    iAddAndGet = addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
