package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableReduceMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.ObservableSource<T> source;

    public ObservableReduceMaybe(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.source = observableSource;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableReduceMaybe.ReduceObserver(maybeObserver, this.reducer));
    }

    static final class ReduceObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        io.reactivex.disposables.Disposable upstream;
        T value;

        ReduceObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.downstream = maybeObserver;
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
            if (this.done) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.value;
            this.value = null;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
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
