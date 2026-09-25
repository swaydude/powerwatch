package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zziz implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzkz zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzd;

    zziz(com.google.android.gms.measurement.internal.zzix zzixVar, boolean z, com.google.android.gms.measurement.internal.zzkz zzkzVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzd = zzixVar;
        this.zza = z;
        this.zzb = zzkzVar;
        this.zzc = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzd.zzb;
        if (zzfcVar == null) {
            this.zzd.zzr().zzf().zza("Discarding data. Failed to set user property");
        } else {
            this.zzd.zza(zzfcVar, this.zza ? null : this.zzb, this.zzc);
            this.zzd.zzaj();
        }
    }
}
