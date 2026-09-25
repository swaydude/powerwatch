package io.reactivex.internal.operators.parallel;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFromArray<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final org.reactivestreams.Publisher<T>[] sources;

    public ParallelFromArray(org.reactivestreams.Publisher<T>[] publisherArr) {
        this.sources = publisherArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            for (int i = 0; i < length; i++) {
                this.sources[i].subscribe(subscriberArr[i]);
            }
        }
    }
}
