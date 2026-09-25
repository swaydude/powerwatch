package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface ObservableConverter<T, R> {
    R apply(io.reactivex.Observable<T> observable);
}
