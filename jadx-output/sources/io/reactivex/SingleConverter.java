package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface SingleConverter<T, R> {
    R apply(io.reactivex.Single<T> single);
}
