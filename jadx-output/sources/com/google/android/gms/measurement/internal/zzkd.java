package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkd {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzkc zza;
    private com.google.android.gms.measurement.internal.zzki zzb;
    private final java.lang.Runnable zzc = new java.lang.Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzkg
        private final com.google.android.gms.measurement.internal.zzkd zza;

        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.gms.measurement.internal.zzkd zzkdVar = this.zza;
            zzkdVar.zza.zzq().zza(new java.lang.Runnable(zzkdVar) { // from class: com.google.android.gms.measurement.internal.zzkf
                private final com.google.android.gms.measurement.internal.zzkd zza;

                {
                    this.zza = zzkdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzkd zzkdVar2 = this.zza;
                    zzkdVar2.zza.zzd();
                    zzkdVar2.zza.zzr().zzw().zza("Application backgrounded");
                    zzkdVar2.zza.zzf().zzb(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", new android.os.Bundle());
                }
            });
        }
    };

    zzkd(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    final void zza() {
        this.zza.zzd();
        if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzci)) {
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zza.zzt().zze(this.zza.zzg().zzab(), com.google.android.gms.measurement.internal.zzap.zzcv)) {
                if (this.zzb != null) {
                    this.zza.zzc.removeCallbacks(this.zzb);
                    return;
                }
                return;
            }
            this.zza.zzc.removeCallbacks(this.zzc);
        }
    }

    final void zzb() {
        if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzci)) {
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zza.zzt().zze(this.zza.zzg().zzab(), com.google.android.gms.measurement.internal.zzap.zzcv)) {
                this.zzb = new com.google.android.gms.measurement.internal.zzki(this, this.zza.zzm().currentTimeMillis());
                this.zza.zzc.postDelayed(this.zzb, 2000L);
            } else {
                this.zza.zzc.postDelayed(this.zzc, 2000L);
            }
        }
    }
}
