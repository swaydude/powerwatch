package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapMaybe<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final int prefetch;
    final io.reactivex.Flowable<T> source;

    public FlowableConcatMapMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber(subscriber, this.mapper, this.prefetch, this.errorMode));
    }

    static final class ConcatMapMaybeSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        long emitted;
        final io.reactivex.internal.util.ErrorMode errorMode;
        R item;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
        final int prefetch;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        volatile int state;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber.ConcatMapMaybeObserver<R> inner = new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber.ConcatMapMaybeObserver<>(this);

        ConcatMapMaybeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i;
            this.errorMode = errorMode;
            this.queue = new io.reactivex.internal.queue.SpscArrayQueue(i);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("queue full?!"));
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
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

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        void innerComplete() {
            this.state = 0;
            drain();
        }

        void innerError(java.lang.Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode != io.reactivex.internal.util.ErrorMode.END) {
                    this.upstream.cancel();
                }
                this.state = 0;
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
            io.reactivex.internal.util.ErrorMode errorMode = this.errorMode;
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            java.util.concurrent.atomic.AtomicLong atomicLong = this.requested;
            int i = this.prefetch;
            int i2 = i - (i >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (this.cancelled) {
                    simplePlainQueue.clear();
                    this.item = null;
                } else {
                    int i3 = this.state;
                    if (atomicThrowable.get() != null && (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE || (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && i3 == 0))) {
                        break;
                    }
                    if (i3 == 0) {
                        boolean z = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            java.lang.Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z2) {
                            int i4 = this.consumed + 1;
                            if (i4 == i2) {
                                this.consumed = 0;
                                this.upstream.request(i2);
                            } else {
                                this.consumed = i4;
                            }
                            try {
                                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null MaybeSource");
                                this.state = 1;
                                maybeSource.subscribe(this.inner);
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.upstream.cancel();
                                simplePlainQueue.clear();
                                atomicThrowable.addThrowable(th);
                                subscriber.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i3 == 2) {
                        long j = this.emitted;
                        if (j != atomicLong.get()) {
                            R r = this.item;
                            this.item = null;
                            subscriber.onNext(r);
                            this.emitted = j + 1;
                            this.state = 0;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.item = null;
            subscriber.onError(atomicThrowable.terminate());
        }

        static final class ConcatMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> parent;

            ConcatMapMaybeObserver(io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.parent = concatMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
