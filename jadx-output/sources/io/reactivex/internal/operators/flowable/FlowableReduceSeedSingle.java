package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final R seed;
    final org.reactivestreams.Publisher<T> source;

    public FlowableReduceSeedSingle(org.reactivestreams.Publisher<T> publisher, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.source = publisher;
        this.seed = r;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }

    static final class ReduceSeedObserver<T, R> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super R> downstream;
        final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
        org.reactivestreams.Subscription upstream;
        R value;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.downstream = singleObserver;
            this.value = r;
            this.reducer = biFunction;
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
            R r = this.value;
            if (r != null) {
                try {
                    this.value = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(r, t), "The reducer returned a null value");
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.value != null) {
                this.value = null;
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            R r = this.value;
            if (r != null) {
                this.value = null;
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(r);
            }
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
