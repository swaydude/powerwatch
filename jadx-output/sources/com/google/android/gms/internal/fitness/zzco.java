package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzco extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcm {
    zzco(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzcm
    public final void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.fitness.zzd.zza(parcelZza, status);
        zzb(1, parcelZza);
    }
}
