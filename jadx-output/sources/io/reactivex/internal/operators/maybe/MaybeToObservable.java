package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeToObservable<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;

    public MaybeToObservable(io.reactivex.MaybeSource<T> maybeSource) {
        this.source = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(create(observer));
    }

    public static <T> io.reactivex.MaybeObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.internal.operators.maybe.MaybeToObservable.MaybeToObservableObserver(observer);
    }

    static final class MaybeToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.disposables.Disposable upstream;

        MaybeToObservableObserver(io.reactivex.Observer<? super T> observer) {
            super(observer);
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
            complete(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            error(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
