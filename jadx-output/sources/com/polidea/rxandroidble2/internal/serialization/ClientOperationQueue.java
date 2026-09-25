package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
public interface ClientOperationQueue {
    <T> io.reactivex.Observable<T> queue(com.polidea.rxandroidble2.internal.operations.Operation<T> operation);
}
