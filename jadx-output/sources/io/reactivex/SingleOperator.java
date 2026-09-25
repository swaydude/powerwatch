package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface SingleOperator<Downstream, Upstream> {
    io.reactivex.SingleObserver<? super Upstream> apply(io.reactivex.SingleObserver<? super Downstream> singleObserver) throws java.lang.Exception;
}
