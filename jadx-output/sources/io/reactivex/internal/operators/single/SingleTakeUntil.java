package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleTakeUntil<T, U> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<U> other;
    final io.reactivex.SingleSource<T> source;

    public SingleTakeUntil(io.reactivex.SingleSource<T> singleSource, org.reactivestreams.Publisher<U> publisher) {
        this.source = singleSource;
        this.other = publisher;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver takeUntilMainObserver = new io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver(singleObserver);
        singleObserver.onSubscribe(takeUntilMainObserver);
        this.other.subscribe(takeUntilMainObserver.other);
        this.source.subscribe(takeUntilMainObserver);
    }

    static final class TakeUntilMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.SingleObserver<? super T> downstream;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber other = new io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber(this);

        TakeUntilMainObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.other.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.other.dispose();
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.other.dispose();
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void otherError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable andSet;
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                if (andSet != null) {
                    andSet.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    static final class TakeUntilOtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> parent;

        TakeUntilOtherSubscriber(io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.parent = takeUntilMainObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object obj) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this)) {
                this.parent.otherError(new java.util.concurrent.CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.parent.otherError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.parent.otherError(new java.util.concurrent.CancellationException());
            }
        }

        public void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }
    }
}
