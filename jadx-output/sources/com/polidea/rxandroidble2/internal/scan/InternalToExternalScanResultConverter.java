package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class InternalToExternalScanResultConverter implements io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult> {
    private final com.polidea.rxandroidble2.internal.RxBleDeviceProvider deviceProvider;

    @bleshadow.javax.inject.Inject
    public InternalToExternalScanResultConverter(com.polidea.rxandroidble2.internal.RxBleDeviceProvider rxBleDeviceProvider) {
        this.deviceProvider = rxBleDeviceProvider;
    }

    @Override // io.reactivex.functions.Function
    public com.polidea.rxandroidble2.scan.ScanResult apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
        return new com.polidea.rxandroidble2.scan.ScanResult(this.deviceProvider.getBleDevice(rxBleInternalScanResult.getBluetoothDevice().getAddress()), rxBleInternalScanResult.getRssi(), rxBleInternalScanResult.getTimestampNanos(), rxBleInternalScanResult.getScanCallbackType(), rxBleInternalScanResult.getScanRecord());
    }
}
