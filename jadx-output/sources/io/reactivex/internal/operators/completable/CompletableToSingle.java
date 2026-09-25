package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableToSingle<T> extends io.reactivex.Single<T> {
    final T completionValue;
    final java.util.concurrent.Callable<? extends T> completionValueSupplier;
    final io.reactivex.CompletableSource source;

    public CompletableToSingle(io.reactivex.CompletableSource completableSource, java.util.concurrent.Callable<? extends T> callable, T t) {
        this.source = completableSource;
        this.completionValue = t;
        this.completionValueSupplier = callable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableToSingle.ToSingle(singleObserver));
    }

    final class ToSingle implements io.reactivex.CompletableObserver {
        private final io.reactivex.SingleObserver<? super T> observer;

        ToSingle(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.observer = singleObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            T tCall;
            if (io.reactivex.internal.operators.completable.CompletableToSingle.this.completionValueSupplier != null) {
                try {
                    tCall = io.reactivex.internal.operators.completable.CompletableToSingle.this.completionValueSupplier.call();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.observer.onError(th);
                    return;
                }
            } else {
                tCall = io.reactivex.internal.operators.completable.CompletableToSingle.this.completionValue;
            }
            if (tCall == null) {
                this.observer.onError(new java.lang.NullPointerException("The value supplied is null"));
            } else {
                this.observer.onSuccess(tCall);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.observer.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }
    }
}
