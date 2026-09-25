package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelCollect<T, C> extends io.reactivex.parallel.ParallelFlowable<C> {
    final io.reactivex.functions.BiConsumer<? super C, ? super T> collector;
    final java.util.concurrent.Callable<? extends C> initialCollection;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    public ParallelCollect(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, java.util.concurrent.Callable<? extends C> callable, io.reactivex.functions.BiConsumer<? super C, ? super T> biConsumer) {
        this.source = parallelFlowable;
        this.initialCollection = callable;
        this.collector = biConsumer;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super C>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super java.lang.Object>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                try {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelCollect.ParallelCollectSubscriber(subscriberArr[i], io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.initialCollection.call(), "The initialSupplier returned a null value"), this.collector);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    reportError(subscriberArr, th);
                    return;
                }
            }
            this.source.subscribe(subscriberArr2);
        }
    }

    void reportError(org.reactivestreams.Subscriber<?>[] subscriberArr, java.lang.Throwable th) {
        for (org.reactivestreams.Subscriber<?> subscriber : subscriberArr) {
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    static final class ParallelCollectSubscriber<T, C> extends io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C collection;
        final io.reactivex.functions.BiConsumer<? super C, ? super T> collector;
        boolean done;

        ParallelCollectSubscriber(org.reactivestreams.Subscriber<? super C> subscriber, C c, io.reactivex.functions.BiConsumer<? super C, ? super T> biConsumer) {
            super(subscriber);
            this.collection = c;
            this.collector = biConsumer;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept(this.collection, t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c = this.collection;
            this.collection = null;
            complete(c);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
