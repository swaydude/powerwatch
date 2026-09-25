package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final io.reactivex.Scheduler scheduler;

    public FlowableSubscribeOn(io.reactivex.Flowable<T> flowable, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber subscribeOnSubscriber = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber(subscriber, workerCreateWorker, this.source, this.nonScheduledRequests);
        subscriber.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }

    static final class SubscribeOnSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final boolean nonScheduledRequests;
        org.reactivestreams.Publisher<T> source;
        final io.reactivex.Scheduler.Worker worker;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        SubscribeOnSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.Scheduler.Worker worker, org.reactivestreams.Publisher<T> publisher, boolean z) {
            this.downstream = subscriber;
            this.worker = worker;
            this.source = publisher;
            this.nonScheduledRequests = !z;
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(java.lang.Thread.currentThread());
            org.reactivestreams.Publisher<T> publisher = this.source;
            this.source = null;
            publisher.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, subscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                org.reactivestreams.Subscription subscription = this.upstream.get();
                if (subscription != null) {
                    requestUpstream(j, subscription);
                    return;
                }
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                org.reactivestreams.Subscription subscription2 = this.upstream.get();
                if (subscription2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, subscription2);
                    }
                }
            }
        }

        void requestUpstream(long j, org.reactivestreams.Subscription subscription) {
            if (this.nonScheduledRequests || java.lang.Thread.currentThread() == get()) {
                subscription.request(j);
            } else {
                this.worker.schedule(new io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber.Request(subscription, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        static final class Request implements java.lang.Runnable {
            final long n;
            final org.reactivestreams.Subscription upstream;

            Request(org.reactivestreams.Subscription subscription, long j) {
                this.upstream = subscription;
                this.n = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.n);
            }
        }
    }
}
