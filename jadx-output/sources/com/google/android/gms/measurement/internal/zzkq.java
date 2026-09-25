package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
class zzkq extends com.google.android.gms.measurement.internal.zzhf implements com.google.android.gms.measurement.internal.zzhh {
    protected final com.google.android.gms.measurement.internal.zzks zza;

    zzkq(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar.zzs());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzksVar);
        this.zza = zzksVar;
    }

    public com.google.android.gms.measurement.internal.zzgi zzj() {
        return this.zza.zzc();
    }

    public com.google.android.gms.measurement.internal.zzac zzi() {
        return this.zza.zze();
    }

    public com.google.android.gms.measurement.internal.zzn e_() {
        return this.zza.zzf();
    }

    public com.google.android.gms.measurement.internal.zzkw zzg() {
        return this.zza.zzh();
    }
}
