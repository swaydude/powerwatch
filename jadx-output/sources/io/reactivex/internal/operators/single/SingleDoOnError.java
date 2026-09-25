package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnError<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.SingleSource<T> source;

    public SingleDoOnError(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        this.source = singleSource;
        this.onError = consumer;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoOnError.DoOnError(singleObserver));
    }

    final class DoOnError implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> downstream;

        DoOnError(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnError.this.onError.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }
    }
}
