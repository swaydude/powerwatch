package io.reactivex.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    boolean done;
    final org.reactivestreams.Subscriber<? super T> downstream;
    org.reactivestreams.Subscription upstream;

    public SafeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.downstream = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            try {
                this.downstream.onSubscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.done = true;
                try {
                    subscription.cancel();
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.upstream == null) {
            onNextNoSubscription();
            return;
        }
        if (t == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.upstream.cancel();
                onError(nullPointerException);
                return;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
                return;
            }
        }
        try {
            this.downstream.onNext(t);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            try {
                this.upstream.cancel();
                onError(th2);
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                onError(new io.reactivex.exceptions.CompositeException(th2, th3));
            }
        }
    }

    void onNextNoSubscription() {
        this.done = true;
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        if (this.upstream == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.downstream.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
                try {
                    this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException));
                    return;
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.downstream.onError(th);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th4));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        if (this.upstream == null) {
            onCompleteNoSubscription();
            return;
        }
        try {
            this.downstream.onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    void onCompleteNoSubscription() {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        try {
            this.upstream.request(j);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            try {
                this.upstream.cancel();
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.upstream.cancel();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
