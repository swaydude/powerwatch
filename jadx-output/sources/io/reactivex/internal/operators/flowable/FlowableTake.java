package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTake<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long limit;

    public FlowableTake(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.limit = j;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTake.TakeSubscriber(subscriber, this.limit));
    }

    static final class TakeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final long limit;
        long remaining;
        org.reactivestreams.Subscription upstream;

        TakeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j) {
            this.downstream = subscriber;
            this.limit = j;
            this.remaining = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (this.limit == 0) {
                    subscription.cancel();
                    this.done = true;
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.remaining;
            long j2 = j - 1;
            this.remaining = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.downstream.onNext(t);
                if (z) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                if (!get() && compareAndSet(false, true) && j >= this.limit) {
                    this.upstream.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                } else {
                    this.upstream.request(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
