package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaj extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzho zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(com.google.android.gms.internal.measurement.zzx zzxVar, com.google.android.gms.measurement.internal.zzho zzhoVar) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = zzhoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzd.zzr.setEventInterceptor(new com.google.android.gms.internal.measurement.zzx.zzc(this.zzc));
    }
}
