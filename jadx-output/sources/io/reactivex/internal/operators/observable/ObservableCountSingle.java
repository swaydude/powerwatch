package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Long> {
    final io.reactivex.ObservableSource<T> source;

    public ObservableCountSingle(io.reactivex.ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableCountSingle.CountObserver(singleObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<java.lang.Long> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableCount(this.source));
    }

    static final class CountObserver implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        long count;
        final io.reactivex.SingleObserver<? super java.lang.Long> downstream;
        io.reactivex.disposables.Disposable upstream;

        CountObserver(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
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

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            this.count++;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onSuccess(java.lang.Long.valueOf(this.count));
        }
    }
}
