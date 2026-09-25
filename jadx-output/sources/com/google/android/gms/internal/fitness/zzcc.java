package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcd {
    zzcc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.zzba zzbaVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbaVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.zzbc zzbcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbcVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, sessionInsertRequest);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, sessionReadRequest);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.zzay zzayVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzayVar);
        zza(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcd
    public final void zza(com.google.android.gms.fitness.request.zzbe zzbeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbeVar);
        zza(6, parcelZza);
    }
}
