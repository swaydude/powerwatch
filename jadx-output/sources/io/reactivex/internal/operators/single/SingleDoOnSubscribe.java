package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnSubscribe<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    final io.reactivex.SingleSource<T> source;

    public SingleDoOnSubscribe(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.source = singleSource;
        this.onSubscribe = consumer;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoOnSubscribe.DoOnSubscribeSingleObserver(singleObserver, this.onSubscribe));
    }

    static final class DoOnSubscribeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        boolean done;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

        DoOnSubscribeSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.downstream = singleObserver;
            this.onSubscribe = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            try {
                this.onSubscribe.accept(disposable);
                this.downstream.onSubscribe(disposable);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.done = true;
                disposable.dispose();
                io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            if (this.done) {
                return;
            }
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
