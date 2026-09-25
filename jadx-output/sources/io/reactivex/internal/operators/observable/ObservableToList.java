package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableToList<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> collectionSupplier;

    public ObservableToList(io.reactivex.ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.collectionSupplier = io.reactivex.internal.functions.Functions.createArrayList(i);
    }

    public ObservableToList(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableToList.ToListObserver(observer, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class ToListObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        U collection;
        final io.reactivex.Observer<? super U> downstream;
        io.reactivex.disposables.Disposable upstream;

        ToListObserver(io.reactivex.Observer<? super U> observer, U u) {
            this.downstream = observer;
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
            this.downstream.onNext(u);
            this.downstream.onComplete();
        }
    }
}
