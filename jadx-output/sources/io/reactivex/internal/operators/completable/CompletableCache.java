package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableCache extends io.reactivex.Completable implements io.reactivex.CompletableObserver {
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] EMPTY = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[0];
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] TERMINATED = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[0];
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
    final io.reactivex.CompletableSource source;

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public CompletableCache(io.reactivex.CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache(completableObserver);
        completableObserver.onSubscribe(innerCompletableCache);
        if (add(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                remove(innerCompletableCache);
            }
            if (this.once.compareAndSet(false, true)) {
                this.source.subscribe(this);
                return;
            }
            return;
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            completableObserver.onError(th);
        } else {
            completableObserver.onComplete();
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable th) {
        this.error = th;
        for (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache : this.observers.getAndSet(TERMINATED)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        for (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache : this.observers.getAndSet(TERMINATED)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    boolean add(io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache) {
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr;
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.observers.get();
            if (innerCompletableCacheArr == TERMINATED) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[length + 1];
            java.lang.System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!this.observers.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    void remove(io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache) {
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr;
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.observers.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (innerCompletableCacheArr[i2] == innerCompletableCache) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = EMPTY;
            } else {
                io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr3 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[length - 1];
                java.lang.System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                java.lang.System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!this.observers.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    final class InnerCompletableCache extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        final io.reactivex.CompletableObserver downstream;

        InnerCompletableCache(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                io.reactivex.internal.operators.completable.CompletableCache.this.remove(this);
            }
        }
    }
}
