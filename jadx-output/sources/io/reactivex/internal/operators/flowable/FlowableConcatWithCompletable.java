package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatWithCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.CompletableSource other;

    public FlowableConcatWithCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable.ConcatWithSubscriber(subscriber, this.other));
    }

    static final class ConcatWithSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -7346385463600070225L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        boolean inCompletable;
        io.reactivex.CompletableSource other;
        org.reactivestreams.Subscription upstream;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.CompletableSource completableSource) {
            this.downstream = subscriber;
            this.other = completableSource;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.CompletableSource completableSource = this.other;
            this.other = null;
            completableSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }
    }
}
