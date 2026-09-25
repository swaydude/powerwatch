package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFlatMap<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final io.reactivex.SingleSource<? extends T> source;

    public SingleFlatMap(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
        this.mapper = function;
        this.source = singleSource;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback(singleObserver, this.mapper));
    }

    static final class SingleFlatMapCallback<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3258103020495908596L;
        final io.reactivex.SingleObserver<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;

        SingleFlatMapCallback(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
            this.downstream = singleObserver;
            this.mapper = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.FlatMapSingleObserver(this, this.downstream));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        static final class FlatMapSingleObserver<R> implements io.reactivex.SingleObserver<R> {
            final io.reactivex.SingleObserver<? super R> downstream;
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

            FlatMapSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.SingleObserver<? super R> singleObserver) {
                this.parent = atomicReference;
                this.downstream = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this.parent, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.downstream.onSuccess(r);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.downstream.onError(th);
            }
        }
    }
}
