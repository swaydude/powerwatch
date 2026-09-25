package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhu implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ android.os.Bundle zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ java.lang.String zzh;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzi;

    zzhu(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        this.zzi = zzhpVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
