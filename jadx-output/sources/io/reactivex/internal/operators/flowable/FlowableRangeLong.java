package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRangeLong extends io.reactivex.Flowable<java.lang.Long> {
    final long end;
    final long start;

    public FlowableRangeLong(long j, long j2) {
        this.start = j;
        this.end = j + j2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.start, this.end));
        } else {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeSubscription(subscriber, this.start, this.end));
        }
    }

    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(long j, long j2) {
            this.index = j;
            this.end = j2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final java.lang.Long poll() {
            long j = this.index;
            if (j == this.end) {
                return null;
            }
            this.index = 1 + j;
            return java.lang.Long.valueOf(j);
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

    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> downstream;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber, long j, long j2) {
            super(j, j2);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j = this.end;
            org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.downstream;
            for (long j2 = this.index; j2 != j; j2++) {
                if (this.cancelled) {
                    return;
                }
                subscriber.onNext(java.lang.Long.valueOf(j2));
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long j) {
            long j2 = this.end;
            long j3 = this.index;
            org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.downstream;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.cancelled) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j4 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        subscriber.onNext(java.lang.Long.valueOf(j3));
                        j4++;
                        j3++;
                    }
                }
                this.index = j3;
                j = addAndGet(-j4);
            } while (j != 0);
        }
    }

    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> downstream;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber, long j, long j2) {
            super(j, j2);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j = this.end;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber = this.downstream;
            for (long j2 = this.index; j2 != j; j2++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(java.lang.Long.valueOf(j2));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long j) {
            long j2 = this.end;
            long j3 = this.index;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber = this.downstream;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j4 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(java.lang.Long.valueOf(j3))) {
                            j4++;
                        }
                        j3++;
                    }
                }
                this.index = j3;
                j = addAndGet(-j4);
            } while (j != 0);
        }
    }
}
