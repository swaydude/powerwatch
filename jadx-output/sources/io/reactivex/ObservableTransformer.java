package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface ObservableTransformer<Upstream, Downstream> {
    io.reactivex.ObservableSource<Downstream> apply(io.reactivex.Observable<Upstream> observable);
}
