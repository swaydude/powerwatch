package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zziv implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzit zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzit zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zziw zze;

    zziv(com.google.android.gms.measurement.internal.zziw zziwVar, boolean z, long j, com.google.android.gms.measurement.internal.zzit zzitVar, com.google.android.gms.measurement.internal.zzit zzitVar2) {
        this.zze = zziwVar;
        this.zza = z;
        this.zzb = j;
        this.zzc = zzitVar;
        this.zzd = zzitVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.zze.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzba)) {
            z = this.zza && this.zze.zza != null;
            if (z) {
                com.google.android.gms.measurement.internal.zziw zziwVar = this.zze;
                zziwVar.zza(zziwVar.zza, true, this.zzb);
            }
        } else {
            if (this.zza && this.zze.zza != null) {
                com.google.android.gms.measurement.internal.zziw zziwVar2 = this.zze;
                zziwVar2.zza(zziwVar2.zza, true, this.zzb);
            }
            z = false;
        }
        com.google.android.gms.measurement.internal.zzit zzitVar = this.zzc;
        if ((zzitVar != null && zzitVar.zzc == this.zzd.zzc && com.google.android.gms.measurement.internal.zzla.zzc(this.zzc.zzb, this.zzd.zzb) && com.google.android.gms.measurement.internal.zzla.zzc(this.zzc.zza, this.zzd.zza)) ? false : true) {
            android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.measurement.internal.zziw.zza(this.zzd, bundle, true);
            com.google.android.gms.measurement.internal.zzit zzitVar2 = this.zzc;
            if (zzitVar2 != null) {
                if (zzitVar2.zza != null) {
                    bundle.putString("_pn", this.zzc.zza);
                }
                bundle.putString("_pc", this.zzc.zzb);
                bundle.putLong("_pi", this.zzc.zzc);
            }
            if (this.zze.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzba) && z) {
                long jZzb = this.zze.zzk().zzb.zzb();
                if (jZzb > 0) {
                    this.zze.zzp().zza(bundle, jZzb);
                }
            }
            this.zze.zzf().zzb(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_vs", bundle);
        }
        this.zze.zza = this.zzd;
        this.zze.zzh().zza(this.zzd);
    }
}
