package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzag extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(com.google.android.gms.internal.measurement.zzx zzxVar) {
        super(zzxVar);
        this.zzc = zzxVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzc.zzr.resetAnalyticsData(this.zza);
    }
}
