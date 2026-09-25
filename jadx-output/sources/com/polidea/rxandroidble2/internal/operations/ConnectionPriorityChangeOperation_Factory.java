package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionPriorityChangeOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Integer> connectionPriorityProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> successTimeoutConfigurationAndTimeoutConfigurationProvider;

    public ConnectionPriorityChangeOperation_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<java.lang.Integer> provider4) {
        this.rxBleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.successTimeoutConfigurationAndTimeoutConfigurationProvider = provider3;
        this.connectionPriorityProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation(this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.successTimeoutConfigurationAndTimeoutConfigurationProvider.get(), this.connectionPriorityProvider.get().intValue(), this.successTimeoutConfigurationAndTimeoutConfigurationProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<java.lang.Integer> provider4) {
        return new com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation newConnectionPriorityChangeOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, int i, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration2) {
        return new com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation(rxBleGattCallback, bluetoothGatt, timeoutConfiguration, i, timeoutConfiguration2);
    }
}
