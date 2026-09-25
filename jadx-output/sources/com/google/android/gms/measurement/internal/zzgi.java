package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgi extends com.google.android.gms.measurement.internal.zzkp implements com.google.android.gms.measurement.internal.zzz {
    private static int zzb = 65535;
    private static int zzc = 2;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> zzd;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zze;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zzf;
    private final java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzbo.zzb> zzg;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> zzh;
    private final java.util.Map<java.lang.String, java.lang.String> zzi;

    zzgi(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
        this.zzd = new androidx.collection.ArrayMap();
        this.zze = new androidx.collection.ArrayMap();
        this.zzf = new androidx.collection.ArrayMap();
        this.zzg = new androidx.collection.ArrayMap();
        this.zzi = new androidx.collection.ArrayMap();
        this.zzh = new androidx.collection.ArrayMap();
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    private final void zzi(java.lang.String str) throws java.lang.Throwable {
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (this.zzg.get(str) == null) {
            byte[] bArrZzd = zzi().zzd(str);
            if (bArrZzd == null) {
                this.zzd.put(str, null);
                this.zze.put(str, null);
                this.zzf.put(str, null);
                this.zzg.put(str, null);
                this.zzi.put(str, null);
                this.zzh.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.zzbo.zzb.zza zzaVarZzbm = zza(str, bArrZzd).zzbm();
            zza(str, zzaVarZzbm);
            this.zzd.put(str, zza((com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu())));
            this.zzg.put(str, (com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu()));
            this.zzi.put(str, null);
        }
    }

    protected final com.google.android.gms.internal.measurement.zzbo.zzb zza(java.lang.String str) {
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzi(str);
        return this.zzg.get(str);
    }

    protected final java.lang.String zzb(java.lang.String str) {
        zzd();
        return this.zzi.get(str);
    }

    protected final void zzc(java.lang.String str) {
        zzd();
        this.zzi.put(str, null);
    }

    final void zzd(java.lang.String str) {
        zzd();
        this.zzg.remove(str);
    }

    final boolean zze(java.lang.String str) {
        zzd();
        com.google.android.gms.internal.measurement.zzbo.zzb zzbVarZza = zza(str);
        if (zzbVarZza == null) {
            return false;
        }
        return zzbVarZza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    public final java.lang.String zza(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        zzd();
        zzi(str);
        java.util.Map<java.lang.String, java.lang.String> map = this.zzd.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(com.google.android.gms.internal.measurement.zzbo.zzb zzbVar) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        if (zzbVar != null) {
            for (com.google.android.gms.internal.measurement.zzbo.zzc zzcVar : zzbVar.zze()) {
                arrayMap.put(zzcVar.zza(), zzcVar.zzb());
            }
        }
        return arrayMap;
    }

    private final void zza(java.lang.String str, com.google.android.gms.internal.measurement.zzbo.zzb.zza zzaVar) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
        if (zzaVar != null) {
            for (int i = 0; i < zzaVar.zza(); i++) {
                com.google.android.gms.internal.measurement.zzbo.zza.C0027zza c0027zzaZzbm = zzaVar.zza(i).zzbm();
                if (android.text.TextUtils.isEmpty(c0027zzaZzbm.zza())) {
                    zzr().zzi().zza("EventConfig contained null event name");
                } else {
                    java.lang.String strZzb = com.google.android.gms.measurement.internal.zzhj.zzb(c0027zzaZzbm.zza());
                    if (!android.text.TextUtils.isEmpty(strZzb)) {
                        c0027zzaZzbm = c0027zzaZzbm.zza(strZzb);
                        zzaVar.zza(i, c0027zzaZzbm);
                    }
                    arrayMap.put(c0027zzaZzbm.zza(), java.lang.Boolean.valueOf(c0027zzaZzbm.zzb()));
                    arrayMap2.put(c0027zzaZzbm.zza(), java.lang.Boolean.valueOf(c0027zzaZzbm.zzc()));
                    if (c0027zzaZzbm.zzd()) {
                        if (c0027zzaZzbm.zze() < zzc || c0027zzaZzbm.zze() > zzb) {
                            zzr().zzi().zza("Invalid sampling rate. Event name, sample rate", c0027zzaZzbm.zza(), java.lang.Integer.valueOf(c0027zzaZzbm.zze()));
                        } else {
                            arrayMap3.put(c0027zzaZzbm.zza(), java.lang.Integer.valueOf(c0027zzaZzbm.zze()));
                        }
                    }
                }
            }
        }
        this.zze.put(str, arrayMap);
        this.zzf.put(str, arrayMap2);
        this.zzh.put(str, arrayMap3);
    }

    protected final boolean zza(java.lang.String str, byte[] bArr, java.lang.String str2) {
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzbo.zzb.zza zzaVarZzbm = zza(str, bArr).zzbm();
        if (zzaVarZzbm == null) {
            return false;
        }
        zza(str, zzaVarZzbm);
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu()));
        this.zzi.put(str, str2);
        this.zzd.put(str, zza((com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu())));
        zzi().zzb(str, new java.util.ArrayList(zzaVarZzbm.zzb()));
        try {
            zzaVarZzbm.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu())).zzbi();
        } catch (java.lang.RuntimeException e) {
            zzr().zzi().zza("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
        }
        com.google.android.gms.measurement.internal.zzac zzacVarZzi = zzi();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzacVarZzi.zzd();
        zzacVarZzi.zzak();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (zzacVarZzi.c_().update("apps", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                zzacVarZzi.zzr().zzf().zza("Failed to update remote config (got 0). appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzacVarZzi.zzr().zzf().zza("Error storing remote config. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e2);
        }
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzbm.zzu()));
        return true;
    }

    final boolean zzb(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Boolean bool;
        zzd();
        zzi(str);
        if (zzg(str) && com.google.android.gms.measurement.internal.zzla.zze(str2)) {
            return true;
        }
        if (zzh(str) && com.google.android.gms.measurement.internal.zzla.zza(str2)) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzc(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Boolean bool;
        zzd();
        zzi(str);
        if (com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2)) {
            return true;
        }
        if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdf) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final int zzd(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Integer num;
        zzd();
        zzi(str);
        java.util.Map<java.lang.String, java.lang.Integer> map = this.zzh.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final long zzf(java.lang.String str) throws java.lang.Throwable {
        java.lang.String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (android.text.TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(strZza);
        } catch (java.lang.NumberFormatException e) {
            zzr().zzi().zza("Unable to parse timezone offset. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return 0L;
        }
    }

    private final com.google.android.gms.internal.measurement.zzbo.zzb zza(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzbo.zzb.zzj();
        }
        try {
            com.google.android.gms.internal.measurement.zzbo.zzb zzbVar = (com.google.android.gms.internal.measurement.zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbo.zzb.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbo.zzb.zzi(), bArr)).zzu());
            zzr().zzx().zza("Parsed config. version, gmp_app_id", zzbVar.zza() ? java.lang.Long.valueOf(zzbVar.zzb()) : null, zzbVar.zzc() ? zzbVar.zzd() : null);
            return zzbVar;
        } catch (com.google.android.gms.internal.measurement.zzfo e) {
            zzr().zzi().zza("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return com.google.android.gms.internal.measurement.zzbo.zzb.zzj();
        } catch (java.lang.RuntimeException e2) {
            zzr().zzi().zza("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e2);
            return com.google.android.gms.internal.measurement.zzbo.zzb.zzj();
        }
    }

    final boolean zzg(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzh(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkw zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzn e_() {
        return super.e_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgi zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
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
