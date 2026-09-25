package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class MtuRequestOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.MtuRequestOperation> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Integer> requestedMtuProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutConfigurationProvider;

    public MtuRequestOperation_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<java.lang.Integer> provider4) {
        this.rxBleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.timeoutConfigurationProvider = provider3;
        this.requestedMtuProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.MtuRequestOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.MtuRequestOperation(this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.timeoutConfigurationProvider.get(), this.requestedMtuProvider.get().intValue());
    }

    public static com.polidea.rxandroidble2.internal.operations.MtuRequestOperation_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider3, bleshadow.javax.inject.Provider<java.lang.Integer> provider4) {
        return new com.polidea.rxandroidble2.internal.operations.MtuRequestOperation_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.operations.MtuRequestOperation newMtuRequestOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, int i) {
        return new com.polidea.rxandroidble2.internal.operations.MtuRequestOperation(rxBleGattCallback, bluetoothGatt, timeoutConfiguration, i);
    }
}
