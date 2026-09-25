package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zziw extends com.google.android.gms.measurement.internal.zze {
    protected com.google.android.gms.measurement.internal.zzit zza;
    private volatile com.google.android.gms.measurement.internal.zzit zzb;
    private com.google.android.gms.measurement.internal.zzit zzc;
    private final java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.zzit> zzd;
    private com.google.android.gms.measurement.internal.zzit zze;
    private java.lang.String zzf;

    public zziw(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzit zzab() {
        zzw();
        zzd();
        return this.zza;
    }

    public final void zza(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        if (this.zzb == null) {
            zzr().zzk().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            zzr().zzk().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zza(activity.getClass().getCanonicalName());
        }
        boolean zEquals = this.zzb.zzb.equals(str2);
        boolean zZzc = com.google.android.gms.measurement.internal.zzla.zzc(this.zzb.zza, str);
        if (zEquals && zZzc) {
            zzr().zzk().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            zzr().zzk().zza("Invalid screen name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            zzr().zzk().zza("Invalid class name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str2.length()));
            return;
        }
        zzr().zzx().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
        com.google.android.gms.measurement.internal.zzit zzitVar = new com.google.android.gms.measurement.internal.zzit(str, str2, zzp().zzg());
        this.zzd.put(activity, zzitVar);
        zza(activity, zzitVar, true);
    }

    public final com.google.android.gms.measurement.internal.zzit zzac() {
        zzb();
        return this.zzb;
    }

    private final void zza(android.app.Activity activity, com.google.android.gms.measurement.internal.zzit zzitVar, boolean z) {
        com.google.android.gms.measurement.internal.zzit zzitVar2 = this.zzb == null ? this.zzc : this.zzb;
        com.google.android.gms.measurement.internal.zzit zzitVar3 = zzitVar.zzb == null ? new com.google.android.gms.measurement.internal.zzit(zzitVar.zza, zza(activity.getClass().getCanonicalName()), zzitVar.zzc) : zzitVar;
        this.zzc = this.zzb;
        this.zzb = zzitVar3;
        zzq().zza(new com.google.android.gms.measurement.internal.zziv(this, z, zzm().elapsedRealtime(), zzitVar2, zzitVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.measurement.internal.zzit zzitVar, boolean z, long j) {
        zze().zza(zzm().elapsedRealtime());
        if (zzk().zza(zzitVar.zzd, z, j)) {
            zzitVar.zzd = false;
        }
    }

    public static void zza(com.google.android.gms.measurement.internal.zzit zzitVar, android.os.Bundle bundle, boolean z) {
        if (bundle != null && zzitVar != null && (!bundle.containsKey("_sc") || z)) {
            if (zzitVar.zza != null) {
                bundle.putString("_sn", zzitVar.zza);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzitVar.zzb);
            bundle.putLong("_si", zzitVar.zzc);
            return;
        }
        if (bundle != null && zzitVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(java.lang.String str, com.google.android.gms.measurement.internal.zzit zzitVar) {
        zzd();
        synchronized (this) {
            java.lang.String str2 = this.zzf;
            if (str2 == null || str2.equals(str) || zzitVar != null) {
                this.zzf = str;
                this.zze = zzitVar;
            }
        }
    }

    private static java.lang.String zza(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        java.lang.String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final com.google.android.gms.measurement.internal.zzit zzd(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity);
        com.google.android.gms.measurement.internal.zzit zzitVar = this.zzd.get(activity);
        if (zzitVar != null) {
            return zzitVar;
        }
        com.google.android.gms.measurement.internal.zzit zzitVar2 = new com.google.android.gms.measurement.internal.zzit(null, zza(activity.getClass().getCanonicalName()), zzp().zzg());
        this.zzd.put(activity, zzitVar2);
        return zzitVar2;
    }

    public final void zza(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new com.google.android.gms.measurement.internal.zzit(bundle2.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zza(android.app.Activity activity) {
        zza(activity, zzd(activity), false);
        com.google.android.gms.measurement.internal.zzb zzbVarZze = zze();
        zzbVarZze.zzq().zza(new com.google.android.gms.measurement.internal.zzc(zzbVarZze, zzbVarZze.zzm().elapsedRealtime()));
    }

    public final void zzb(android.app.Activity activity) {
        com.google.android.gms.measurement.internal.zzit zzitVarZzd = zzd(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        zzq().zza(new com.google.android.gms.measurement.internal.zziy(this, zzitVarZzd, zzm().elapsedRealtime()));
    }

    public final void zzb(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzit zzitVar;
        if (bundle == null || (zzitVar = this.zzd.get(activity)) == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong("id", zzitVar.zzc);
        bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzitVar.zza);
        bundle2.putString("referrer_name", zzitVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzc(android.app.Activity activity) {
        this.zzd.remove(activity);
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
