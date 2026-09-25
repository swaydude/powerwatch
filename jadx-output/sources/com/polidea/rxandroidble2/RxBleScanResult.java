package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleScanResult {
    private final com.polidea.rxandroidble2.RxBleDevice bleDevice;
    private final int rssi;
    private final byte[] scanRecord;

    public RxBleScanResult(com.polidea.rxandroidble2.RxBleDevice rxBleDevice, int i, byte[] bArr) {
        this.bleDevice = rxBleDevice;
        this.rssi = i;
        this.scanRecord = bArr;
    }

    public com.polidea.rxandroidble2.RxBleDevice getBleDevice() {
        return this.bleDevice;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public java.lang.String toString() {
        return "RxBleScanResult{bleDevice=" + this.bleDevice + ", rssi=" + this.rssi + ", scanRecord=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(this.scanRecord) + '}';
    }
}
