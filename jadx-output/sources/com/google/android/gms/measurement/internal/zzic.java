package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzic implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zze;

    zzic(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zze = zzhpVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzx.zzw().zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
