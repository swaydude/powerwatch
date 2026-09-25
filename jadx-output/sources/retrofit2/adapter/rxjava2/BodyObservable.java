package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
final class BodyObservable<T> extends io.reactivex.Observable<T> {
    private final io.reactivex.Observable<retrofit2.Response<T>> upstream;

    BodyObservable(io.reactivex.Observable<retrofit2.Response<T>> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.upstream.subscribe(new retrofit2.adapter.rxjava2.BodyObservable.BodyObserver(observer));
    }

    private static class BodyObserver<R> implements io.reactivex.Observer<retrofit2.Response<R>> {
        private final io.reactivex.Observer<? super R> observer;
        private boolean terminated;

        BodyObserver(io.reactivex.Observer<? super R> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(retrofit2.Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            retrofit2.adapter.rxjava2.HttpException httpException = new retrofit2.adapter.rxjava2.HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(httpException, th));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            io.reactivex.plugins.RxJavaPlugins.onError(assertionError);
        }
    }
}
