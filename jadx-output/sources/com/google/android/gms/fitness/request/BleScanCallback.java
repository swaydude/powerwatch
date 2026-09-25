package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class BleScanCallback {
    public abstract void onDeviceFound(com.google.android.gms.fitness.data.BleDevice bleDevice);

    public abstract void onScanStopped();
}
