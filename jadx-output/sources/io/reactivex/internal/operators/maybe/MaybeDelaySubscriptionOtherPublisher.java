package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    public MaybeDelaySubscriptionOtherPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher) {
        super(maybeSource);
        this.other = publisher;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.other.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.OtherSubscriber(maybeObserver, this.source));
    }

    static final class OtherSubscriber<T> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<T> main;
        io.reactivex.MaybeSource<T> source;
        org.reactivestreams.Subscription upstream;

        OtherSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<T> maybeSource) {
            this.main = new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<>(maybeObserver);
            this.source = maybeSource;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.main.downstream.onSubscribe(this);
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object obj) {
            if (this.upstream != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.upstream.cancel();
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                subscribeNext();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.upstream != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.main.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.upstream != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                subscribeNext();
            }
        }

        void subscribeNext() {
            io.reactivex.MaybeSource<T> maybeSource = this.source;
            this.source = null;
            maybeSource.subscribe(this.main);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.main.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.main);
        }
    }

    static final class DelayMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final io.reactivex.MaybeObserver<? super T> downstream;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
