package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromPublisher<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T> publisher;

    public FlowableFromPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        this.publisher = publisher;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.publisher.subscribe(subscriber);
    }
}
