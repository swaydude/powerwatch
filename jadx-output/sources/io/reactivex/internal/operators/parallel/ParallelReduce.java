package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelReduce<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final java.util.concurrent.Callable<R> initialSupplier;
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    public ParallelReduce(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.source = parallelFlowable;
        this.initialSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super java.lang.Object>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                try {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelReduce.ParallelReduceSubscriber(subscriberArr[i], io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.reducer);
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

    static final class ParallelReduceSubscriber<T, R> extends io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        R accumulator;
        boolean done;
        final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;

        ParallelReduceSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
            super(subscriber);
            this.accumulator = r;
            this.reducer = biFunction;
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
                this.accumulator = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(this.accumulator, t), "The reducer returned a null value");
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
            this.accumulator = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            R r = this.accumulator;
            this.accumulator = null;
            complete(r);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
