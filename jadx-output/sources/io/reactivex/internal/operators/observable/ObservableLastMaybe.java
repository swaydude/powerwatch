package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableLastMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.ObservableSource<T> source;

    public ObservableLastMaybe(io.reactivex.ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableLastMaybe.LastObserver(maybeObserver));
    }

    static final class LastObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> downstream;
        T item;
        io.reactivex.disposables.Disposable upstream;

        LastObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
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
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
