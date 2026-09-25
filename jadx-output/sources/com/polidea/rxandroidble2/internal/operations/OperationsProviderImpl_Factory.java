package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public final class OperationsProviderImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices> bleServicesLoggerProvider;
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> bluetoothInteractionSchedulerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> rssiReadOperationProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> timeoutConfigurationProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> timeoutSchedulerProvider;

    public OperationsProviderImpl_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> provider7) {
        this.rxBleGattCallbackProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.bleServicesLoggerProvider = provider3;
        this.timeoutConfigurationProvider = provider4;
        this.bluetoothInteractionSchedulerProvider = provider5;
        this.timeoutSchedulerProvider = provider6;
        this.rssiReadOperationProvider = provider7;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl get() {
        return new com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl(this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), this.bleServicesLoggerProvider.get(), this.timeoutConfigurationProvider.get(), this.bluetoothInteractionSchedulerProvider.get(), this.timeoutSchedulerProvider.get(), this.rssiReadOperationProvider);
    }

    public static com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider6, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> provider7) {
        return new com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl newOperationsProviderImpl(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices loggerUtilBluetoothServices, com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, io.reactivex.Scheduler scheduler, io.reactivex.Scheduler scheduler2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> provider) {
        return new com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl(rxBleGattCallback, bluetoothGatt, loggerUtilBluetoothServices, timeoutConfiguration, scheduler, scheduler2, provider);
    }
}
