package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeTakeUntilPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    public MaybeTakeUntilPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher) {
        super(maybeSource);
        this.other = publisher;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(takeUntilMainMaybeObserver);
        this.other.subscribe(takeUntilMainMaybeObserver.other);
        this.source.subscribe(takeUntilMainMaybeObserver);
    }

    static final class TakeUntilMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<U> other = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<>(this);

        TakeUntilMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.other);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        void otherError(java.lang.Throwable th) {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        void otherComplete() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        static final class TakeUntilOtherMaybeObserver<U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> parent;

            TakeUntilOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(java.lang.Object obj) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
                this.parent.otherComplete();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable th) {
                this.parent.otherError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                this.parent.otherComplete();
            }
        }
    }
}
