package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleUsing<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super U> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<U> resourceSupplier;
    final io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> singleFunction;

    public SingleUsing(java.util.concurrent.Callable<U> callable, io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> function, io.reactivex.functions.Consumer<? super U> consumer, boolean z) {
        this.resourceSupplier = callable;
        this.singleFunction = function;
        this.disposer = consumer;
        this.eager = z;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        try {
            U uCall = this.resourceSupplier.call();
            try {
                ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.singleFunction.apply(uCall), "The singleFunction returned a null SingleSource")).subscribe(new io.reactivex.internal.operators.single.SingleUsing.UsingSingleObserver(singleObserver, uCall, this.eager, this.disposer));
            } catch (java.lang.Throwable th) {
                th = th;
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.eager) {
                    try {
                        this.disposer.accept(uCall);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        th = new io.reactivex.exceptions.CompositeException(th, th2);
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
                if (this.eager) {
                    return;
                }
                try {
                    this.disposer.accept(uCall);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(th3);
                }
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, singleObserver);
        }
    }

    static final class UsingSingleObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5331524057054083935L;
        final io.reactivex.functions.Consumer<? super U> disposer;
        final io.reactivex.SingleObserver<? super T> downstream;
        final boolean eager;
        io.reactivex.disposables.Disposable upstream;

        UsingSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, U u, boolean z, io.reactivex.functions.Consumer<? super U> consumer) {
            super(u);
            this.downstream = singleObserver;
            this.eager = z;
            this.disposer = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposeAfter();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.eager) {
                java.lang.Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                    return;
                }
            }
            this.downstream.onSuccess(t);
            if (this.eager) {
                return;
            }
            disposeAfter();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.eager) {
                java.lang.Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    th = new io.reactivex.exceptions.CompositeException(th, th2);
                }
            }
            this.downstream.onError(th);
            if (this.eager) {
                return;
            }
            disposeAfter();
        }

        void disposeAfter() {
            java.lang.Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
