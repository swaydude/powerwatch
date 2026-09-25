package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.CompletableSource source;

    public CompletableToFlowable(io.reactivex.CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe(new io.reactivex.internal.observers.SubscriberCompletableObserver(subscriber));
    }
}
