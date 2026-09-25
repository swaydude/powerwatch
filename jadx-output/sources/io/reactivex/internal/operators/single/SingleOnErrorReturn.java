package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleOnErrorReturn<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> source;
    final T value;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    public SingleOnErrorReturn(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function, T t) {
        this.source = singleSource;
        this.valueSupplier = function;
        this.value = t;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleOnErrorReturn.OnErrorReturn(singleObserver));
    }

    final class OnErrorReturn implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> observer;

        OnErrorReturn(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.observer = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            T tApply;
            if (io.reactivex.internal.operators.single.SingleOnErrorReturn.this.valueSupplier != null) {
                try {
                    tApply = io.reactivex.internal.operators.single.SingleOnErrorReturn.this.valueSupplier.apply(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.observer.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                    return;
                }
            } else {
                tApply = io.reactivex.internal.operators.single.SingleOnErrorReturn.this.value;
            }
            if (tApply == null) {
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.observer.onError(nullPointerException);
                return;
            }
            this.observer.onSuccess(tApply);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.observer.onSuccess(t);
        }
    }
}
