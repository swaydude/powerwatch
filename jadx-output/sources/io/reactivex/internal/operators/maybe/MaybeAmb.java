package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeAmb<T> extends io.reactivex.Maybe<T> {
    private final io.reactivex.MaybeSource<? extends T>[] sources;
    private final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> sourcesIterable;

    public MaybeAmb(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr, java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> iterable) {
        this.sources = maybeSourceArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        int length;
        io.reactivex.MaybeSource<? extends T>[] maybeSourceArr = this.sources;
        if (maybeSourceArr == null) {
            maybeSourceArr = new io.reactivex.MaybeSource[8];
            try {
                length = 0;
                for (io.reactivex.MaybeSource<? extends T> maybeSource : this.sourcesIterable) {
                    if (maybeSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), maybeObserver);
                        return;
                    }
                    if (length == maybeSourceArr.length) {
                        io.reactivex.MaybeSource<? extends T>[] maybeSourceArr2 = new io.reactivex.MaybeSource[(length >> 2) + length];
                        java.lang.System.arraycopy(maybeSourceArr, 0, maybeSourceArr2, 0, length);
                        maybeSourceArr = maybeSourceArr2;
                    }
                    int i = length + 1;
                    maybeSourceArr[length] = maybeSource;
                    length = i;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
                return;
            }
        } else {
            length = maybeSourceArr.length;
        }
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        maybeObserver.onSubscribe(compositeDisposable);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            io.reactivex.MaybeSource<? extends T> maybeSource2 = maybeSourceArr[i2];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (maybeSource2 == null) {
                compositeDisposable.dispose();
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    maybeObserver.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            maybeSource2.subscribe(new io.reactivex.internal.operators.maybe.MaybeAmb.AmbMaybeObserver(maybeObserver, compositeDisposable, atomicBoolean));
        }
        if (length == 0) {
            maybeObserver.onComplete();
        }
    }

    static final class AmbMaybeObserver<T> implements io.reactivex.MaybeObserver<T> {
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.disposables.CompositeDisposable set;
        io.reactivex.disposables.Disposable upstream;
        final java.util.concurrent.atomic.AtomicBoolean winner;

        AmbMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            this.downstream = maybeObserver;
            this.set = compositeDisposable;
            this.winner = atomicBoolean;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.upstream = disposable;
            this.set.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onComplete();
            }
        }
    }
}
