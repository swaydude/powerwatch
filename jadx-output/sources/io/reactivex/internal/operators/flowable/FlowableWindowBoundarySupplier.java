package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int capacityHint;
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> other;

    public FlowableWindowBoundarySupplier(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable, int i) {
        super(flowable);
        this.other = callable;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber(subscriber, this.capacityHint, this.other));
    }

    static final class WindowBoundaryMainSubscriber<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<java.lang.Object, java.lang.Object> BOUNDARY_DISPOSED = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<>(null);
        static final java.lang.Object NEXT_WINDOW = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> downstream;
        long emitted;
        final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> other;
        org.reactivestreams.Subscription upstream;
        io.reactivex.processors.UnicastProcessor<T> window;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B>> boundarySubscriber = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger windows = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> queue = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable errors = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean stopWindows = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, int i, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable) {
            this.downstream = subscriber;
            this.capacityHint = i;
            this.other = callable;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            disposeBoundary();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
        }

        void disposeBoundary() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B>> atomicReference = this.boundarySubscriber;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<java.lang.Object, java.lang.Object> windowBoundaryInnerSubscriber = BOUNDARY_DISPOSED;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B> andSet = atomicReference.getAndSet((io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B>) windowBoundaryInnerSubscriber);
            if (andSet == null || andSet == windowBoundaryInnerSubscriber) {
                return;
            }
            andSet.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        void innerNext(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber) {
            this.boundarySubscriber.compareAndSet(windowBoundaryInnerSubscriber, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        void innerError(java.lang.Throwable th) {
            this.upstream.cancel();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void innerComplete() {
            this.upstream.cancel();
            this.done = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber = this.downstream;
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.errors;
            long j = this.emitted;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
                boolean z = this.done;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    java.lang.Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate);
                    }
                    subscriber.onError(thTerminate);
                    return;
                }
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    java.lang.Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    subscriber.onError(thTerminate2);
                    return;
                }
                if (!z2) {
                    if (objPoll != NEXT_WINDOW) {
                        unicastProcessor.onNext((T) objPoll);
                    } else {
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            if (j != this.requested.get()) {
                                io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.capacityHint, this);
                                this.window = unicastProcessorCreate;
                                this.windows.getAndIncrement();
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null Publisher");
                                    io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<>(this);
                                    if (this.boundarySubscriber.compareAndSet(null, windowBoundaryInnerSubscriber)) {
                                        publisher.subscribe(windowBoundaryInnerSubscriber);
                                        j++;
                                        subscriber.onNext(unicastProcessorCreate);
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    atomicThrowable.addThrowable(th);
                                    this.done = true;
                                }
                            } else {
                                this.upstream.cancel();
                                disposeBoundary();
                                atomicThrowable.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                this.done = true;
                            }
                        }
                    }
                } else {
                    this.emitted = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }
    }

    static final class WindowBoundaryInnerSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> parent;

        WindowBoundaryInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.done) {
                return;
            }
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }
    }
}
