package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.fitness.request.zzaf {
    zzah(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.request.IBleScanCallback");
    }

    @Override // com.google.android.gms.fitness.request.zzaf
    public final void onDeviceFound(com.google.android.gms.fitness.data.BleDevice bleDevice) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, bleDevice);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.gms.fitness.request.zzaf
    public final void onScanStopped() throws android.os.RemoteException {
        zzb(2, zza());
    }
}
