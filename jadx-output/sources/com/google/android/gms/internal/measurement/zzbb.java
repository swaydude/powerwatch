package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbb extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ android.os.Bundle zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbb(com.google.android.gms.internal.measurement.zzx zzxVar, android.os.Bundle bundle) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzd.zzr.setConditionalUserProperty(this.zzc, this.zza);
    }
}
