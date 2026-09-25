package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableLastSingle<T> extends io.reactivex.Single<T> {
    final T defaultItem;
    final io.reactivex.ObservableSource<T> source;

    public ObservableLastSingle(io.reactivex.ObservableSource<T> observableSource, T t) {
        this.source = observableSource;
        this.defaultItem = t;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableLastSingle.LastObserver(singleObserver, this.defaultItem));
    }

    static final class LastObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final T defaultItem;
        final io.reactivex.SingleObserver<? super T> downstream;
        T item;
        io.reactivex.disposables.Disposable upstream;

        LastObserver(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.downstream = singleObserver;
            this.defaultItem = t;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.item = t;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.item = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            T t = this.item;
            if (t != null) {
                this.item = null;
                this.downstream.onSuccess(t);
                return;
            }
            T t2 = this.defaultItem;
            if (t2 != null) {
                this.downstream.onSuccess(t2);
            } else {
                this.downstream.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
