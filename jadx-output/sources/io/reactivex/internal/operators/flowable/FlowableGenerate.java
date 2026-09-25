package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableGenerate<T, S> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super S> disposeState;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> generator;
    final java.util.concurrent.Callable<S> stateSupplier;

    public FlowableGenerate(java.util.concurrent.Callable<S> callable, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer) {
        this.stateSupplier = callable;
        this.generator = biFunction;
        this.disposeState = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableGenerate.GeneratorSubscription(subscriber, this.generator, this.disposeState, this.stateSupplier.call()));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static final class GeneratorSubscription<T, S> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Emitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        volatile boolean cancelled;
        final io.reactivex.functions.Consumer<? super S> disposeState;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        GeneratorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer, S s) {
            this.downstream = subscriber;
            this.generator = biFunction;
            this.disposeState = consumer;
            this.state = s;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                S sApply = this.state;
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction = this.generator;
                do {
                    long j2 = 0;
                    while (true) {
                        if (j2 != j) {
                            if (this.cancelled) {
                                this.state = null;
                                dispose(sApply);
                                return;
                            }
                            this.hasNext = false;
                            try {
                                sApply = biFunction.apply(sApply, this);
                                if (this.terminate) {
                                    this.cancelled = true;
                                    this.state = null;
                                    dispose(sApply);
                                    return;
                                }
                                j2++;
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.cancelled = true;
                                this.state = null;
                                onError(th);
                                dispose(sApply);
                                return;
                            }
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    }
                    this.state = sApply;
                    j = addAndGet(-j2);
                } while (j != 0);
            }
        }

        private void dispose(S s) {
            try {
                this.disposeState.accept(s);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (io.reactivex.internal.util.BackpressureHelper.add(this, 1L) == 0) {
                S s = this.state;
                this.state = null;
                dispose(s);
            }
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.terminate) {
                return;
            }
            if (this.hasNext) {
                onError(new java.lang.IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.hasNext = true;
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable th) {
            if (this.terminate) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.terminate = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.terminate) {
                return;
            }
            this.terminate = true;
            this.downstream.onComplete();
        }
    }
}
