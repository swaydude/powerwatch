package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class LongWriteOperationBuilderImpl implements com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder {
    private byte[] bytes;
    private com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider maxBatchSizeProvider;
    private final com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue operationQueue;
    private final com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider;
    private final com.polidea.rxandroidble2.RxBleConnection rxBleConnection;
    private com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy = new com.polidea.rxandroidble2.internal.connection.ImmediateSerializedBatchAckStrategy();
    private com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy = new com.polidea.rxandroidble2.internal.connection.NoRetryStrategy();
    private io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> writtenCharacteristicObservable;

    @bleshadow.javax.inject.Inject
    LongWriteOperationBuilderImpl(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit mtuBasedPayloadSizeLimit, com.polidea.rxandroidble2.RxBleConnection rxBleConnection, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        this.operationQueue = connectionOperationQueue;
        this.maxBatchSizeProvider = mtuBasedPayloadSizeLimit;
        this.rxBleConnection = rxBleConnection;
        this.operationsProvider = operationsProvider;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setBytes(byte[] bArr) {
        this.bytes = bArr;
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setCharacteristicUuid(java.util.UUID uuid) {
        this.writtenCharacteristicObservable = this.rxBleConnection.getCharacteristic(uuid);
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.writtenCharacteristicObservable = io.reactivex.Single.just(bluetoothGattCharacteristic);
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setMaxBatchSize(int i) {
        this.maxBatchSizeProvider = new com.polidea.rxandroidble2.internal.connection.ConstantPayloadSizeLimit(i);
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setWriteOperationRetryStrategy(com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy) {
        this.writeOperationRetryStrategy = writeOperationRetryStrategy;
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setWriteOperationAckStrategy(com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy) {
        this.writeOperationAckStrategy = writeOperationAckStrategy;
        return this;
    }

    @Override // com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder
    public io.reactivex.Observable<byte[]> build() {
        io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> single = this.writtenCharacteristicObservable;
        if (single == null) {
            throw new java.lang.IllegalArgumentException("setCharacteristicUuid() or setCharacteristic() needs to be called before build()");
        }
        if (this.bytes == null) {
            throw new java.lang.IllegalArgumentException("setBytes() needs to be called before build()");
        }
        return single.flatMapObservable(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, io.reactivex.Observable<byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.1
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<byte[]> apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                return com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.operationQueue.queue(com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.operationsProvider.provideLongWriteOperation(bluetoothGattCharacteristic, com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.writeOperationAckStrategy, com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.writeOperationRetryStrategy, com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.maxBatchSizeProvider, com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl.this.bytes));
            }
        });
    }
}
