package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleMap<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.Function<? super T, ? extends R> mapper;
    final io.reactivex.SingleSource<? extends T> source;

    public SingleMap(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends R> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleMap.MapSingleObserver(singleObserver, this.mapper));
    }

    static final class MapSingleObserver<T, R> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;
        final io.reactivex.SingleObserver<? super R> t;

        MapSingleObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.Function<? super T, ? extends R> function) {
            this.t = singleObserver;
            this.mapper = function;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.t.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                this.t.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.t.onError(th);
        }
    }
}
