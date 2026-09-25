package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> buffer;
    boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] EMPTY = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[0];
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] TERMINATED = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[0];

    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable th);

        java.lang.Throwable getError();

        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t);

        void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription);

        int size();

        void trimHead();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create() {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.UnboundedReplayBuffer(16));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create(int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.UnboundedReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithSize(int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeBoundReplayBuffer(i));
    }

    static <T> io.reactivex.processors.ReplayProcessor<T> createUnbounded() {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    ReplayProcessor(io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription = new io.reactivex.processors.ReplayProcessor.ReplaySubscription<>(subscriber, this);
        subscriber.onSubscribe(replaySubscription);
        if (add(replaySubscription) && replaySubscription.cancelled) {
            remove(replaySubscription);
        } else {
            this.buffer.replay(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.done) {
            subscription.cancel();
        } else {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            return;
        }
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.next(t);
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.subscribers.get()) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.error(th);
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.complete();
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
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
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone()) {
            return replayBuffer.getError();
        }
        return null;
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    public T getValue() {
        return this.buffer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object[] getValues() {
        java.lang.Object[] objArr = EMPTY_ARRAY;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() != null;
    }

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    int size() {
        return this.buffer.size();
    }

    boolean add(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr;
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[length + 1];
            java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!this.subscribers.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    void remove(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr;
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED || replaySubscriptionArr == EMPTY) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (replaySubscriptionArr[i2] == replaySubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = EMPTY;
            } else {
                io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr3 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[length - 1];
                java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                java.lang.System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
    }

    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final org.reactivestreams.Subscriber<? super T> downstream;
        long emitted;
        java.lang.Object index;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.processors.ReplayProcessor<T> state;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.ReplayProcessor<T> replayProcessor) {
            this.downstream = subscriber;
            this.state = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                this.state.buffer.replay(this);
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
    }

    static final class UnboundedReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        final java.util.List<T> buffer;
        volatile boolean done;
        java.lang.Throwable error;
        volatile int size;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
        }

        UnboundedReplayBuffer(int i) {
            this.buffer = new java.util.ArrayList(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            return this.buffer.get(i - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            java.util.List<T> list = this.buffer;
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            java.util.List<T> list = this.buffer;
            org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.downstream;
            java.lang.Integer num = (java.lang.Integer) replaySubscription.index;
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                replaySubscription.index = 0;
            }
            long j = replaySubscription.emitted;
            int iAddAndGet = 1;
            do {
                long j2 = replaySubscription.requested.get();
                while (j != j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    boolean z = this.done;
                    int i = this.size;
                    if (z && iIntValue == i) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th = this.error;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i) {
                        break;
                    }
                    subscriber.onNext(list.get(iIntValue));
                    iIntValue++;
                    j++;
                }
                if (j == j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    boolean z2 = this.done;
                    int i2 = this.size;
                    if (z2 && iIntValue == i2) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th2 = this.error;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.index = java.lang.Integer.valueOf(iIntValue);
                replaySubscription.emitted = j;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return this.size;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
            return this.error;
        }
    }

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        volatile io.reactivex.processors.ReplayProcessor.Node<T> head;
        final int maxSize;
        int size;
        io.reactivex.processors.ReplayProcessor.Node<T> tail;

        SizeBoundReplayBuffer(int i) {
            this.maxSize = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(null);
            this.tail = node;
            this.head = node;
        }

        void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t) {
            io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(t);
            io.reactivex.processors.ReplayProcessor.Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable th) {
            this.error = th;
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(null);
                node.lazySet(this.head.get());
                this.head = node;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.head;
            while (true) {
                io.reactivex.processors.ReplayProcessor.Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.head;
            io.reactivex.processors.ReplayProcessor.Node<T> node2 = node;
            int i = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                node = node.get();
                tArr[i2] = node.value;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.downstream;
            io.reactivex.processors.ReplayProcessor.Node<T> node = (io.reactivex.processors.ReplayProcessor.Node) replaySubscription.index;
            if (node == null) {
                node = this.head;
            }
            long j = replaySubscription.emitted;
            int iAddAndGet = 1;
            do {
                long j2 = replaySubscription.requested.get();
                while (j != j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    boolean z = this.done;
                    io.reactivex.processors.ReplayProcessor.Node<T> node2 = node.get();
                    boolean z2 = node2 == null;
                    if (z && z2) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th = this.error;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(node2.value);
                    j++;
                    node = node2;
                }
                if (j == j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    if (this.done && node.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th2 = this.error;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.index = node;
                replaySubscription.emitted = j;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = node.get()) != null) {
                i++;
            }
            return i;
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        volatile io.reactivex.processors.ReplayProcessor.TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        io.reactivex.processors.ReplayProcessor.TimedNode<T> tail;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.maxSize = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            this.maxAge = io.reactivex.internal.functions.ObjectHelper.verifyPositive(j, "maxAge");
            this.unit = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = this.head;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else {
                    if (timedNode2.time > jNow) {
                        this.head = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        void trimFinal() {
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = this.head;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.head = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.head = timedNode;
                        return;
                    }
                }
                if (timedNode2.time > jNow) {
                    if (timedNode.value != null) {
                        io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode3 = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                timedNode.lazySet(this.head.get());
                this.head = timedNode;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t) {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(t, this.scheduler.now(this.unit));
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable th) {
            trimFinal();
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimFinal();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = this.head;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.time < this.scheduler.now(this.unit) - this.maxAge) {
                return null;
            }
            return timedNode.value;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> head = getHead();
            int size = size(head);
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    head = head.get();
                    tArr[i] = head.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        io.reactivex.processors.ReplayProcessor.TimedNode<T> getHead() {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = this.head;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > jNow) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.downstream;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> head = (io.reactivex.processors.ReplayProcessor.TimedNode) replaySubscription.index;
            if (head == null) {
                head = getHead();
            }
            long j = replaySubscription.emitted;
            int iAddAndGet = 1;
            do {
                long j2 = replaySubscription.requested.get();
                while (j != j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    boolean z = this.done;
                    io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = head.get();
                    boolean z2 = timedNode == null;
                    if (z && z2) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th = this.error;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(timedNode.value);
                    j++;
                    head = timedNode;
                }
                if (j == j2) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    if (this.done && head.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        java.lang.Throwable th2 = this.error;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.index = head;
                replaySubscription.emitted = j;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        int size(io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }
    }
}
