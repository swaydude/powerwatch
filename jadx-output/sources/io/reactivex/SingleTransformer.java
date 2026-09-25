package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface SingleTransformer<Upstream, Downstream> {
    /* JADX INFO: renamed from: apply */
    io.reactivex.SingleSource<Downstream> apply2(io.reactivex.Single<Upstream> single);
}
