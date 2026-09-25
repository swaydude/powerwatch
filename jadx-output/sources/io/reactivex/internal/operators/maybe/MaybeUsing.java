package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeUsing<T, D> extends io.reactivex.Maybe<T> {
    final boolean eager;
    final io.reactivex.functions.Consumer<? super D> resourceDisposer;
    final java.util.concurrent.Callable<? extends D> resourceSupplier;
    final io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> sourceSupplier;

    public MaybeUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.resourceDisposer = consumer;
        this.eager = z;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null MaybeSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeUsing.UsingObserver(maybeObserver, dCall, this.resourceDisposer, this.eager));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.eager) {
                    try {
                        this.resourceDisposer.accept(dCall);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), maybeObserver);
                        return;
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
                if (this.eager) {
                    return;
                }
                try {
                    this.resourceDisposer.accept(dCall);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(th3);
                }
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, maybeObserver);
        }
    }

    static final class UsingObserver<T, D> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final io.reactivex.functions.Consumer<? super D> disposer;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final boolean eager;
        io.reactivex.disposables.Disposable upstream;

        UsingObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            super(d);
            this.downstream = maybeObserver;
            this.disposer = consumer;
            this.eager = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposeResourceAfter();
        }

        void disposeResourceAfter() {
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

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
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
            disposeResourceAfter();
        }

        @Override // io.reactivex.MaybeObserver
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
            disposeResourceAfter();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
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
            this.downstream.onComplete();
            if (this.eager) {
                return;
            }
            disposeResourceAfter();
        }
    }
}
