package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class ScanOperationApi21 extends com.polidea.rxandroidble2.internal.operations.ScanOperation<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, android.bluetooth.le.ScanCallback> {
    private final com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter;
    private final com.polidea.rxandroidble2.internal.scan.EmulatedScanFilterMatcher emulatedScanFilterMatcher;
    private final com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator;
    private final com.polidea.rxandroidble2.scan.ScanFilter[] scanFilters;
    private final com.polidea.rxandroidble2.scan.ScanSettings scanSettings;

    public ScanOperationApi21(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter, com.polidea.rxandroidble2.scan.ScanSettings scanSettings, com.polidea.rxandroidble2.internal.scan.EmulatedScanFilterMatcher emulatedScanFilterMatcher, com.polidea.rxandroidble2.scan.ScanFilter[] scanFilterArr) {
        super(rxBleAdapterWrapper);
        this.internalScanResultCreator = internalScanResultCreator;
        this.scanSettings = scanSettings;
        this.emulatedScanFilterMatcher = emulatedScanFilterMatcher;
        this.scanFilters = scanFilterArr;
        this.androidScanObjectsConverter = androidScanObjectsConverter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public android.bluetooth.le.ScanCallback createScanCallback(final io.reactivex.Emitter<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emitter) {
        return new android.bluetooth.le.ScanCallback() { // from class: com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
                if (!com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.this.emulatedScanFilterMatcher.isEmpty() && com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3) && com.polidea.rxandroidble2.internal.RxBleLog.getShouldLogScannedPeripherals()) {
                    android.bluetooth.le.ScanRecord scanRecord = scanResult.getScanRecord();
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(scanResult.getDevice().getAddress());
                    objArr[1] = scanResult.getDevice().getName();
                    objArr[2] = java.lang.Integer.valueOf(scanResult.getRssi());
                    objArr[3] = com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(scanRecord != null ? scanRecord.getBytes() : null);
                    com.polidea.rxandroidble2.internal.RxBleLog.d("%s, name=%s, rssi=%d, data=%s", objArr);
                }
                com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResultCreate = com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.this.internalScanResultCreator.create(i, scanResult);
                if (com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.this.emulatedScanFilterMatcher.matches(rxBleInternalScanResultCreate)) {
                    emitter.onNext(rxBleInternalScanResultCreate);
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> list) {
                java.util.Iterator<android.bluetooth.le.ScanResult> it = list.iterator();
                while (it.hasNext()) {
                    com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResultCreate = com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.this.internalScanResultCreator.create(it.next());
                    if (com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.this.emulatedScanFilterMatcher.matches(rxBleInternalScanResultCreate)) {
                        emitter.onNext(rxBleInternalScanResultCreate);
                    }
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                emitter.onError(new com.polidea.rxandroidble2.exceptions.BleScanException(com.polidea.rxandroidble2.internal.operations.ScanOperationApi21.errorCodeToBleErrorCode(i)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public boolean startScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, android.bluetooth.le.ScanCallback scanCallback) {
        if (this.emulatedScanFilterMatcher.isEmpty()) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("No library side filtering —> debug logs of scanned devices disabled", new java.lang.Object[0]);
        }
        rxBleAdapterWrapper.startLeScan(this.androidScanObjectsConverter.toNativeFilters(this.scanFilters), this.androidScanObjectsConverter.toNativeSettings(this.scanSettings), scanCallback);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.polidea.rxandroidble2.internal.operations.ScanOperation
    public void stopScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, android.bluetooth.le.ScanCallback scanCallback) {
        rxBleAdapterWrapper.stopLeScan(scanCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int errorCodeToBleErrorCode(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 4) {
            return 8;
        }
        if (i == 5) {
            return 9;
        }
        com.polidea.rxandroidble2.internal.RxBleLog.w("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new java.lang.Object[0]);
        return Integer.MAX_VALUE;
    }

    public java.lang.String toString() {
        java.lang.String str;
        com.polidea.rxandroidble2.scan.ScanFilter[] scanFilterArr = this.scanFilters;
        boolean z = scanFilterArr == null || scanFilterArr.length == 0;
        boolean zIsEmpty = this.emulatedScanFilterMatcher.isEmpty();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScanOperationApi21{");
        java.lang.String str2 = "";
        if (z) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> nativeFilters=" + java.util.Arrays.toString(this.scanFilters);
        }
        sb.append(str);
        sb.append((z || zIsEmpty) ? "" : " and then ");
        if (!zIsEmpty) {
            str2 = "ANY_MUST_MATCH -> " + this.emulatedScanFilterMatcher;
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }
}
