package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanRecordImplCompat implements com.polidea.rxandroidble2.scan.ScanRecord {
    private final int advertiseFlags;
    private final byte[] bytes;
    private final java.lang.String deviceName;
    private final android.util.SparseArray<byte[]> manufacturerSpecificData;
    private final java.util.Map<android.os.ParcelUuid, byte[]> serviceData;
    private final java.util.List<android.os.ParcelUuid> serviceUuids;
    private final int txPowerLevel;

    public ScanRecordImplCompat(java.util.List<android.os.ParcelUuid> list, android.util.SparseArray<byte[]> sparseArray, java.util.Map<android.os.ParcelUuid, byte[]> map, int i, int i2, java.lang.String str, byte[] bArr) {
        this.serviceUuids = list;
        this.manufacturerSpecificData = sparseArray;
        this.serviceData = map;
        this.deviceName = str;
        this.advertiseFlags = i;
        this.txPowerLevel = i2;
        this.bytes = bArr;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public int getAdvertiseFlags() {
        return this.advertiseFlags;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.util.List<android.os.ParcelUuid> getServiceUuids() {
        return this.serviceUuids;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public android.util.SparseArray<byte[]> getManufacturerSpecificData() {
        return this.manufacturerSpecificData;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getManufacturerSpecificData(int i) {
        return this.manufacturerSpecificData.get(i);
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() {
        return this.serviceData;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getServiceData(android.os.ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.serviceData.get(parcelUuid);
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public int getTxPowerLevel() {
        return this.txPowerLevel;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public java.lang.String getDeviceName() {
        return this.deviceName;
    }

    @Override // com.polidea.rxandroidble2.scan.ScanRecord
    public byte[] getBytes() {
        return this.bytes;
    }
}
