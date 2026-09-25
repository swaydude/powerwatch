package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleEquals<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.SingleSource<? extends T> first;
    final io.reactivex.SingleSource<? extends T> second;

    public SingleEquals(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.SingleSource<? extends T> singleSource2) {
        this.first = singleSource;
        this.second = singleSource2;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        java.lang.Object[] objArr = {null, null};
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.first.subscribe(new io.reactivex.internal.operators.single.SingleEquals.InnerObserver(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.second.subscribe(new io.reactivex.internal.operators.single.SingleEquals.InnerObserver(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }

    static class InnerObserver<T> implements io.reactivex.SingleObserver<T> {
        final java.util.concurrent.atomic.AtomicInteger count;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> downstream;
        final int index;
        final io.reactivex.disposables.CompositeDisposable set;
        final java.lang.Object[] values;

        InnerObserver(int i, io.reactivex.disposables.CompositeDisposable compositeDisposable, java.lang.Object[] objArr, io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.index = i;
            this.set = compositeDisposable;
            this.values = objArr;
            this.downstream = singleObserver;
            this.count = atomicInteger;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.set.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.values[this.index] = t;
            if (this.count.incrementAndGet() == 2) {
                io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver = this.downstream;
                java.lang.Object[] objArr = this.values;
                singleObserver.onSuccess(java.lang.Boolean.valueOf(io.reactivex.internal.functions.ObjectHelper.equals(objArr[0], objArr[1])));
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            int i;
            do {
                i = this.count.get();
                if (i >= 2) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
            } while (!this.count.compareAndSet(i, 2));
            this.set.dispose();
            this.downstream.onError(th);
        }
    }
}
