package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoOnEach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;

    public FlowableDoOnEach(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
        super(flowable);
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onAfterTerminate = action2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachSubscriber(subscriber, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        }
    }

    static final class DoOnEachSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
            super(subscriber);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t);
                this.downstream.onNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            boolean z = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.downstream.onError(th);
            }
            try {
                this.onAfterTerminate.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            try {
                T tPoll = this.qs.poll();
                if (tPoll != null) {
                    try {
                        this.onNext.accept(tPoll);
                        this.onAfterTerminate.run();
                    } catch (java.lang.Throwable th) {
                        try {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            try {
                                this.onError.accept(th);
                                throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th);
                            } catch (java.lang.Throwable th2) {
                                throw new io.reactivex.exceptions.CompositeException(th, th2);
                            }
                        } catch (java.lang.Throwable th3) {
                            this.onAfterTerminate.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.onComplete.run();
                    this.onAfterTerminate.run();
                }
                return tPoll;
            } catch (java.lang.Throwable th4) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                try {
                    this.onError.accept(th4);
                    throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th4);
                } catch (java.lang.Throwable th5) {
                    throw new io.reactivex.exceptions.CompositeException(th4, th5);
                }
            }
        }
    }

    static final class DoOnEachConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
            super(conditionalSubscriber);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t);
                this.downstream.onNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            try {
                this.onNext.accept(t);
                return this.downstream.tryOnNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                fail(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            boolean z = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.downstream.onError(th);
            }
            try {
                this.onAfterTerminate.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            try {
                T tPoll = this.qs.poll();
                if (tPoll != null) {
                    try {
                        this.onNext.accept(tPoll);
                        this.onAfterTerminate.run();
                    } catch (java.lang.Throwable th) {
                        try {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            try {
                                this.onError.accept(th);
                                throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th);
                            } catch (java.lang.Throwable th2) {
                                throw new io.reactivex.exceptions.CompositeException(th, th2);
                            }
                        } catch (java.lang.Throwable th3) {
                            this.onAfterTerminate.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.onComplete.run();
                    this.onAfterTerminate.run();
                }
                return tPoll;
            } catch (java.lang.Throwable th4) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                try {
                    this.onError.accept(th4);
                    throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th4);
                } catch (java.lang.Throwable th5) {
                    throw new io.reactivex.exceptions.CompositeException(th4, th5);
                }
            }
        }
    }
}
