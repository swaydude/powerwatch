package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoAfterTerminate<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.SingleSource<T> source;

    public SingleDoAfterTerminate(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Action action) {
        this.source = singleSource;
        this.onAfterTerminate = action;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoAfterTerminate.DoAfterTerminateObserver(singleObserver, this.onAfterTerminate));
    }

    static final class DoAfterTerminateObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.functions.Action onAfterTerminate;
        io.reactivex.disposables.Disposable upstream;

        DoAfterTerminateObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Action action) {
            this.downstream = singleObserver;
            this.onAfterTerminate = action;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            onAfterTerminate();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
            onAfterTerminate();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        private void onAfterTerminate() {
            try {
                this.onAfterTerminate.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
