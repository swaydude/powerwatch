package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
final class ResultObservable<T> extends io.reactivex.Observable<retrofit2.adapter.rxjava2.Result<T>> {
    private final io.reactivex.Observable<retrofit2.Response<T>> upstream;

    ResultObservable(io.reactivex.Observable<retrofit2.Response<T>> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<T>> observer) {
        this.upstream.subscribe(new retrofit2.adapter.rxjava2.ResultObservable.ResultObserver(observer));
    }

    private static class ResultObserver<R> implements io.reactivex.Observer<retrofit2.Response<R>> {
        private final io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> observer;

        ResultObserver(io.reactivex.Observer<? super retrofit2.adapter.rxjava2.Result<R>> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(retrofit2.Response<R> response) {
            this.observer.onNext(retrofit2.adapter.rxjava2.Result.response(response));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            try {
                this.observer.onNext(retrofit2.adapter.rxjava2.Result.error(th));
                this.observer.onComplete();
            } catch (java.lang.Throwable th2) {
                try {
                    this.observer.onError(th2);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.observer.onComplete();
        }
    }
}
