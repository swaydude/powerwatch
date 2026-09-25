package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.measurement.internal.zzf {
    private final java.util.Map<java.lang.String, java.lang.Long> zza;
    private final java.util.Map<java.lang.String, java.lang.Integer> zzb;
    private long zzc;

    public zzb(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzb = new androidx.collection.ArrayMap();
        this.zza = new androidx.collection.ArrayMap();
    }

    public final void zza(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            zzr().zzf().zza("Ad unit id must be a non-empty string");
        } else {
            zzq().zza(new com.google.android.gms.measurement.internal.zza(this, str, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(java.lang.String str, long j) {
        zzb();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (this.zzb.isEmpty()) {
            this.zzc = j;
        }
        java.lang.Integer num = this.zzb.get(str);
        if (num != null) {
            this.zzb.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (this.zzb.size() >= 100) {
            zzr().zzi().zza("Too many ads visible");
        } else {
            this.zzb.put(str, 1);
            this.zza.put(str, java.lang.Long.valueOf(j));
        }
    }

    public final void zzb(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            zzr().zzf().zza("Ad unit id must be a non-empty string");
        } else {
            zzq().zza(new com.google.android.gms.measurement.internal.zzd(this, str, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(java.lang.String str, long j) {
        zzb();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.lang.Integer num = this.zzb.get(str);
        if (num != null) {
            com.google.android.gms.measurement.internal.zzit zzitVarZzab = zzi().zzab();
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.zzb.remove(str);
                java.lang.Long l = this.zza.get(str);
                if (l == null) {
                    zzr().zzf().zza("First ad unit exposure time was never set");
                } else {
                    long jLongValue = j - l.longValue();
                    this.zza.remove(str);
                    zza(str, jLongValue, zzitVarZzab);
                }
                if (this.zzb.isEmpty()) {
                    long j2 = this.zzc;
                    if (j2 == 0) {
                        zzr().zzf().zza("First ad exposure time was never set");
                        return;
                    } else {
                        zza(j - j2, zzitVarZzab);
                        this.zzc = 0L;
                        return;
                    }
                }
                return;
            }
            this.zzb.put(str, java.lang.Integer.valueOf(iIntValue));
            return;
        }
        zzr().zzf().zza("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zza(long j, com.google.android.gms.measurement.internal.zzit zzitVar) {
        if (zzitVar == null) {
            zzr().zzx().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzr().zzx().zza("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zziw.zza(zzitVar, bundle, true);
        zzf().zza("am", "_xa", bundle);
    }

    private final void zza(java.lang.String str, long j, com.google.android.gms.measurement.internal.zzit zzitVar) {
        if (zzitVar == null) {
            zzr().zzx().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzr().zzx().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zziw.zza(zzitVar, bundle, true);
        zzf().zza("am", "_xu", bundle);
    }

    public final void zza(long j) {
        com.google.android.gms.measurement.internal.zzit zzitVarZzab = zzi().zzab();
        for (java.lang.String str : this.zza.keySet()) {
            zza(str, j - this.zza.get(str).longValue(), zzitVarZzab);
        }
        if (!this.zza.isEmpty()) {
            zza(j - this.zzc, zzitVarZzab);
        }
        zzb(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j) {
        java.util.Iterator<java.lang.String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put(it.next(), java.lang.Long.valueOf(j));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j;
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
