package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTakePublisher<T> extends io.reactivex.Flowable<T> {
    final long limit;
    final org.reactivestreams.Publisher<T> source;

    public FlowableTakePublisher(org.reactivestreams.Publisher<T> publisher, long j) {
        this.source = publisher;
        this.limit = j;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe(new io.reactivex.internal.operators.flowable.FlowableTake.TakeSubscriber(subscriber, this.limit));
    }
}
