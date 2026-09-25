package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> other;

    public FlowableSwitchIfEmpty(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<? extends T> publisher) {
        super(flowable);
        this.other = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty.SwitchIfEmptySubscriber switchIfEmptySubscriber = new io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty.SwitchIfEmptySubscriber(subscriber, this.other);
        subscriber.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((io.reactivex.FlowableSubscriber) switchIfEmptySubscriber);
    }

    static final class SwitchIfEmptySubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> downstream;
        final org.reactivestreams.Publisher<? extends T> other;
        boolean empty = true;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter arbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter(false);

        SwitchIfEmptySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<? extends T> publisher) {
            this.downstream = subscriber;
            this.other = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.arbiter.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.empty) {
                this.empty = false;
                this.other.subscribe(this);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
