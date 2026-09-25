package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkv implements java.util.concurrent.Callable<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzks zzb;

    zzkv(com.google.android.gms.measurement.internal.zzks zzksVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzb = zzksVar;
        this.zza = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.String call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzg zzgVarZzc = this.zzb.zzc(this.zza);
        if (zzgVarZzc == null) {
            this.zzb.zzr().zzi().zza("App info was null when attempting to get app instance id");
            return null;
        }
        return zzgVarZzc.zzd();
    }
}
