package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDelayWithSingle<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<U> other;
    final io.reactivex.SingleSource<T> source;

    public SingleDelayWithSingle(io.reactivex.SingleSource<T> singleSource, io.reactivex.SingleSource<U> singleSource2) {
        this.source = singleSource;
        this.other = singleSource2;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.other.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithSingle.OtherObserver(singleObserver, this.source));
    }

    static final class OtherObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.SingleSource<T> source;

        OtherObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.downstream = singleObserver;
            this.source = singleSource;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(U u) {
            this.source.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.downstream));
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
