package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzae extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ android.app.Activity zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ java.lang.String zze;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(com.google.android.gms.internal.measurement.zzx zzxVar, android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        super(zzxVar);
        this.zzf = zzxVar;
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        this.zzf.zzr.setCurrentScreen(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd, this.zze, this.zza);
    }
}
