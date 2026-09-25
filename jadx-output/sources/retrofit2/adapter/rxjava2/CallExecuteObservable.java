package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
final class CallExecuteObservable<T> extends io.reactivex.Observable<retrofit2.Response<T>> {
    private final retrofit2.Call<T> originalCall;

    CallExecuteObservable(retrofit2.Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.Response<T>> observer) {
        boolean z;
        retrofit2.Call<T> callClone = this.originalCall.clone();
        retrofit2.adapter.rxjava2.CallExecuteObservable.CallDisposable callDisposable = new retrofit2.adapter.rxjava2.CallExecuteObservable.CallDisposable(callClone);
        observer.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        try {
            retrofit2.Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                observer.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                observer.onComplete();
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (z) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            z = false;
        }
    }

    private static final class CallDisposable implements io.reactivex.disposables.Disposable {
        private final retrofit2.Call<?> call;
        private volatile boolean disposed;

        CallDisposable(retrofit2.Call<?> call) {
            this.call = call;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }
}
