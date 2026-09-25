package com.polidea.rxandroidble2.scan;

/* JADX INFO: loaded from: classes2.dex */
public interface BackgroundScanner {
    java.util.List<com.polidea.rxandroidble2.scan.ScanResult> onScanResultReceived(android.content.Intent intent);

    void scanBleDeviceInBackground(android.app.PendingIntent pendingIntent, com.polidea.rxandroidble2.scan.ScanSettings scanSettings, com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr);

    void stopBackgroundBleScan(android.app.PendingIntent pendingIntent);
}
