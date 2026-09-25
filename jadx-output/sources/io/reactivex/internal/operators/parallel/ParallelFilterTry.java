package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFilterTry<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
    final io.reactivex.functions.Predicate<? super T> predicate;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelFilterTry(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.predicate = predicate;
        this.errorHandler = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super T> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.predicate, this.errorHandler);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterSubscriber(subscriber, this.predicate, this.errorHandler);
                }
            }
            this.source.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    static abstract class BaseFilterSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Predicate<? super T> predicate;
        org.reactivestreams.Subscription upstream;

        BaseFilterSubscriber(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.predicate = predicate;
            this.errorHandler = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.done) {
                return;
            }
            this.upstream.request(1L);
        }
    }

    static final class ParallelFilterSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> downstream;

        ParallelFilterSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            int i;
            if (!this.done) {
                long j = 0;
                do {
                    try {
                        if (!this.predicate.test(t)) {
                            return false;
                        }
                        this.downstream.onNext(t);
                        return true;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        try {
                            j++;
                            i = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorHandler.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        }
                    }
                } while (i == 1);
                if (i != 2) {
                    if (i == 3) {
                        cancel();
                        onComplete();
                    } else {
                        cancel();
                        onError(th);
                        return false;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$parallel$ParallelFailureHandling;

        static {
            int[] iArr = new int[io.reactivex.parallel.ParallelFailureHandling.values().length];
            $SwitchMap$io$reactivex$parallel$ParallelFailureHandling = iArr;
            try {
                iArr[io.reactivex.parallel.ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[io.reactivex.parallel.ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[io.reactivex.parallel.ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static final class ParallelFilterConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> downstream;

        ParallelFilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            int i;
            if (!this.done) {
                long j = 0;
                do {
                    try {
                        return this.predicate.test(t) && this.downstream.tryOnNext(t);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        try {
                            j++;
                            i = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorHandler.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        }
                    }
                } while (i == 1);
                if (i != 2) {
                    if (i == 3) {
                        cancel();
                        onComplete();
                    } else {
                        cancel();
                        onError(th);
                        return false;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }
    }
}
