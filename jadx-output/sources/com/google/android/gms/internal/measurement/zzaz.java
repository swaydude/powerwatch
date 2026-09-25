package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaz extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ java.lang.Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        super(zzxVar);
        this.zzg = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzg.zzr.setUserProperty(this.zzc, this.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze), this.zzf, this.zza);
    }
}
