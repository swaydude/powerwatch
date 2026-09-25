package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleContains<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> comparer;
    final io.reactivex.SingleSource<T> source;
    final java.lang.Object value;

    public SingleContains(io.reactivex.SingleSource<T> singleSource, java.lang.Object obj, io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> biPredicate) {
        this.source = singleSource;
        this.value = obj;
        this.comparer = biPredicate;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleContains.ContainsSingleObserver(singleObserver));
    }

    final class ContainsSingleObserver implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super java.lang.Boolean> downstream;

        ContainsSingleObserver(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                this.downstream.onSuccess(java.lang.Boolean.valueOf(io.reactivex.internal.operators.single.SingleContains.this.comparer.test(t, io.reactivex.internal.operators.single.SingleContains.this.value)));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
