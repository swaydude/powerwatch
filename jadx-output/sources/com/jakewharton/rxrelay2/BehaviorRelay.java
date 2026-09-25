package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
public final class BehaviorRelay<T> extends com.jakewharton.rxrelay2.Relay<T> {
    long index;
    final java.util.concurrent.locks.Lock readLock;
    final java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<T> value;
    final java.util.concurrent.locks.Lock writeLock;
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    static final com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable[] EMPTY = new com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.BehaviorRelay<T> create() {
        return new com.jakewharton.rxrelay2.BehaviorRelay<>();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.BehaviorRelay<T> createDefault(T t) {
        return new com.jakewharton.rxrelay2.BehaviorRelay<>(t);
    }

    BehaviorRelay() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        this.value = new java.util.concurrent.atomic.AtomicReference<>();
    }

    BehaviorRelay(T t) {
        this();
        java.util.Objects.requireNonNull(t, "defaultValue == null");
        this.value.lazySet(t);
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T> behaviorDisposable = new com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<>(observer, this);
        observer.onSubscribe(behaviorDisposable);
        add(behaviorDisposable);
        if (behaviorDisposable.cancelled) {
            remove(behaviorDisposable);
        } else {
            behaviorDisposable.emitFirst();
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        java.util.Objects.requireNonNull(t, "value == null");
        setCurrent(t);
        for (com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T> behaviorDisposable : this.subscribers.get()) {
            behaviorDisposable.emitNext(t, this.index);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    int subscriberCount() {
        return this.subscribers.get().length;
    }

    public T getValue() {
        return this.value.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public java.lang.Object[] getValues() {
        java.lang.Object[] objArr = EMPTY_ARRAY;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    @java.lang.Deprecated
    public T[] getValues(T[] tArr) {
        T t = this.value.get();
        if (t == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length != 0) {
            tArr[0] = t;
            if (tArr.length == 1) {
                return tArr;
            }
            tArr[1] = null;
            return tArr;
        }
        T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
        tArr2[0] = t;
        return tArr2;
    }

    public boolean hasValue() {
        return this.value.get() != null;
    }

    void add(com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T> behaviorDisposable) {
        com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr;
        com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.subscribers.get();
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable[length + 1];
            java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!this.subscribers.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    void remove(com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T> behaviorDisposable) {
        com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr;
        com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.subscribers.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (behaviorDisposableArr[i2] == behaviorDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = EMPTY;
            } else {
                com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr3 = new com.jakewharton.rxrelay2.BehaviorRelay.BehaviorDisposable[length - 1];
                java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                java.lang.System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!this.subscribers.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    void setCurrent(T t) {
        this.writeLock.lock();
        this.index++;
        this.value.lazySet(t);
        this.writeLock.unlock();
    }

    static final class BehaviorDisposable<T> implements io.reactivex.disposables.Disposable, com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList.NonThrowingPredicate<T> {
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> queue;
        final com.jakewharton.rxrelay2.BehaviorRelay<T> state;

        BehaviorDisposable(io.reactivex.Observer<? super T> observer, com.jakewharton.rxrelay2.BehaviorRelay<T> behaviorRelay) {
            this.downstream = observer;
            this.state = behaviorRelay;
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
                com.jakewharton.rxrelay2.BehaviorRelay<T> behaviorRelay = this.state;
                java.util.concurrent.locks.Lock lock = behaviorRelay.readLock;
                lock.lock();
                this.index = behaviorRelay.index;
                T t = behaviorRelay.value.get();
                lock.unlock();
                this.emitting = t != null;
                this.next = true;
                if (t != null) {
                    test(t);
                    emitLoop();
                }
            }
        }

        void emitNext(T t, long j) {
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
                        com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(t);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(t);
        }

        @Override // com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(T t) {
            if (this.cancelled) {
                return false;
            }
            this.downstream.onNext(t);
            return false;
        }

        void emitLoop() {
            com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList;
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
    }
}
