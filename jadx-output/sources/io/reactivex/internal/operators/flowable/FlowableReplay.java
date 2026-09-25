package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReplay<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T>, io.reactivex.internal.disposables.ResettableConnectable {
    static final java.util.concurrent.Callable DEFAULT_UNBOUNDED_FACTORY = new io.reactivex.internal.operators.flowable.FlowableReplay.DefaultUnboundedFactory();
    final java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> bufferFactory;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> current;
    final org.reactivestreams.Publisher<T> onSubscribe;
    final io.reactivex.Flowable<T> source;

    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable th);

        void next(T t);

        void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription);
    }

    public static <U, R> io.reactivex.Flowable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableReplay.MulticastFlowable(callable, function);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> observeOn(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, io.reactivex.Scheduler scheduler) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowableReplay.ConnectableFlowableReplay(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> createFrom(io.reactivex.Flowable<? extends T> flowable) {
        return create(flowable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, int i) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(flowable);
        }
        return create(flowable, new io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBufferTask(i));
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return create(flowable, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return create(flowable, new io.reactivex.internal.operators.flowable.FlowableReplay.ScheduledReplayBufferTask(i, j, timeUnit, scheduler));
    }

    static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowableReplay(new io.reactivex.internal.operators.flowable.FlowableReplay.ReplayPublisher(atomicReference, callable), flowable, atomicReference, callable));
    }

    private FlowableReplay(org.reactivestreams.Publisher<T> publisher, io.reactivex.Flowable<T> flowable, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> atomicReference, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
        this.onSubscribe = publisher;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferFactory = callable;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.onSubscribe.subscribe(subscriber);
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(io.reactivex.disposables.Disposable disposable) {
        this.current.compareAndSet((io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber) disposable, null);
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.current.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber2 = new io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<>(this.bufferFactory.call());
                if (this.current.compareAndSet(replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
        }
        boolean z = !replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z) {
                this.source.subscribe((io.reactivex.FlowableSubscriber) replaySubscriber);
            }
        } catch (java.lang.Throwable th2) {
            if (z) {
                replaySubscriber.shouldConnect.compareAndSet(true, false);
            }
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th2);
        }
    }

    static final class ReplaySubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] EMPTY = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[0];
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] TERMINATED = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> buffer;
        boolean done;
        long maxChildRequested;
        long maxUpstreamRequested;
        final java.util.concurrent.atomic.AtomicInteger management = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect = new java.util.concurrent.atomic.AtomicBoolean();

        ReplaySubscriber(io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.set(TERMINATED);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr2;
            java.util.Objects.requireNonNull(innerSubscription);
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[length + 1];
                java.lang.System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        void remove(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerSubscriptionArr[i2].equals(innerSubscription)) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = EMPTY;
                } else {
                    io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[length - 1];
                    java.lang.System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                manageRequests();
                for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.replay(innerSubscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.next(t);
            for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                    this.buffer.replay(innerSubscription);
                }
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
            this.buffer.complete();
            for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        void manageRequests() {
            if (this.management.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                long j = this.maxChildRequested;
                long jMax = j;
                for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                    jMax = java.lang.Math.max(jMax, innerSubscription.totalRequested.get());
                }
                long j2 = this.maxUpstreamRequested;
                org.reactivestreams.Subscription subscription = get();
                long j3 = jMax - j;
                if (j3 != 0) {
                    this.maxChildRequested = jMax;
                    if (subscription == null) {
                        long j4 = j2 + j3;
                        if (j4 < 0) {
                            j4 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                        }
                        this.maxUpstreamRequested = j4;
                    } else if (j2 != 0) {
                        this.maxUpstreamRequested = 0L;
                        subscription.request(j2 + j3);
                    } else {
                        subscription.request(j3);
                    }
                } else if (j2 != 0 && subscription != null) {
                    this.maxUpstreamRequested = 0L;
                    subscription.request(j2);
                }
                iAddAndGet = this.management.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    static final class InnerSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.Subscriber<? super T> child;
        boolean emitting;
        java.lang.Object index;
        boolean missed;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> parent;
        final java.util.concurrent.atomic.AtomicLong totalRequested = new java.util.concurrent.atomic.AtomicLong();

        InnerSubscription(io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.parent = replaySubscriber;
            this.child = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (!io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) || io.reactivex.internal.util.BackpressureHelper.addCancel(this, j) == Long.MIN_VALUE) {
                return;
            }
            io.reactivex.internal.util.BackpressureHelper.add(this.totalRequested, j);
            this.parent.manageRequests();
            this.parent.buffer.replay(this);
        }

        public long produced(long j) {
            return io.reactivex.internal.util.BackpressureHelper.producedCancel(this, j);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.manageRequests();
                this.index = null;
            }
        }

        <U> U index() {
            return (U) this.index;
        }
    }

    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void next(T t) {
            add(io.reactivex.internal.util.NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void error(java.lang.Throwable th) {
            add(io.reactivex.internal.util.NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void complete() {
            add(io.reactivex.internal.util.NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
                org.reactivestreams.Subscriber<? super T> subscriber = innerSubscription.child;
                while (!innerSubscription.isDisposed()) {
                    int i = this.size;
                    java.lang.Integer num = (java.lang.Integer) innerSubscription.index();
                    int iIntValue = num != null ? num.intValue() : 0;
                    long j = innerSubscription.get();
                    long j2 = j;
                    long j3 = 0;
                    while (j2 != 0 && iIntValue < i) {
                        java.lang.Object obj = get(iIntValue);
                        try {
                            if (io.reactivex.internal.util.NotificationLite.accept(obj, subscriber) || innerSubscription.isDisposed()) {
                                return;
                            }
                            iIntValue++;
                            j2--;
                            j3++;
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            innerSubscription.dispose();
                            if (io.reactivex.internal.util.NotificationLite.isError(obj) || io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                                return;
                            }
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        innerSubscription.index = java.lang.Integer.valueOf(iIntValue);
                        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                            innerSubscription.produced(j3);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.missed) {
                            innerSubscription.emitting = false;
                            return;
                        }
                        innerSubscription.missed = false;
                    }
                }
            }
        }
    }

    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final java.lang.Object value;

        Node(java.lang.Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    static class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        io.reactivex.internal.operators.flowable.FlowableReplay.Node tail;

        java.lang.Object enterTransform(java.lang.Object obj) {
            return obj;
        }

        java.lang.Object leaveTransform(java.lang.Object obj) {
            return obj;
        }

        void truncate() {
        }

        BoundedReplayBuffer() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(null, 0L);
            this.tail = node;
            set(node);
        }

        final void addLast(io.reactivex.internal.operators.flowable.FlowableReplay.Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        final void removeFirst() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get().get();
            if (node == null) {
                throw new java.lang.IllegalStateException("Empty list!");
            }
            this.size--;
            setFirst(node);
        }

        final void removeSome(int i) {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
        }

        final void setFirst(io.reactivex.internal.operators.flowable.FlowableReplay.Node node) {
            set(node);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void next(T t) {
            java.lang.Object objEnterTransform = enterTransform(io.reactivex.internal.util.NotificationLite.next(t));
            long j = this.index + 1;
            this.index = j;
            addLast(new io.reactivex.internal.operators.flowable.FlowableReplay.Node(objEnterTransform, j));
            truncate();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void error(java.lang.Throwable th) {
            java.lang.Object objEnterTransform = enterTransform(io.reactivex.internal.util.NotificationLite.error(th));
            long j = this.index + 1;
            this.index = j;
            addLast(new io.reactivex.internal.operators.flowable.FlowableReplay.Node(objEnterTransform, j));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            java.lang.Object objEnterTransform = enterTransform(io.reactivex.internal.util.NotificationLite.complete());
            long j = this.index + 1;
            this.index = j;
            addLast(new io.reactivex.internal.operators.flowable.FlowableReplay.Node(objEnterTransform, j));
            truncateFinal();
        }

        final void trimHead() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get();
            if (node.value != null) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
                while (!innerSubscription.isDisposed()) {
                    long j = innerSubscription.get();
                    boolean z = j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                    io.reactivex.internal.operators.flowable.FlowableReplay.Node head = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) innerSubscription.index();
                    if (head == null) {
                        head = getHead();
                        innerSubscription.index = head;
                        io.reactivex.internal.util.BackpressureHelper.add(innerSubscription.totalRequested, head.index);
                    }
                    long j2 = 0;
                    while (j != 0 && (node = head.get()) != null) {
                        java.lang.Object objLeaveTransform = leaveTransform(node.value);
                        try {
                            if (io.reactivex.internal.util.NotificationLite.accept(objLeaveTransform, innerSubscription.child)) {
                                innerSubscription.index = null;
                                return;
                            }
                            j2++;
                            j--;
                            if (innerSubscription.isDisposed()) {
                                innerSubscription.index = null;
                                return;
                            }
                            head = node;
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            innerSubscription.index = null;
                            innerSubscription.dispose();
                            if (io.reactivex.internal.util.NotificationLite.isError(objLeaveTransform) || io.reactivex.internal.util.NotificationLite.isComplete(objLeaveTransform)) {
                                return;
                            }
                            innerSubscription.child.onError(th);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        innerSubscription.index = head;
                        if (!z) {
                            innerSubscription.produced(j2);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.missed) {
                            innerSubscription.emitting = false;
                            return;
                        }
                        innerSubscription.missed = false;
                    }
                }
                innerSubscription.index = null;
            }
        }

        void truncateFinal() {
            trimHead();
        }

        final void collect(java.util.Collection<? super T> collection) {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node head = getHead();
            while (true) {
                head = head.get();
                if (head == null) {
                    return;
                }
                java.lang.Object objLeaveTransform = leaveTransform(head.value);
                if (io.reactivex.internal.util.NotificationLite.isComplete(objLeaveTransform) || io.reactivex.internal.util.NotificationLite.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add((java.lang.Object) io.reactivex.internal.util.NotificationLite.getValue(objLeaveTransform));
                }
            }
        }

        boolean hasError() {
            return this.tail.value != null && io.reactivex.internal.util.NotificationLite.isError(leaveTransform(this.tail.value));
        }

        boolean hasCompleted() {
            return this.tail.value != null && io.reactivex.internal.util.NotificationLite.isComplete(leaveTransform(this.tail.value));
        }

        io.reactivex.internal.operators.flowable.FlowableReplay.Node getHead() {
            return get();
        }
    }

    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        java.lang.Object enterTransform(java.lang.Object obj) {
            return new io.reactivex.schedulers.Timed(obj, this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        java.lang.Object leaveTransform(java.lang.Object obj) {
            return ((io.reactivex.schedulers.Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    if (this.size <= this.limit) {
                        if (((io.reactivex.schedulers.Timed) node2.value).time() > jNow) {
                            break;
                        }
                        i++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.size--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncateFinal() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((io.reactivex.schedulers.Timed) node2.value).time() > jNow) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        io.reactivex.internal.operators.flowable.FlowableReplay.Node getHead() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2.get();
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                io.reactivex.schedulers.Timed timed = (io.reactivex.schedulers.Timed) node2.value;
                if (io.reactivex.internal.util.NotificationLite.isComplete(timed.value()) || io.reactivex.internal.util.NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }
    }

    static final class MulticastFlowable<R, U> extends io.reactivex.Flowable<R> {
        private final java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> connectableFactory;
        private final io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> selector;

        MulticastFlowable(java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> function) {
            this.connectableFactory = callable;
            this.selector = function;
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
            try {
                io.reactivex.flowables.ConnectableFlowable connectableFlowable = (io.reactivex.flowables.ConnectableFlowable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.connectableFactory.call(), "The connectableFactory returned null");
                try {
                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(connectableFlowable), "The selector returned a null Publisher");
                    io.reactivex.internal.subscribers.SubscriberResourceWrapper subscriberResourceWrapper = new io.reactivex.internal.subscribers.SubscriberResourceWrapper(subscriber);
                    publisher.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new io.reactivex.internal.operators.flowable.FlowableReplay.MulticastFlowable.DisposableConsumer(subscriberResourceWrapper));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
            }
        }

        final class DisposableConsumer implements io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
            private final io.reactivex.internal.subscribers.SubscriberResourceWrapper<R> srw;

            DisposableConsumer(io.reactivex.internal.subscribers.SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.srw = subscriberResourceWrapper;
            }

            @Override // io.reactivex.functions.Consumer
            public void accept(io.reactivex.disposables.Disposable disposable) {
                this.srw.setResource(disposable);
            }
        }
    }

    static final class ConnectableFlowableReplay<T> extends io.reactivex.flowables.ConnectableFlowable<T> {
        private final io.reactivex.flowables.ConnectableFlowable<T> cf;
        private final io.reactivex.Flowable<T> flowable;

        ConnectableFlowableReplay(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, io.reactivex.Flowable<T> flowable) {
            this.cf = connectableFlowable;
            this.flowable = flowable;
        }

        @Override // io.reactivex.flowables.ConnectableFlowable
        public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.cf.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.flowable.subscribe(subscriber);
        }
    }

    static final class ReplayBufferTask<T> implements java.util.concurrent.Callable<io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> {
        private final int bufferSize;

        ReplayBufferTask(int i) {
            this.bufferSize = i;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> call() {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.SizeBoundReplayBuffer(this.bufferSize);
        }
    }

    static final class ScheduledReplayBufferTask<T> implements java.util.concurrent.Callable<io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> {
        private final int bufferSize;
        private final long maxAge;
        private final io.reactivex.Scheduler scheduler;
        private final java.util.concurrent.TimeUnit unit;

        ScheduledReplayBufferTask(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.bufferSize = i;
            this.maxAge = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> call() {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.SizeAndTimeBoundReplayBuffer(this.bufferSize, this.maxAge, this.unit, this.scheduler);
        }
    }

    static final class ReplayPublisher<T> implements org.reactivestreams.Publisher<T> {
        private final java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> bufferFactory;
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> curr;

        ReplayPublisher(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> atomicReference, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
            this.curr = atomicReference;
            this.bufferFactory = callable;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber;
            while (true) {
                replaySubscriber = this.curr.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber2 = new io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<>(this.bufferFactory.call());
                    if (this.curr.compareAndSet(null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    return;
                }
            }
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<>(replaySubscriber, subscriber);
            subscriber.onSubscribe(innerSubscription);
            replaySubscriber.add(innerSubscription);
            if (innerSubscription.isDisposed()) {
                replaySubscriber.remove(innerSubscription);
            } else {
                replaySubscriber.manageRequests();
                replaySubscriber.buffer.replay(innerSubscription);
            }
        }
    }

    static final class DefaultUnboundedFactory implements java.util.concurrent.Callable<java.lang.Object> {
        DefaultUnboundedFactory() {
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.UnboundedReplayBuffer(16);
        }
    }
}
