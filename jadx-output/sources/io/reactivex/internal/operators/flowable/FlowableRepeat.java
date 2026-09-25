package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRepeat<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long count;

    public FlowableRepeat(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.count = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        long j = this.count;
        long j2 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            j2 = j - 1;
        }
        new io.reactivex.internal.operators.flowable.FlowableRepeat.RepeatSubscriber(subscriber, j2, subscriptionArbiter, this.source).subscribeNext();
    }

    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        long produced;
        long remaining;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Publisher<? extends T> publisher) {
            this.downstream = subscriber;
            this.sa = subscriptionArbiter;
            this.source = publisher;
            this.remaining = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.sa.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j = this.remaining;
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.sa.produced(j);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
