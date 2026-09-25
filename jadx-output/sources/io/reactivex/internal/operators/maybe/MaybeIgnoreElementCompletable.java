package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeIgnoreElementCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToMaybe<T> {
    final io.reactivex.MaybeSource<T> source;

    public MaybeIgnoreElementCompletable(io.reactivex.MaybeSource<T> maybeSource) {
        this.source = maybeSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable.IgnoreMaybeObserver(completableObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public io.reactivex.Maybe<T> fuseToMaybe() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.maybe.MaybeIgnoreElement(this.source));
    }

    static final class IgnoreMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver downstream;
        io.reactivex.disposables.Disposable upstream;

        IgnoreMaybeObserver(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
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
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
