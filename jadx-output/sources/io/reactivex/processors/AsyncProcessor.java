package io.reactivex.processors;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] EMPTY = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[0];
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] TERMINATED = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[0];
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    T value;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.AsyncProcessor<T> create() {
        return new io.reactivex.processors.AsyncProcessor<>();
    }

    AsyncProcessor() {
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
        if (this.subscribers.get() == TERMINATED) {
            return;
        }
        this.value = t;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.value = null;
        this.error = th;
        for (io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription : this.subscribers.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t = this.value;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] andSet = this.subscribers.getAndSet(asyncSubscriptionArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription = new io.reactivex.processors.AsyncProcessor.AsyncSubscription<>(subscriber, this);
        subscriber.onSubscribe(asyncSubscription);
        if (add(asyncSubscription)) {
            if (asyncSubscription.isCancelled()) {
                remove(asyncSubscription);
                return;
            }
            return;
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            subscriber.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            asyncSubscription.complete(t);
        } else {
            asyncSubscription.onComplete();
        }
    }

    boolean add(io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription) {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.subscribers.get();
            if (asyncSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[length + 1];
            java.lang.System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!this.subscribers.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    void remove(io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> asyncSubscription) {
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr;
        io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.subscribers.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (asyncSubscriptionArr[i2] == asyncSubscription) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = EMPTY;
            } else {
                io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[] asyncSubscriptionArr3 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[length - 1];
                java.lang.System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(asyncSubscriptionArr, i + 1, asyncSubscriptionArr3, i, (length - i) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    public boolean hasValue() {
        return this.subscribers.get() == TERMINATED && this.value != null;
    }

    public T getValue() {
        if (this.subscribers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    @java.lang.Deprecated
    public java.lang.Object[] getValues() {
        T value = getValue();
        return value != null ? new java.lang.Object[]{value} : new java.lang.Object[0];
    }

    @java.lang.Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    static final class AsyncSubscription<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final io.reactivex.processors.AsyncProcessor<T> parent;

        AsyncSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.parent = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (super.tryCancel()) {
                this.parent.remove(this);
            }
        }

        void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.downstream.onComplete();
        }

        void onError(java.lang.Throwable th) {
            if (isCancelled()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
