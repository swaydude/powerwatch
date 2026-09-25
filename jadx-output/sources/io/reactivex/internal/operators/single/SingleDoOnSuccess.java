package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super T> onSuccess;
    final io.reactivex.SingleSource<T> source;

    public SingleDoOnSuccess(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super T> consumer) {
        this.source = singleSource;
        this.onSuccess = consumer;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoOnSuccess.DoOnSuccess(singleObserver));
    }

    final class DoOnSuccess implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super T> downstream;

        DoOnSuccess(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnSuccess.this.onSuccess.accept(t);
                this.downstream.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
