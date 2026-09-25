package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
class zzhf implements com.google.android.gms.measurement.internal.zzhh {
    protected final com.google.android.gms.measurement.internal.zzgo zzx;

    zzhf(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgoVar);
        this.zzx = zzgoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public com.google.android.gms.measurement.internal.zzw zzu() {
        return this.zzx.zzu();
    }

    public com.google.android.gms.measurement.internal.zzx zzt() {
        return this.zzx.zzb();
    }

    public com.google.android.gms.measurement.internal.zzft zzs() {
        return this.zzx.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public com.google.android.gms.measurement.internal.zzfk zzr() {
        return this.zzx.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public com.google.android.gms.measurement.internal.zzgh zzq() {
        return this.zzx.zzq();
    }

    public com.google.android.gms.measurement.internal.zzla zzp() {
        return this.zzx.zzi();
    }

    public com.google.android.gms.measurement.internal.zzfi zzo() {
        return this.zzx.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public android.content.Context zzn() {
        return this.zzx.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public com.google.android.gms.common.util.Clock zzm() {
        return this.zzx.zzm();
    }

    public com.google.android.gms.measurement.internal.zzah zzl() {
        return this.zzx.zzx();
    }

    public void zzd() {
        this.zzx.zzq().zzd();
    }

    public void zzc() {
        this.zzx.zzq().zzc();
    }

    public void zzb() {
        this.zzx.zzae();
    }

    public void zza() {
        this.zzx.zzaf();
    }
}
