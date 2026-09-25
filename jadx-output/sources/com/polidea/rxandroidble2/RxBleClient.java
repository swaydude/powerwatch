package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RxBleClient {

    public enum State {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY
    }

    public abstract com.polidea.rxandroidble2.scan.BackgroundScanner getBackgroundScanner();

    public abstract com.polidea.rxandroidble2.RxBleDevice getBleDevice(java.lang.String str);

    public abstract java.util.Set<com.polidea.rxandroidble2.RxBleDevice> getBondedDevices();

    public abstract com.polidea.rxandroidble2.RxBleClient.State getState();

    public abstract io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> observeStateChanges();

    public abstract io.reactivex.Observable<com.polidea.rxandroidble2.scan.ScanResult> scanBleDevices(com.polidea.rxandroidble2.scan.ScanSettings scanSettings, com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr);

    @java.lang.Deprecated
    public abstract io.reactivex.Observable<com.polidea.rxandroidble2.RxBleScanResult> scanBleDevices(java.util.UUID... uuidArr);

    public static com.polidea.rxandroidble2.RxBleClient create(android.content.Context context) {
        return com.polidea.rxandroidble2.DaggerClientComponent.builder().applicationContext(context.getApplicationContext()).build().rxBleClient();
    }

    @java.lang.Deprecated
    public static void setLogLevel(int i) {
        com.polidea.rxandroidble2.internal.RxBleLog.setLogLevel(i);
    }

    public static void updateLogOptions(com.polidea.rxandroidble2.LogOptions logOptions) {
        com.polidea.rxandroidble2.internal.RxBleLog.updateLogOptions(logOptions);
    }
}
