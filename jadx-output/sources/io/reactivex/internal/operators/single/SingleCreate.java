package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleCreate<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleOnSubscribe<T> source;

    public SingleCreate(io.reactivex.SingleOnSubscribe<T> singleOnSubscribe) {
        this.source = singleOnSubscribe;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleCreate.Emitter emitter = new io.reactivex.internal.operators.single.SingleCreate.Emitter(singleObserver);
        singleObserver.onSubscribe(emitter);
        try {
            this.source.subscribe(emitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            emitter.onError(th);
        }
    }

    static final class Emitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.SingleObserver<? super T> downstream;

        Emitter(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleEmitter
        public void onSuccess(T t) {
            io.reactivex.disposables.Disposable andSet;
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.downstream.onError(new java.lang.NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.downstream.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (java.lang.Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // io.reactivex.SingleEmitter
        public void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.SingleEmitter
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

        @Override // io.reactivex.SingleEmitter
        public void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.SingleEmitter
        public void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
