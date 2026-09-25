package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> boundarySupplier;
    final java.util.concurrent.Callable<U> bufferSupplier;

    public FlowableBufferBoundarySupplier(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable, java.util.concurrent.Callable<U> callable2) {
        super(flowable);
        this.boundarySupplier = callable;
        this.bufferSupplier = callable2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.bufferSupplier, this.boundarySupplier));
    }

    static final class BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> boundarySupplier;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;
        org.reactivestreams.Subscription upstream;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            return accept((org.reactivestreams.Subscriber<? super java.util.Collection>) subscriber, (java.util.Collection) obj);
        }

        BufferBoundarySupplierSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable2) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.other = new java.util.concurrent.atomic.AtomicReference<>();
            this.bufferSupplier = callable;
            this.boundarySupplier = callable2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                        io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber(this);
                        this.other.set(bufferBoundarySubscriber);
                        subscriber.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        publisher.subscribe(bufferBoundarySubscriber);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        subscription.cancel();
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            cancel();
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                this.buffer = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeOther();
            if (enter()) {
                this.queue.clear();
            }
        }

        void disposeOther() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
        }

        void next() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                try {
                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                    io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber(this);
                    if (io.reactivex.internal.disposables.DisposableHelper.replace(this.other, bufferBoundarySubscriber)) {
                        synchronized (this) {
                            U u2 = this.buffer;
                            if (u2 == null) {
                                return;
                            }
                            this.buffer = u;
                            publisher.subscribe(bufferBoundarySubscriber);
                            fastPathEmitMax(u2, false, this);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    this.downstream.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeOther();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.other.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(org.reactivestreams.Subscriber<? super U> subscriber, U u) {
            this.downstream.onNext((java.lang.Object) u);
            return true;
        }
    }

    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean once;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> parent;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.parent = bufferBoundarySupplierSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.once) {
                return;
            }
            this.once = true;
            cancel();
            this.parent.next();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.once) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.once = true;
                this.parent.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.once) {
                return;
            }
            this.once = true;
            this.parent.next();
        }
    }
}
