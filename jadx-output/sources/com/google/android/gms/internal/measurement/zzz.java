package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzz extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ android.os.Bundle zze;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzz(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        super(zzxVar);
        this.zzf = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzf.zzr.clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
