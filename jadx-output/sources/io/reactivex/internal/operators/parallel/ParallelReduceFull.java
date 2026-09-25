package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelReduceFull<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    public ParallelReduceFull(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.source = parallelFlowable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber(subscriber, this.source.parallelism(), this.reducer);
        subscriber.onSubscribe(parallelReduceFullMainSubscriber);
        this.source.subscribe(parallelReduceFullMainSubscriber.subscribers);
    }

    static final class ParallelReduceFullMainSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T>> current;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        final java.util.concurrent.atomic.AtomicInteger remaining;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T>[] subscribers;

        ParallelReduceFullMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.current = new java.util.concurrent.atomic.AtomicReference<>();
            this.remaining = new java.util.concurrent.atomic.AtomicInteger();
            this.error = new java.util.concurrent.atomic.AtomicReference<>();
            io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                parallelReduceFullInnerSubscriberArr[i2] = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<>(this, biFunction);
            }
            this.subscribers = parallelReduceFullInnerSubscriberArr;
            this.reducer = biFunction;
            this.remaining.lazySet(i);
        }

        io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> addValue(T t) {
            io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> slotPair;
            int iTryAcquireSlot;
            while (true) {
                slotPair = this.current.get();
                if (slotPair == null) {
                    slotPair = new io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<>();
                    if (!this.current.compareAndSet(null, slotPair)) {
                        continue;
                    }
                }
                iTryAcquireSlot = slotPair.tryAcquireSlot();
                if (iTryAcquireSlot >= 0) {
                    break;
                }
                this.current.compareAndSet(slotPair, null);
            }
            if (iTryAcquireSlot == 0) {
                slotPair.first = t;
            } else {
                slotPair.second = t;
            }
            if (!slotPair.releaseSlot()) {
                return null;
            }
            this.current.compareAndSet(slotPair, null);
            return slotPair;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            for (io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.subscribers) {
                parallelReduceFullInnerSubscriber.cancel();
            }
        }

        void innerError(java.lang.Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                cancel();
                this.downstream.onError(th);
            } else if (th != this.error.get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void innerComplete(T t) {
            if (t != null) {
                while (true) {
                    io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> slotPairAddValue = addValue(t);
                    if (slotPairAddValue == null) {
                        break;
                    }
                    try {
                        t = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(slotPairAddValue.first, slotPairAddValue.second), "The reducer returned a null value");
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> slotPair = this.current.get();
                this.current.lazySet(null);
                if (slotPair != null) {
                    complete(slotPair.first);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    static final class ParallelReduceFullInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        boolean done;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> parent;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        T value;

        ParallelReduceFullInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.parent = parallelReduceFullMainSubscriber;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.reducer.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
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
            this.parent.innerComplete(this.value);
        }

        void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }
    }

    static final class SlotPair<T> extends java.util.concurrent.atomic.AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final java.util.concurrent.atomic.AtomicInteger releaseIndex = new java.util.concurrent.atomic.AtomicInteger();
        T second;

        SlotPair() {
        }

        int tryAcquireSlot() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }

        boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }
    }
}
