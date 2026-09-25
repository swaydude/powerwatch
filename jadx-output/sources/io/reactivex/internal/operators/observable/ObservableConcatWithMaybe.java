package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatWithMaybe<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> other;

    public ObservableConcatWithMaybe(io.reactivex.Observable<T> observable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.other = maybeSource;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatWithMaybe.ConcatWithObserver(observer, this.other));
    }

    static final class ConcatWithObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.Observer<? super T> downstream;
        boolean inMaybe;
        io.reactivex.MaybeSource<? extends T> other;

        ConcatWithObserver(io.reactivex.Observer<? super T> observer, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.downstream = observer;
            this.other = maybeSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (!io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) || this.inMaybe) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, null);
            io.reactivex.MaybeSource<? extends T> maybeSource = this.other;
            this.other = null;
            maybeSource.subscribe(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
