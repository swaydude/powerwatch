package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbd extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ android.app.Activity zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx.zzd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbd(com.google.android.gms.internal.measurement.zzx.zzd zzdVar, android.app.Activity activity) {
        super(com.google.android.gms.internal.measurement.zzx.this);
        this.zzd = zzdVar;
        this.zzc = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        com.google.android.gms.internal.measurement.zzx.this.zzr.onActivityResumed(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}
