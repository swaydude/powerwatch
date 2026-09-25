package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeCache<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] EMPTY = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[0];
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] TERMINATED = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[0];
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.MaybeSource<T>> source;
    T value;

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public MaybeCache(io.reactivex.MaybeSource<T> maybeSource) {
        this.source = new java.util.concurrent.atomic.AtomicReference<>(maybeSource);
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        if (add(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                remove(cacheDisposable);
                return;
            }
            io.reactivex.MaybeSource<T> andSet = this.source.getAndSet(null);
            if (andSet != null) {
                andSet.subscribe(this);
                return;
            }
            return;
        }
        if (cacheDisposable.isDisposed()) {
            return;
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            maybeObserver.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            maybeObserver.onSuccess(t);
        } else {
            maybeObserver.onComplete();
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        this.value = t;
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(java.lang.Throwable th) {
        this.error = th;
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    boolean add(io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[length + 1];
            java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.observers.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    void remove(io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr2;
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
                io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr3 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[length - 1];
                java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                java.lang.System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.observers.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final io.reactivex.MaybeObserver<? super T> downstream;

        CacheDisposable(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.internal.operators.maybe.MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.operators.maybe.MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
