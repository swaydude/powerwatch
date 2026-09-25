package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleAmb<T> extends io.reactivex.Single<T> {
    private final io.reactivex.SingleSource<? extends T>[] sources;
    private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> sourcesIterable;

    public SingleAmb(io.reactivex.SingleSource<? extends T>[] singleSourceArr, java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
        this.sources = singleSourceArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        int length;
        io.reactivex.SingleSource<? extends T>[] singleSourceArr = this.sources;
        if (singleSourceArr == null) {
            singleSourceArr = new io.reactivex.SingleSource[8];
            try {
                length = 0;
                for (io.reactivex.SingleSource<? extends T> singleSource : this.sourcesIterable) {
                    if (singleSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), singleObserver);
                        return;
                    }
                    if (length == singleSourceArr.length) {
                        io.reactivex.SingleSource<? extends T>[] singleSourceArr2 = new io.reactivex.SingleSource[(length >> 2) + length];
                        java.lang.System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, length);
                        singleSourceArr = singleSourceArr2;
                    }
                    int i = length + 1;
                    singleSourceArr[length] = singleSource;
                    length = i;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
                return;
            }
        } else {
            length = singleSourceArr.length;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        for (int i2 = 0; i2 < length; i2++) {
            io.reactivex.SingleSource<? extends T> singleSource2 = singleSourceArr[i2];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (singleSource2 == null) {
                compositeDisposable.dispose();
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    singleObserver.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            singleSource2.subscribe(new io.reactivex.internal.operators.single.SingleAmb.AmbSingleObserver(singleObserver, compositeDisposable, atomicBoolean));
        }
    }

    static final class AmbSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.disposables.CompositeDisposable set;
        io.reactivex.disposables.Disposable upstream;
        final java.util.concurrent.atomic.AtomicBoolean winner;

        AmbSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            this.downstream = singleObserver;
            this.set = compositeDisposable;
            this.winner = atomicBoolean;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.upstream = disposable;
            this.set.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
