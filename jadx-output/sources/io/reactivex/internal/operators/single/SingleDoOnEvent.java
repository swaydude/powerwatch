package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnEvent<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onEvent;
    final io.reactivex.SingleSource<T> source;

    public SingleDoOnEvent(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> biConsumer) {
        this.source = singleSource;
        this.onEvent = biConsumer;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoOnEvent.DoOnEvent(singleObserver));
    }

    final class DoOnEvent implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> downstream;

        DoOnEvent(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnEvent.this.onEvent.accept(t, null);
                this.downstream.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnEvent.this.onEvent.accept(null, th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }
    }
}
