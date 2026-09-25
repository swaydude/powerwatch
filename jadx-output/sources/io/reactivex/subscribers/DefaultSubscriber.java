package io.reactivex.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
    org.reactivestreams.Subscription upstream;

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.util.EndConsumerHelper.validate(this.upstream, subscription, getClass())) {
            this.upstream = subscription;
            onStart();
        }
    }

    protected final void request(long j) {
        org.reactivestreams.Subscription subscription = this.upstream;
        if (subscription != null) {
            subscription.request(j);
        }
    }

    protected final void cancel() {
        org.reactivestreams.Subscription subscription = this.upstream;
        this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    protected void onStart() {
        request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }
}
