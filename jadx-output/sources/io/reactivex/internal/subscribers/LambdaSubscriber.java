package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public final class LambdaSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;

    public LambdaSubscriber(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.onSubscribe.accept(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
                return;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                return;
            }
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        get().request(j);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.onError != io.reactivex.internal.functions.Functions.ON_ERROR_MISSING;
    }
}
