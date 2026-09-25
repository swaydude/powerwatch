package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDetach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableDetach(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDetach.DetachSubscriber(subscriber));
    }

    static final class DetachSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscriber<? super T> downstream;
        org.reactivestreams.Subscription upstream;

        DetachSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            org.reactivestreams.Subscription subscription = this.upstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscription.cancel();
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
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }
    }
}
