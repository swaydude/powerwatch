package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbu extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbv {
    zzbu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbv
    public final void zza(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, goalsReadRequest);
        zza(1, parcelZza);
    }
}
