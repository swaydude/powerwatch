package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public FlowableThrottleFirstTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed.DebounceTimedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.timeout, this.unit, this.scheduler.createWorker()));
    }

    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final io.reactivex.internal.disposables.SequentialDisposable timer = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.downstream = subscriber;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done || this.gate) {
                return;
            }
            this.gate = true;
            if (get() != 0) {
                this.downstream.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                io.reactivex.disposables.Disposable disposable = this.timer.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.timer.replace(this.worker.schedule(this, this.timeout, this.unit));
                return;
            }
            this.done = true;
            cancel();
            this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }
    }
}
