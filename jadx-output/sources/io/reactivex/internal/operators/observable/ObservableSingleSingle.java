package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSingleSingle<T> extends io.reactivex.Single<T> {
    final T defaultValue;
    final io.reactivex.ObservableSource<? extends T> source;

    public ObservableSingleSingle(io.reactivex.ObservableSource<? extends T> observableSource, T t) {
        this.source = observableSource;
        this.defaultValue = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSingleSingle.SingleElementObserver(singleObserver, this.defaultValue));
    }

    static final class SingleElementObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final T defaultValue;
        boolean done;
        final io.reactivex.SingleObserver<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;
        T value;

        SingleElementObserver(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.downstream = singleObserver;
            this.defaultValue = t;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
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

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.value != null) {
                this.done = true;
                this.upstream.dispose();
                this.downstream.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.value = t;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.value;
            this.value = null;
            if (t == null) {
                t = this.defaultValue;
            }
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
