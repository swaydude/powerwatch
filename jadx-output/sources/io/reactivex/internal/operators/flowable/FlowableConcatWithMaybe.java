package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatWithMaybe<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> other;

    public FlowableConcatWithMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.other = maybeSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe.ConcatWithSubscriber(subscriber, this.other));
    }

    static final class ConcatWithSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        boolean inMaybe;
        io.reactivex.MaybeSource<? extends T> other;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> otherDisposable;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.MaybeSource<? extends T> maybeSource) {
            super(subscriber);
            this.other = maybeSource;
            this.otherDisposable = new java.util.concurrent.atomic.AtomicReference<>();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.otherDisposable, disposable);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext((java.lang.Object) t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.MaybeSource<? extends T> maybeSource = this.other;
            this.other = null;
            maybeSource.subscribe(this);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.otherDisposable);
        }
    }
}
