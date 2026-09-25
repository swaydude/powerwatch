package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ServiceDiscoveryManager_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> operationProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> operationQueueProvider;

    public ServiceDiscoveryManager_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider3) {
        this.operationQueueProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.operationProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager get() {
        return new com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager(this.operationQueueProvider.get(), this.bluetoothGattProvider.get(), this.operationProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.OperationsProvider> provider3) {
        return new com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager newServiceDiscoveryManager(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue connectionOperationQueue, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.OperationsProvider operationsProvider) {
        return new com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager(connectionOperationQueue, bluetoothGatt, operationsProvider);
    }
}
