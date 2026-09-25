package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbx {
    zzbw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataReadRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.zzl zzlVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzlVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataDeleteRequest);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzhVar);
        zza(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataUpdateRequest);
        zza(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataUpdateListenerRegistrationRequest);
        zza(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbx
    public final void zza(com.google.android.gms.fitness.request.zzx zzxVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzxVar);
        zza(11, parcelZza);
    }
}
