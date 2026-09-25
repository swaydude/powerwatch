package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeSwitchIfEmptySingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.SingleSource<? extends T> other;
    final io.reactivex.MaybeSource<T> source;

    public MaybeSwitchIfEmptySingle(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.SingleSource<? extends T> singleSource) {
        this.source = maybeSource;
        this.other = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle.SwitchIfEmptyMaybeObserver(singleObserver, this.other));
    }

    static final class SwitchIfEmptyMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4603919676453758899L;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.SingleSource<? extends T> other;

        SwitchIfEmptyMaybeObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<? extends T> singleSource) {
            this.downstream = singleObserver;
            this.other = singleSource;
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
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.other.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle.SwitchIfEmptyMaybeObserver.OtherSingleObserver(this.downstream, this));
        }

        static final class OtherSingleObserver<T> implements io.reactivex.SingleObserver<T> {
            final io.reactivex.SingleObserver<? super T> downstream;
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

            OtherSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
                this.downstream = singleObserver;
                this.parent = atomicReference;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this.parent, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.downstream.onError(th);
            }
        }
    }
}
