package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class DisconnectOperation_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.DisconnectOperation> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> bluetoothInteractionSchedulerProvider;
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothManager> bluetoothManagerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> connectionStateChangeListenerProvider;
    private final bleshadow.javax.inject.Provider<java.lang.String> macAddressProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutConfigurationProvider;

    public DisconnectOperation_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider2, bleshadow.javax.inject.Provider<java.lang.String> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothManager> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> provider7) {
        this.rxBleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.macAddressProvider = provider3;
        this.bluetoothManagerProvider = provider4;
        this.bluetoothInteractionSchedulerProvider = provider5;
        this.timeoutConfigurationProvider = provider6;
        this.connectionStateChangeListenerProvider = provider7;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.DisconnectOperation get() {
        return new com.polidea.rxandroidble2.internal.operations.DisconnectOperation(this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.macAddressProvider.get(), this.bluetoothManagerProvider.get(), this.bluetoothInteractionSchedulerProvider.get(), this.timeoutConfigurationProvider.get(), this.connectionStateChangeListenerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.operations.DisconnectOperation_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider2, bleshadow.javax.inject.Provider<java.lang.String> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothManager> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> provider7) {
        return new com.polidea.rxandroidble2.internal.operations.DisconnectOperation_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.polidea.rxandroidble2.internal.operations.DisconnectOperation newDisconnectOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, java.lang.String str, android.bluetooth.BluetoothManager bluetoothManager, io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener connectionStateChangeListener) {
        return new com.polidea.rxandroidble2.internal.operations.DisconnectOperation(rxBleGattCallback, bluetoothGattProvider, str, bluetoothManager, scheduler, timeoutConfiguration, connectionStateChangeListener);
    }
}
