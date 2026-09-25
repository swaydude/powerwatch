package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
final class CallEnqueueObservable<T> extends io.reactivex.Observable<retrofit2.Response<T>> {
    private final retrofit2.Call<T> originalCall;

    CallEnqueueObservable(retrofit2.Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super retrofit2.Response<T>> observer) {
        retrofit2.Call<T> callClone = this.originalCall.clone();
        retrofit2.adapter.rxjava2.CallEnqueueObservable.CallCallback callCallback = new retrofit2.adapter.rxjava2.CallEnqueueObservable.CallCallback(callClone, observer);
        observer.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        callClone.enqueue(callCallback);
    }

    private static final class CallCallback<T> implements io.reactivex.disposables.Disposable, retrofit2.Callback<T> {
        private final retrofit2.Call<?> call;
        private volatile boolean disposed;
        private final io.reactivex.Observer<? super retrofit2.Response<T>> observer;
        boolean terminated = false;

        CallCallback(retrofit2.Call<?> call, io.reactivex.Observer<? super retrofit2.Response<T>> observer) {
            this.call = call;
            this.observer = observer;
        }

        @Override // retrofit2.Callback
        public void onResponse(retrofit2.Call<T> call, retrofit2.Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (java.lang.Throwable th) {
                if (this.terminated) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        }

        @Override // retrofit2.Callback
        public void onFailure(retrofit2.Call<T> call, java.lang.Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
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
