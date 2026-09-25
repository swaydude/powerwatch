package io.reactivex.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializedSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    static final int QUEUE_LINK_SIZE = 4;
    final boolean delayError;
    volatile boolean done;
    final org.reactivestreams.Subscriber<? super T> downstream;
    boolean emitting;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
    org.reactivestreams.Subscription upstream;

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, boolean z) {
        this.downstream = subscriber;
        this.delayError = z;
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
        if (this.done) {
            return;
        }
        if (t == null) {
            this.upstream.cancel();
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            if (this.emitting) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.next(t));
                return;
            }
            this.emitting = true;
            this.downstream.onNext(t);
            emitLoop();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.done) {
                if (this.emitting) {
                    this.done = true;
                    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    java.lang.Object objError = io.reactivex.internal.util.NotificationLite.error(th);
                    if (this.delayError) {
                        appendOnlyLinkedArrayList.add(objError);
                    } else {
                        appendOnlyLinkedArrayList.setFirst(objError);
                    }
                    return;
                }
                this.done = true;
                this.emitting = true;
                z = false;
            }
            if (z) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            if (this.emitting) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.complete());
                return;
            }
            this.done = true;
            this.emitting = true;
            this.downstream.onComplete();
        }
    }

    void emitLoop() {
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    this.emitting = false;
                    return;
                }
                this.queue = null;
            }
        } while (!appendOnlyLinkedArrayList.accept(this.downstream));
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        this.upstream.request(j);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.upstream.cancel();
    }
}
