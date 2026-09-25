package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicFuseableSubscriber<T, R> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.fuseable.QueueSubscription<R> {
    protected boolean done;
    protected final org.reactivestreams.Subscriber<? super R> downstream;
    protected io.reactivex.internal.fuseable.QueueSubscription<T> qs;
    protected int sourceMode;
    protected org.reactivestreams.Subscription upstream;

    protected void afterDownstream() {
    }

    protected boolean beforeDownstream() {
        return true;
    }

    public BasicFuseableSubscriber(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.downstream = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                this.qs = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    protected final void fail(java.lang.Throwable th) {
        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        this.upstream.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    protected final int transitiveBoundaryFusion(int i) {
        io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.qs;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        this.upstream.request(j);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    public void clear() {
        this.qs.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r, R r2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
