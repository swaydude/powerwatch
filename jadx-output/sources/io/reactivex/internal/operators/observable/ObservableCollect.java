package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableCollect<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
    final java.util.concurrent.Callable<? extends U> initialSupplier;

    public ObservableCollect(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends U> callable, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.initialSupplier = callable;
        this.collector = biConsumer;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableCollect.CollectObserver(observer, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.collector));
        } catch (java.lang.Throwable th) {
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class CollectObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
        boolean done;
        final io.reactivex.Observer<? super U> downstream;
        final U u;
        io.reactivex.disposables.Disposable upstream;

        CollectObserver(io.reactivex.Observer<? super U> observer, U u, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
            this.downstream = observer;
            this.collector = biConsumer;
            this.u = u;
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
            try {
                this.collector.accept(this.u, t);
            } catch (java.lang.Throwable th) {
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
            this.downstream.onNext(this.u);
            this.downstream.onComplete();
        }
    }
}
