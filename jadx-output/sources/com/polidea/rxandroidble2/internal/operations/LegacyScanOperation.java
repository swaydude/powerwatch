package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class LegacyScanOperation extends com.polidea.rxandroidble2.internal.operations.ScanOperation<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy, android.bluetooth.BluetoothAdapter.LeScanCallback> {
    private final java.util.Set<java.util.UUID> filterUuids;
    private final com.polidea.rxandroidble2.internal.util.UUIDUtil uuidUtil;

    public LegacyScanOperation(java.util.UUID[] uuidArr, com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.util.UUIDUtil uUIDUtil) {
        super(rxBleAdapterWrapper);
        this.uuidUtil = uUIDUtil;
        if (uuidArr != null && uuidArr.length > 0) {
            java.util.HashSet hashSet = new java.util.HashSet(uuidArr.length);
            this.filterUuids = hashSet;
            java.util.Collections.addAll(hashSet, uuidArr);
            return;
        }
        this.filterUuids = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public android.bluetooth.BluetoothAdapter.LeScanCallback createScanCallback(final io.reactivex.Emitter<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy> emitter) {
        return new android.bluetooth.BluetoothAdapter.LeScanCallback() { // from class: com.polidea.rxandroidble2.internal.operations.LegacyScanOperation.1
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                if (com.polidea.rxandroidble2.internal.operations.LegacyScanOperation.this.filterUuids != null && com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
                    com.polidea.rxandroidble2.internal.RxBleLog.d("%s, name=%s, rssi=%d, data=%s", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(bluetoothDevice.getAddress()), bluetoothDevice.getName(), java.lang.Integer.valueOf(i), com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(bArr));
                }
                if (com.polidea.rxandroidble2.internal.operations.LegacyScanOperation.this.filterUuids == null || com.polidea.rxandroidble2.internal.operations.LegacyScanOperation.this.uuidUtil.extractUUIDs(bArr).containsAll(com.polidea.rxandroidble2.internal.operations.LegacyScanOperation.this.filterUuids)) {
                    emitter.onNext(new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResultLegacy(bluetoothDevice, i, bArr));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public boolean startScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.filterUuids == null) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("No library side filtering —> debug logs of scanned devices disabled", new java.lang.Object[0]);
        }
        return rxBleAdapterWrapper.startLegacyLeScan(leScanCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public void stopScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback) {
        rxBleAdapterWrapper.stopLegacyLeScan(leScanCallback);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LegacyScanOperation{");
        if (this.filterUuids == null) {
            str = "";
        } else {
            str = "ALL_MUST_MATCH -> uuids=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidSetToLog(this.filterUuids);
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
