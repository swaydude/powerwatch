package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
public final class BehaviorProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    long index;
    final java.util.concurrent.locks.ReadWriteLock lock;
    final java.util.concurrent.locks.Lock readLock;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> terminalEvent;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> value;
    final java.util.concurrent.locks.Lock writeLock;
    static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] EMPTY = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[0];
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] TERMINATED = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.BehaviorProcessor<T> create() {
        return new io.reactivex.processors.BehaviorProcessor<>();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.BehaviorProcessor<T> createDefault(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null");
        return new io.reactivex.processors.BehaviorProcessor<>(t);
    }

    BehaviorProcessor() {
        this.value = new java.util.concurrent.atomic.AtomicReference<>();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        this.terminalEvent = new java.util.concurrent.atomic.AtomicReference<>();
    }

    BehaviorProcessor(T t) {
        this();
        this.value.lazySet(io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null"));
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<>(subscriber, this);
        subscriber.onSubscribe(behaviorSubscription);
        if (add(behaviorSubscription)) {
            if (behaviorSubscription.cancelled) {
                remove(behaviorSubscription);
                return;
            } else {
                behaviorSubscription.emitFirst();
                return;
            }
        }
        java.lang.Throwable th = this.terminalEvent.get();
        if (th == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
            subscriber.onComplete();
        } else {
            subscriber.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.terminalEvent.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.terminalEvent.get() != null) {
            return;
        }
        java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
        setCurrent(next);
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : this.subscribers.get()) {
            behaviorSubscription.emitNext(next, this.index);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.terminalEvent.compareAndSet(null, th)) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        java.lang.Object objError = io.reactivex.internal.util.NotificationLite.error(th);
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : terminate(objError)) {
            behaviorSubscription.emitNext(objError, this.index);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.terminalEvent.compareAndSet(null, io.reactivex.internal.util.ExceptionHelper.TERMINATED)) {
            java.lang.Object objComplete = io.reactivex.internal.util.NotificationLite.complete();
            for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : terminate(objComplete)) {
                behaviorSubscription.emitNext(objComplete, this.index);
            }
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr = this.subscribers.get();
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.isFull()) {
                return false;
            }
        }
        java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
        setCurrent(next);
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.emitNext(next, this.index);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    int subscriberCount() {
        return this.subscribers.get().length;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.value.get();
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public T getValue() {
        java.lang.Object obj = this.value.get();
        if (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return null;
        }
        return (T) io.reactivex.internal.util.NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public java.lang.Object[] getValues() {
        java.lang.Object[] objArr = EMPTY_ARRAY;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public T[] getValues(T[] tArr) {
        java.lang.Object obj = this.value.get();
        if (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        }
        java.lang.Object value = io.reactivex.internal.util.NotificationLite.getValue(obj);
        if (tArr.length != 0) {
            tArr[0] = value;
            if (tArr.length == 1) {
                return tArr;
            }
            tArr[1] = 0;
            return tArr;
        }
        T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
        tArr2[0] = value;
        return tArr2;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.value.get());
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.value.get());
    }

    public boolean hasValue() {
        java.lang.Object obj = this.value.get();
        return (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    boolean add(io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr;
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.subscribers.get();
            if (behaviorSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[length + 1];
            java.lang.System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!this.subscribers.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    void remove(io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr;
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.subscribers.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (behaviorSubscriptionArr[i2] == behaviorSubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = EMPTY;
            } else {
                io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr3 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[length - 1];
                java.lang.System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(behaviorSubscriptionArr, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] terminate(java.lang.Object obj) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] andSet = this.subscribers.get();
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr = TERMINATED;
        if (andSet != behaviorSubscriptionArr && (andSet = this.subscribers.getAndSet(behaviorSubscriptionArr)) != behaviorSubscriptionArr) {
            setCurrent(obj);
        }
        return andSet;
    }

    void setCurrent(java.lang.Object obj) {
        java.util.concurrent.locks.Lock lock = this.writeLock;
        lock.lock();
        this.index++;
        this.value.lazySet(obj);
        lock.unlock();
    }

    static final class BehaviorSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final org.reactivestreams.Subscriber<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
        final io.reactivex.processors.BehaviorProcessor<T> state;

        BehaviorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = subscriber;
            this.state = behaviorProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        void emitFirst() {
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                if (this.cancelled) {
                    return;
                }
                if (this.next) {
                    return;
                }
                io.reactivex.processors.BehaviorProcessor<T> behaviorProcessor = this.state;
                java.util.concurrent.locks.Lock lock = behaviorProcessor.readLock;
                lock.lock();
                this.index = behaviorProcessor.index;
                java.lang.Object obj = behaviorProcessor.value.get();
                lock.unlock();
                this.emitting = obj != null;
                this.next = true;
                if (obj == null || test(obj)) {
                    return;
                }
                emitLoop();
            }
        }

        void emitNext(java.lang.Object obj, long j) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.index == j) {
                        return;
                    }
                    if (this.emitting) {
                        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(obj);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(java.lang.Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            }
            if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
                this.downstream.onError(io.reactivex.internal.util.NotificationLite.getError(obj));
                return true;
            }
            long j = get();
            if (j != 0) {
                this.downstream.onNext((java.lang.Object) io.reactivex.internal.util.NotificationLite.getValue(obj));
                if (j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    return false;
                }
                decrementAndGet();
                return false;
            }
            cancel();
            this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
            return true;
        }

        void emitLoop() {
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
            while (!this.cancelled) {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }

        public boolean isFull() {
            return get() == 0;
        }
    }
}
