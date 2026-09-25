package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzah extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.String str) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzd.zzr.beginAdUnitExposure(this.zzc, this.zzb);
    }
}
