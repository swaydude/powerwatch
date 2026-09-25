package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableOnErrorNext<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean allowFatal;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> nextSupplier;

    public ObservableOnErrorNext(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.nextSupplier = function;
        this.allowFatal = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableOnErrorNext.OnErrorNextObserver onErrorNextObserver = new io.reactivex.internal.operators.observable.ObservableOnErrorNext.OnErrorNextObserver(observer, this.nextSupplier, this.allowFatal);
        observer.onSubscribe(onErrorNextObserver.arbiter);
        this.source.subscribe(onErrorNextObserver);
    }

    static final class OnErrorNextObserver<T> implements io.reactivex.Observer<T> {
        final boolean allowFatal;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter = new io.reactivex.internal.disposables.SequentialDisposable();
        boolean done;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> nextSupplier;
        boolean once;

        OnErrorNextObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> function, boolean z) {
            this.downstream = observer;
            this.nextSupplier = function;
            this.allowFatal = z;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.arbiter.replace(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.once) {
                if (this.done) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.once = true;
            if (this.allowFatal && !(th instanceof java.lang.Exception)) {
                this.downstream.onError(th);
                return;
            }
            try {
                io.reactivex.ObservableSource<? extends T> observableSourceApply = this.nextSupplier.apply(th);
                if (observableSourceApply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.downstream.onError(nullPointerException);
                    return;
                }
                observableSourceApply.subscribe(this);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }
    }
}
