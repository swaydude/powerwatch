package com.polidea.rxandroidble2.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanResult {
    private final com.polidea.rxandroidble2.RxBleDevice bleDevice;
    private final com.polidea.rxandroidble2.scan.ScanCallbackType callbackType;
    private final int rssi;
    private final com.polidea.rxandroidble2.scan.ScanRecord scanRecord;
    private final long timestampNanos;

    public ScanResult(com.polidea.rxandroidble2.RxBleDevice rxBleDevice, int i, long j, com.polidea.rxandroidble2.scan.ScanCallbackType scanCallbackType, com.polidea.rxandroidble2.scan.ScanRecord scanRecord) {
        this.bleDevice = rxBleDevice;
        this.rssi = i;
        this.timestampNanos = j;
        this.callbackType = scanCallbackType;
        this.scanRecord = scanRecord;
    }

    public com.polidea.rxandroidble2.RxBleDevice getBleDevice() {
        return this.bleDevice;
    }

    public int getRssi() {
        return this.rssi;
    }

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public com.polidea.rxandroidble2.scan.ScanCallbackType getCallbackType() {
        return this.callbackType;
    }

    public com.polidea.rxandroidble2.scan.ScanRecord getScanRecord() {
        return this.scanRecord;
    }

    public java.lang.String toString() {
        return "ScanResult{bleDevice=" + this.bleDevice + ", rssi=" + this.rssi + ", timestampNanos=" + this.timestampNanos + ", callbackType=" + this.callbackType + ", scanRecord=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(this.scanRecord.getBytes()) + '}';
    }
}
