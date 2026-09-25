package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorReadOperation extends com.polidea.rxandroidble2.internal.SingleResponseOperation<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> {
    private final android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor;

    @bleshadow.javax.inject.Inject
    DescriptorReadOperation(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, android.bluetooth.BluetoothGatt bluetoothGatt, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(bluetoothGatt, rxBleGattCallback, com.polidea.rxandroidble2.exceptions.BleGattOperationType.DESCRIPTOR_READ, timeoutConfiguration);
        this.bluetoothGattDescriptor = bluetoothGattDescriptor;
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected io.reactivex.Single<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> getCallback(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnDescriptorRead().filter(com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.descriptorPredicate(this.bluetoothGattDescriptor)).firstOrError();
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    protected boolean startOperation(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readDescriptor(this.bluetoothGattDescriptor);
    }

    @Override // com.polidea.rxandroidble2.internal.SingleResponseOperation
    public java.lang.String toString() {
        return "DescriptorReadOperation{" + super.toString() + ", descriptor=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.wrap(this.bluetoothGattDescriptor, false) + '}';
    }
}
