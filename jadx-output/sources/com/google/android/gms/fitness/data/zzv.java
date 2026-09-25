package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.fitness.data.zzu {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.data.IDataSourceListener");
    }

    @Override // com.google.android.gms.fitness.data.zzu
    public final void zzc(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataPoint);
        zzb(1, parcelZza);
    }
}
