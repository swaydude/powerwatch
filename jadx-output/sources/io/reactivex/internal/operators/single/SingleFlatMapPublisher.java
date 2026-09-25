package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFlatMapPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final io.reactivex.SingleSource<T> source;

    public SingleFlatMapPublisher(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapPublisher.SingleFlatMapPublisherObserver(subscriber, this.mapper));
    }

    static final class SingleFlatMapPublisherObserver<S, T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.SingleObserver<S>, io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7759721921468635667L;
        io.reactivex.disposables.Disposable disposable;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.functions.Function<? super S, ? extends org.reactivestreams.Publisher<? extends T>> mapper;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> parent = new java.util.concurrent.atomic.AtomicReference<>();

        SingleFlatMapPublisherObserver(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super S, ? extends org.reactivestreams.Publisher<? extends T>> function) {
            this.downstream = subscriber;
            this.mapper = function;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s) {
            try {
                ((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.parent, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.parent, this, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.disposable.dispose();
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.parent);
        }
    }
}
