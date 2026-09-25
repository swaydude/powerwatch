package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplaySubject<T> extends io.reactivex.subjects.Subject<T> {
    final io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> buffer;
    boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] EMPTY = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[0];
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] TERMINATED = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[0];
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];

    interface ReplayBuffer<T> {
        void add(T t);

        void addFinal(java.lang.Object obj);

        boolean compareAndSet(java.lang.Object obj, java.lang.Object obj2);

        java.lang.Object get();

        T getValue();

        T[] getValues(T[] tArr);

        void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable);

        int size();

        void trimHead();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> create() {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.UnboundedReplayBuffer(16));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> create(int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.UnboundedReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithSize(int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeBoundReplayBuffer(i));
    }

    static <T> io.reactivex.subjects.ReplaySubject<T> createUnbounded() {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    ReplaySubject(io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable = new io.reactivex.subjects.ReplaySubject.ReplayDisposable<>(observer, this);
        observer.onSubscribe(replayDisposable);
        if (replayDisposable.cancelled) {
            return;
        }
        if (add(replayDisposable) && replayDisposable.cancelled) {
            remove(replayDisposable);
        } else {
            this.buffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.done) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            return;
        }
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.add(t);
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : this.observers.get()) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        java.lang.Object objError = io.reactivex.internal.util.NotificationLite.error(th);
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(objError);
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : terminate(objError)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        java.lang.Object objComplete = io.reactivex.internal.util.NotificationLite.complete();
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(objComplete);
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : terminate(objComplete)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    int observerCount() {
        return this.observers.get().length;
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.buffer.get();
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public T getValue() {
        return this.buffer.getValue();
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
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

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.buffer.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.buffer.get());
    }

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    int size() {
        return this.buffer.size();
    }

    boolean add(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            if (replayDisposableArr == TERMINATED) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[length + 1];
            java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            if (replayDisposableArr == TERMINATED || replayDisposableArr == EMPTY) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (replayDisposableArr[i2] == replayDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr3 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[length - 1];
                java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                java.lang.System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] terminate(java.lang.Object obj) {
        if (this.buffer.compareAndSet(null, obj)) {
            return this.observers.getAndSet(TERMINATED);
        }
        return TERMINATED;
    }

    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> downstream;
        java.lang.Object index;
        final io.reactivex.subjects.ReplaySubject<T> state;

        ReplayDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.ReplaySubject<T> replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    static final class UnboundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final java.util.List<java.lang.Object> buffer;
        volatile boolean done;
        volatile int size;

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
        }

        UnboundedReplayBuffer(int i) {
            this.buffer = new java.util.ArrayList(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            java.util.List<java.lang.Object> list = this.buffer;
            T t = (T) list.get(i - 1);
            if (!io.reactivex.internal.util.NotificationLite.isComplete(t) && !io.reactivex.internal.util.NotificationLite.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            java.util.List<java.lang.Object> list = this.buffer;
            java.lang.Object obj = list.get(i - 1);
            if ((io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) && (i = i - 1) == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            int i;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            java.util.List<java.lang.Object> list = this.buffer;
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            java.lang.Integer num = (java.lang.Integer) replayDisposable.index;
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                replayDisposable.index = 0;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.cancelled) {
                int i2 = this.size;
                while (i2 != iIntValue) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    }
                    java.lang.Object obj = list.get(iIntValue);
                    if (this.done && (i = iIntValue + 1) == i2 && i == (i2 = this.size)) {
                        if (io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                            observer.onComplete();
                        } else {
                            observer.onError(io.reactivex.internal.util.NotificationLite.getError(obj));
                        }
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    }
                    observer.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.size) {
                    replayDisposable.index = java.lang.Integer.valueOf(iIntValue);
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            java.lang.Object obj = this.buffer.get(i2);
            return (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? i2 : i;
        }
    }

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> head;
        final int maxSize;
        int size;
        io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> tail;

        SizeBoundReplayBuffer(int i) {
            this.maxSize = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(null);
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(t);
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object obj) {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(obj);
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.head;
            if (node.value != null) {
                io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = new io.reactivex.subjects.ReplaySubject.Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T getValue() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.head;
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = null;
            while (true) {
                io.reactivex.subjects.ReplaySubject.Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t = (T) node.value;
            if (t == null) {
                return null;
            }
            return (io.reactivex.internal.util.NotificationLite.isComplete(t) || io.reactivex.internal.util.NotificationLite.isError(t)) ? (T) node2.value : t;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            io.reactivex.subjects.ReplaySubject.Node<T> node = this.head;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    node = node.get();
                    tArr[i] = node.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = (io.reactivex.subjects.ReplaySubject.Node) replayDisposable.index;
            if (node == null) {
                node = this.head;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.cancelled) {
                io.reactivex.subjects.ReplaySubject.Node<T> node2 = node.get();
                if (node2 != null) {
                    T t = node2.value;
                    if (this.done && node2.get() == null) {
                        if (io.reactivex.internal.util.NotificationLite.isComplete(t)) {
                            observer.onComplete();
                        } else {
                            observer.onError(io.reactivex.internal.util.NotificationLite.getError(t));
                        }
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    }
                    observer.onNext(t);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.index = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                io.reactivex.subjects.ReplaySubject.Node<T> node2 = node.get();
                if (node2 == null) {
                    java.lang.Object obj = node.value;
                    return (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? i - 1 : i;
                }
                i++;
                node = node2;
            }
            return i;
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> tail;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.maxSize = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            this.maxAge = io.reactivex.internal.functions.ObjectHelper.verifyPositive(j, "maxAge");
            this.unit = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
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
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.head;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode2 = timedNode.get();
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
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.head;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value != null) {
                        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode3 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                if (timedNode2.time > jNow) {
                    if (timedNode.value != null) {
                        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode4 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                        timedNode4.lazySet(timedNode.get());
                        this.head = timedNode4;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(t, this.scheduler.now(this.unit));
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object obj) {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(obj, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            trimFinal();
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.head;
            if (timedNode.value != null) {
                io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T getValue() {
            T t;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.head;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = null;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.time >= this.scheduler.now(this.unit) - this.maxAge && (t = (T) timedNode.value) != null) {
                return (io.reactivex.internal.util.NotificationLite.isComplete(t) || io.reactivex.internal.util.NotificationLite.isError(t)) ? (T) timedNode2.value : t;
            }
            return null;
        }

        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> getHead() {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.head;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > jNow) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            io.reactivex.subjects.ReplaySubject.TimedNode<T> head = getHead();
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> head = (io.reactivex.subjects.ReplaySubject.TimedNode) replayDisposable.index;
            if (head == null) {
                head = getHead();
            }
            int iAddAndGet = 1;
            while (!replayDisposable.cancelled) {
                while (true) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    }
                    io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode = head.get();
                    if (timedNode == null) {
                        break;
                    }
                    T t = timedNode.value;
                    if (this.done && timedNode.get() == null) {
                        if (io.reactivex.internal.util.NotificationLite.isComplete(t)) {
                            observer.onComplete();
                        } else {
                            observer.onError(io.reactivex.internal.util.NotificationLite.getError(t));
                        }
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    }
                    observer.onNext(t);
                    head = timedNode;
                }
                if (head.get() == null) {
                    replayDisposable.index = head;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        int size(io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    java.lang.Object obj = timedNode.value;
                    return (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? i - 1 : i;
                }
                i++;
                timedNode = timedNode2;
            }
            return i;
        }
    }
}
