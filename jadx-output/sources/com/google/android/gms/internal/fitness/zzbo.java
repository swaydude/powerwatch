package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbm {
    zzbo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoalsReadCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbm
    public final void zza(com.google.android.gms.fitness.result.GoalsResult goalsResult) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, goalsResult);
        zzb(1, parcelZza);
    }
}
