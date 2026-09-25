package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattException extends com.polidea.rxandroidble2.exceptions.BleException {
    public static final int UNKNOWN_STATUS = -1;
    private final com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType;
    private final android.bluetooth.BluetoothGatt gatt;
    private final int status;

    @java.lang.Deprecated
    public BleGattException(int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(createMessage(null, i, bleGattOperationType));
        this.gatt = null;
        this.status = i;
        this.bleGattOperationType = bleGattOperationType;
    }

    public BleGattException(android.bluetooth.BluetoothGatt bluetoothGatt, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        super(createMessage(bluetoothGatt, i, bleGattOperationType));
        this.gatt = bluetoothGatt;
        this.status = i;
        this.bleGattOperationType = bleGattOperationType;
    }

    public BleGattException(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        this(bluetoothGatt, -1, bleGattOperationType);
    }

    public java.lang.String getMacAddress() {
        return getMacAddress(this.gatt);
    }

    public com.polidea.rxandroidble2.exceptions.BleGattOperationType getBleGattOperationType() {
        return this.bleGattOperationType;
    }

    public int getStatus() {
        return this.status;
    }

    private static java.lang.String getMacAddress(android.bluetooth.BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return null;
        }
        return bluetoothGatt.getDevice().getAddress();
    }

    private static java.lang.String createMessage(android.bluetooth.BluetoothGatt bluetoothGatt, int i, com.polidea.rxandroidble2.exceptions.BleGattOperationType bleGattOperationType) {
        if (i == -1) {
            return java.lang.String.format("GATT exception from MAC address %s, with type %s", getMacAddress(bluetoothGatt), bleGattOperationType);
        }
        return java.lang.String.format("GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(bluetoothGatt), java.lang.Integer.valueOf(i), com.polidea.rxandroidble2.utils.GattStatusParser.getGattCallbackStatusDescription(i), bleGattOperationType, java.lang.Integer.valueOf(i), "https://android.googlesource.com/platform/external/bluetooth/bluedroid/+/android-5.1.0_r1/stack/include/gatt_api.h");
    }
}
