package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimer extends io.reactivex.Flowable<java.lang.Long> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public FlowableTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableTimer.TimerSubscriber timerSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimer.TimerSubscriber(subscriber);
        subscriber.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }

    static final class TimerSubscriber extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> downstream;
        volatile boolean requested;

        TimerSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                if (this.requested) {
                    this.downstream.onNext(0L);
                    lazySet(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                } else {
                    lazySet(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                    this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void setResource(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.trySet(this, disposable);
        }
    }
}
