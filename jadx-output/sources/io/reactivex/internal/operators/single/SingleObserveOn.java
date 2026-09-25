package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleObserveOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;

    public SingleObserveOn(io.reactivex.SingleSource<T> singleSource, io.reactivex.Scheduler scheduler) {
        this.source = singleSource;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleObserveOn.ObserveOnSingleObserver(singleObserver, this.scheduler));
    }

    static final class ObserveOnSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final io.reactivex.SingleObserver<? super T> downstream;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        T value;

        ObserveOnSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.Scheduler scheduler) {
            this.downstream = singleObserver;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.value = t;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.error = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
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
