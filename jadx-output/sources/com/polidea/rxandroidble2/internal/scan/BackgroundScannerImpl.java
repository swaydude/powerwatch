package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class BackgroundScannerImpl implements com.polidea.rxandroidble2.scan.BackgroundScanner {
    private static final int NO_ERROR = 0;
    private final com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator;
    private final com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter internalToExternalScanResultConverter;
    private final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;
    private final com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter scanObjectsConverter;

    @bleshadow.javax.inject.Inject
    BackgroundScannerImpl(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter internalToExternalScanResultConverter) {
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
        this.scanObjectsConverter = androidScanObjectsConverter;
        this.internalScanResultCreator = internalScanResultCreator;
        this.internalToExternalScanResultConverter = internalToExternalScanResultConverter;
    }

    @Override // com.polidea.rxandroidble2.scan.BackgroundScanner
    public void scanBleDeviceInBackground(android.app.PendingIntent pendingIntent, com.polidea.rxandroidble2.scan.ScanSettings scanSettings, com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("PendingIntent based scanning is available for Android O and higher only.", new java.lang.Object[0]);
            return;
        }
        if (!this.rxBleAdapterWrapper.isBluetoothEnabled()) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("PendingIntent based scanning is available only when Bluetooth is ON.", new java.lang.Object[0]);
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(1);
        }
        com.polidea.rxandroidble2.internal.RxBleLog.i("Requesting pending intent based scan.", new java.lang.Object[0]);
        int iStartLeScan = this.rxBleAdapterWrapper.startLeScan(this.scanObjectsConverter.toNativeFilters(scanFilterArr), this.scanObjectsConverter.toNativeSettings(scanSettings), pendingIntent);
        if (iStartLeScan == 0) {
            return;
        }
        com.polidea.rxandroidble2.exceptions.BleScanException bleScanException = new com.polidea.rxandroidble2.exceptions.BleScanException(iStartLeScan);
        com.polidea.rxandroidble2.internal.RxBleLog.w(bleScanException, "Failed to start scan", new java.lang.Object[0]);
        throw bleScanException;
    }

    @Override // com.polidea.rxandroidble2.scan.BackgroundScanner
    public void stopBackgroundBleScan(android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("PendingIntent based scanning is available for Android O and higher only.", new java.lang.Object[0]);
        } else if (!this.rxBleAdapterWrapper.isBluetoothEnabled()) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("PendingIntent based scanning is available only when Bluetooth is ON.", new java.lang.Object[0]);
        } else {
            com.polidea.rxandroidble2.internal.RxBleLog.i("Stopping pending intent based scan.", new java.lang.Object[0]);
            this.rxBleAdapterWrapper.stopLeScan(pendingIntent);
        }
    }

    @Override // com.polidea.rxandroidble2.scan.BackgroundScanner
    public java.util.List<com.polidea.rxandroidble2.scan.ScanResult> onScanResultReceived(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
        int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
        java.util.List<android.bluetooth.le.ScanResult> listExtractScanResults = extractScanResults(intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (intExtra2 == 0) {
            java.util.Iterator<android.bluetooth.le.ScanResult> it = listExtractScanResults.iterator();
            while (it.hasNext()) {
                arrayList.add(convertScanResultToRxAndroidBLEModel(intExtra, it.next()));
            }
            return arrayList;
        }
        throw new com.polidea.rxandroidble2.exceptions.BleScanException(intExtra2);
    }

    private static java.util.List<android.bluetooth.le.ScanResult> extractScanResults(android.content.Intent intent) {
        return (java.util.List) intent.getSerializableExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
    }

    private com.polidea.rxandroidble2.scan.ScanResult convertScanResultToRxAndroidBLEModel(int i, android.bluetooth.le.ScanResult scanResult) {
        return this.internalToExternalScanResultConverter.apply(this.internalScanResultCreator.create(i, scanResult));
    }
}
