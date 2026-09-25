package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface MaybeConverter<T, R> {
    R apply(io.reactivex.Maybe<T> maybe);
}
