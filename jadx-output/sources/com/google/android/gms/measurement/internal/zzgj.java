package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgj implements java.lang.Thread.UncaughtExceptionHandler {
    private final java.lang.String zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzb;

    public zzgj(com.google.android.gms.measurement.internal.zzgh zzghVar, java.lang.String str) {
        this.zzb = zzghVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zza = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.zzb.zzr().zzf().zza(this.zza, th);
    }
}
