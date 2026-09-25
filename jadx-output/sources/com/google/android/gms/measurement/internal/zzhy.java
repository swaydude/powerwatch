package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhy implements java.lang.Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzhy(com.google.android.gms.measurement.internal.zzhp zzhpVar, long j) {
        this.zzb = zzhpVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzhp zzhpVar = this.zzb;
        long j = this.zza;
        zzhpVar.zzd();
        zzhpVar.zzb();
        zzhpVar.zzw();
        zzhpVar.zzr().zzw().zza("Resetting analytics data (FE)");
        com.google.android.gms.measurement.internal.zzkc zzkcVarZzk = zzhpVar.zzk();
        zzkcVarZzk.zzd();
        zzkcVarZzk.zzb.zza();
        boolean zZzab = zzhpVar.zzx.zzab();
        com.google.android.gms.measurement.internal.zzft zzftVarZzs = zzhpVar.zzs();
        zzftVarZzs.zzh.zza(j);
        if (!android.text.TextUtils.isEmpty(zzftVarZzs.zzs().zzw.zza())) {
            zzftVarZzs.zzw.zza(null);
        }
        if (com.google.android.gms.internal.measurement.zzle.zzb() && zzftVarZzs.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcr)) {
            zzftVarZzs.zzq.zza(0L);
        }
        if (!zzftVarZzs.zzt().zzg()) {
            zzftVarZzs.zzc(!zZzab);
        }
        zzhpVar.zzh().zzad();
        if (com.google.android.gms.internal.measurement.zzle.zzb() && zzhpVar.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcr)) {
            zzhpVar.zzk().zza.zza();
        }
        zzhpVar.zzb = !zZzab;
        this.zzb.zzh().zza(new java.util.concurrent.atomic.AtomicReference<>());
    }
}
