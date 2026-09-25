package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzav extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzk zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(com.google.android.gms.internal.measurement.zzx zzxVar, com.google.android.gms.internal.measurement.zzk zzkVar, int i) {
        super(zzxVar);
        this.zze = zzxVar;
        this.zzc = zzkVar;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zze.zzr.getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zzc.zza((android.os.Bundle) null);
    }
}
