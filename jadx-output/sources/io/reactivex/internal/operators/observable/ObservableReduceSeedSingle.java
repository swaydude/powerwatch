package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final R seed;
    final io.reactivex.ObservableSource<T> source;

    public ObservableReduceSeedSingle(io.reactivex.ObservableSource<T> observableSource, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.source = observableSource;
        this.seed = r;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }

    static final class ReduceSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super R> downstream;
        final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
        io.reactivex.disposables.Disposable upstream;
        R value;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.downstream = singleObserver;
            this.value = r;
            this.reducer = biFunction;
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
            R r = this.value;
            if (r != null) {
                try {
                    this.value = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(r, t), "The reducer returned a null value");
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.value != null) {
                this.value = null;
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            R r = this.value;
            if (r != null) {
                this.value = null;
                this.downstream.onSuccess(r);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
