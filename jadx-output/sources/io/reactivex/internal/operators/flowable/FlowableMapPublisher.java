package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableMapPublisher<T, U> extends io.reactivex.Flowable<U> {
    final io.reactivex.functions.Function<? super T, ? extends U> mapper;
    final org.reactivestreams.Publisher<T> source;

    public FlowableMapPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends U> function) {
        this.source = publisher;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.source.subscribe(new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, this.mapper));
    }
}
