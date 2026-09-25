package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int prefetch;
    final org.reactivestreams.Publisher<T> source;

    public FlowableConcatMapPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        this.source = publisher;
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe(io.reactivex.internal.operators.flowable.FlowableConcatMap.subscribe(subscriber, this.mapper, this.prefetch, this.errorMode));
    }
}
