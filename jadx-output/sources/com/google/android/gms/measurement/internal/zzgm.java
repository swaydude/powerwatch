package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgm<V> extends java.util.concurrent.FutureTask<V> implements java.lang.Comparable<com.google.android.gms.measurement.internal.zzgm<V>> {
    final boolean zza;
    private final long zzb;
    private final java.lang.String zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgm(com.google.android.gms.measurement.internal.zzgh zzghVar, java.util.concurrent.Callable<V> callable, boolean z, java.lang.String str) {
        super(callable);
        this.zzd = zzghVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        long andIncrement = com.google.android.gms.measurement.internal.zzgh.zzj.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z;
        if (andIncrement == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            zzghVar.zzr().zzf().zza("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgm(com.google.android.gms.measurement.internal.zzgh zzghVar, java.lang.Runnable runnable, boolean z, java.lang.String str) {
        super(runnable, null);
        this.zzd = zzghVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        long andIncrement = com.google.android.gms.measurement.internal.zzgh.zzj.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = false;
        if (andIncrement == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            zzghVar.zzr().zzf().zza("Tasks index overflow");
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable th) {
        this.zzd.zzr().zzf().zza(this.zzc, th);
        if (th instanceof com.google.android.gms.measurement.internal.zzgk) {
            java.lang.Thread.getDefaultUncaughtExceptionHandler().uncaughtException(java.lang.Thread.currentThread(), th);
        }
        super.setException(th);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.zzgm zzgmVar = (com.google.android.gms.measurement.internal.zzgm) obj;
        boolean z = this.zza;
        if (z != zzgmVar.zza) {
            return z ? -1 : 1;
        }
        long j = this.zzb;
        long j2 = zzgmVar.zzb;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzd.zzr().zzg().zza("Two tasks share the same index. index", java.lang.Long.valueOf(this.zzb));
        return 0;
    }
}
