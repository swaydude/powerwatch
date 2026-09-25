package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoOnLifecycle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    private final io.reactivex.functions.Action onCancel;
    private final io.reactivex.functions.LongConsumer onRequest;
    private final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;

    public FlowableDoOnLifecycle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle.SubscriptionLambdaSubscriber(subscriber, this.onSubscribe, this.onRequest, this.onCancel));
    }

    static final class SubscriptionLambdaSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.functions.Action onCancel;
        final io.reactivex.functions.LongConsumer onRequest;
        final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;
        org.reactivestreams.Subscription upstream;

        SubscriptionLambdaSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action) {
            this.downstream = subscriber;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            try {
                this.onSubscribe.accept(subscription);
                if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                    this.upstream = subscription;
                    this.downstream.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                subscription.cancel();
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.downstream);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.upstream != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.upstream != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.onRequest.accept(j);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            org.reactivestreams.Subscription subscription = this.upstream;
            if (subscription != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                try {
                    this.onCancel.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
                subscription.cancel();
            }
        }
    }
}
