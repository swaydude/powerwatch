package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class ImmediateSerializedBatchAckStrategy implements com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy {
    @Override // io.reactivex.ObservableTransformer
    /* JADX INFO: renamed from: apply */
    public io.reactivex.ObservableSource<java.lang.Boolean> apply2(io.reactivex.Observable<java.lang.Boolean> observable) {
        return observable;
    }
}
