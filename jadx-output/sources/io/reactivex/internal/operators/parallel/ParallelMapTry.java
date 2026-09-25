package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelMapTry<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
    final io.reactivex.functions.Function<? super T, ? extends R> mapper;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelMapTry(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.errorHandler = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super R> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTryConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.mapper, this.errorHandler);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTrySubscriber(subscriber, this.mapper, this.errorHandler);
                }
            }
            this.source.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    static final class ParallelMapTrySubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;
        org.reactivestreams.Subscription upstream;

        ParallelMapTrySubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.downstream = subscriber;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (tryOnNext(t) || this.done) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            int i;
            if (this.done) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.downstream.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null value"));
                    return true;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorHandler.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancel();
                        onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        return false;
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

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1, reason: invalid class name */
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

    static final class ParallelMapTryConditionalSubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> downstream;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;
        org.reactivestreams.Subscription upstream;

        ParallelMapTryConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> conditionalSubscriber, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.downstream = conditionalSubscriber;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (tryOnNext(t) || this.done) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            int i;
            if (this.done) {
                return false;
            }
            long j = 0;
            do {
                try {
                    return this.downstream.tryOnNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.errorHandler.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancel();
                        onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        return false;
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
