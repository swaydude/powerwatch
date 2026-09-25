package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDelay extends io.reactivex.Completable {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;
    final java.util.concurrent.TimeUnit unit;

    public CompletableDelay(io.reactivex.CompletableSource completableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        this.source = completableSource;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableDelay.Delay(completableObserver, this.delay, this.unit, this.scheduler, this.delayError));
    }

    static final class Delay extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final io.reactivex.CompletableObserver downstream;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        Delay(io.reactivex.CompletableObserver completableObserver, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
            this.downstream = completableObserver;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.delayError = z;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delay, this.unit));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.error = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delayError ? this.delay : 0L, this.unit));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
