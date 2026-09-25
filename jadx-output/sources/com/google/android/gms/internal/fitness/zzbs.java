package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbs extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbt {
    zzbs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbt
    public final void zza(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataTypeCreateRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbt
    public final void zza(com.google.android.gms.fitness.request.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zztVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbt
    public final void zza(com.google.android.gms.fitness.request.zzab zzabVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzabVar);
        zza(22, parcelZza);
    }
}
