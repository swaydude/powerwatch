package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzer extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzep {
    zzer(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzep
    public final void zza(com.google.android.gms.fitness.result.BleDevicesResult bleDevicesResult) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, bleDevicesResult);
        zzb(1, parcelZza);
    }
}
