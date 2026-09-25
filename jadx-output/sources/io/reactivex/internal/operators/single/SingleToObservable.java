package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.SingleSource<? extends T> source;

    public SingleToObservable(io.reactivex.SingleSource<? extends T> singleSource) {
        this.source = singleSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(create(observer));
    }

    public static <T> io.reactivex.SingleObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.internal.operators.single.SingleToObservable.SingleToObservableObserver(observer);
    }

    static final class SingleToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        io.reactivex.disposables.Disposable upstream;

        SingleToObservableObserver(io.reactivex.Observer<? super T> observer) {
            super(observer);
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
            complete(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            error(th);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
