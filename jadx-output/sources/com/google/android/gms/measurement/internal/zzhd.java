package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhd implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zze;

    zzhd(com.google.android.gms.measurement.internal.zzgp zzgpVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.zze = zzgpVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.zza;
        if (str == null) {
            this.zze.zza.zzs().zzv().zza(this.zzb, (com.google.android.gms.measurement.internal.zzit) null);
        } else {
            this.zze.zza.zzs().zzv().zza(this.zzb, new com.google.android.gms.measurement.internal.zzit(this.zzc, str, this.zzd));
        }
    }
}
