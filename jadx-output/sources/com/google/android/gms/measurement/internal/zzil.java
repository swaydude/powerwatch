package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzil implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ android.net.Uri zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzim zze;

    zzil(com.google.android.gms.measurement.internal.zzim zzimVar, boolean z, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.zze = zzimVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
