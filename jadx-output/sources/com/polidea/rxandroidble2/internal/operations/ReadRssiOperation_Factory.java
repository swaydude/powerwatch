package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class ReadRssiOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> bleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutConfigurationProvider;

    public ReadRssiOperation_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3) {
        this.bleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.timeoutConfigurationProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.ReadRssiOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.ReadRssiOperation(this.bleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.timeoutConfigurationProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.operations.ReadRssiOperation_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3) {
        return new com.polidea.rxandroidble2.internal.operations.ReadRssiOperation_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.operations.ReadRssiOperation newReadRssiOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration) {
        return new com.polidea.rxandroidble2.internal.operations.ReadRssiOperation(rxBleGattCallback, bluetoothGatt, timeoutConfiguration);
    }
}
