package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeToSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final T defaultValue;
    final io.reactivex.MaybeSource<T> source;

    public MaybeToSingle(io.reactivex.MaybeSource<T> maybeSource, T t) {
        this.source = maybeSource;
        this.defaultValue = t;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeToSingle.ToSingleMaybeSubscriber(singleObserver, this.defaultValue));
    }

    static final class ToSingleMaybeSubscriber<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final T defaultValue;
        final io.reactivex.SingleObserver<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;

        ToSingleMaybeSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.downstream = singleObserver;
            this.defaultValue = t;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            T t = this.defaultValue;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onError(new java.util.NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }
}
