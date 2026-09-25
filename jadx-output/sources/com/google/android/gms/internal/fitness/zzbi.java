package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbi extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbg {
    zzbi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbg
    public final void zza(com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, dataSourcesResult);
        zzb(1, parcelZza);
    }
}
