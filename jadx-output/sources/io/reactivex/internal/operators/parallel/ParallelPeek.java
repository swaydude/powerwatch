package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelPeek<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.Consumer<? super T> onAfterNext;
    final io.reactivex.functions.Action onAfterTerminated;
    final io.reactivex.functions.Action onCancel;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.LongConsumer onRequest;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelPeek(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super T> consumer2, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer3, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer4, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action3) {
        this.source = parallelFlowable;
        this.onNext = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.onAfterNext = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.onError = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.onComplete = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onComplete is null");
        this.onAfterTerminated = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.onSubscribe = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.onRequest = (io.reactivex.functions.LongConsumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.onCancel = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelPeek.ParallelPeekSubscriber(subscriberArr[i], this);
            }
            this.source.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    static final class ParallelPeekSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.internal.operators.parallel.ParallelPeek<T> parent;
        org.reactivestreams.Subscription upstream;

        ParallelPeekSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.parallel.ParallelPeek<T> parallelPeek) {
            this.downstream = subscriber;
            this.parent = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.parent.onRequest.accept(j);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            try {
                this.parent.onCancel.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                try {
                    this.parent.onSubscribe.accept(subscription);
                    this.downstream.onSubscribe(this);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    subscription.cancel();
                    this.downstream.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.parent.onNext.accept(t);
                this.downstream.onNext(t);
                try {
                    this.parent.onAfterNext.accept(t);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            try {
                this.parent.onError.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
            try {
                this.parent.onAfterTerminated.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            try {
                this.parent.onComplete.run();
                this.downstream.onComplete();
                try {
                    this.parent.onAfterTerminated.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }
    }
}
