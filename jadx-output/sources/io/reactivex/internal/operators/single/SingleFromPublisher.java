package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFromPublisher<T> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<? extends T> publisher;

    public SingleFromPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        this.publisher = publisher;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.publisher.subscribe(new io.reactivex.internal.operators.single.SingleFromPublisher.ToSingleObserver(singleObserver));
    }

    static final class ToSingleObserver<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        volatile boolean disposed;
        boolean done;
        final io.reactivex.SingleObserver<? super T> downstream;
        org.reactivestreams.Subscription upstream;
        T value;

        ToSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.value != null) {
                this.upstream.cancel();
                this.done = true;
                this.value = null;
                this.downstream.onError(new java.lang.IndexOutOfBoundsException("Too many elements in the Publisher"));
                return;
            }
            this.value = t;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.value;
            this.value = null;
            if (t == null) {
                this.downstream.onError(new java.util.NoSuchElementException("The source Publisher is empty"));
            } else {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
        }
    }
}
