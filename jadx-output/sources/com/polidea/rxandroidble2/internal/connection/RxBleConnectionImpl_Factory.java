package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleConnectionImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> callbackSchedulerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> descriptorWriterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> gattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker> illegalOperationCheckerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> longWriteOperationBuilderProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuProvider> mtuProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager> notificationIndicationManagerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> operationProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> operationQueueProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager> serviceDiscoveryManagerProvider;

    public RxBleConnectionImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider2, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuProvider> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> provider7, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider8, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> provider9, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider10, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker> provider11) {
        this.operationQueueProvider = provider;
        this.gattCallbackProvider = provider2;
        this.bluetoothGattProvider = provider3;
        this.serviceDiscoveryManagerProvider = provider4;
        this.notificationIndicationManagerProvider = provider5;
        this.mtuProvider = provider6;
        this.descriptorWriterProvider = provider7;
        this.operationProvider = provider8;
        this.longWriteOperationBuilderProvider = provider9;
        this.callbackSchedulerProvider = provider10;
        this.illegalOperationCheckerProvider = provider11;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl get() {
        return new com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl(this.operationQueueProvider.get(), this.gattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.serviceDiscoveryManagerProvider.get(), this.notificationIndicationManagerProvider.get(), this.mtuProvider.get(), this.descriptorWriterProvider.get(), this.operationProvider.get(), this.longWriteOperationBuilderProvider, this.callbackSchedulerProvider.get(), this.illegalOperationCheckerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider2, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.MtuProvider> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> provider7, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider8, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> provider9, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider10, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker> provider11) {
        return new com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl newRxBleConnectionImpl(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder> provider, io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker illegalOperationChecker) {
        return new com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl(connectionOperationQueue, rxBleGattCallback, bluetoothGatt, (com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager) obj, (com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager) obj2, (com.polidea.rxandroidble2.internal.connection.MtuProvider) obj3, (com.polidea.rxandroidble2.internal.connection.DescriptorWriter) obj4, operationsProvider, provider, scheduler, illegalOperationChecker);
    }
}
