package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSamplePublisher<T> extends io.reactivex.Flowable<T> {
    final boolean emitLast;
    final org.reactivestreams.Publisher<?> other;
    final org.reactivestreams.Publisher<T> source;

    public FlowableSamplePublisher(org.reactivestreams.Publisher<T> publisher, org.reactivestreams.Publisher<?> publisher2, boolean z) {
        this.source = publisher;
        this.other = publisher2;
        this.emitLast = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        if (this.emitLast) {
            this.source.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SampleMainEmitLast(serializedSubscriber, this.other));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SampleMainNoLast(serializedSubscriber, this.other));
        }
    }

    static abstract class SamplePublisherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final org.reactivestreams.Publisher<?> sampler;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other = new java.util.concurrent.atomic.AtomicReference<>();

        abstract void completion();

        abstract void run();

        SamplePublisherSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            this.downstream = subscriber;
            this.sampler = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplerSubscriber(this));
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            completion();
        }

        void setOther(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.other, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void error(java.lang.Throwable th) {
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        public void complete() {
            this.upstream.cancel();
            completion();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    io.reactivex.internal.util.BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    static final class SamplerSubscriber<T> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        final io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> parent;

        SamplerSubscriber(io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.parent.setOther(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object obj) {
            this.parent.run();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.error(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.complete();
        }
    }

    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            super(subscriber, publisher);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void run() {
            emit();
        }
    }

    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleMainEmitLast(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            super(subscriber, publisher);
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }
}
