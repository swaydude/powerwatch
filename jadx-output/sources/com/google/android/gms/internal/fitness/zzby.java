package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzby extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbz {
    zzby(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbz
    public final void zza(com.google.android.gms.fitness.request.zzbk zzbkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbkVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbz
    public final void zza(com.google.android.gms.fitness.request.zzbo zzboVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzboVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbz
    public final void zza(com.google.android.gms.fitness.request.zzai zzaiVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzaiVar);
        zza(3, parcelZza);
    }
}
