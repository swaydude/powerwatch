package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkk {
    private long zza;
    private long zzb;
    private final com.google.android.gms.measurement.internal.zzaf zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzkc zzd;

    public zzkk(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zzd = zzkcVar;
        this.zzc = new com.google.android.gms.measurement.internal.zzkj(this, zzkcVar.zzx);
        long jElapsedRealtime = zzkcVar.zzm().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    final void zza(long j) {
        this.zzd.zzd();
        this.zzc.zzc();
        this.zza = j;
        this.zzb = j;
    }

    final void zzb(long j) {
        this.zzc.zzc();
        if (this.zza != 0) {
            this.zzd.zzs().zzr.zza(this.zzd.zzs().zzr.zza() + (j - this.zza));
        }
    }

    final void zza() {
        this.zzc.zzc();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        this.zzd.zzd();
        zza(false, false, this.zzd.zzm().elapsedRealtime());
        this.zzd.zze().zza(this.zzd.zzm().elapsedRealtime());
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzd.zzd();
        this.zzd.zzw();
        if (!com.google.android.gms.internal.measurement.zzkm.zzb() || !this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcw)) {
            j = this.zzd.zzm().elapsedRealtime();
        }
        if (!com.google.android.gms.internal.measurement.zzle.zzb() || !this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcr) || this.zzd.zzx.zzab()) {
            this.zzd.zzs().zzq.zza(this.zzd.zzm().currentTimeMillis());
        }
        long jZzb = j - this.zza;
        if (!z && jZzb < 1000) {
            this.zzd.zzr().zzx().zza("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(jZzb));
            return false;
        }
        if (this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzba) && !z2) {
            jZzb = zzb();
        }
        this.zzd.zzs().zzr.zza(jZzb);
        this.zzd.zzr().zzx().zza("Recording user engagement, ms", java.lang.Long.valueOf(jZzb));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", jZzb);
        com.google.android.gms.measurement.internal.zziw.zza(this.zzd.zzi().zzab(), bundle, true);
        if (this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzba) && !this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbb) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbb) || !z2) {
            this.zzd.zzf().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zza = j;
        this.zzc.zzc();
        this.zzc.zza(java.lang.Math.max(0L, 3600000 - this.zzd.zzs().zzr.zza()));
        return true;
    }

    final long zzb() {
        long jElapsedRealtime = this.zzd.zzm().elapsedRealtime();
        long j = jElapsedRealtime - this.zzb;
        this.zzb = jElapsedRealtime;
        return j;
    }
}
