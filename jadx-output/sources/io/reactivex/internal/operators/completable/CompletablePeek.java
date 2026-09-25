package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletablePeek extends io.reactivex.Completable {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Action onDispose;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    final io.reactivex.functions.Action onTerminate;
    final io.reactivex.CompletableSource source;

    public CompletablePeek(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Action action3, io.reactivex.functions.Action action4) {
        this.source = completableSource;
        this.onSubscribe = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onTerminate = action2;
        this.onAfterTerminate = action3;
        this.onDispose = action4;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletablePeek.CompletableObserverImplementation(completableObserver));
    }

    final class CompletableObserverImplementation implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver downstream;
        io.reactivex.disposables.Disposable upstream;

        CompletableObserverImplementation(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.onSubscribe.accept(disposable);
                if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    this.downstream.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                disposable.dispose();
                this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.onError.accept(th);
                io.reactivex.internal.operators.completable.CompletablePeek.this.onTerminate.run();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
            doAfter();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.onComplete.run();
                io.reactivex.internal.operators.completable.CompletablePeek.this.onTerminate.run();
                this.downstream.onComplete();
                doAfter();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        void doAfter() {
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.onAfterTerminate.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.onDispose.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
