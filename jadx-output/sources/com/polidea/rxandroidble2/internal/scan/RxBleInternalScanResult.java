package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleInternalScanResult {
    private final android.bluetooth.BluetoothDevice bluetoothDevice;
    private final int rssi;
    private final com.polidea.rxandroidble2.scan.ScanCallbackType scanCallbackType;
    private final com.polidea.rxandroidble2.scan.ScanRecord scanRecord;
    private final long timestampNanos;

    public RxBleInternalScanResult(android.bluetooth.BluetoothDevice bluetoothDevice, int i, long j, com.polidea.rxandroidble2.scan.ScanRecord scanRecord, com.polidea.rxandroidble2.scan.ScanCallbackType scanCallbackType) {
        this.bluetoothDevice = bluetoothDevice;
        this.rssi = i;
        this.timestampNanos = j;
        this.scanRecord = scanRecord;
        this.scanCallbackType = scanCallbackType;
    }

    public android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    public int getRssi() {
        return this.rssi;
    }

    public com.polidea.rxandroidble2.scan.ScanRecord getScanRecord() {
        return this.scanRecord;
    }

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public com.polidea.rxandroidble2.scan.ScanCallbackType getScanCallbackType() {
        return this.scanCallbackType;
    }
}
