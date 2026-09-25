package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFlatMapMaybe<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final io.reactivex.SingleSource<? extends T> source;

    public SingleFlatMapMaybe(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
        this.mapper = function;
        this.source = singleSource;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapMaybe.FlatMapSingleObserver(maybeObserver, this.mapper));
    }

    static final class FlatMapSingleObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5843758257109742742L;
        final io.reactivex.MaybeObserver<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;

        FlatMapSingleObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
            this.downstream = maybeObserver;
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
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapMaybe.FlatMapMaybeObserver(this, this.downstream));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }

    static final class FlatMapMaybeObserver<R> implements io.reactivex.MaybeObserver<R> {
        final io.reactivex.MaybeObserver<? super R> downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        FlatMapMaybeObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super R> maybeObserver) {
            this.parent = atomicReference;
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.parent, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(R r) {
            this.downstream.onSuccess(r);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
