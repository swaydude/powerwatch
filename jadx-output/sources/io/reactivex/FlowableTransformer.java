package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    org.reactivestreams.Publisher<Downstream> apply(io.reactivex.Flowable<Upstream> flowable);
}
