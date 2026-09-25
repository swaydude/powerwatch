package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMapSingle<T, R> extends io.reactivex.Flowable<R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final io.reactivex.Flowable<T> source;

    public FlowableSwitchMapSingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber(subscriber, this.mapper, this.delayErrors));
    }

    static final class SwitchMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> INNER_DISPOSED = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        long emitted;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> inner = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
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
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.dispose();
            }
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver3 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<>(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!this.inner.compareAndSet(switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.subscribe(switchMapSingleObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.inner.getAndSet((io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>) INNER_DISPOSED);
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
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> atomicReference = this.inner;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver = INNER_DISPOSED;
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
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

        void innerError(io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver, java.lang.Throwable th) {
            if (this.inner.compareAndSet(switchMapSingleObserver, null) && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    disposeInner();
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber = this.downstream;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> atomicReference = this.inner;
            java.util.concurrent.atomic.AtomicLong atomicLong = this.requested;
            long j = this.emitted;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
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
                if (!z2 && switchMapSingleObserver.item != null && j != atomicLong.get()) {
                    atomicReference.compareAndSet(switchMapSingleObserver, null);
                    subscriber.onNext(switchMapSingleObserver.item);
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

        static final class SwitchMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> parent;

            SwitchMapSingleObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(this, th);
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
