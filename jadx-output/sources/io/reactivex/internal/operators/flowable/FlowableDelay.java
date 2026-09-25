package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDelay<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public FlowableDelay(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber(this.delayError ? subscriber : new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }

    static final class DelaySubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final long delay;
        final boolean delayError;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.Scheduler.Worker w;

        DelaySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.downstream = subscriber;
            this.delay = j;
            this.unit = timeUnit;
            this.w = worker;
            this.delayError = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.w.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnNext(t), this.delay, this.unit);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.w.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.w.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnComplete(), this.delay, this.unit);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            this.w.dispose();
        }

        final class OnNext implements java.lang.Runnable {
            private final T t;

            OnNext(T t) {
                this.t = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.downstream.onNext(this.t);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable t;

            OnError(java.lang.Throwable th) {
                this.t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.downstream.onError(this.t);
                } finally {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.w.dispose();
                }
            }
        }

        final class OnComplete implements java.lang.Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.downstream.onComplete();
                } finally {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.w.dispose();
                }
            }
        }
    }
}
