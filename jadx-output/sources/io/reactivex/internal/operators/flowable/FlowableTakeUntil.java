package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTakeUntil<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends U> other;

    public FlowableTakeUntil(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<? extends U> publisher) {
        super(flowable);
        this.other = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = new io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber(subscriber);
        subscriber.onSubscribe(takeUntilMainSubscriber);
        this.other.subscribe(takeUntilMainSubscriber.other);
        this.source.subscribe((io.reactivex.FlowableSubscriber) takeUntilMainSubscriber);
    }

    static final class TakeUntilMainSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4945480365982832967L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber<T>.OtherSubscriber other = new io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.OtherSubscriber();
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();

        TakeUntilMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.downstream, t, this, this.error);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            io.reactivex.internal.util.HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            io.reactivex.internal.util.HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
        }

        final class OtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(java.lang.Object obj) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.upstream);
                org.reactivestreams.Subscriber<? super T> subscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.downstream;
                io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.HalfSerializer.onError(subscriber, th, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.upstream);
                org.reactivestreams.Subscriber<? super T> subscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.downstream;
                io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.HalfSerializer.onComplete(subscriber, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }
        }
    }
}
