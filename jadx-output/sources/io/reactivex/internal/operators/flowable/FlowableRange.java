package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRange extends io.reactivex.Flowable<java.lang.Integer> {
    final int end;
    final int start;

    public FlowableRange(int i, int i2) {
        this.start = i;
        this.end = i + i2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRange.RangeConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.start, this.end));
        } else {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRange.RangeSubscription(subscriber, this.start, this.end));
        }
    }

    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final java.lang.Integer poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return java.lang.Integer.valueOf(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
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

    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Integer> downstream;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber, int i, int i2) {
            super(i, i2);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i = this.end;
            org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                subscriber.onNext(java.lang.Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.cancelled) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        subscriber.onNext(java.lang.Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
                this.index = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> downstream;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i = this.end;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(java.lang.Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(java.lang.Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
                this.index = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }
}
