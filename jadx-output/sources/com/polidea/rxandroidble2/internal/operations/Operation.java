package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public interface Operation<T> extends java.lang.Comparable<com.polidea.rxandroidble2.internal.operations.Operation<?>> {
    com.polidea.rxandroidble2.internal.Priority definedPriority();

    io.reactivex.Observable<T> run(com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface);
}
