package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzki implements java.lang.Runnable {
    long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzkd zzb;

    zzki(com.google.android.gms.measurement.internal.zzkd zzkdVar, long j) {
        this.zzb = zzkdVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zza(new java.lang.Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzkh
            private final com.google.android.gms.measurement.internal.zzki zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzki zzkiVar = this.zza;
                com.google.android.gms.measurement.internal.zzkd zzkdVar = zzkiVar.zzb;
                long j = zzkiVar.zza;
                zzkdVar.zza.zzd();
                zzkdVar.zza.zzr().zzw().zza("Application going to the background");
                zzkdVar.zza.zzf().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, new android.os.Bundle());
            }
        });
    }
}
