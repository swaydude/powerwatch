package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhc implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzkz zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzc;

    zzhc(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzkz zzkzVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzc = zzgpVar;
        this.zza = zzkzVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzo();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzb(this.zza, this.zzb);
        } else {
            this.zzc.zza.zza(this.zza, this.zzb);
        }
    }
}
