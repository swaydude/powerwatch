package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDematerialize<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> selector;

    public FlowableDematerialize(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> function) {
        super(flowable);
        this.selector = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDematerialize.DematerializeSubscriber(subscriber, this.selector));
    }

    static final class DematerializeSubscriber<T, R> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> selector;
        org.reactivestreams.Subscription upstream;

        DematerializeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> function) {
            this.downstream = subscriber;
            this.selector = function;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                if (t instanceof io.reactivex.Notification) {
                    io.reactivex.Notification notification = (io.reactivex.Notification) t;
                    if (notification.isOnError()) {
                        io.reactivex.plugins.RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.Notification notification2 = (io.reactivex.Notification) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(t), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.upstream.cancel();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.upstream.cancel();
                    onComplete();
                } else {
                    this.downstream.onNext((java.lang.Object) notification2.getValue());
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.cancel();
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
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
