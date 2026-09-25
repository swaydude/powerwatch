package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    interface TimeoutSupport {
        void onTimeout(long j);
    }

    public FlowableTimeoutTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, org.reactivestreams.Publisher<? extends T> publisher) {
        super(flowable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (this.other == null) {
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSubscriber timeoutSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSubscriber(subscriber, this.timeout, this.unit, this.scheduler.createWorker());
            subscriber.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0L);
            this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutSubscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutFallbackSubscriber timeoutFallbackSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutFallbackSubscriber(subscriber, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        subscriber.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startTimeout(0L);
        this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutFallbackSubscriber);
    }

    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.downstream = subscriber;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutTask(j, this), this.timeout, this.unit));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }
    }

    static final class TimeoutTask implements java.lang.Runnable {
        final long idx;
        final io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport parent;

        TimeoutTask(long j, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport timeoutSupport) {
            this.idx = j;
            this.parent = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final org.reactivestreams.Subscriber<? super T> downstream;
        org.reactivestreams.Publisher<? extends T> fallback;
        final java.util.concurrent.atomic.AtomicLong index;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
        final io.reactivex.Scheduler.Worker worker;

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, org.reactivestreams.Publisher<? extends T> publisher) {
            super(true);
            this.downstream = subscriber;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = publisher;
            this.task = new io.reactivex.internal.disposables.SequentialDisposable();
            this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
            this.index = new java.util.concurrent.atomic.AtomicLong();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
                setSubscription(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = this.index.get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutTask(j, this), this.timeout, this.unit));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    produced(j2);
                }
                org.reactivestreams.Publisher<? extends T> publisher = this.fallback;
                this.fallback = null;
                publisher.subscribe(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }
    }

    static final class FallbackSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final io.reactivex.internal.subscriptions.SubscriptionArbiter arbiter;
        final org.reactivestreams.Subscriber<? super T> downstream;

        FallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter) {
            this.downstream = subscriber;
            this.arbiter = subscriptionArbiter;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.arbiter.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
