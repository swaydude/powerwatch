package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzci extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcg {
    zzci(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ISessionReadCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzcg
    public final void zza(com.google.android.gms.fitness.result.SessionReadResult sessionReadResult) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, sessionReadResult);
        zzb(1, parcelZza);
    }
}
