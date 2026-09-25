package com.polidea.rxandroidble2.scan;

/* JADX INFO: loaded from: classes2.dex */
public interface ScanRecord {
    int getAdvertiseFlags();

    byte[] getBytes();

    java.lang.String getDeviceName();

    android.util.SparseArray<byte[]> getManufacturerSpecificData();

    byte[] getManufacturerSpecificData(int i);

    java.util.Map<android.os.ParcelUuid, byte[]> getServiceData();

    byte[] getServiceData(android.os.ParcelUuid parcelUuid);

    java.util.List<android.os.ParcelUuid> getServiceUuids();

    int getTxPowerLevel();
}
