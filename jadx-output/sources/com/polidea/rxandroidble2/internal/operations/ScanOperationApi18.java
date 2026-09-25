package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ScanOperationApi18 extends com.polidea.rxandroidble2.internal.operations.ScanOperation<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, android.bluetooth.BluetoothAdapter.LeScanCallback> {
    private final com.polidea.rxandroidble2.internal.scan.EmulatedScanFilterMatcher scanFilterMatcher;
    private final com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator scanResultCreator;

    public ScanOperationApi18(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.EmulatedScanFilterMatcher emulatedScanFilterMatcher) {
        super(rxBleAdapterWrapper);
        this.scanResultCreator = internalScanResultCreator;
        this.scanFilterMatcher = emulatedScanFilterMatcher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public android.bluetooth.BluetoothAdapter.LeScanCallback createScanCallback(final io.reactivex.Emitter<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emitter) {
        return new android.bluetooth.BluetoothAdapter.LeScanCallback() { // from class: com.polidea.rxandroidble2.internal.operations.ScanOperationApi18.1
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                if (!com.polidea.rxandroidble2.internal.operations.ScanOperationApi18.this.scanFilterMatcher.isEmpty() && com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3) && com.polidea.rxandroidble2.internal.RxBleLog.getShouldLogScannedPeripherals()) {
                    com.polidea.rxandroidble2.internal.RxBleLog.d("%s, name=%s, rssi=%d, data=%s", com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(bluetoothDevice.getAddress()), bluetoothDevice.getName(), java.lang.Integer.valueOf(i), com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(bArr));
                }
                com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResultCreate = com.polidea.rxandroidble2.internal.operations.ScanOperationApi18.this.scanResultCreator.create(bluetoothDevice, i, bArr);
                if (com.polidea.rxandroidble2.internal.operations.ScanOperationApi18.this.scanFilterMatcher.matches(rxBleInternalScanResultCreate)) {
                    emitter.onNext(rxBleInternalScanResultCreate);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public boolean startScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.scanFilterMatcher.isEmpty()) {
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
        sb.append("ScanOperationApi18{");
        if (this.scanFilterMatcher.isEmpty()) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> " + this.scanFilterMatcher;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
