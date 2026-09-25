package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx extends com.google.android.gms.measurement.internal.zzhf {
    private java.lang.Boolean zza;
    private com.google.android.gms.measurement.internal.zzz zzb;
    private java.lang.Boolean zzc;

    zzx(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzb = com.google.android.gms.measurement.internal.zzaa.zza;
    }

    final void zza(com.google.android.gms.measurement.internal.zzz zzzVar) {
        this.zzb = zzzVar;
    }

    final int zza(java.lang.String str) {
        return (com.google.android.gms.internal.measurement.zzji.zzb() && zzd(null, com.google.android.gms.measurement.internal.zzap.zzdg)) ? zzb(str, com.google.android.gms.measurement.internal.zzap.zzag) : com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL;
    }

    public final int zzb(java.lang.String str) {
        return zzb(str, com.google.android.gms.measurement.internal.zzap.zzn);
    }

    final int zzc(java.lang.String str) {
        if (com.google.android.gms.internal.measurement.zzji.zzb() && zzd(null, com.google.android.gms.measurement.internal.zzap.zzdg)) {
            return zzb(str, com.google.android.gms.measurement.internal.zzap.zzaf);
        }
        return 25;
    }

    public final long zze() {
        zzu();
        return 22048L;
    }

    public final boolean zzf() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    android.content.pm.ApplicationInfo applicationInfo = zzn().getApplicationInfo();
                    java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        java.lang.String str = applicationInfo.processName;
                        this.zzc = java.lang.Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzc == null) {
                        this.zzc = java.lang.Boolean.TRUE;
                        zzr().zzf().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }

    public final long zza(java.lang.String str, com.google.android.gms.measurement.internal.zzez<java.lang.Long> zzezVar) {
        if (str == null) {
            return zzezVar.zza(null).longValue();
        }
        java.lang.String strZza = this.zzb.zza(str, zzezVar.zza());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return zzezVar.zza(null).longValue();
        }
        try {
            return zzezVar.zza(java.lang.Long.valueOf(java.lang.Long.parseLong(strZza))).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return zzezVar.zza(null).longValue();
        }
    }

    public final int zzb(java.lang.String str, com.google.android.gms.measurement.internal.zzez<java.lang.Integer> zzezVar) {
        if (str == null) {
            return zzezVar.zza(null).intValue();
        }
        java.lang.String strZza = this.zzb.zza(str, zzezVar.zza());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return zzezVar.zza(null).intValue();
        }
        try {
            return zzezVar.zza(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strZza))).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return zzezVar.zza(null).intValue();
        }
    }

    public final double zzc(java.lang.String str, com.google.android.gms.measurement.internal.zzez<java.lang.Double> zzezVar) {
        if (str == null) {
            return zzezVar.zza(null).doubleValue();
        }
        java.lang.String strZza = this.zzb.zza(str, zzezVar.zza());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return zzezVar.zza(null).doubleValue();
        }
        try {
            return zzezVar.zza(java.lang.Double.valueOf(java.lang.Double.parseDouble(strZza))).doubleValue();
        } catch (java.lang.NumberFormatException unused) {
            return zzezVar.zza(null).doubleValue();
        }
    }

    public final boolean zzd(java.lang.String str, com.google.android.gms.measurement.internal.zzez<java.lang.Boolean> zzezVar) {
        if (str == null) {
            return zzezVar.zza(null).booleanValue();
        }
        java.lang.String strZza = this.zzb.zza(str, zzezVar.zza());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return zzezVar.zza(null).booleanValue();
        }
        return zzezVar.zza(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(strZza))).booleanValue();
    }

    public final boolean zze(java.lang.String str, com.google.android.gms.measurement.internal.zzez<java.lang.Boolean> zzezVar) {
        return zzd(str, zzezVar);
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzez<java.lang.Boolean> zzezVar) {
        return zzd(null, zzezVar);
    }

    private final android.os.Bundle zzy() {
        try {
            if (zzn().getPackageManager() == null) {
                zzr().zzf().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzn()).getApplicationInfo(zzn().getPackageName(), 128);
            if (applicationInfo == null) {
                zzr().zzf().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            zzr().zzf().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    final java.lang.Boolean zzd(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle bundleZzy = zzy();
        if (bundleZzy == null) {
            zzr().zzf().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzy.containsKey(str)) {
            return java.lang.Boolean.valueOf(bundleZzy.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: NotFoundException -> 0x0043, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:12:0x002b, B:15:0x003e), top: B:20:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final java.util.List<java.lang.String> zze(java.lang.String str) {
        java.lang.Integer numValueOf;
        java.lang.String[] stringArray;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle bundleZzy = zzy();
        if (bundleZzy == null) {
            zzr().zzf().zza("Failed to load metadata: Metadata bundle is null");
        } else {
            if (bundleZzy.containsKey(str)) {
                numValueOf = java.lang.Integer.valueOf(bundleZzy.getInt(str));
            }
            if (numValueOf == null) {
                return null;
            }
            try {
                stringArray = zzn().getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return java.util.Arrays.asList(stringArray);
            } catch (android.content.res.Resources.NotFoundException e) {
                zzr().zzf().zza("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        numValueOf = null;
        if (numValueOf == null) {
            return null;
        }
        stringArray = zzn().getResources().getStringArray(numValueOf.intValue());
        if (stringArray == null) {
            return null;
        }
        return java.util.Arrays.asList(stringArray);
    }

    public final boolean zzg() {
        zzu();
        java.lang.Boolean boolZzd = zzd("firebase_analytics_collection_deactivated");
        return boolZzd != null && boolZzd.booleanValue();
    }

    public final java.lang.Boolean zzh() {
        zzu();
        return zzd("firebase_analytics_collection_enabled");
    }

    public final java.lang.Boolean zzi() {
        zzb();
        java.lang.Boolean boolZzd = zzd("google_analytics_adid_collection_enabled");
        return java.lang.Boolean.valueOf(boolZzd == null || boolZzd.booleanValue());
    }

    public static long zzj() {
        return com.google.android.gms.measurement.internal.zzap.zzac.zza(null).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public final java.lang.String zza(com.google.android.gms.measurement.internal.zzg zzgVar) {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        java.lang.String strZze = zzgVar.zze();
        if (android.text.TextUtils.isEmpty(strZze)) {
            if (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zzd(zzgVar.zzc(), com.google.android.gms.measurement.internal.zzap.zzch)) {
                strZze = zzgVar.zzg();
                if (android.text.TextUtils.isEmpty(strZze)) {
                    strZze = zzgVar.zzf();
                }
            } else {
                strZze = zzgVar.zzf();
            }
        }
        android.net.Uri.Builder builderEncodedAuthority = builder.scheme(com.google.android.gms.measurement.internal.zzap.zzd.zza(null)).encodedAuthority(com.google.android.gms.measurement.internal.zzap.zze.zza(null));
        java.lang.String strValueOf = java.lang.String.valueOf(strZze);
        builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new java.lang.String("config/app/")).appendQueryParameter("app_instance_id", zzgVar.zzd()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", java.lang.String.valueOf(zze()));
        return builder.build().toString();
    }

    public static long zzk() {
        return com.google.android.gms.measurement.internal.zzap.zzc.zza(null).longValue();
    }

    public final java.lang.String zzv() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final java.lang.String zzw() {
        return zza("debug.deferred.deeplink", "");
    }

    private final java.lang.String zza(java.lang.String str, java.lang.String str2) {
        try {
            return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, str, str2);
        } catch (java.lang.ClassNotFoundException e) {
            zzr().zzf().zza("Could not find SystemProperties class", e);
            return str2;
        } catch (java.lang.IllegalAccessException e2) {
            zzr().zzf().zza("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (java.lang.NoSuchMethodException e3) {
            zzr().zzf().zza("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            zzr().zzf().zza("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final boolean zzf(java.lang.String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzg(java.lang.String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzh(java.lang.String str) {
        return zzd(str, com.google.android.gms.measurement.internal.zzap.zzai);
    }

    final java.lang.String zzi(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzez<java.lang.String> zzezVar = com.google.android.gms.measurement.internal.zzap.zzaj;
        if (str == null) {
            return zzezVar.zza(null);
        }
        return zzezVar.zza(this.zzb.zza(str, zzezVar.zza()));
    }

    final boolean zzx() {
        if (this.zza == null) {
            java.lang.Boolean boolZzd = zzd("app_measurement_lite");
            this.zza = boolZzd;
            if (boolZzd == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzx.zzt();
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
