package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public interface OperationsProvider {
    com.polidea.rxandroidble2.internal.operations.ConnectionPriorityChangeOperation provideConnectionPriorityChangeOperation(int i, long j, java.util.concurrent.TimeUnit timeUnit);

    com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation provideLongWriteOperation(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy, com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy, com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider payloadSizeLimitProvider, byte[] bArr);

    com.polidea.rxandroidble2.internal.operations.MtuRequestOperation provideMtuChangeOperation(int i);

    com.polidea.rxandroidble2.internal.operations.CharacteristicReadOperation provideReadCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

    com.polidea.rxandroidble2.internal.operations.DescriptorReadOperation provideReadDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor);

    com.polidea.rxandroidble2.internal.operations.ReadRssiOperation provideRssiReadOperation();

    com.polidea.rxandroidble2.internal.operations.ServiceDiscoveryOperation provideServiceDiscoveryOperation(long j, java.util.concurrent.TimeUnit timeUnit);

    com.polidea.rxandroidble2.internal.operations.CharacteristicWriteOperation provideWriteCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    com.polidea.rxandroidble2.internal.operations.DescriptorWriteOperation provideWriteDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);
}
