package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class OperationsProviderImpl implements com.polidea.rxandroidble2.internal.operations.OperationsProvider {
    private final com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices bleServicesLogger;
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private final io.reactivex.Scheduler bluetoothInteractionScheduler;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> rssiReadOperationProvider;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration;
    private final io.reactivex.Scheduler timeoutScheduler;

    @bleshadow.javax.inject.Inject
    OperationsProviderImpl(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices loggerUtilBluetoothServices, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) io.reactivex.Scheduler scheduler, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT) io.reactivex.Scheduler scheduler2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.operations.ReadRssiOperation> provider) {
        this.rxBleGattCallback = rxBleGattCallback;
        this.bluetoothGatt = bluetoothGatt;
        this.bleServicesLogger = loggerUtilBluetoothServices;
        this.timeoutConfiguration = timeoutConfiguration;
        this.bluetoothInteractionScheduler = scheduler;
        this.timeoutScheduler = scheduler2;
        this.rssiReadOperationProvider = provider;
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation provideLongWriteOperation(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy, com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy, com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider payloadSizeLimitProvider, byte[] bArr) {
        return new com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation(this.bluetoothGatt, this.rxBleGattCallback, this.bluetoothInteractionScheduler, this.timeoutConfiguration, bluetoothGattCharacteristic, payloadSizeLimitProvider, writeOperationAckStrategy, writeOperationRetryStrategy, bArr);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.MtuRequestOperation provideMtuChangeOperation(int i) {
        return new com.polidea.rxandroidble2.internal.operations.MtuRequestOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, i);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.CharacteristicReadOperation provideReadCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new com.polidea.rxandroidble2.internal.operations.CharacteristicReadOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, bluetoothGattCharacteristic);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation provideReadDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, bluetoothGattDescriptor);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.ReadRssiOperation provideRssiReadOperation() {
        return this.rssiReadOperationProvider.get();
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation provideServiceDiscoveryOperation(long j, java.util.concurrent.TimeUnit timeUnit) {
        return new com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation(this.rxBleGattCallback, this.bluetoothGatt, this.bleServicesLogger, new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(j, timeUnit, this.timeoutScheduler));
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.CharacteristicWriteOperation provideWriteCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new com.polidea.rxandroidble2.internal.operations.CharacteristicWriteOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, bluetoothGattCharacteristic, bArr);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.DescriptorWriteOperation provideWriteDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new com.polidea.rxandroidble2.internal.operations.DescriptorWriteOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, 2, bluetoothGattDescriptor, bArr);
    }

    @Override // com.polidea.rxandroidble2.internal.operations.OperationsProvider
    public com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation provideConnectionPriorityChangeOperation(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation(this.rxBleGattCallback, this.bluetoothGatt, this.timeoutConfiguration, i, new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(j, timeUnit, this.timeoutScheduler));
    }
}
