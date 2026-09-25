package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleInternalScanResultLegacy {
    private final android.bluetooth.BluetoothDevice bluetoothDevice;
    private final int rssi;
    private final byte[] scanRecord;

    public RxBleInternalScanResultLegacy(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.bluetoothDevice = bluetoothDevice;
        this.rssi = i;
        this.scanRecord = bArr;
    }

    public android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }
}
