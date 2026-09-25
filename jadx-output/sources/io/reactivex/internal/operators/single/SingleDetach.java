package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDetach<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> source;

    public SingleDetach(io.reactivex.SingleSource<T> singleSource) {
        this.source = singleSource;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDetach.DetachSingleObserver(singleObserver));
    }

    static final class DetachSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.SingleObserver<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;

        DetachSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.downstream = null;
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
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
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.SingleObserver<? super T> singleObserver = this.downstream;
            if (singleObserver != null) {
                this.downstream = null;
                singleObserver.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.SingleObserver<? super T> singleObserver = this.downstream;
            if (singleObserver != null) {
                this.downstream = null;
                singleObserver.onError(th);
            }
        }
    }
}
