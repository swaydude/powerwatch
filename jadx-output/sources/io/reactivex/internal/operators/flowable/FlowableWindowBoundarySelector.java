package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> close;
    final org.reactivestreams.Publisher<B> open;

    public FlowableWindowBoundarySelector(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<B> publisher, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> function, int i) {
        super(flowable);
        this.open = publisher;
        this.close = function;
        this.bufferSize = i;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.open, this.close, this.bufferSize));
    }

    static final class WindowBoundaryMainSubscriber<T, B, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> close;
        final org.reactivestreams.Publisher<B> open;
        final io.reactivex.disposables.CompositeDisposable resources;
        final java.util.concurrent.atomic.AtomicBoolean stopWindows;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicLong windows;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> ws;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, java.lang.Object obj) {
            return false;
        }

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, org.reactivestreams.Publisher<B> publisher, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> function, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.boundary = new java.util.concurrent.atomic.AtomicReference<>();
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new java.util.concurrent.atomic.AtomicBoolean();
            this.open = publisher;
            this.close = function;
            this.bufferSize = i;
            this.resources = new io.reactivex.disposables.CompositeDisposable();
            this.ws = new java.util.ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                if (this.stopWindows.get()) {
                    return;
                }
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryOpenSubscriber(this);
                if (this.boundary.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                    this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.ws.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        void error(java.lang.Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        void dispose() {
            this.resources.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
            java.util.List<io.reactivex.processors.UnicastProcessor<T>> list = this.ws;
            int iLeave = 1;
            while (true) {
                boolean z = this.done;
                java.lang.Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    dispose();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (objPoll instanceof io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation) {
                        io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation windowOperation = (io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation) objPoll;
                        if (windowOperation.w != null) {
                            if (list.remove(windowOperation.w)) {
                                windowOperation.w.onComplete();
                                if (this.windows.decrementAndGet() == 0) {
                                    dispose();
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.stopWindows.get()) {
                            io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                            long jRequested = requested();
                            if (jRequested != 0) {
                                list.add(unicastProcessorCreate);
                                subscriber.onNext(unicastProcessorCreate);
                                if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                    produced(1L);
                                }
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The publisher supplied is null");
                                    io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber(this, unicastProcessorCreate);
                                    if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                        this.windows.getAndIncrement();
                                        publisher.subscribe(operatorWindowBoundaryCloseSubscriber);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    cancel();
                                    subscriber.onError(th2);
                                }
                            } else {
                                cancel();
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver new window due to lack of requests"));
                            }
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                        }
                    }
                } else {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void open(B b) {
            this.queue.offer((U) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation(null, b));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void close(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer((U) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation(operatorWindowBoundaryCloseSubscriber.w, null));
            if (enter()) {
                drainLoop();
            }
        }
    }

    static final class WindowOperation<T, B> {
        final B open;
        final io.reactivex.processors.UnicastProcessor<T> w;

        WindowOperation(io.reactivex.processors.UnicastProcessor<T> unicastProcessor, B b) {
            this.w = unicastProcessor;
            this.open = b;
        }
    }

    static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> parent;

        OperatorWindowBoundaryOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            this.parent.open(b);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.error(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.onComplete();
        }
    }

    static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends io.reactivex.subscribers.DisposableSubscriber<V> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> parent;
        final io.reactivex.processors.UnicastProcessor<T> w;

        OperatorWindowBoundaryCloseSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.w = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(V v) {
            cancel();
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.error(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }
    }
}
