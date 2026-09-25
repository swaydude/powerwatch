package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class DescriptorWriter {
    private final com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue operationQueue;
    private final com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider;

    @bleshadow.javax.inject.Inject
    DescriptorWriter(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        this.operationQueue = connectionOperationQueue;
        this.operationsProvider = operationsProvider;
    }

    io.reactivex.Completable writeDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.operationQueue.queue(this.operationsProvider.provideWriteDescriptor(bluetoothGattDescriptor, bArr)).ignoreElements();
    }
}
