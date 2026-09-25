package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureDrop<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> implements io.reactivex.functions.Consumer<T> {
    final io.reactivex.functions.Consumer<? super T> onDrop;

    @Override // io.reactivex.functions.Consumer
    public void accept(T t) {
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> flowable) {
        super(flowable);
        this.onDrop = this;
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super T> consumer) {
        super(flowable);
        this.onDrop = consumer;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop.BackpressureDropSubscriber(subscriber, this.onDrop));
    }

    static final class BackpressureDropSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.functions.Consumer<? super T> onDrop;
        org.reactivestreams.Subscription upstream;

        BackpressureDropSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer) {
            this.downstream = subscriber;
            this.onDrop = consumer;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
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
            if (get() != 0) {
                this.downstream.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
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
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
