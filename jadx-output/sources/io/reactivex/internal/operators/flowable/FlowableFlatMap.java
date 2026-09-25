package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
    final int maxConcurrency;

    public FlowableFlatMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) subscribe(subscriber, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }

    public static <T, U> io.reactivex.FlowableSubscriber<T> subscribe(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
        return new io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber(subscriber, function, z, i, i2);
    }

    static final class MergeSubscriber<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super U> downstream;
        final io.reactivex.internal.util.AtomicThrowable errs = new io.reactivex.internal.util.AtomicThrowable();
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        org.reactivestreams.Subscription upstream;
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] EMPTY = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[0];
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] CANCELLED = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[0];

        MergeSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new java.util.concurrent.atomic.AtomicLong();
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = java.lang.Math.max(1, i >> 1);
            atomicReference.lazySet(EMPTY);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                if (publisher instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object objCall = ((java.util.concurrent.Callable) publisher).call();
                        if (objCall != null) {
                            tryEmitScalar(objCall);
                            return;
                        }
                        if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                            return;
                        }
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i2);
                            return;
                        }
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.errs.addThrowable(th);
                        drain();
                        return;
                    }
                }
                long j = this.uniqueId;
                this.uniqueId = 1 + j;
                io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber innerSubscriber = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber(this, j);
                if (addInner(innerSubscriber)) {
                    publisher.subscribe(innerSubscriber);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        boolean addInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[length + 1];
                java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]) innerSubscriberArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerSubscriberArr[i2] == innerSubscriber) {
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
                    io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr3 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[length - 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getMainQueue() {
            io.reactivex.internal.fuseable.SimplePlainQueue<U> spscArrayQueue = this.queue;
            if (spscArrayQueue == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    spscArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(this.bufferSize);
                } else {
                    spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = spscArrayQueue;
            }
            return spscArrayQueue;
        }

        void tryEmitScalar(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                io.reactivex.internal.fuseable.SimpleQueue<U> mainQueue = this.queue;
                if (j != 0 && (mainQueue == null || mainQueue.isEmpty())) {
                    this.downstream.onNext(u);
                    if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i2);
                        }
                    }
                } else {
                    if (mainQueue == null) {
                        mainQueue = getMainQueue();
                    }
                    if (!mainQueue.offer(u)) {
                        onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u)) {
                onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getInnerQueue(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber) {
            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        void tryEmit(U u, io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                io.reactivex.internal.fuseable.SimpleQueue<U> innerQueue = innerSubscriber.queue;
                if (j != 0 && (innerQueue == null || innerQueue.isEmpty())) {
                    this.downstream.onNext(u);
                    if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                } else {
                    if (innerQueue == null) {
                        innerQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer(u)) {
                        onError(new io.reactivex.exceptions.MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.fuseable.SimpleQueue spscArrayQueue = innerSubscriber.queue;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u)) {
                    onError(new io.reactivex.exceptions.MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else if (this.errs.addThrowable(th)) {
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
            io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.queue) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            long j;
            long j2;
            boolean z;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U>[] innerSubscriberArr;
            int i;
            long j3;
            java.lang.Object obj;
            org.reactivestreams.Subscriber<? super U> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z2 = jAddAndGet == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                long j4 = 0;
                long j5 = 0;
                if (simplePlainQueue != null) {
                    do {
                        long j6 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = simplePlainQueue.poll();
                            if (checkTerminate()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            subscriber.onNext(uPoll);
                            j5++;
                            j6++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j6 != 0) {
                            jAddAndGet = z2 ? kotlin.jvm.internal.LongCompanionObject.MAX_VALUE : this.requested.addAndGet(-j6);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z3 = this.done;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (z3 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    java.lang.Throwable thTerminate = this.errs.terminate();
                    if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                int i2 = iAddAndGet;
                if (length != 0) {
                    long j7 = this.lastId;
                    int i3 = this.lastIndex;
                    if (length <= i3 || innerSubscriberArr2[i3].id != j7) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        for (int i4 = 0; i4 < length && innerSubscriberArr2[i3].id != j7; i4++) {
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.lastIndex = i3;
                        this.lastId = innerSubscriberArr2[i3].id;
                    }
                    int i5 = i3;
                    boolean z4 = false;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            innerSubscriberArr = innerSubscriberArr2;
                            z = z4;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr2[i5];
                        U uPoll2 = null;
                        while (!checkTerminate()) {
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                            if (simpleQueue == null) {
                                innerSubscriberArr = innerSubscriberArr2;
                                i = length;
                            } else {
                                innerSubscriberArr = innerSubscriberArr2;
                                i = length;
                                long j8 = j4;
                                while (jAddAndGet != j4) {
                                    try {
                                        uPoll2 = simpleQueue.poll();
                                        if (uPoll2 == null) {
                                            break;
                                        }
                                        subscriber.onNext(uPoll2);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j8++;
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        innerSubscriber.dispose();
                                        this.errs.addThrowable(th);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerSubscriber);
                                        i6++;
                                        length = i;
                                        z4 = true;
                                    }
                                }
                                if (j8 != j4) {
                                    jAddAndGet = !z2 ? this.requested.addAndGet(-j8) : kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                                    innerSubscriber.requestMore(j8);
                                    j3 = 0;
                                } else {
                                    j3 = j4;
                                }
                                if (jAddAndGet != j3 && uPoll2 != null) {
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    length = i;
                                    j4 = 0;
                                }
                            }
                            boolean z5 = innerSubscriber.done;
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j5++;
                                z4 = true;
                            }
                            if (jAddAndGet == 0) {
                                z = z4;
                                break;
                            }
                            i5++;
                            length = i;
                            if (i5 == length) {
                                i5 = 0;
                            }
                            i6++;
                            innerSubscriberArr2 = innerSubscriberArr;
                            j4 = 0;
                        }
                        return;
                    }
                    this.lastIndex = i5;
                    this.lastId = innerSubscriberArr[i5].id;
                    j2 = j5;
                    j = 0;
                } else {
                    j = 0;
                    j2 = j5;
                    z = false;
                }
                if (j2 != j && !this.cancelled) {
                    this.upstream.request(j2);
                }
                if (z) {
                    iAddAndGet = i2;
                } else {
                    iAddAndGet = addAndGet(-i2);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            java.lang.Throwable thTerminate = this.errs.terminate();
            if (thTerminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        void clearScalarQueue() {
            io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        void disposeAll() {
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] andSet;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            java.lang.Throwable thTerminate = this.errs.terminate();
            if (thTerminate == null || thTerminate == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(thTerminate);
        }

        void innerError(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber, java.lang.Throwable th) {
            if (this.errs.addThrowable(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber2.dispose();
                    }
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    static final class InnerSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> parent;
        long produced;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerSubscriber(io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            int i = mergeSubscriber.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
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
                    }
                }
                subscription.request(this.bufferSize);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        void requestMore(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= this.limit) {
                    this.produced = 0L;
                    get().request(j2);
                } else {
                    this.produced = j2;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
