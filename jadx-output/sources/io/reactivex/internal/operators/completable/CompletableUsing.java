package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableUsing<R> extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> completableFunction;
    final io.reactivex.functions.Consumer<? super R> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<R> resourceSupplier;

    public CompletableUsing(java.util.concurrent.Callable<R> callable, io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> function, io.reactivex.functions.Consumer<? super R> consumer, boolean z) {
        this.resourceSupplier = callable;
        this.completableFunction = function;
        this.disposer = consumer;
        this.eager = z;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            R rCall = this.resourceSupplier.call();
            try {
                ((io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.completableFunction.apply(rCall), "The completableFunction returned a null CompletableSource")).subscribe(new io.reactivex.internal.operators.completable.CompletableUsing.UsingObserver(completableObserver, rCall, this.disposer, this.eager));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.eager) {
                    try {
                        this.disposer.accept(rCall);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), completableObserver);
                        return;
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
                if (this.eager) {
                    return;
                }
                try {
                    this.disposer.accept(rCall);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(th3);
                }
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, completableObserver);
        }
    }

    static final class UsingObserver<R> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final io.reactivex.functions.Consumer<? super R> disposer;
        final io.reactivex.CompletableObserver downstream;
        final boolean eager;
        io.reactivex.disposables.Disposable upstream;

        UsingObserver(io.reactivex.CompletableObserver completableObserver, R r, io.reactivex.functions.Consumer<? super R> consumer, boolean z) {
            super(r);
            this.downstream = completableObserver;
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

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
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

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
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
