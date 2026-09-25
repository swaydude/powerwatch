package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidScanObjectsConverter {
    private final int deviceSdk;

    @bleshadow.javax.inject.Inject
    public AndroidScanObjectsConverter(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i) {
        this.deviceSdk = i;
    }

    public android.bluetooth.le.ScanSettings toNativeSettings(com.polidea.rxandroidble2.scan.ScanSettings scanSettings) {
        android.bluetooth.le.ScanSettings.Builder builder = new android.bluetooth.le.ScanSettings.Builder();
        if (this.deviceSdk >= 23) {
            setMarshmallowSettings(scanSettings, builder);
        }
        return builder.setReportDelay(scanSettings.getReportDelayMillis()).setScanMode(scanSettings.getScanMode()).build();
    }

    private void setMarshmallowSettings(com.polidea.rxandroidble2.scan.ScanSettings scanSettings, android.bluetooth.le.ScanSettings.Builder builder) {
        builder.setCallbackType(scanSettings.getCallbackType()).setMatchMode(scanSettings.getMatchMode()).setNumOfMatches(scanSettings.getNumOfMatches());
    }

    public java.util.List<android.bluetooth.le.ScanFilter> toNativeFilters(com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr) {
        if (!(scanFilterArr != null && scanFilterArr.length > 0)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(scanFilterArr.length);
        for (com.polidea.rxandroidble2.scan.ScanFilter scanFilter : scanFilterArr) {
            arrayList.add(toNative(scanFilter));
        }
        return arrayList;
    }

    private android.bluetooth.le.ScanFilter toNative(com.polidea.rxandroidble2.scan.ScanFilter scanFilter) {
        android.bluetooth.le.ScanFilter.Builder builder = new android.bluetooth.le.ScanFilter.Builder();
        if (scanFilter.getServiceDataUuid() != null) {
            builder.setServiceData(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        return builder.setDeviceAddress(scanFilter.getDeviceAddress()).setDeviceName(scanFilter.getDeviceName()).setManufacturerData(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask()).setServiceUuid(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask()).build();
    }
}
