package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> itemTimeoutIndicator;
    final org.reactivestreams.Publisher<? extends T> other;

    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long j, java.lang.Throwable th);
    }

    public FlowableTimeout(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<U> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> function, org.reactivestreams.Publisher<? extends T> publisher2) {
        super(flowable);
        this.firstTimeoutIndicator = publisher;
        this.itemTimeoutIndicator = function;
        this.other = publisher2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (this.other == null) {
            io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSubscriber timeoutSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSubscriber(subscriber, this.itemTimeoutIndicator);
            subscriber.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
            this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutSubscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutFallbackSubscriber timeoutFallbackSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutFallbackSubscriber(subscriber, this.itemTimeoutIndicator, this.other);
        subscriber.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
        this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutFallbackSubscriber);
    }

    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> function) {
            this.downstream = subscriber;
            this.itemTimeoutIndicator = function;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(j2, this);
                        if (this.task.replace(timeoutConsumer)) {
                            publisher.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        void startFirstTimeout(org.reactivestreams.Publisher<?> publisher) {
            if (publisher != null) {
                io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    publisher.subscribe(timeoutConsumer);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new java.util.concurrent.TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j, java.lang.Throwable th) {
            if (compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
            this.task.dispose();
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final org.reactivestreams.Subscriber<? super T> downstream;
        org.reactivestreams.Publisher<? extends T> fallback;
        final java.util.concurrent.atomic.AtomicLong index;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> function, org.reactivestreams.Publisher<? extends T> publisher) {
            super(true);
            this.downstream = subscriber;
            this.itemTimeoutIndicator = function;
            this.task = new io.reactivex.internal.disposables.SequentialDisposable();
            this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
            this.fallback = publisher;
            this.index = new java.util.concurrent.atomic.AtomicLong();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription)) {
                setSubscription(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = this.index.get();
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.consumed++;
                    this.downstream.onNext(t);
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(j2, this);
                        if (this.task.replace(timeoutConsumer)) {
                            publisher.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        void startFirstTimeout(org.reactivestreams.Publisher<?> publisher) {
            if (publisher != null) {
                io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    publisher.subscribe(timeoutConsumer);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.index.getAndSet(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                org.reactivestreams.Publisher<? extends T> publisher = this.fallback;
                this.fallback = null;
                long j2 = this.consumed;
                if (j2 != 0) {
                    produced(j2);
                }
                publisher.subscribe(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.FallbackSubscriber(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j, java.lang.Throwable th) {
            if (this.index.compareAndSet(j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.task.dispose();
        }
    }

    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport parent;

        TimeoutConsumer(long j, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j;
            this.parent = timeoutSelectorSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object obj) {
            org.reactivestreams.Subscription subscription = (org.reactivestreams.Subscription) get();
            if (subscription != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                subscription.cancel();
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.parent.onTimeoutError(this.idx, th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
