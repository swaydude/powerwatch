package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleTimer extends io.reactivex.Single<java.lang.Long> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public SingleTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        io.reactivex.internal.operators.single.SingleTimer.TimerDisposable timerDisposable = new io.reactivex.internal.operators.single.SingleTimer.TimerDisposable(singleObserver);
        singleObserver.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.scheduler.scheduleDirect(timerDisposable, this.delay, this.unit));
    }

    static final class TimerDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final io.reactivex.SingleObserver<? super java.lang.Long> downstream;

        TimerDisposable(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onSuccess(0L);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        void setFuture(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }
    }
}
