package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDelayWithCompletable<T> extends io.reactivex.Single<T> {
    final io.reactivex.CompletableSource other;
    final io.reactivex.SingleSource<T> source;

    public SingleDelayWithCompletable(io.reactivex.SingleSource<T> singleSource, io.reactivex.CompletableSource completableSource) {
        this.source = singleSource;
        this.other = completableSource;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.other.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithCompletable.OtherObserver(singleObserver, this.source));
    }

    static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.SingleSource<T> source;

        OtherObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.downstream = singleObserver;
            this.source = singleSource;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.source.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.downstream));
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
