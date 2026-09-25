package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzca extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcb {
    zzca(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzcb
    public final void zza(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataSourcesRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcb
    public final void zza(com.google.android.gms.fitness.request.zzao zzaoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzaoVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzcb
    public final void zza(com.google.android.gms.fitness.request.zzas zzasVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, zzasVar);
        zza(3, parcelZza);
    }
}
