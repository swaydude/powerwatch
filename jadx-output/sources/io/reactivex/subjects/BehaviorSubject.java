package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class BehaviorSubject<T> extends io.reactivex.subjects.Subject<T> {
    long index;
    final java.util.concurrent.locks.ReadWriteLock lock;
    final java.util.concurrent.locks.Lock readLock;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> terminalEvent;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> value;
    final java.util.concurrent.locks.Lock writeLock;
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] EMPTY = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[0];
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] TERMINATED = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> create() {
        return new io.reactivex.subjects.BehaviorSubject<>();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> createDefault(T t) {
        return new io.reactivex.subjects.BehaviorSubject<>(t);
    }

    BehaviorSubject() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        this.value = new java.util.concurrent.atomic.AtomicReference<>();
        this.terminalEvent = new java.util.concurrent.atomic.AtomicReference<>();
    }

    BehaviorSubject(T t) {
        this();
        this.value.lazySet(io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null"));
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<>(observer, this);
        observer.onSubscribe(behaviorDisposable);
        if (add(behaviorDisposable)) {
            if (behaviorDisposable.cancelled) {
                remove(behaviorDisposable);
                return;
            } else {
                behaviorDisposable.emitFirst();
                return;
            }
        }
        java.lang.Throwable th = this.terminalEvent.get();
        if (th == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
            observer.onComplete();
        } else {
            observer.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.terminalEvent.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.terminalEvent.get() != null) {
            return;
        }
        java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
        setCurrent(next);
        for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : this.subscribers.get()) {
            behaviorDisposable.emitNext(next, this.index);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.terminalEvent.compareAndSet(null, th)) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        java.lang.Object objError = io.reactivex.internal.util.NotificationLite.error(th);
        for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : terminate(objError)) {
            behaviorDisposable.emitNext(objError, this.index);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.terminalEvent.compareAndSet(null, io.reactivex.internal.util.ExceptionHelper.TERMINATED)) {
            java.lang.Object objComplete = io.reactivex.internal.util.NotificationLite.complete();
            for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : terminate(objComplete)) {
                behaviorDisposable.emitNext(objComplete, this.index);
            }
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    int subscriberCount() {
        return this.subscribers.get().length;
    }

    @Override // io.reactivex.subjects.Subject
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

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.value.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.value.get());
    }

    public boolean hasValue() {
        java.lang.Object obj = this.value.get();
        return (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    boolean add(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable) {
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.subscribers.get();
            if (behaviorDisposableArr == TERMINATED) {
                return false;
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[length + 1];
            java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!this.subscribers.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable) {
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr2;
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
                io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr3 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[length - 1];
                java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                java.lang.System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!this.subscribers.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] terminate(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> atomicReference = this.subscribers;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr = TERMINATED;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
        if (andSet != behaviorDisposableArr) {
            setCurrent(obj);
        }
        return andSet;
    }

    void setCurrent(java.lang.Object obj) {
        this.writeLock.lock();
        this.index++;
        this.value.lazySet(obj);
        this.writeLock.unlock();
    }

    static final class BehaviorDisposable<T> implements io.reactivex.disposables.Disposable, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
        final io.reactivex.subjects.BehaviorSubject<T> state;

        BehaviorDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.BehaviorSubject<T> behaviorSubject) {
            this.downstream = observer;
            this.state = behaviorSubject;
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
                io.reactivex.subjects.BehaviorSubject<T> behaviorSubject = this.state;
                java.util.concurrent.locks.Lock lock = behaviorSubject.readLock;
                lock.lock();
                this.index = behaviorSubject.index;
                java.lang.Object obj = behaviorSubject.value.get();
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
            return this.cancelled || io.reactivex.internal.util.NotificationLite.accept(obj, this.downstream);
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
    }
}
