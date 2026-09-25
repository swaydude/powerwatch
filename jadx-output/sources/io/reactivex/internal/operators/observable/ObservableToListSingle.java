package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableToListSingle<T, U extends java.util.Collection<? super T>> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToObservable<U> {
    final java.util.concurrent.Callable<U> collectionSupplier;
    final io.reactivex.ObservableSource<T> source;

    public ObservableToListSingle(io.reactivex.ObservableSource<T> observableSource, int i) {
        this.source = observableSource;
        this.collectionSupplier = io.reactivex.internal.functions.Functions.createArrayList(i);
    }

    public ObservableToListSingle(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<U> callable) {
        this.source = observableSource;
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableToListSingle.ToListObserver(singleObserver, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<U> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableToList(this.source, this.collectionSupplier));
    }

    static final class ToListObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        U collection;
        final io.reactivex.SingleObserver<? super U> downstream;
        io.reactivex.disposables.Disposable upstream;

        ToListObserver(io.reactivex.SingleObserver<? super U> singleObserver, U u) {
            this.downstream = singleObserver;
            this.collection = u;
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
            this.collection.add(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.collection = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u = this.collection;
            this.collection = null;
            this.downstream.onSuccess(u);
        }
    }
}
