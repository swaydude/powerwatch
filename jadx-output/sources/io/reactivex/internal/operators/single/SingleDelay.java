package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDelay<T> extends io.reactivex.Single<T> {
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<? extends T> source;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    public SingleDelay(io.reactivex.SingleSource<? extends T> singleSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        this.source = singleSource;
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDelay.Delay(sequentialDisposable, singleObserver));
    }

    final class Delay implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super T> downstream;
        private final io.reactivex.internal.disposables.SequentialDisposable sd;

        Delay(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.SingleObserver<? super T> singleObserver) {
            this.sd = sequentialDisposable;
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.sd.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.sd.replace(io.reactivex.internal.operators.single.SingleDelay.this.scheduler.scheduleDirect(new io.reactivex.internal.operators.single.SingleDelay.Delay.OnSuccess(t), io.reactivex.internal.operators.single.SingleDelay.this.time, io.reactivex.internal.operators.single.SingleDelay.this.unit));
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.sd.replace(io.reactivex.internal.operators.single.SingleDelay.this.scheduler.scheduleDirect(new io.reactivex.internal.operators.single.SingleDelay.Delay.OnError(th), io.reactivex.internal.operators.single.SingleDelay.this.delayError ? io.reactivex.internal.operators.single.SingleDelay.this.time : 0L, io.reactivex.internal.operators.single.SingleDelay.this.unit));
        }

        final class OnSuccess implements java.lang.Runnable {
            private final T value;

            OnSuccess(T t) {
                this.value = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.single.SingleDelay.Delay.this.downstream.onSuccess(this.value);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable e;

            OnError(java.lang.Throwable th) {
                this.e = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.single.SingleDelay.Delay.this.downstream.onError(this.e);
            }
        }
    }
}
