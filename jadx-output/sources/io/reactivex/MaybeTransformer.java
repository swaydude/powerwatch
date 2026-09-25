package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface MaybeTransformer<Upstream, Downstream> {
    io.reactivex.MaybeSource<Downstream> apply(io.reactivex.Maybe<Upstream> maybe);
}
