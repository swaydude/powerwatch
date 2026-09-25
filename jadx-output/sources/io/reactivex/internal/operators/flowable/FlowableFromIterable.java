package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromIterable<T> extends io.reactivex.Flowable<T> {
    final java.lang.Iterable<? extends T> source;

    public FlowableFromIterable(java.lang.Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            subscribe(subscriber, this.source.iterator());
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    public static <T> void subscribe(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            } else if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, it));
            } else {
                subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorSubscription(subscriber, it));
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static abstract class BaseRangeSubscription<T> extends io.reactivex.internal.subscriptions.BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        java.util.Iterator<? extends T> it;
        boolean once;

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(java.util.Iterator<? extends T> it) {
            this.it = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            java.util.Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.it.next(), "Iterator.next() returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            java.util.Iterator<? extends T> it = this.it;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.it = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                if (j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }
    }

    static final class IteratorSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final org.reactivestreams.Subscriber<? super T> downstream;

        IteratorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Iterator<? extends T> it) {
            super(it);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
            java.util.Iterator<? extends T> it = this.it;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        subscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    subscriber.onNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        subscriber.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void slowPath(long j) {
            java.util.Iterator<? extends T> it = this.it;
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                subscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            subscriber.onNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    subscriber.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                subscriber.onError(th);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            subscriber.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    static final class IteratorConditionalSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> downstream;

        IteratorConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, java.util.Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
            java.util.Iterator<? extends T> it = this.it;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void slowPath(long j) {
            java.util.Iterator<? extends T> it = this.it;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zTryOnNext = conditionalSubscriber.tryOnNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zTryOnNext) {
                                    j2++;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }
}
