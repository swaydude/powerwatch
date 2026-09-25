package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnTerminate<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action onTerminate;
    final io.reactivex.SingleSource<T> source;

    public SingleDoOnTerminate(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Action action) {
        this.source = singleSource;
        this.onTerminate = action;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoOnTerminate.DoOnTerminate(singleObserver));
    }

    final class DoOnTerminate implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super T> downstream;

        DoOnTerminate(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnTerminate.this.onTerminate.run();
                this.downstream.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnTerminate.this.onTerminate.run();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }
    }
}
