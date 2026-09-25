package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableUsing<T, D> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super D> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<? extends D> resourceSupplier;
    final io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> sourceSupplier;

    public ObservableUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new io.reactivex.internal.operators.observable.ObservableUsing.UsingObserver(observer, dCall, this.disposer, this.eager));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                try {
                    this.disposer.accept(dCall);
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), observer);
                }
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.disposables.EmptyDisposable.error(th3, observer);
        }
    }

    static final class UsingObserver<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 5904473792286235046L;
        final io.reactivex.functions.Consumer<? super D> disposer;
        final io.reactivex.Observer<? super T> downstream;
        final boolean eager;
        final D resource;
        io.reactivex.disposables.Disposable upstream;

        UsingObserver(io.reactivex.Observer<? super T> observer, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            this.downstream = observer;
            this.resource = d;
            this.disposer = consumer;
            this.eager = z;
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
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        th = new io.reactivex.exceptions.CompositeException(th, th2);
                    }
                }
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.upstream.dispose();
            disposeAfter();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.dispose();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.dispose();
            disposeAfter();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
