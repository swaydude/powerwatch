package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkm {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzkc zza;

    zzkm(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    final void zza() {
        if (com.google.android.gms.internal.measurement.zzle.zzb() && this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzay)) {
            this.zza.zzd();
            if (this.zza.zzs().zza(this.zza.zzm().currentTimeMillis())) {
                this.zza.zzs().zzm.zza(true);
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                    android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        this.zza.zzr().zzx().zza("Detected application was in foreground");
                        zzb(this.zza.zzm().currentTimeMillis(), false);
                    }
                }
            }
        }
    }

    final void zza(long j, boolean z) {
        this.zza.zzd();
        this.zza.zzac();
        if (this.zza.zzs().zza(j)) {
            this.zza.zzs().zzm.zza(true);
            this.zza.zzs().zzr.zza(0L);
        }
        if (z && this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzat)) {
            this.zza.zzs().zzq.zza(j);
        }
        if (this.zza.zzs().zzm.zza()) {
            zzb(j, z);
        }
    }

    private final void zzb(long j, boolean z) {
        this.zza.zzd();
        if (com.google.android.gms.internal.measurement.zzle.zzb() && this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzay)) {
            if (!this.zza.zzx.zzab()) {
                return;
            } else {
                this.zza.zzs().zzq.zza(j);
            }
        }
        this.zza.zzr().zzx().zza("Session started, time", java.lang.Long.valueOf(this.zza.zzm().elapsedRealtime()));
        java.lang.Long lValueOf = this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzar) ? java.lang.Long.valueOf(j / 1000) : null;
        this.zza.zzf().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", lValueOf, j);
        this.zza.zzs().zzm.zza(false);
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzar)) {
            bundle.putLong("_sid", lValueOf.longValue());
        }
        if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcj) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.zza.zzf().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
        if (com.google.android.gms.internal.measurement.zzka.zzb() && this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcq)) {
            java.lang.String strZza = this.zza.zzs().zzw.zza();
            if (!android.text.TextUtils.isEmpty(strZza)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("_ffr", strZza);
                this.zza.zzf().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
            }
        }
        if (com.google.android.gms.internal.measurement.zzle.zzb() && this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzay)) {
            return;
        }
        this.zza.zzs().zzq.zza(j);
    }
}
