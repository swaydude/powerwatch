package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Long> {
    final io.reactivex.Flowable<T> source;

    public FlowableCountSingle(io.reactivex.Flowable<T> flowable) {
        this.source = flowable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableCountSingle.CountSubscriber(singleObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<java.lang.Long> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableCount(this.source));
    }

    static final class CountSubscriber implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        long count;
        final io.reactivex.SingleObserver<? super java.lang.Long> downstream;
        org.reactivestreams.Subscription upstream;

        CountSubscriber(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.downstream = singleObserver;
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
        public void onNext(java.lang.Object obj) {
            this.count++;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.downstream.onSuccess(java.lang.Long.valueOf(this.count));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
