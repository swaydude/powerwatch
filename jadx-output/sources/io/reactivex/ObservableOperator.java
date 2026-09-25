package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface ObservableOperator<Downstream, Upstream> {
    io.reactivex.Observer<? super Upstream> apply(io.reactivex.Observer<? super Downstream> observer) throws java.lang.Exception;
}
