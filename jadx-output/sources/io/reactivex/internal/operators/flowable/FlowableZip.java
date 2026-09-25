package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableZip<T, R> extends io.reactivex.Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final org.reactivestreams.Publisher<? extends T>[] sources;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    public FlowableZip(org.reactivestreams.Publisher<? extends T>[] publisherArr, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.sources = publisherArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        int length;
        org.reactivestreams.Publisher<? extends T>[] publisherArr = this.sources;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            length = 0;
            for (org.reactivestreams.Publisher<? extends T> publisher : this.sourcesIterable) {
                if (length == publisherArr.length) {
                    org.reactivestreams.Publisher<? extends T>[] publisherArr2 = new org.reactivestreams.Publisher[(length >> 2) + length];
                    java.lang.System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i = length;
        if (i == 0) {
            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator(subscriber, this.zipper, i, this.bufferSize, this.delayError);
        subscriber.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(publisherArr, i);
    }

    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final java.lang.Object[] current;
        final boolean delayErrors;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] subscribers;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = subscriber;
            this.zipper = function;
            this.delayErrors = z;
            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<>(this, i2);
            }
            this.current = new java.lang.Object[i];
            this.subscribers = zipSubscriberArr;
            this.requested = new java.util.concurrent.atomic.AtomicLong();
            this.errors = new io.reactivex.internal.util.AtomicThrowable();
        }

        void subscribe(org.reactivestreams.Publisher<? extends T>[] publisherArr, int i) {
            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                publisherArr[i2].subscribe(zipSubscriberArr[i2]);
            }
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
        }

        void error(io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber, java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                zipSubscriber.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void cancelAll() {
            for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            java.lang.Object[] objArr = this.current;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j != j2) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        subscriber.onError(this.errors.terminate());
                        return;
                    }
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i];
                        if (objArr[i] == null) {
                            try {
                                boolean z2 = zipSubscriber.done;
                                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                T tPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                boolean z3 = tPoll == null;
                                if (z2 && z3) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        subscriber.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (z3) {
                                    z = true;
                                } else {
                                    objArr[i] = tPoll;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.errors.addThrowable(th);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    subscriber.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                    try {
                        subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j2++;
                        java.util.Arrays.fill(objArr, (java.lang.Object) null);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancelAll();
                        this.errors.addThrowable(th2);
                        subscriber.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j == j2) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        subscriber.onError(this.errors.terminate());
                        return;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i2];
                        if (objArr[i2] == null) {
                            try {
                                boolean z4 = zipSubscriber2.done;
                                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z5 = tPoll2 == null;
                                if (z4 && z5) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        subscriber.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (!z5) {
                                    objArr[i2] = tPoll2;
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                this.errors.addThrowable(th3);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    subscriber.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j2 != 0) {
                    for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j2);
                    }
                    if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    static final class ZipSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        ZipSubscriber(io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.SpscArrayQueue(this.prefetch);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.error(this, th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= this.limit) {
                    this.produced = 0L;
                    get().request(j2);
                } else {
                    this.produced = j2;
                }
            }
        }
    }
}
