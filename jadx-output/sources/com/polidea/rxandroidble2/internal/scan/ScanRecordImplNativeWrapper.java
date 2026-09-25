package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanRecordImplNativeWrapper implements com.polidea.rxandroidble2.scan.ScanRecord {
    private final android.bluetooth.le.ScanRecord nativeScanRecord;

    public ScanRecordImplNativeWrapper(android.bluetooth.le.ScanRecord scanRecord) {
        this.nativeScanRecord = scanRecord;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public int getAdvertiseFlags() {
        return this.nativeScanRecord.getAdvertiseFlags();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.util.List<android.os.ParcelUuid> getServiceUuids() {
        return this.nativeScanRecord.getServiceUuids();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public android.util.SparseArray<byte[]> getManufacturerSpecificData() {
        return this.nativeScanRecord.getManufacturerSpecificData();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getManufacturerSpecificData(int i) {
        return this.nativeScanRecord.getManufacturerSpecificData(i);
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() {
        return this.nativeScanRecord.getServiceData();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getServiceData(android.os.ParcelUuid parcelUuid) {
        return this.nativeScanRecord.getServiceData(parcelUuid);
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public int getTxPowerLevel() {
        return this.nativeScanRecord.getTxPowerLevel();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.lang.String getDeviceName() {
        return this.nativeScanRecord.getDeviceName();
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getBytes() {
        return this.nativeScanRecord.getBytes();
    }
}
