package io.reactivex.parallel;

/* JADX INFO: loaded from: classes2.dex */
public interface ParallelTransformer<Upstream, Downstream> {
    io.reactivex.parallel.ParallelFlowable<Downstream> apply(io.reactivex.parallel.ParallelFlowable<Upstream> parallelFlowable);
}
