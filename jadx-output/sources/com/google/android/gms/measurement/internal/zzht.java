package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzht implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.Object zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zze;

    zzht(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j) {
        this.zze = zzhpVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
