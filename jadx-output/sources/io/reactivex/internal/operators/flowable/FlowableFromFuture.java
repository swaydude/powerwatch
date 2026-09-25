package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromFuture<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public FlowableFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.DeferredScalarSubscription deferredScalarSubscription = new io.reactivex.internal.subscriptions.DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            java.util.concurrent.TimeUnit timeUnit = this.unit;
            T t = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t == null) {
                subscriber.onError(new java.lang.NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            subscriber.onError(th);
        }
    }
}
