package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCombineLatest<T, R> extends io.reactivex.Flowable<R> {
    final org.reactivestreams.Publisher<? extends T>[] array;
    final int bufferSize;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
    final boolean delayErrors;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable;

    public FlowableCombineLatest(org.reactivestreams.Publisher<? extends T>[] publisherArr, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.array = publisherArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    public FlowableCombineLatest(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        int length;
        org.reactivestreams.Publisher<? extends T>[] publisherArr = this.array;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            try {
                java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            org.reactivestreams.Publisher<? extends T> publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == publisherArr.length) {
                                org.reactivestreams.Publisher<? extends T>[] publisherArr2 = new org.reactivestreams.Publisher[(length >> 2) + length];
                                java.lang.System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                                publisherArr = publisherArr2;
                            }
                            publisherArr[length] = publisher;
                            length++;
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
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th3, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        int i = length;
        if (i == 0) {
            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
        } else {
            if (i == 1) {
                publisherArr[0].subscribe(new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, new io.reactivex.internal.operators.flowable.FlowableCombineLatest.SingletonArrayFunc()));
                return;
            }
            io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator combineLatestCoordinator = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator(subscriber, this.combiner, i, this.bufferSize, this.delayErrors);
            subscriber.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(publisherArr, i);
        }
    }

    static final class CombineLatestCoordinator<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final java.lang.Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = subscriber;
            this.combiner = function;
            io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new java.lang.Object[i];
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
            this.requested = new java.util.concurrent.atomic.AtomicLong();
            this.error = new java.util.concurrent.atomic.AtomicReference<>();
            this.delayErrors = z;
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
            this.cancelled = true;
            cancelAll();
        }

        void subscribe(org.reactivestreams.Publisher<? extends T>[] publisherArr, int i) {
            io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                publisherArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }

        void innerValue(int i, T t) {
            boolean z;
            synchronized (this) {
                java.lang.Object[] objArr = this.latest;
                int i2 = this.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    this.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.queue.offer(this.subscribers[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.subscribers[i].requestOne();
            } else {
                drain();
            }
        }

        void innerComplete(int i) {
            int i2;
            synchronized (this) {
                java.lang.Object[] objArr = this.latest;
                if (objArr[i] == null || (i2 = this.completedSources + 1) == objArr.length) {
                    this.done = true;
                    drain();
                } else {
                    this.completedSources = i2;
                }
            }
        }

        void innerError(int i, java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th)) {
                if (!this.delayErrors) {
                    cancelAll();
                    this.done = true;
                    drain();
                    return;
                }
                innerComplete(i);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void drainOutput() {
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                java.lang.Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    subscriber.onError(th);
                    return;
                }
                boolean z = this.done;
                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                if (!zIsEmpty) {
                    subscriber.onNext(null);
                }
                if (z && zIsEmpty) {
                    subscriber.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        void drainAsync() {
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.done;
                    java.lang.Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z2 = objPoll == null;
                    if (checkTerminated(z, z2, subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    try {
                        subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.combiner.apply((java.lang.Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) objPoll).requestOne();
                        j2++;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        cancelAll();
                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th);
                        subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j2 == j && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        boolean checkTerminated(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayErrors) {
                if (!z2) {
                    return false;
                }
                cancelAll();
                java.lang.Throwable thTerminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.error);
                if (thTerminate != null && thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    subscriber.onError(thTerminate);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            java.lang.Throwable thTerminate2 = io.reactivex.internal.util.ExceptionHelper.terminate(this.error);
            if (thTerminate2 != null && thTerminate2 != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                subscriber.onError(thTerminate2);
                return true;
            }
            if (!z2) {
                return false;
            }
            cancelAll();
            subscriber.onComplete();
            return true;
        }

        void cancelAll() {
            for (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.outputFused = i2 != 0;
            return i2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
            java.lang.Object objPoll = this.queue.poll();
            if (objPoll == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.combiner.apply((java.lang.Object[]) this.queue.poll()), "The combiner returned a null value");
            ((io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) objPoll).requestOne();
            return r;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.parent = combineLatestCoordinator;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.prefetch);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.parent.innerValue(this.index, t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        public void requestOne() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                get().request(i);
            } else {
                this.produced = i;
            }
        }
    }

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public R apply(T t) throws java.lang.Exception {
            return io.reactivex.internal.operators.flowable.FlowableCombineLatest.this.combiner.apply(new java.lang.Object[]{t});
        }
    }
}
