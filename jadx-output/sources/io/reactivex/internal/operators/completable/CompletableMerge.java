package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMerge extends io.reactivex.Completable {
    final boolean delayErrors;
    final int maxConcurrency;
    final org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> source;

    public CompletableMerge(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> publisher, int i, boolean z) {
        this.source = publisher;
        this.maxConcurrency = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber(completableObserver, this.maxConcurrency, this.delayErrors));
    }

    static final class CompletableMergeSubscriber extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<io.reactivex.CompletableSource>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2108443387387077490L;
        final boolean delayErrors;
        final io.reactivex.CompletableObserver downstream;
        final int maxConcurrency;
        org.reactivestreams.Subscription upstream;
        final io.reactivex.disposables.CompositeDisposable set = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();

        CompletableMergeSubscriber(io.reactivex.CompletableObserver completableObserver, int i, boolean z) {
            this.downstream = completableObserver;
            this.maxConcurrency = i;
            this.delayErrors = z;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.set.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(io.reactivex.CompletableSource completableSource) {
            getAndIncrement();
            io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver mergeInnerObserver = new io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver();
            this.set.add(mergeInnerObserver);
            completableSource.subscribe(mergeInnerObserver);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (!this.delayErrors) {
                this.set.dispose();
                if (this.error.addThrowable(th)) {
                    if (getAndSet(0) > 0) {
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (this.error.addThrowable(th)) {
                if (decrementAndGet() == 0) {
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.error.get() != null) {
                    this.downstream.onError(this.error.terminate());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        void innerError(io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver mergeInnerObserver, java.lang.Throwable th) {
            this.set.delete(mergeInnerObserver);
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
                if (this.error.addThrowable(th)) {
                    if (getAndSet(0) > 0) {
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (this.error.addThrowable(th)) {
                if (decrementAndGet() == 0) {
                    this.downstream.onError(this.error.terminate());
                    return;
                } else {
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                        return;
                    }
                    return;
                }
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        void innerComplete(io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver mergeInnerObserver) {
            this.set.delete(mergeInnerObserver);
            if (decrementAndGet() == 0) {
                java.lang.Throwable th = this.error.get();
                if (th != null) {
                    this.downstream.onError(th);
                    return;
                } else {
                    this.downstream.onComplete();
                    return;
                }
            }
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        final class MergeInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 251330541679988317L;

            MergeInnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.this.innerError(this, th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
