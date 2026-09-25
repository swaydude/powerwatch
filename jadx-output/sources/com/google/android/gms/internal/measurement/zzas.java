package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzas extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ java.lang.Object zze;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzh;
    private final /* synthetic */ int zzc = 5;
    private final /* synthetic */ java.lang.Object zzf = null;
    private final /* synthetic */ java.lang.Object zzg = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(com.google.android.gms.internal.measurement.zzx zzxVar, boolean z, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        super(false);
        this.zzh = zzxVar;
        this.zzd = str;
        this.zze = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzh.zzr.logHealthData(this.zzc, this.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzf), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzg));
    }
}
