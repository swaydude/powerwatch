package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final org.reactivestreams.Publisher<B> boundary;
    final java.util.concurrent.Callable<U> bufferSupplier;

    public FlowableBufferExactBoundary(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<B> publisher, java.util.concurrent.Callable<U> callable) {
        super(flowable);
        this.boundary = publisher;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.bufferSupplier, this.boundary));
    }

    static final class BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final org.reactivestreams.Publisher<B> boundary;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        io.reactivex.disposables.Disposable other;
        org.reactivestreams.Subscription upstream;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            return accept((org.reactivestreams.Subscriber<? super java.util.Collection>) subscriber, (java.util.Collection) obj);
        }

        BufferExactBoundarySubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, org.reactivestreams.Publisher<B> publisher) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                try {
                    this.buffer = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferBoundarySubscriber(this);
                    this.other = bufferBoundarySubscriber;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                    this.boundary.subscribe(bufferBoundarySubscriber);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.downstream);
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
            this.other.dispose();
            this.upstream.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        void next() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = u;
                    fastPathEmitMax(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(org.reactivestreams.Subscriber<? super U> subscriber, U u) {
            this.downstream.onNext((java.lang.Object) u);
            return true;
        }
    }

    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> parent;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.parent = bufferExactBoundarySubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            this.parent.next();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.onComplete();
        }
    }
}
