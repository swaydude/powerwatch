package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDoFinally extends io.reactivex.Completable {
    final io.reactivex.functions.Action onFinally;
    final io.reactivex.CompletableSource source;

    public CompletableDoFinally(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Action action) {
        this.source = completableSource;
        this.onFinally = action;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableDoFinally.DoFinallyObserver(completableObserver, this.onFinally));
    }

    static final class DoFinallyObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.functions.Action onFinally;
        io.reactivex.disposables.Disposable upstream;

        DoFinallyObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Action action) {
            this.downstream = completableObserver;
            this.onFinally = action;
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
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
