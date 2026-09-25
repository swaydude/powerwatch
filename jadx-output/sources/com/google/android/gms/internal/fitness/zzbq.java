package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbq extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbr {
    zzbq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbr
    public final void zza(com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, startBleScanRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbr
    public final void zza(com.google.android.gms.fitness.request.zzbi zzbiVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbiVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbr
    public final void zza(com.google.android.gms.fitness.request.zzf zzfVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzfVar);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbr
    public final void zza(com.google.android.gms.fitness.request.zzbm zzbmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzbmVar);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbr
    public final void zza(com.google.android.gms.fitness.request.zzag zzagVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzagVar);
        zza(5, parcelZza);
    }
}
