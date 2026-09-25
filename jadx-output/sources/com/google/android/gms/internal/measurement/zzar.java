package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzar extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ android.os.Bundle zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzk zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(com.google.android.gms.internal.measurement.zzx zzxVar, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzk zzkVar) {
        super(zzxVar);
        this.zze = zzxVar;
        this.zzc = bundle;
        this.zzd = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zze.zzr.performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zzd.zza((android.os.Bundle) null);
    }
}
