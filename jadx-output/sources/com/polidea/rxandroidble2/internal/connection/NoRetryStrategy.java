package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class NoRetryStrategy implements com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy {
    @Override // io.reactivex.ObservableTransformer
    /* JADX INFO: renamed from: apply */
    public io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> observable) {
        return observable.flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure>>() { // from class: com.polidea.rxandroidble2.internal.connection.NoRetryStrategy.1
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> apply(com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure longWriteFailure) {
                return io.reactivex.Observable.error(longWriteFailure.getCause());
            }
        });
    }
}
