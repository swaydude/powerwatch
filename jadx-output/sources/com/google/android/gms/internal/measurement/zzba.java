package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzba extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.Long zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ java.lang.String zze;
    private final /* synthetic */ android.os.Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzba(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.Long l, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2) {
        super(zzxVar);
        this.zzi = zzxVar;
        this.zzc = l;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z;
        this.zzh = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        java.lang.Long l = this.zzc;
        this.zzi.zzr.logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l == null ? this.zza : l.longValue());
    }
}
