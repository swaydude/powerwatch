package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureBuffer<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.functions.Action onOverflow;
    final boolean unbounded;

    public FlowableOnBackpressureBuffer(io.reactivex.Flowable<T> flowable, int i, boolean z, boolean z2, io.reactivex.functions.Action action) {
        super(flowable);
        this.bufferSize = i;
        this.unbounded = z;
        this.delayError = z2;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer.BackpressureBufferSubscriber(subscriber, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }

    static final class BackpressureBufferSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        java.lang.Throwable error;
        final io.reactivex.functions.Action onOverflow;
        boolean outputFused;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        org.reactivestreams.Subscription upstream;

        BackpressureBufferSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i, boolean z, boolean z2, io.reactivex.functions.Action action) {
            io.reactivex.internal.fuseable.SimplePlainQueue<T> spscArrayQueue;
            this.downstream = subscriber;
            this.onOverflow = action;
            this.delayError = z2;
            if (z) {
                spscArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            } else {
                spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(i);
            }
            this.queue = spscArrayQueue;
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
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                io.reactivex.exceptions.MissingBackpressureException missingBackpressureException = new io.reactivex.exceptions.MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (this.outputFused || !io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                return;
            }
            io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
                org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && checkTerminated(this.done, simplePlainQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean checkTerminated(boolean z, boolean z2, org.reactivestreams.Subscriber<? super T> subscriber) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }
}
