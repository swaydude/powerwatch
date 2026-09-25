package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final io.reactivex.functions.Action onOverflow;
    final io.reactivex.BackpressureOverflowStrategy strategy;

    public FlowableOnBackpressureBufferStrategy(io.reactivex.Flowable<T> flowable, long j, io.reactivex.functions.Action action, io.reactivex.BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.OnBackpressureBufferStrategySubscriber(subscriber, this.onOverflow, this.strategy, this.bufferSize));
    }

    static final class OnBackpressureBufferStrategySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super T> downstream;
        java.lang.Throwable error;
        final io.reactivex.functions.Action onOverflow;
        final io.reactivex.BackpressureOverflowStrategy strategy;
        org.reactivestreams.Subscription upstream;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        final java.util.Deque<T> deque = new java.util.ArrayDeque();

        OnBackpressureBufferStrategySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Action action, io.reactivex.BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.downstream = subscriber;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j;
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
            boolean z;
            boolean z2;
            if (this.done) {
                return;
            }
            java.util.Deque<T> deque = this.deque;
            synchronized (deque) {
                z = false;
                z2 = true;
                if (deque.size() == this.bufferSize) {
                    int i = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy[this.strategy.ordinal()];
                    if (i == 1) {
                        deque.pollLast();
                        deque.offer(t);
                    } else if (i == 2) {
                        deque.poll();
                        deque.offer(t);
                    }
                    z = true;
                } else {
                    deque.offer(t);
                }
                z2 = false;
            }
            if (!z) {
                if (z2) {
                    this.upstream.cancel();
                    onError(new io.reactivex.exceptions.MissingBackpressureException());
                    return;
                } else {
                    drain();
                    return;
                }
            }
            io.reactivex.functions.Action action = this.onOverflow;
            if (action != null) {
                try {
                    action.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        void clear(java.util.Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        void drain() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            java.util.Deque<T> deque = this.deque;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z = this.done;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z2 = tPoll == null;
                    if (z) {
                        java.lang.Throwable th = this.error;
                        if (th != null) {
                            clear(deque);
                            subscriber.onError(th);
                            return;
                        } else if (z2) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z3 = this.done;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        java.lang.Throwable th2 = this.error;
                        if (th2 != null) {
                            clear(deque);
                            subscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.internal.util.BackpressureHelper.produced(this.requested, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy;

        static {
            int[] iArr = new int[io.reactivex.BackpressureOverflowStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureOverflowStrategy = iArr;
            try {
                iArr[io.reactivex.BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureOverflowStrategy[io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
