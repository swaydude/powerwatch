package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
public final class PublishProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor.PublishSubscription<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] TERMINATED = new io.reactivex.processors.PublishProcessor.PublishSubscription[0];
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] EMPTY = new io.reactivex.processors.PublishProcessor.PublishSubscription[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.PublishProcessor<T> create() {
        return new io.reactivex.processors.PublishProcessor<>();
    }

    PublishProcessor() {
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription = new io.reactivex.processors.PublishProcessor.PublishSubscription<>(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        if (add(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                remove(publishSubscription);
            }
        } else {
            java.lang.Throwable th = this.error;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }
    }

    boolean add(io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription) {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr;
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new io.reactivex.processors.PublishProcessor.PublishSubscription[length + 1];
            java.lang.System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    void remove(io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription) {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr;
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED || publishSubscriptionArr == EMPTY) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (publishSubscriptionArr[i2] == publishSubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = EMPTY;
            } else {
                io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr3 = new io.reactivex.processors.PublishProcessor.PublishSubscription[length - 1];
                java.lang.System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.subscribers.get() == TERMINATED) {
            subscription.cancel();
        } else {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.subscribers.get()) {
            publishSubscription.onNext(t);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onComplete();
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.isFull()) {
                return false;
            }
        }
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.onNext(t);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    static final class PublishSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.processors.PublishProcessor<T> parent;

        PublishSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.PublishProcessor<T> publishProcessor) {
            this.downstream = subscriber;
            this.parent = publishProcessor;
        }

        public void onNext(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.downstream.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        public void onError(java.lang.Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        boolean isFull() {
            return get() == 0;
        }
    }
}
