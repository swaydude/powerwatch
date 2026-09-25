package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.ConnectOperation> {
    private final bleshadow.javax.inject.Provider<java.lang.Boolean> autoConnectProvider;
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> bluetoothDeviceProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> connectTimeoutProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.BleConnectionCompat> connectionCompatProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> connectionStateChangedActionProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;

    public ConnectOperation_Factory(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.BleConnectionCompat> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider5, bleshadow.javax.inject.Provider<java.lang.Boolean> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> provider7) {
        this.bluetoothDeviceProvider = provider;
        this.connectionCompatProvider = provider2;
        this.rxBleGattCallbackProvider = provider3;
        this.bluetoothGattProvider = provider4;
        this.connectTimeoutProvider = provider5;
        this.autoConnectProvider = provider6;
        this.connectionStateChangedActionProvider = provider7;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.ConnectOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.ConnectOperation(this.bluetoothDeviceProvider.get(), this.connectionCompatProvider.get(), this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.connectTimeoutProvider.get(), this.autoConnectProvider.get().booleanValue(), this.connectionStateChangedActionProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.operations.ConnectOperation_Factory create(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.BleConnectionCompat> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider5, bleshadow.javax.inject.Provider<java.lang.Boolean> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> provider7) {
        return new com.polidea.rxandroidble2.internal.operations.ConnectOperation_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.polidea.rxandroidble2.internal.operations.ConnectOperation newConnectOperation(android.bluetooth.BluetoothDevice bluetoothDevice, com.polidea.rxandroidble2.internal.util.BleConnectionCompat bleConnectionCompat, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, boolean z, com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangeListener) {
        return new com.polidea.rxandroidble2.internal.operations.ConnectOperation(bluetoothDevice, bleConnectionCompat, rxBleGattCallback, bluetoothGattProvider, timeoutConfiguration, z, connectionStateChangeListener);
    }
}
