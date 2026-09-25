package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleCannotSetCharacteristicNotificationException extends com.polidea.rxandroidble2.exceptions.BleException {
    public static final int CANNOT_FIND_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR = 2;
    public static final int CANNOT_SET_LOCAL_NOTIFICATION = 1;
    public static final int CANNOT_WRITE_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR = 3;

    @java.lang.Deprecated
    public static final int UNKNOWN = -1;
    private final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic;
    private final int reason;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    private static java.lang.String reasonDescription(int i) {
        if (i == 1) {
            return "Cannot set local notification";
        }
        if (i != 2) {
            return i != 3 ? "Unknown error" : "Cannot write client characteristic config descriptor";
        }
        return "Cannot find client characteristic config descriptor";
    }

    @java.lang.Deprecated
    public BleCannotSetCharacteristicNotificationException(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(createMessage(bluetoothGattCharacteristic, -1));
        this.bluetoothGattCharacteristic = bluetoothGattCharacteristic;
        this.reason = -1;
    }

    public BleCannotSetCharacteristicNotificationException(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, java.lang.Throwable th) {
        super(createMessage(bluetoothGattCharacteristic, i), th);
        this.bluetoothGattCharacteristic = bluetoothGattCharacteristic;
        this.reason = i;
    }

    public android.bluetooth.BluetoothGattCharacteristic getBluetoothGattCharacteristic() {
        return this.bluetoothGattCharacteristic;
    }

    public int getReason() {
        return this.reason;
    }

    private static java.lang.String createMessage(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return reasonDescription(i) + " (code " + i + ") with characteristic UUID " + bluetoothGattCharacteristic.getUuid();
    }
}
