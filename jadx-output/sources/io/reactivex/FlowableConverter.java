package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface FlowableConverter<T, R> {
    R apply(io.reactivex.Flowable<T> flowable);
}
