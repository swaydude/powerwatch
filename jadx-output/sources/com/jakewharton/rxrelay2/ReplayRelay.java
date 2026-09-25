package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayRelay<T> extends com.jakewharton.rxrelay2.Relay<T> {
    static final com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable[] EMPTY = new com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable[0];
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    final com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> buffer;
    final java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

    interface ReplayBuffer<T> {
        void add(T t);

        T getValue();

        T[] getValues(T[] tArr);

        void replay(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable);

        int size();

        void trimHead();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.ReplayRelay<T> create() {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.UnboundedReplayBuffer(16));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.ReplayRelay<T> create(int i) {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.UnboundedReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.ReplayRelay<T> createWithSize(int i) {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.SizeBoundReplayBuffer(i));
    }

    static <T> com.jakewharton.rxrelay2.ReplayRelay<T> createUnbounded() {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.ReplayRelay<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.ReplayRelay<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return new com.jakewharton.rxrelay2.ReplayRelay<>(new com.jakewharton.rxrelay2.ReplayRelay.SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    ReplayRelay(com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable = new com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<>(observer, this);
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

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        java.util.Objects.requireNonNull(t, "value == null");
        com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.add(t);
        for (com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable : this.observers.get()) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    int observerCount() {
        return this.observers.get().length;
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

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    int size() {
        return this.buffer.size();
    }

    boolean add(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable) {
        com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[] replayDisposableArr;
        com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable[length + 1];
            java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
        return true;
    }

    void remove(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable) {
        com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[] replayDisposableArr;
        com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            if (replayDisposableArr == EMPTY) {
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
                com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T>[] replayDisposableArr3 = new com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable[length - 1];
                java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                java.lang.System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> downstream;
        java.lang.Object index;
        final com.jakewharton.rxrelay2.ReplayRelay<T> state;

        ReplayDisposable(io.reactivex.Observer<? super T> observer, com.jakewharton.rxrelay2.ReplayRelay<T> replayRelay) {
            this.downstream = observer;
            this.state = replayRelay;
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

    static final class UnboundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final java.util.List<T> buffer;
        volatile int size;

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void trimHead() {
        }

        UnboundedReplayBuffer(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("capacityHint <= 0");
            }
            this.buffer = new java.util.ArrayList(i);
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T getValue() {
            int i = this.size;
            if (i != 0) {
                return this.buffer.get(i - 1);
            }
            return null;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            java.util.List<T> list = this.buffer;
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void replay(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            java.util.List<T> list = this.buffer;
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            java.lang.Integer num = (java.lang.Integer) replayDisposable.index;
            int iIntValue = 0;
            int iAddAndGet = 1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                replayDisposable.index = 0;
            }
            while (!replayDisposable.cancelled) {
                int i = this.size;
                while (i != iIntValue) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    } else {
                        observer.onNext(list.get(iIntValue));
                        iIntValue++;
                    }
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public int size() {
            return this.size;
        }
    }

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.ReplayRelay.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile com.jakewharton.rxrelay2.ReplayRelay.Node<T> head;
        final int maxSize;
        int size;
        com.jakewharton.rxrelay2.ReplayRelay.Node<T> tail;

        SizeBoundReplayBuffer(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("maxSize > 0 required but it was " + i);
            }
            this.maxSize = i;
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = new com.jakewharton.rxrelay2.ReplayRelay.Node<>(null);
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void add(T t) {
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = new com.jakewharton.rxrelay2.ReplayRelay.Node<>(t);
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void trimHead() {
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = this.head;
            if (node.value != null) {
                com.jakewharton.rxrelay2.ReplayRelay.Node<T> node2 = new com.jakewharton.rxrelay2.ReplayRelay.Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T getValue() {
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = this.head;
            while (true) {
                com.jakewharton.rxrelay2.ReplayRelay.Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T[] getValues(T[] tArr) {
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = this.head;
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void replay(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = (com.jakewharton.rxrelay2.ReplayRelay.Node) replayDisposable.index;
            if (node == null) {
                node = this.head;
            }
            while (!replayDisposable.cancelled) {
                com.jakewharton.rxrelay2.ReplayRelay.Node<T> node2 = node.get();
                if (node2 != null) {
                    observer.onNext(node2.value);
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public int size() {
            com.jakewharton.rxrelay2.ReplayRelay.Node<T> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = node.get()) != null) {
                i++;
            }
            return i;
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> tail;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("maxSize > 0 required but it was " + i);
            }
            if (j <= 0) {
                throw new java.lang.IllegalArgumentException("maxAge > 0 required but it was " + j);
            }
            java.util.Objects.requireNonNull(timeUnit, "unit == null");
            java.util.Objects.requireNonNull(scheduler, "scheduler == null");
            this.maxSize = i;
            this.maxAge = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = new com.jakewharton.rxrelay2.ReplayRelay.TimedNode<>(null, 0L);
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
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = this.head;
            while (true) {
                com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode2 = timedNode.get();
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void add(T t) {
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = new com.jakewharton.rxrelay2.ReplayRelay.TimedNode<>(t, this.scheduler.now(this.unit));
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void trimHead() {
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = this.head;
            if (timedNode.value != null) {
                com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode2 = new com.jakewharton.rxrelay2.ReplayRelay.TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T getValue() {
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = this.head;
            while (true) {
                com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode2 = timedNode.get();
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

        com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> getHead() {
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode;
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode2 = this.head;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > jNow) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public T[] getValues(T[] tArr) {
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> head = getHead();
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public void replay(com.jakewharton.rxrelay2.ReplayRelay.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            io.reactivex.Observer<? super T> observer = replayDisposable.downstream;
            com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> head = (com.jakewharton.rxrelay2.ReplayRelay.TimedNode) replayDisposable.index;
            if (head == null) {
                head = getHead();
            }
            while (!replayDisposable.cancelled) {
                while (true) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    }
                    com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode = head.get();
                    if (timedNode == null) {
                        break;
                    }
                    observer.onNext(timedNode.value);
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

        @Override // com.jakewharton.rxrelay2.ReplayRelay.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        int size(com.jakewharton.rxrelay2.ReplayRelay.TimedNode<T> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i++;
            }
            return i;
        }
    }
}
