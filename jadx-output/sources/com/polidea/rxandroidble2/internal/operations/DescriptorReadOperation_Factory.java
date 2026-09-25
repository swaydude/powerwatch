package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorReadOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGattDescriptor> descriptorProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutConfigurationProvider;

    public DescriptorReadOperation_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGattDescriptor> provider4) {
        this.rxBleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.timeoutConfigurationProvider = provider3;
        this.descriptorProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation(this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.timeoutConfigurationProvider.get(), this.descriptorProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGattDescriptor> provider4) {
        return new com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation newDescriptorReadOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation(rxBleGattCallback, bluetoothGatt, timeoutConfiguration, bluetoothGattDescriptor);
    }
}
