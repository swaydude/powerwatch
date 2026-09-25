package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoAfterSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super T> onAfterSuccess;
    final io.reactivex.SingleSource<T> source;

    public SingleDoAfterSuccess(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super T> consumer) {
        this.source = singleSource;
        this.onAfterSuccess = consumer;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDoAfterSuccess.DoAfterObserver(singleObserver, this.onAfterSuccess));
    }

    static final class DoAfterObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.functions.Consumer<? super T> onAfterSuccess;
        io.reactivex.disposables.Disposable upstream;

        DoAfterObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Consumer<? super T> consumer) {
            this.downstream = singleObserver;
            this.onAfterSuccess = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            try {
                this.onAfterSuccess.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
