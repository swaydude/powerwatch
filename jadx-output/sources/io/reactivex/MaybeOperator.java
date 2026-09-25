package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface MaybeOperator<Downstream, Upstream> {
    io.reactivex.MaybeObserver<? super Upstream> apply(io.reactivex.MaybeObserver<? super Downstream> maybeObserver) throws java.lang.Exception;
}
