package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgg implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgo zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ android.os.Bundle zzc;
    private final /* synthetic */ android.content.Context zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfk zze;
    private final /* synthetic */ android.content.BroadcastReceiver.PendingResult zzf;

    zzgg(com.google.android.gms.measurement.internal.zzge zzgeVar, com.google.android.gms.measurement.internal.zzgo zzgoVar, long j, android.os.Bundle bundle, android.content.Context context, com.google.android.gms.measurement.internal.zzfk zzfkVar, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.zza = zzgoVar;
        this.zzb = j;
        this.zzc = bundle;
        this.zzd = context;
        this.zze = zzfkVar;
        this.zzf = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZza = this.zza.zzc().zzh.zza();
        long j = this.zzb;
        if (jZza > 0 && (j >= jZza || j <= 0)) {
            j = jZza - 1;
        }
        if (j > 0) {
            this.zzc.putLong("click_timestamp", j);
        }
        this.zzc.putString("_cis", "referrer broadcast");
        com.google.android.gms.measurement.internal.zzgo.zza(this.zzd, (com.google.android.gms.internal.measurement.zzv) null).zzh().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", this.zzc);
        this.zze.zzx().zza("Install campaign recorded");
        android.content.BroadcastReceiver.PendingResult pendingResult = this.zzf;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
