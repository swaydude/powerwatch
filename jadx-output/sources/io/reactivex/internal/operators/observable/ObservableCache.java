package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> implements io.reactivex.Observer<T> {
    static final io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[] EMPTY = new io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[0];
    static final io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[] TERMINATED = new io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[0];
    final int capacityHint;
    volatile boolean done;
    java.lang.Throwable error;
    final io.reactivex.internal.operators.observable.ObservableCache.Node<T> head;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[]> observers;
    final java.util.concurrent.atomic.AtomicBoolean once;
    volatile long size;
    io.reactivex.internal.operators.observable.ObservableCache.Node<T> tail;
    int tailOffset;

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public ObservableCache(io.reactivex.Observable<T> observable, int i) {
        super(observable);
        this.capacityHint = i;
        this.once = new java.util.concurrent.atomic.AtomicBoolean();
        io.reactivex.internal.operators.observable.ObservableCache.Node<T> node = new io.reactivex.internal.operators.observable.ObservableCache.Node<>(i);
        this.head = node;
        this.tail = node;
        this.observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable = new io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<>(observer, this);
        observer.onSubscribe(cacheDisposable);
        add(cacheDisposable);
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            this.source.subscribe(this);
        } else {
            replay(cacheDisposable);
        }
    }

    boolean isConnected() {
        return this.once.get();
    }

    boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    long cachedEventCount() {
        return this.size;
    }

    void add(io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[length + 1];
            java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.observers.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    void remove(io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (cacheDisposableArr[i2] == cacheDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = EMPTY;
            } else {
                io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T>[] cacheDisposableArr3 = new io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable[length - 1];
                java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                java.lang.System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.observers.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    void replay(io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        io.reactivex.internal.operators.observable.ObservableCache.Node<T> node = cacheDisposable.node;
        io.reactivex.Observer<? super T> observer = cacheDisposable.downstream;
        int i2 = this.capacityHint;
        int iAddAndGet = 1;
        while (!cacheDisposable.disposed) {
            boolean z = this.done;
            boolean z2 = this.size == j;
            if (z && z2) {
                cacheDisposable.node = null;
                java.lang.Throwable th = this.error;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (!z2) {
                if (i == i2) {
                    node = node.next;
                    i = 0;
                }
                observer.onNext(node.values[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = node;
                iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        cacheDisposable.node = null;
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        int i = this.tailOffset;
        if (i == this.capacityHint) {
            io.reactivex.internal.operators.observable.ObservableCache.Node<T> node = new io.reactivex.internal.operators.observable.ObservableCache.Node<>(i);
            node.values[0] = t;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i] = t;
            this.tailOffset = i + 1;
        }
        this.size++;
        for (io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable : this.observers.get()) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        this.error = th;
        this.done = true;
        for (io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.done = true;
        for (io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final io.reactivex.Observer<? super T> downstream;
        long index;
        io.reactivex.internal.operators.observable.ObservableCache.Node<T> node;
        int offset;
        final io.reactivex.internal.operators.observable.ObservableCache<T> parent;

        CacheDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.internal.operators.observable.ObservableCache<T> observableCache) {
            this.downstream = observer;
            this.parent = observableCache;
            this.node = observableCache.head;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.parent.remove(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    static final class Node<T> {
        volatile io.reactivex.internal.operators.observable.ObservableCache.Node<T> next;
        final T[] values;

        Node(int i) {
            this.values = (T[]) new java.lang.Object[i];
        }
    }
}
