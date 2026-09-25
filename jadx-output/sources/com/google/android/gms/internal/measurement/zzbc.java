package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbc extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ android.app.Activity zzc;
    private final /* synthetic */ android.os.Bundle zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbc(com.google.android.gms.internal.measurement.zzx.zzd zzdVar, android.app.Activity activity, android.os.Bundle bundle) {
        super(com.google.android.gms.internal.measurement.zzx.this);
        this.zze = zzdVar;
        this.zzc = activity;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        com.google.android.gms.internal.measurement.zzx.this.zzr.onActivityCreated(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}
