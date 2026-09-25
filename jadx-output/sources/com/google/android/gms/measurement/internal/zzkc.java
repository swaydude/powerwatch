package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkc extends com.google.android.gms.measurement.internal.zze {
    protected com.google.android.gms.measurement.internal.zzkm zza;
    protected com.google.android.gms.measurement.internal.zzkk zzb;
    private android.os.Handler zzc;
    private com.google.android.gms.measurement.internal.zzkd zzd;

    zzkc(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zza = new com.google.android.gms.measurement.internal.zzkm(this);
        this.zzb = new com.google.android.gms.measurement.internal.zzkk(this);
        this.zzd = new com.google.android.gms.measurement.internal.zzkd(this);
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    protected final void zzab() {
        zzq().zza(new com.google.android.gms.measurement.internal.zzkb(this, zzm().elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac() {
        zzd();
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.measurement.zzj(android.os.Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        zzd();
        zzac();
        zzr().zzx().zza("Activity resumed, time", java.lang.Long.valueOf(j));
        this.zzd.zza();
        this.zzb.zza(j);
        com.google.android.gms.measurement.internal.zzkm zzkmVar = this.zza;
        zzkmVar.zza.zzd();
        if (zzkmVar.zza.zzx.zzab()) {
            if (zzkmVar.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzau)) {
                zzkmVar.zza.zzs().zzt.zza(false);
            }
            zzkmVar.zza(zzkmVar.zza.zzm().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j) {
        zzd();
        zzac();
        zzr().zzx().zza("Activity paused, time", java.lang.Long.valueOf(j));
        this.zzd.zzb();
        this.zzb.zzb(j);
        com.google.android.gms.measurement.internal.zzkm zzkmVar = this.zza;
        if (zzkmVar.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzau)) {
            zzkmVar.zza.zzs().zzt.zza(true);
        }
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        return this.zzb.zza(z, z2, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfd zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzix zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zziw zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfg zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkc zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }
}
