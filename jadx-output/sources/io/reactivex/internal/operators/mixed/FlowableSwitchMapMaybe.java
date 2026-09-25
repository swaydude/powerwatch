package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMapMaybe<T, R> extends io.reactivex.Flowable<R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final io.reactivex.Flowable<T> source;

    public FlowableSwitchMapMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber(subscriber, this.mapper, this.delayErrors));
    }

    static final class SwitchMapMaybeSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> INNER_DISPOSED = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        long emitted;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> inner = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapMaybeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z;
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
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
            if (switchMapMaybeObserver2 != null) {
                switchMapMaybeObserver2.dispose();
            }
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<>(this);
                do {
                    switchMapMaybeObserver = this.inner.get();
                    if (switchMapMaybeObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!this.inner.compareAndSet(switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.subscribe(switchMapMaybeObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.inner.getAndSet((io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>) INNER_DISPOSED);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        void disposeInner() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = INNER_DISPOSED;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            andSet.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        void innerError(io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver, java.lang.Throwable th) {
            if (this.inner.compareAndSet(switchMapMaybeObserver, null) && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    disposeInner();
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void innerComplete(io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            if (this.inner.compareAndSet(switchMapMaybeObserver, null)) {
                drain();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            java.util.concurrent.atomic.AtomicLong atomicLong = this.requested;
            long j = this.emitted;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber.SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
                if (z && z2) {
                    java.lang.Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        subscriber.onError(thTerminate);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (!z2 && switchMapMaybeObserver.item != null && j != atomicLong.get()) {
                    atomicReference.compareAndSet(switchMapMaybeObserver, null);
                    subscriber.onNext(switchMapMaybeObserver.item);
                    j++;
                } else {
                    this.emitted = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        static final class SwitchMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> parent;

            SwitchMapMaybeObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe.SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber) {
                this.parent = switchMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
