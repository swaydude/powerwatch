package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleUnsubscribeOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;

    public SingleUnsubscribeOn(io.reactivex.SingleSource<T> singleSource, io.reactivex.Scheduler scheduler) {
        this.source = singleSource;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleUnsubscribeOn.UnsubscribeOnSingleObserver(singleObserver, this.scheduler));
    }

    static final class UnsubscribeOnSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.SingleObserver<? super T> downstream;
        io.reactivex.disposables.Disposable ds;
        final io.reactivex.Scheduler scheduler;

        UnsubscribeOnSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.Scheduler scheduler) {
            this.downstream = singleObserver;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.disposables.Disposable andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
            if (andSet != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.ds = andSet;
                this.scheduler.scheduleDirect(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
