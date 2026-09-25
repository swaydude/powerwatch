package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableZipIterable<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, V> {
    final java.lang.Iterable<U> other;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

    public FlowableZipIterable(io.reactivex.Flowable<T> flowable, java.lang.Iterable<U> iterable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super V> subscriber) {
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                } else {
                    this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableZipIterable.ZipIterableSubscriber(subscriber, it, this.zipper));
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
        }
    }

    static final class ZipIterableSubscriber<T, U, V> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final org.reactivestreams.Subscriber<? super V> downstream;
        final java.util.Iterator<U> iterator;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

        ZipIterableSubscriber(org.reactivestreams.Subscriber<? super V> subscriber, java.util.Iterator<U> it, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = subscriber;
            this.iterator = it;
            this.zipper = biFunction;
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
            try {
                try {
                    this.downstream.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.zipper.apply(t, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.iterator.hasNext()) {
                            return;
                        }
                        this.done = true;
                        this.upstream.cancel();
                        this.downstream.onComplete();
                    } catch (java.lang.Throwable th) {
                        error(th);
                    }
                } catch (java.lang.Throwable th2) {
                    error(th2);
                }
            } catch (java.lang.Throwable th3) {
                error(th3);
            }
        }

        void error(java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
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

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
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
}
