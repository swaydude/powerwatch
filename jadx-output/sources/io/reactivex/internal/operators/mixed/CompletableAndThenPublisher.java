package io.reactivex.internal.operators.mixed;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableAndThenPublisher<R> extends io.reactivex.Flowable<R> {
    final org.reactivestreams.Publisher<? extends R> other;
    final io.reactivex.CompletableSource source;

    public CompletableAndThenPublisher(io.reactivex.CompletableSource completableSource, org.reactivestreams.Publisher<? extends R> publisher) {
        this.source = completableSource;
        this.other = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe(new io.reactivex.internal.operators.mixed.CompletableAndThenPublisher.AndThenPublisherSubscriber(subscriber, this.other));
    }

    static final class AndThenPublisherSubscriber<R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<R>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8948264376121066672L;
        final org.reactivestreams.Subscriber<? super R> downstream;
        org.reactivestreams.Publisher<? extends R> other;
        final java.util.concurrent.atomic.AtomicLong requested = new java.util.concurrent.atomic.AtomicLong();
        io.reactivex.disposables.Disposable upstream;

        AndThenPublisherSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, org.reactivestreams.Publisher<? extends R> publisher) {
            this.downstream = subscriber;
            this.other = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            org.reactivestreams.Publisher<? extends R> publisher = this.other;
            if (publisher == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                publisher.subscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this, this.requested, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.dispose();
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this, this.requested, subscription);
        }
    }
}
