package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableUsing<T, D> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super D> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<? extends D> resourceSupplier;
    final io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> sourceSupplier;

    public FlowableUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null Publisher")).subscribe(new io.reactivex.internal.operators.flowable.FlowableUsing.UsingSubscriber(subscriber, dCall, this.disposer, this.eager));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                try {
                    this.disposer.accept(dCall);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(new io.reactivex.exceptions.CompositeException(th, th2), subscriber);
                }
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th3, subscriber);
        }
    }

    static final class UsingSubscriber<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 5904473792286235046L;
        final io.reactivex.functions.Consumer<? super D> disposer;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final boolean eager;
        final D resource;
        org.reactivestreams.Subscription upstream;

        UsingSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            this.downstream = subscriber;
            this.resource = d;
            this.disposer = consumer;
            this.eager = z;
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
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.eager) {
                java.lang.Throwable th2 = null;
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    }
                }
                this.upstream.cancel();
                if (th2 != null) {
                    this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.downstream.onError(th);
            this.upstream.cancel();
            disposeAfter();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.cancel();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.cancel();
            disposeAfter();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            disposeAfter();
            this.upstream.cancel();
        }

        void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
