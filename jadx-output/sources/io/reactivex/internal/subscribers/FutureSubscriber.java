package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public final class FutureSubscriber<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.FlowableSubscriber<T>, java.util.concurrent.Future<T>, org.reactivestreams.Subscription {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
    T value;

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
    }

    public FutureSubscriber() {
        super(1);
        this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        org.reactivestreams.Subscription subscription;
        do {
            subscription = this.upstream.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return false;
            }
        } while (!this.upstream.compareAndSet(subscription, io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED));
        if (subscription != null) {
            subscription.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.value;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.upstream, subscription, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.value != null) {
            this.upstream.get().cancel();
            onError(new java.lang.IndexOutOfBoundsException("More than one element received"));
        } else {
            this.value = t;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        org.reactivestreams.Subscription subscription;
        do {
            subscription = this.upstream.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!this.upstream.compareAndSet(subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        org.reactivestreams.Subscription subscription;
        if (this.value == null) {
            onError(new java.util.NoSuchElementException("The source is empty"));
            return;
        }
        do {
            subscription = this.upstream.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!this.upstream.compareAndSet(subscription, this));
        countDown();
    }
}
