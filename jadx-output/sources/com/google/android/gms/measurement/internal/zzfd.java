package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfd extends com.google.android.gms.measurement.internal.zze {
    private java.lang.String zza;
    private java.lang.String zzb;
    private int zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private long zzg;
    private java.util.List<java.lang.String> zzh;
    private int zzi;
    private java.lang.String zzj;
    private java.lang.String zzk;
    private java.lang.String zzl;

    zzfd(com.google.android.gms.measurement.internal.zzgo zzgoVar, long j) {
        super(zzgoVar);
        this.zzg = j;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027b A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x028c A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a0 A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a3 A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02df  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x030d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0315 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0317  */
    /* JADX WARN: Code duplicated, block: B:132:0x0322  */
    /* JADX WARN: Code duplicated, block: B:134:0x0325  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[LOOP:0: B:120:0x02f2->B:146:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212  */
    /* JADX WARN: Code duplicated, block: B:80:0x021e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0230  */
    /* JADX WARN: Code duplicated, block: B:84:0x0232  */
    /* JADX WARN: Code duplicated, block: B:99:0x0275 A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    @Override // com.google.android.gms.measurement.internal.zze
    protected final void zzaa() {
        java.lang.String str;
        java.lang.String string;
        com.google.android.gms.common.api.Status statusInitialize;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        java.util.List<java.lang.String> listZze;
        java.util.Iterator<java.lang.String> it;
        java.lang.String googleAppId;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Boolean boolZzh;
        java.lang.String packageName = zzn().getPackageName();
        android.content.pm.PackageManager packageManager = zzn().getPackageManager();
        java.lang.String str4 = "Unknown";
        java.lang.String str5 = "";
        java.lang.String installerPackageName = "unknown";
        int i = Integer.MIN_VALUE;
        try {
            if (packageManager == null) {
                zzr().zzf().zza("PackageManager is null, app identity information might be inaccurate. appId", com.google.android.gms.measurement.internal.zzfk.zza(packageName));
            } else {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (java.lang.IllegalArgumentException unused) {
                    zzr().zzf().zza("Error retrieving app installer package name. appId", com.google.android.gms.measurement.internal.zzfk.zza(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(zzn().getPackageName(), 0);
                    if (packageInfo != null) {
                        java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !android.text.TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str4 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            str = str4;
                            str4 = string;
                            zzr().zzf().zza("Error retrieving package info. appId, appName", com.google.android.gms.measurement.internal.zzfk.zza(packageName), str4);
                            string = str4;
                            str4 = str;
                        }
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str4;
                this.zzc = i;
                this.zze = string;
                this.zzf = 0L;
                zzu();
                statusInitialize = com.google.android.gms.common.api.internal.GoogleServices.initialize(zzn());
                z = true;
                if (statusInitialize == null && statusInitialize.isSuccess()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (android.text.TextUtils.isEmpty(this.zzx.zzo()) && "am".equals(this.zzx.zzp())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                if (!z4) {
                    if (statusInitialize == null) {
                        zzr().zzg().zza("GoogleService failed to initialize (no status)");
                    } else {
                        zzr().zzg().zza("GoogleService failed to initialize, status", java.lang.Integer.valueOf(statusInitialize.getStatusCode()), statusInitialize.getStatusMessage());
                    }
                }
                if (!z4) {
                    z5 = false;
                } else if (!com.google.android.gms.internal.measurement.zzkt.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcy)) {
                    int iZzac = this.zzx.zzac();
                    switch (iZzac) {
                        case 0:
                            zzr().zzx().zza("App measurement collection enabled");
                            break;
                        case 1:
                            zzr().zzv().zza("App measurement deactivated via the manifest");
                            break;
                        case 2:
                            zzr().zzx().zza("App measurement deactivated via the init parameters");
                            break;
                        case 3:
                            zzr().zzv().zza("App measurement disabled by setMeasurementEnabled(false)");
                            break;
                        case 4:
                            zzr().zzv().zza("App measurement disabled via the manifest");
                            break;
                        case 5:
                            zzr().zzx().zza("App measurement disabled via the init parameters");
                            break;
                        case 6:
                            zzr().zzk().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            break;
                        case 7:
                            zzr().zzv().zza("App measurement disabled via the global data collection setting");
                            break;
                        default:
                            zzr().zzv().zza("App measurement disabled");
                            zzr().zzg().zza("Invalid scion state in identity");
                            break;
                    }
                    if (iZzac == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    boolZzh = zzt().zzh();
                    if (zzt().zzg()) {
                        if (this.zzx.zzl()) {
                            zzr().zzv().zza("Collection disabled with firebase_analytics_collection_deactivated=1");
                        }
                    } else if (boolZzh == null && !boolZzh.booleanValue()) {
                        if (this.zzx.zzl()) {
                            zzr().zzv().zza("Collection disabled with firebase_analytics_collection_enabled=0");
                        }
                    } else if (boolZzh != null && com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled()) {
                        zzr().zzv().zza("Collection disabled with google_app_measurement_enable=0");
                    } else {
                        zzr().zzx().zza("Collection enabled");
                        z5 = true;
                    }
                    z5 = false;
                }
                this.zzj = "";
                this.zzk = "";
                this.zzl = "";
                zzu();
                if (z3) {
                    this.zzk = this.zzx.zzo();
                }
                googleAppId = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();
                if (android.text.TextUtils.isEmpty(googleAppId)) {
                    str2 = "";
                } else {
                    str2 = googleAppId;
                }
                this.zzj = str2;
                if (!com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzch)) {
                    com.google.android.gms.common.internal.StringResourceValueReader stringResourceValueReader = new com.google.android.gms.common.internal.StringResourceValueReader(zzn());
                    java.lang.String string2 = stringResourceValueReader.getString("ga_app_id");
                    if (!android.text.TextUtils.isEmpty(string2)) {
                        str5 = string2;
                    }
                    this.zzl = str5;
                    if (!android.text.TextUtils.isEmpty(googleAppId) || !android.text.TextUtils.isEmpty(string2)) {
                        this.zzk = stringResourceValueReader.getString("admob_app_id");
                    }
                } else if (!android.text.TextUtils.isEmpty(googleAppId)) {
                    this.zzk = new com.google.android.gms.common.internal.StringResourceValueReader(zzn()).getString("admob_app_id");
                }
                if (z5) {
                    com.google.android.gms.measurement.internal.zzfm zzfmVarZzx = zzr().zzx();
                    java.lang.String str6 = this.zza;
                    if (android.text.TextUtils.isEmpty(this.zzj)) {
                        str3 = this.zzk;
                    } else {
                        str3 = this.zzj;
                    }
                    zzfmVarZzx.zza("App measurement enabled for app package, google app id", str6, str3);
                }
                this.zzh = null;
                if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbl)) {
                    zzu();
                    listZze = zzt().zze("analytics.safelisted_events");
                    if (listZze != null) {
                        if (listZze.size() == 0) {
                            zzr().zzk().zza("Safelisted event list is empty. Ignoring");
                        } else {
                            it = listZze.iterator();
                            while (it.hasNext()) {
                                if (!zzp().zzb("safelisted event", it.next())) {
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        this.zzh = listZze;
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    this.zzi = 0;
                } else if (packageManager != null) {
                    this.zzi = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(zzn()) ? 1 : 0;
                } else {
                    this.zzi = 0;
                }
            }
            googleAppId = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();
            if (android.text.TextUtils.isEmpty(googleAppId)) {
                str2 = "";
            } else {
                str2 = googleAppId;
            }
            this.zzj = str2;
            if (!com.google.android.gms.internal.measurement.zzll.zzb()) {
                if (!android.text.TextUtils.isEmpty(googleAppId)) {
                    this.zzk = new com.google.android.gms.common.internal.StringResourceValueReader(zzn()).getString("admob_app_id");
                }
            } else if (!android.text.TextUtils.isEmpty(googleAppId)) {
                this.zzk = new com.google.android.gms.common.internal.StringResourceValueReader(zzn()).getString("admob_app_id");
            }
            if (z5) {
                com.google.android.gms.measurement.internal.zzfm zzfmVarZzx2 = zzr().zzx();
                java.lang.String str7 = this.zza;
                if (android.text.TextUtils.isEmpty(this.zzj)) {
                    str3 = this.zzk;
                } else {
                    str3 = this.zzj;
                }
                zzfmVarZzx2.zza("App measurement enabled for app package, google app id", str7, str3);
            }
        } catch (java.lang.IllegalStateException e) {
            zzr().zzf().zza("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzfk.zza(packageName), e);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str4;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        zzu();
        statusInitialize = com.google.android.gms.common.api.internal.GoogleServices.initialize(zzn());
        z = true;
        if (statusInitialize == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (android.text.TextUtils.isEmpty(this.zzx.zzo())) {
            z3 = false;
        } else {
            z3 = false;
        }
        z4 = z2 | z3;
        if (!z4) {
            if (statusInitialize == null) {
                zzr().zzg().zza("GoogleService failed to initialize (no status)");
            } else {
                zzr().zzg().zza("GoogleService failed to initialize, status", java.lang.Integer.valueOf(statusInitialize.getStatusCode()), statusInitialize.getStatusMessage());
            }
        }
        if (!z4) {
            z5 = false;
        } else if (!com.google.android.gms.internal.measurement.zzkt.zzb()) {
            boolZzh = zzt().zzh();
            if (zzt().zzg()) {
                if (this.zzx.zzl()) {
                    zzr().zzv().zza("Collection disabled with firebase_analytics_collection_deactivated=1");
                }
            } else if (boolZzh == null) {
                if (boolZzh != null) {
                }
                zzr().zzx().zza("Collection enabled");
                z5 = true;
            } else {
                if (boolZzh != null) {
                }
                zzr().zzx().zza("Collection enabled");
                z5 = true;
            }
            z5 = false;
        } else {
            boolZzh = zzt().zzh();
            if (zzt().zzg()) {
                if (this.zzx.zzl()) {
                    zzr().zzv().zza("Collection disabled with firebase_analytics_collection_deactivated=1");
                }
            } else if (boolZzh == null) {
                if (boolZzh != null) {
                }
                zzr().zzx().zza("Collection enabled");
                z5 = true;
            } else {
                if (boolZzh != null) {
                }
                zzr().zzx().zza("Collection enabled");
                z5 = true;
            }
            z5 = false;
        }
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
        zzu();
        if (z3) {
            this.zzk = this.zzx.zzo();
        }
        this.zzh = null;
        if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbl)) {
            zzu();
            listZze = zzt().zze("analytics.safelisted_events");
            if (listZze != null) {
                if (listZze.size() == 0) {
                    zzr().zzk().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZze.iterator();
                    while (it.hasNext()) {
                        if (!zzp().zzb("safelisted event", it.next())) {
                        }
                    }
                }
                z = false;
            }
            if (z) {
                this.zzh = listZze;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.zzi = 0;
        } else if (packageManager != null) {
            this.zzi = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(zzn()) ? 1 : 0;
        } else {
            this.zzi = 0;
        }
    }

    final com.google.android.gms.measurement.internal.zzm zza(java.lang.String str) {
        java.lang.Boolean boolZzd;
        zzd();
        zzb();
        java.lang.String strZzab = zzab();
        java.lang.String strZzac = zzac();
        zzw();
        java.lang.String str2 = this.zzb;
        long jZzaf = zzaf();
        zzw();
        java.lang.String str3 = this.zzd;
        long jZze = zzt().zze();
        zzw();
        zzd();
        if (this.zzf == 0) {
            this.zzf = this.zzx.zzi().zza(zzn(), zzn().getPackageName());
        }
        long j = this.zzf;
        boolean zZzab = this.zzx.zzab();
        boolean z = !zzs().zzs;
        zzd();
        zzb();
        java.lang.String strZzai = !this.zzx.zzab() ? null : zzai();
        long jZzad = this.zzx.zzad();
        int iZzag = zzag();
        boolean zBooleanValue = zzt().zzi().booleanValue();
        com.google.android.gms.measurement.internal.zzx zzxVarZzt = zzt();
        zzxVarZzt.zzb();
        java.lang.Boolean boolZzd2 = zzxVarZzt.zzd("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = java.lang.Boolean.valueOf(boolZzd2 == null || boolZzd2.booleanValue()).booleanValue();
        com.google.android.gms.measurement.internal.zzft zzftVarZzs = zzs();
        zzftVarZzs.zzd();
        return new com.google.android.gms.measurement.internal.zzm(strZzab, strZzac, str2, jZzaf, str3, jZze, j, str, zZzab, z, strZzai, 0L, jZzad, iZzag, zBooleanValue, zBooleanValue2, zzftVarZzs.zzg().getBoolean("deferred_analytics_collection", false), zzad(), (!zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbc) || (boolZzd = zzt().zzd("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : java.lang.Boolean.valueOf(!boolZzd.booleanValue()), this.zzg, zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbl) ? this.zzh : null, (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzch)) ? zzae() : null);
    }

    private final java.lang.String zzai() {
        if (com.google.android.gms.internal.measurement.zznh.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzck)) {
            zzr().zzx().zza("Disabled IID for tests.");
            return null;
        }
        try {
            java.lang.Class<?> clsLoadClass = zzn().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                java.lang.Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", android.content.Context.class).invoke(null, zzn());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (java.lang.String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                    zzr().zzk().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (java.lang.Exception unused2) {
                zzr().zzj().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (java.lang.ClassNotFoundException unused3) {
        }
    }

    final java.lang.String zzab() {
        zzw();
        return this.zza;
    }

    final java.lang.String zzac() {
        zzw();
        return this.zzj;
    }

    final java.lang.String zzad() {
        zzw();
        return this.zzk;
    }

    final java.lang.String zzae() {
        zzw();
        return this.zzl;
    }

    final int zzaf() {
        zzw();
        return this.zzc;
    }

    final int zzag() {
        zzw();
        return this.zzi;
    }

    final java.util.List<java.lang.String> zzah() {
        return this.zzh;
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
