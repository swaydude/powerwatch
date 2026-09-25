package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
    final org.reactivestreams.Publisher<? extends U> other;

    public FlowableWithLatestFrom(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, org.reactivestreams.Publisher<? extends U> publisher) {
        super(flowable);
        this.combiner = biFunction;
        this.other = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber withLatestFromSubscriber = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((io.reactivex.FlowableSubscriber) withLatestFromSubscriber);
    }

    static final class WithLatestFromSubscriber<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other = new java.util.concurrent.atomic.AtomicReference<>();

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = subscriber;
            this.combiner = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.downstream.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.combiner.apply(t, u), "The combiner returned a null value"));
                    return true;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
        }

        public boolean setOther(org.reactivestreams.Subscription subscription) {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.other, subscription);
        }

        public void otherError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }
    }

    final class FlowableWithLatestSubscriber implements io.reactivex.FlowableSubscriber<U> {
        private final io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> wlf;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        FlowableWithLatestSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.wlf = withLatestFromSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (this.wlf.setOther(subscription)) {
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            this.wlf.lazySet(u);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.wlf.otherError(th);
        }
    }
}
