package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
    final org.reactivestreams.Publisher<? extends T> first;
    final int prefetch;
    final org.reactivestreams.Publisher<? extends T> second;

    public FlowableSequenceEqualSingle(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Publisher<? extends T> publisher2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.first = publisher;
        this.second = publisher2;
        this.comparer = biPredicate;
        this.prefetch = i;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle.EqualCoordinator(singleObserver, this.prefetch, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<java.lang.Boolean> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableSequenceEqual(this.first, this.second, this.comparer, this.prefetch));
    }

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> downstream;
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> first;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> second;
        T v1;
        T v2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, int i, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.comparer = biPredicate;
            this.first = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
            this.second = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
        }

        void subscribe(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Publisher<? extends T> publisher2) {
            publisher.subscribe(this.first);
            publisher2.subscribe(this.second);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.first.cancel();
            this.second.cancel();
            if (getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.first.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.first.queue;
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.second.queue;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isDisposed()) {
                            this.first.clear();
                            this.second.clear();
                            return;
                        }
                        if (this.error.get() != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z = this.first.done;
                        T tPoll = this.v1;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.v1 = tPoll;
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                cancelAndClear();
                                this.error.addThrowable(th);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.second.done;
                        T tPoll2 = this.v2;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.v2 = tPoll2;
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                cancelAndClear();
                                this.error.addThrowable(th2);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            this.downstream.onSuccess(true);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            cancelAndClear();
                            this.downstream.onSuccess(false);
                            return;
                        }
                        if (z2 || z4) {
                            break;
                        }
                        try {
                            if (!this.comparer.test(tPoll, tPoll2)) {
                                cancelAndClear();
                                this.downstream.onSuccess(false);
                                return;
                            } else {
                                this.v1 = null;
                                this.v2 = null;
                                this.first.request();
                                this.second.request();
                            }
                        } catch (java.lang.Throwable th3) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                            cancelAndClear();
                            this.error.addThrowable(th3);
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                    }
                } else if (isDisposed()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.error.get() != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
