package io.reactivex.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DisposableSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.upstream, subscription, getClass())) {
            onStart();
        }
    }

    protected void onStart() {
        this.upstream.get().request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    protected final void request(long j) {
        this.upstream.get().request(j);
    }

    protected final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
    }
}
