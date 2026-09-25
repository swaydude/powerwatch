package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReduceMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T>, io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.Flowable<T> source;

    public FlowableReduceMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.source = flowable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableReduce(this.source, this.reducer));
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableReduceMaybe.ReduceSubscriber(maybeObserver, this.reducer));
    }

    static final class ReduceSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        org.reactivestreams.Subscription upstream;
        T value;

        ReduceSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.downstream = maybeObserver;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.done = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.done;
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
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(t2, t), "The reducer returned a null value");
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
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
