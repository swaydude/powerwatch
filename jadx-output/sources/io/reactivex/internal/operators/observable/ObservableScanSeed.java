package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableScanSeed<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
    final java.util.concurrent.Callable<R> seedSupplier;

    public ObservableScanSeed(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableScanSeed.ScanSeedObserver(observer, this.accumulator, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class ScanSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
        boolean done;
        final io.reactivex.Observer<? super R> downstream;
        io.reactivex.disposables.Disposable upstream;
        R value;

        ScanSeedObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.downstream = observer;
            this.accumulator = biFunction;
            this.value = r;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                this.downstream.onNext(this.value);
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
            try {
                R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                this.value = r;
                this.downstream.onNext(r);
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
            this.downstream.onComplete();
        }
    }
}
