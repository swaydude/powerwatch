package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFlatMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final boolean delayError;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    public ParallelFlatMap(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z, int i, int i2) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z;
        this.maxConcurrency = i;
        this.prefetch = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                subscriberArr2[i] = io.reactivex.internal.operators.flowable.FlowableFlatMap.subscribe(subscriberArr[i], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(subscriberArr2);
        }
    }
}
