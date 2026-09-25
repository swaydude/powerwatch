package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableToListSingle<T, U extends java.util.Collection<? super T>> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToFlowable<U> {
    final java.util.concurrent.Callable<U> collectionSupplier;
    final io.reactivex.Flowable<T> source;

    public FlowableToListSingle(io.reactivex.Flowable<T> flowable) {
        this(flowable, io.reactivex.internal.util.ArrayListSupplier.asCallable());
    }

    public FlowableToListSingle(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<U> callable) {
        this.source = flowable;
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableToListSingle.ToListSubscriber(singleObserver, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<U> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableToList(this.source, this.collectionSupplier));
    }

    static final class ToListSubscriber<T, U extends java.util.Collection<? super T>> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super U> downstream;
        org.reactivestreams.Subscription upstream;
        U value;

        ToListSubscriber(io.reactivex.SingleObserver<? super U> singleObserver, U u) {
            this.downstream = singleObserver;
            this.value = u;
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
            this.value.add(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.value = null;
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.downstream.onSuccess(this.value);
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
