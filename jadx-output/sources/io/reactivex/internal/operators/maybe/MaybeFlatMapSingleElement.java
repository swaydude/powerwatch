package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFlatMapSingleElement<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final io.reactivex.MaybeSource<T> source;

    public MaybeFlatMapSingleElement(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement.FlatMapMaybeObserver(maybeObserver, this.mapper));
    }

    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4827726964688405508L;
        final io.reactivex.MaybeObserver<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
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

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement.FlatMapSingleObserver(this, this.downstream));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
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

    static final class FlatMapSingleObserver<R> implements io.reactivex.SingleObserver<R> {
        final io.reactivex.MaybeObserver<? super R> downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        FlatMapSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super R> maybeObserver) {
            this.parent = atomicReference;
            this.downstream = maybeObserver;
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
