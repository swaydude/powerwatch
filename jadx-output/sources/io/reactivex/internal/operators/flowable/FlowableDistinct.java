package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDistinct<T, K> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.Callable<? extends java.util.Collection<? super K>> collectionSupplier;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    public FlowableDistinct(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, K> function, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> callable) {
        super(flowable);
        this.keySelector = function;
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDistinct.DistinctSubscriber(subscriber, this.keySelector, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static final class DistinctSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final java.util.Collection<? super K> collection;
        final io.reactivex.functions.Function<? super T, K> keySelector;

        DistinctSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, K> function, java.util.Collection<? super K> collection) {
            super(subscriber);
            this.keySelector = function;
            this.collection = collection;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.collection.add(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.keySelector.apply(t), "The keySelector returned a null key"))) {
                        this.downstream.onNext((java.lang.Object) t);
                        return;
                    } else {
                        this.upstream.request(1L);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    fail(th);
                    return;
                }
            }
            this.downstream.onNext(null);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            T tPoll;
            while (true) {
                tPoll = this.qs.poll();
                if (tPoll == null || this.collection.add((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.keySelector.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.sourceMode == 2) {
                    this.upstream.request(1L);
                }
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.collection.clear();
            super.clear();
        }
    }
}
