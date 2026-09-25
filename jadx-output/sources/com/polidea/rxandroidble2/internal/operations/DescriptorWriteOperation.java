package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorWriteOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<byte[]> {
    private final int bluetoothGattCharacteristicDefaultWriteType;
    private android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor;
    private byte[] data;

    DescriptorWriteOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, int i, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.DESCRIPTOR_WRITE, timeoutConfiguration);
        this.bluetoothGattCharacteristicDefaultWriteType = i;
        this.bluetoothGattDescriptor = bluetoothGattDescriptor;
        this.data = bArr;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<byte[]> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnDescriptorWrite().filter(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.descriptorPredicate(this.bluetoothGattDescriptor)).firstOrError().map(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.getBytesFromAssociation());
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        this.bluetoothGattDescriptor.setValue(this.data);
        android.bluetooth.BluetoothGattCharacteristic characteristic = this.bluetoothGattDescriptor.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(this.bluetoothGattCharacteristicDefaultWriteType);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(this.bluetoothGattDescriptor);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "DescriptorWriteOperation{" + super.toString() + ", descriptor=" + new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(this.bluetoothGattDescriptor.getUuid(), this.data, true) + '}';
    }
}
