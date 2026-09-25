package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzac extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzk zze;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzk zzkVar) {
        super(zzxVar);
        this.zzf = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzf.zzr.getConditionalUserProperties(this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zze.zza((android.os.Bundle) null);
    }
}
