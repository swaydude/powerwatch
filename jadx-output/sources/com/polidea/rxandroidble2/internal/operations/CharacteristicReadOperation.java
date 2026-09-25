package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class CharacteristicReadOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<byte[]> {
    private final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic;

    CharacteristicReadOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_READ, timeoutConfiguration);
        this.bluetoothGattCharacteristic = bluetoothGattCharacteristic;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<byte[]> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnCharacteristicRead().filter(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.characteristicUUIDPredicate(this.bluetoothGattCharacteristic.getUuid())).firstOrError().map(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.getBytesFromAssociation());
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readCharacteristic(this.bluetoothGattCharacteristic);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "CharacteristicReadOperation{" + super.toString() + ", characteristic=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.wrap(this.bluetoothGattCharacteristic, false) + '}';
    }
}
