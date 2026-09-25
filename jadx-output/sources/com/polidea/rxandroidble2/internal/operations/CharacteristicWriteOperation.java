package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class CharacteristicWriteOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<byte[]> {
    private final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic;
    private final byte[] data;

    CharacteristicWriteOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_WRITE, timeoutConfiguration);
        this.bluetoothGattCharacteristic = bluetoothGattCharacteristic;
        this.data = bArr;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<byte[]> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnCharacteristicWrite().filter(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.characteristicUUIDPredicate(this.bluetoothGattCharacteristic.getUuid())).firstOrError().map(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.getBytesFromAssociation());
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        this.bluetoothGattCharacteristic.setValue(this.data);
        return bluetoothGatt.writeCharacteristic(this.bluetoothGattCharacteristic);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "CharacteristicWriteOperation{" + super.toString() + ", characteristic=" + new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(this.bluetoothGattCharacteristic.getUuid(), this.data, true) + '}';
    }
}
