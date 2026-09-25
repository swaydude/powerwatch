package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.ClientScope
public class InternalScanResultCreator {
    private final com.polidea.rxandroidble2.internal.util.UUIDUtil uuidUtil;

    @bleshadow.javax.inject.Inject
    public InternalScanResultCreator(com.polidea.rxandroidble2.internal.util.UUIDUtil uUIDUtil) {
        this.uuidUtil = uUIDUtil;
    }

    public com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult create(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        return new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult(bluetoothDevice, i, java.lang.System.nanoTime(), this.uuidUtil.parseFromBytes(bArr), com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_UNSPECIFIED);
    }

    public com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult create(android.bluetooth.le.ScanResult scanResult) {
        return new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new com.polidea.rxandroidble2.internal.scan.ScanRecordImplNativeWrapper(scanResult.getScanRecord()), com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_BATCH);
    }

    public com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult create(int i, android.bluetooth.le.ScanResult scanResult) {
        return new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new com.polidea.rxandroidble2.internal.scan.ScanRecordImplNativeWrapper(scanResult.getScanRecord()), toScanCallbackType(i));
    }

    private static com.polidea.rxandroidble2.scan.ScanCallbackType toScanCallbackType(int i) {
        if (i == 1) {
            return com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_ALL_MATCHES;
        }
        if (i == 2) {
            return com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_FIRST_MATCH;
        }
        if (i == 4) {
            return com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_MATCH_LOST;
        }
        com.polidea.rxandroidble2.internal.RxBleLog.w("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", java.lang.Integer.valueOf(i));
        return com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_UNKNOWN;
    }
}
