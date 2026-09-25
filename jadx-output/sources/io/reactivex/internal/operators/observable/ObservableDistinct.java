package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDistinct<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.Callable<? extends java.util.Collection<? super K>> collectionSupplier;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    public ObservableDistinct(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, K> function, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> callable) {
        super(observableSource);
        this.keySelector = function;
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDistinct.DistinctObserver(observer, this.keySelector, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class DistinctObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final java.util.Collection<? super K> collection;
        final io.reactivex.functions.Function<? super T, K> keySelector;

        DistinctObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, K> function, java.util.Collection<? super K> collection) {
            super(observer);
            this.keySelector = function;
            this.collection = collection;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.collection.add(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.keySelector.apply(t), "The keySelector returned a null key"))) {
                        this.downstream.onNext((java.lang.Object) t);
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    fail(th);
                    return;
                }
            }
            this.downstream.onNext(null);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            T tPoll;
            do {
                tPoll = this.qd.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.collection.add((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.keySelector.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.collection.clear();
            super.clear();
        }
    }
}
