package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableCreate extends io.reactivex.Completable {
    final io.reactivex.CompletableOnSubscribe source;

    public CompletableCreate(io.reactivex.CompletableOnSubscribe completableOnSubscribe) {
        this.source = completableOnSubscribe;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableCreate.Emitter emitter = new io.reactivex.internal.operators.completable.CompletableCreate.Emitter(completableObserver);
        completableObserver.onSubscribe(emitter);
        try {
            this.source.subscribe(emitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            emitter.onError(th);
        }
    }

    static final class Emitter extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.CompletableObserver downstream;

        Emitter(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.CompletableEmitter
        public void onComplete() {
            io.reactivex.disposables.Disposable andSet;
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.CompletableEmitter
        public void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.CompletableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable andSet;
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.CompletableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.CompletableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
