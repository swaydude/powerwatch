package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimeInterval<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public FlowableTimeInterval(io.reactivex.Flowable<T> flowable, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTimeInterval.TimeIntervalSubscriber(subscriber, this.unit, this.scheduler));
    }

    static final class TimeIntervalSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> downstream;
        long lastTime;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;

        TimeIntervalSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> subscriber, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.downstream = subscriber;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long jNow = this.scheduler.now(this.unit);
            long j = this.lastTime;
            this.lastTime = jNow;
            this.downstream.onNext(new io.reactivex.schedulers.Timed(t, jNow - j, this.unit));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
