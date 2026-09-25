package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zzaf extends android.os.IInterface {
    void onDeviceFound(com.google.android.gms.fitness.data.BleDevice bleDevice) throws android.os.RemoteException;

    void onScanStopped() throws android.os.RemoteException;
}
