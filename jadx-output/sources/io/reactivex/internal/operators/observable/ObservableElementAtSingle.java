package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableElementAtSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final T defaultValue;
    final long index;
    final io.reactivex.ObservableSource<T> source;

    public ObservableElementAtSingle(io.reactivex.ObservableSource<T> observableSource, long j, T t) {
        this.source = observableSource;
        this.index = j;
        this.defaultValue = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAtSingle.ElementAtObserver(singleObserver, this.index, this.defaultValue));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableElementAt(this.source, this.index, this.defaultValue, true));
    }

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        long count;
        final T defaultValue;
        boolean done;
        final io.reactivex.SingleObserver<? super T> downstream;
        final long index;
        io.reactivex.disposables.Disposable upstream;

        ElementAtObserver(io.reactivex.SingleObserver<? super T> singleObserver, long j, T t) {
            this.downstream = singleObserver;
            this.index = j;
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
            long j = this.count;
            if (j == this.index) {
                this.done = true;
                this.upstream.dispose();
                this.downstream.onSuccess(t);
                return;
            }
            this.count = j + 1;
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
            T t = this.defaultValue;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
