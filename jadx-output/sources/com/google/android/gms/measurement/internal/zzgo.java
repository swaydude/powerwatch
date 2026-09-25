package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzgo implements com.google.android.gms.measurement.internal.zzhh {
    private static volatile com.google.android.gms.measurement.internal.zzgo zza;
    private long zzaa;
    private volatile java.lang.Boolean zzab;
    private java.lang.Boolean zzac;
    private java.lang.Boolean zzad;
    private int zzae;
    private final long zzag;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final boolean zzf;
    private final com.google.android.gms.measurement.internal.zzw zzg;
    private final com.google.android.gms.measurement.internal.zzx zzh;
    private final com.google.android.gms.measurement.internal.zzft zzi;
    private final com.google.android.gms.measurement.internal.zzfk zzj;
    private final com.google.android.gms.measurement.internal.zzgh zzk;
    private final com.google.android.gms.measurement.internal.zzkc zzl;
    private final com.google.android.gms.measurement.internal.zzla zzm;
    private final com.google.android.gms.measurement.internal.zzfi zzn;
    private final com.google.android.gms.common.util.Clock zzo;
    private final com.google.android.gms.measurement.internal.zziw zzp;
    private final com.google.android.gms.measurement.internal.zzhp zzq;
    private final com.google.android.gms.measurement.internal.zzb zzr;
    private final com.google.android.gms.measurement.internal.zzin zzs;
    private com.google.android.gms.measurement.internal.zzfg zzt;
    private com.google.android.gms.measurement.internal.zzix zzu;
    private com.google.android.gms.measurement.internal.zzah zzv;
    private com.google.android.gms.measurement.internal.zzfd zzw;
    private com.google.android.gms.measurement.internal.zzfz zzx;
    private java.lang.Boolean zzz;
    private boolean zzy = false;
    private java.util.concurrent.atomic.AtomicInteger zzaf = new java.util.concurrent.atomic.AtomicInteger(0);

    private zzgo(com.google.android.gms.measurement.internal.zzhq zzhqVar) {
        boolean z = false;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhqVar);
        com.google.android.gms.measurement.internal.zzw zzwVar = new com.google.android.gms.measurement.internal.zzw(zzhqVar.zza);
        this.zzg = zzwVar;
        com.google.android.gms.measurement.internal.zzfa.zza = zzwVar;
        android.content.Context context = zzhqVar.zza;
        this.zzb = context;
        this.zzc = zzhqVar.zzb;
        this.zzd = zzhqVar.zzc;
        this.zze = zzhqVar.zzd;
        this.zzf = zzhqVar.zzh;
        this.zzab = zzhqVar.zze;
        com.google.android.gms.internal.measurement.zzv zzvVar = zzhqVar.zzg;
        if (zzvVar != null && zzvVar.zzg != null) {
            java.lang.Object obj = zzvVar.zzg.get("measurementEnabled");
            if (obj instanceof java.lang.Boolean) {
                this.zzac = (java.lang.Boolean) obj;
            }
            java.lang.Object obj2 = zzvVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof java.lang.Boolean) {
                this.zzad = (java.lang.Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzcl.zza(context);
        com.google.android.gms.common.util.Clock defaultClock = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzo = defaultClock;
        this.zzag = defaultClock.currentTimeMillis();
        this.zzh = new com.google.android.gms.measurement.internal.zzx(this);
        com.google.android.gms.measurement.internal.zzft zzftVar = new com.google.android.gms.measurement.internal.zzft(this);
        zzftVar.zzab();
        this.zzi = zzftVar;
        com.google.android.gms.measurement.internal.zzfk zzfkVar = new com.google.android.gms.measurement.internal.zzfk(this);
        zzfkVar.zzab();
        this.zzj = zzfkVar;
        com.google.android.gms.measurement.internal.zzla zzlaVar = new com.google.android.gms.measurement.internal.zzla(this);
        zzlaVar.zzab();
        this.zzm = zzlaVar;
        com.google.android.gms.measurement.internal.zzfi zzfiVar = new com.google.android.gms.measurement.internal.zzfi(this);
        zzfiVar.zzab();
        this.zzn = zzfiVar;
        this.zzr = new com.google.android.gms.measurement.internal.zzb(this);
        com.google.android.gms.measurement.internal.zziw zziwVar = new com.google.android.gms.measurement.internal.zziw(this);
        zziwVar.zzx();
        this.zzp = zziwVar;
        com.google.android.gms.measurement.internal.zzhp zzhpVar = new com.google.android.gms.measurement.internal.zzhp(this);
        zzhpVar.zzx();
        this.zzq = zzhpVar;
        com.google.android.gms.measurement.internal.zzkc zzkcVar = new com.google.android.gms.measurement.internal.zzkc(this);
        zzkcVar.zzx();
        this.zzl = zzkcVar;
        com.google.android.gms.measurement.internal.zzin zzinVar = new com.google.android.gms.measurement.internal.zzin(this);
        zzinVar.zzab();
        this.zzs = zzinVar;
        com.google.android.gms.measurement.internal.zzgh zzghVar = new com.google.android.gms.measurement.internal.zzgh(this);
        zzghVar.zzab();
        this.zzk = zzghVar;
        if (zzhqVar.zzg != null && zzhqVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof android.app.Application) {
            com.google.android.gms.measurement.internal.zzhp zzhpVarZzh = zzh();
            if (zzhpVarZzh.zzn().getApplicationContext() instanceof android.app.Application) {
                android.app.Application application = (android.app.Application) zzhpVarZzh.zzn().getApplicationContext();
                if (zzhpVarZzh.zza == null) {
                    zzhpVarZzh.zza = new com.google.android.gms.measurement.internal.zzim(zzhpVarZzh, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzhpVarZzh.zza);
                    application.registerActivityLifecycleCallbacks(zzhpVarZzh.zza);
                    zzhpVarZzh.zzr().zzx().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzr().zzi().zza("Application context is not an Application");
        }
        zzghVar.zza(new com.google.android.gms.measurement.internal.zzgq(this, zzhqVar));
    }

    final void zzae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.measurement.internal.zzhq zzhqVar) {
        java.lang.String strConcat;
        com.google.android.gms.measurement.internal.zzfm zzfmVarZzv;
        zzq().zzd();
        com.google.android.gms.measurement.internal.zzah zzahVar = new com.google.android.gms.measurement.internal.zzah(this);
        zzahVar.zzab();
        this.zzv = zzahVar;
        com.google.android.gms.measurement.internal.zzfd zzfdVar = new com.google.android.gms.measurement.internal.zzfd(this, zzhqVar.zzf);
        zzfdVar.zzx();
        this.zzw = zzfdVar;
        com.google.android.gms.measurement.internal.zzfg zzfgVar = new com.google.android.gms.measurement.internal.zzfg(this);
        zzfgVar.zzx();
        this.zzt = zzfgVar;
        com.google.android.gms.measurement.internal.zzix zzixVar = new com.google.android.gms.measurement.internal.zzix(this);
        zzixVar.zzx();
        this.zzu = zzixVar;
        this.zzm.zzac();
        this.zzi.zzac();
        this.zzx = new com.google.android.gms.measurement.internal.zzfz(this);
        this.zzw.zzy();
        zzr().zzv().zza("App measurement initialized, version", java.lang.Long.valueOf(this.zzh.zze()));
        zzr().zzv().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        java.lang.String strZzab = zzfdVar.zzab();
        if (android.text.TextUtils.isEmpty(this.zzc)) {
            if (zzi().zzf(strZzab)) {
                zzfmVarZzv = zzr().zzv();
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                com.google.android.gms.measurement.internal.zzfm zzfmVarZzv2 = zzr().zzv();
                java.lang.String strValueOf = java.lang.String.valueOf(strZzab);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new java.lang.String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzfmVarZzv = zzfmVarZzv2;
            }
            zzfmVarZzv.zza(strConcat);
        }
        zzr().zzw().zza("Debug-level message logging enabled");
        if (this.zzae != this.zzaf.get()) {
            zzr().zzf().zza("Not all components initialized", java.lang.Integer.valueOf(this.zzae), java.lang.Integer.valueOf(this.zzaf.get()));
        }
        this.zzy = true;
    }

    protected final void zza() {
        zzq().zzd();
        if (zzc().zzc.zza() == 0) {
            zzc().zzc.zza(this.zzo.currentTimeMillis());
        }
        if (java.lang.Long.valueOf(zzc().zzh.zza()).longValue() == 0) {
            zzr().zzx().zza("Persisting first open", java.lang.Long.valueOf(this.zzag));
            zzc().zzh.zza(this.zzag);
        }
        if (!zzah()) {
            if (zzab()) {
                if (!zzi().zzd("android.permission.INTERNET")) {
                    zzr().zzf().zza("App is missing INTERNET permission");
                }
                if (!zzi().zzd("android.permission.ACCESS_NETWORK_STATE")) {
                    zzr().zzf().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).isCallerInstantApp() && !this.zzh.zzx()) {
                    if (!com.google.android.gms.measurement.internal.zzge.zza(this.zzb)) {
                        zzr().zzf().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!com.google.android.gms.measurement.internal.zzla.zza(this.zzb, false)) {
                        zzr().zzf().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzr().zzf().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!android.text.TextUtils.isEmpty(zzy().zzac()) || !android.text.TextUtils.isEmpty(zzy().zzad())) {
                zzi();
                if (com.google.android.gms.measurement.internal.zzla.zza(zzy().zzac(), zzc().zzh(), zzy().zzad(), zzc().zzi())) {
                    zzr().zzv().zza("Rechecking which service to use due to a GMP App Id change");
                    zzc().zzk();
                    zzk().zzab();
                    this.zzu.zzah();
                    this.zzu.zzaf();
                    zzc().zzh.zza(this.zzag);
                    zzc().zzj.zza(null);
                }
                zzc().zzc(zzy().zzac());
                zzc().zzd(zzy().zzad());
            }
            zzh().zza(zzc().zzj.zza());
            if (com.google.android.gms.internal.measurement.zzka.zzb() && this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzcq) && !zzi().zzv() && !android.text.TextUtils.isEmpty(zzc().zzw.zza())) {
                zzr().zzi().zza("Remote config removed with active feature rollouts");
                zzc().zzw.zza(null);
            }
            if (!android.text.TextUtils.isEmpty(zzy().zzac()) || !android.text.TextUtils.isEmpty(zzy().zzad())) {
                boolean zZzab = zzab();
                if (!zzc().zzx() && !this.zzh.zzg()) {
                    zzc().zzc(!zZzab);
                }
                if (zZzab) {
                    zzh().zzai();
                }
                zze().zza.zza();
                zzw().zza(new java.util.concurrent.atomic.AtomicReference<>());
            }
        }
        zzc().zzo.zza(this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzbi));
        zzc().zzp.zza(this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzbj));
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final com.google.android.gms.measurement.internal.zzw zzu() {
        return this.zzg;
    }

    public final com.google.android.gms.measurement.internal.zzx zzb() {
        return this.zzh;
    }

    public final com.google.android.gms.measurement.internal.zzft zzc() {
        zza((com.google.android.gms.measurement.internal.zzhf) this.zzi);
        return this.zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final com.google.android.gms.measurement.internal.zzfk zzr() {
        zzb(this.zzj);
        return this.zzj;
    }

    public final com.google.android.gms.measurement.internal.zzfk zzd() {
        com.google.android.gms.measurement.internal.zzfk zzfkVar = this.zzj;
        if (zzfkVar == null || !zzfkVar.zzz()) {
            return null;
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final com.google.android.gms.measurement.internal.zzgh zzq() {
        zzb(this.zzk);
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzkc zze() {
        zzb(this.zzl);
        return this.zzl;
    }

    public final com.google.android.gms.measurement.internal.zzfz zzf() {
        return this.zzx;
    }

    final com.google.android.gms.measurement.internal.zzgh zzg() {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzhp zzh() {
        zzb(this.zzq);
        return this.zzq;
    }

    public final com.google.android.gms.measurement.internal.zzla zzi() {
        zza((com.google.android.gms.measurement.internal.zzhf) this.zzm);
        return this.zzm;
    }

    public final com.google.android.gms.measurement.internal.zzfi zzj() {
        zza((com.google.android.gms.measurement.internal.zzhf) this.zzn);
        return this.zzn;
    }

    public final com.google.android.gms.measurement.internal.zzfg zzk() {
        zzb(this.zzt);
        return this.zzt;
    }

    private final com.google.android.gms.measurement.internal.zzin zzaj() {
        zzb(this.zzs);
        return this.zzs;
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final android.content.Context zzn() {
        return this.zzb;
    }

    public final boolean zzl() {
        return android.text.TextUtils.isEmpty(this.zzc);
    }

    public final java.lang.String zzo() {
        return this.zzc;
    }

    public final java.lang.String zzp() {
        return this.zzd;
    }

    public final java.lang.String zzs() {
        return this.zze;
    }

    public final boolean zzt() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final com.google.android.gms.common.util.Clock zzm() {
        return this.zzo;
    }

    public final com.google.android.gms.measurement.internal.zziw zzv() {
        zzb(this.zzp);
        return this.zzp;
    }

    public final com.google.android.gms.measurement.internal.zzix zzw() {
        zzb(this.zzu);
        return this.zzu;
    }

    public final com.google.android.gms.measurement.internal.zzah zzx() {
        zzb(this.zzv);
        return this.zzv;
    }

    public final com.google.android.gms.measurement.internal.zzfd zzy() {
        zzb(this.zzw);
        return this.zzw;
    }

    public final com.google.android.gms.measurement.internal.zzb zzz() {
        com.google.android.gms.measurement.internal.zzb zzbVar = this.zzr;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new java.lang.IllegalStateException("Component not created");
    }

    public static com.google.android.gms.measurement.internal.zzgo zza(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return zza(context, new com.google.android.gms.internal.measurement.zzv(0L, 0L, true, null, null, null, bundle));
    }

    public static com.google.android.gms.measurement.internal.zzgo zza(android.content.Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        if (zzvVar != null && (zzvVar.zze == null || zzvVar.zzf == null)) {
            zzvVar = new com.google.android.gms.internal.measurement.zzv(zzvVar.zza, zzvVar.zzb, zzvVar.zzc, zzvVar.zzd, null, null, zzvVar.zzg);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (com.google.android.gms.measurement.internal.zzgo.class) {
                if (zza == null) {
                    zza = new com.google.android.gms.measurement.internal.zzgo(new com.google.android.gms.measurement.internal.zzhq(context, zzvVar));
                }
            }
        } else if (zzvVar != null && zzvVar.zzg != null && zzvVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            zza.zza(zzvVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zza;
    }

    private final void zzak() {
        if (!this.zzy) {
            throw new java.lang.IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private static void zzb(com.google.android.gms.measurement.internal.zzhi zzhiVar) {
        if (zzhiVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (zzhiVar.zzz()) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(zzhiVar.getClass());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static void zzb(com.google.android.gms.measurement.internal.zze zzeVar) {
        if (zzeVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (zzeVar.zzv()) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(zzeVar.getClass());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static void zza(com.google.android.gms.measurement.internal.zzhf zzhfVar) {
        if (zzhfVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    final void zza(boolean z) {
        this.zzab = java.lang.Boolean.valueOf(z);
    }

    public final boolean zzaa() {
        return this.zzab != null && this.zzab.booleanValue();
    }

    public final boolean zzab() {
        if (com.google.android.gms.internal.measurement.zzkt.zzb() && this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzcy)) {
            return zzac() == 0;
        }
        zzq().zzd();
        zzak();
        if (this.zzh.zzg()) {
            return false;
        }
        java.lang.Boolean bool = this.zzad;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        java.lang.Boolean boolZzv = zzc().zzv();
        if (boolZzv != null) {
            return boolZzv.booleanValue();
        }
        java.lang.Boolean boolZzh = this.zzh.zzh();
        if (boolZzh != null) {
            return boolZzh.booleanValue();
        }
        java.lang.Boolean bool2 = this.zzac;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled()) {
            return false;
        }
        if (!this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzaz) || this.zzab == null) {
            return true;
        }
        return this.zzab.booleanValue();
    }

    public final int zzac() {
        zzq().zzd();
        if (this.zzh.zzg()) {
            return 1;
        }
        java.lang.Boolean bool = this.zzad;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        java.lang.Boolean boolZzv = zzc().zzv();
        if (boolZzv != null) {
            return boolZzv.booleanValue() ? 0 : 3;
        }
        java.lang.Boolean boolZzh = this.zzh.zzh();
        if (boolZzh != null) {
            return boolZzh.booleanValue() ? 0 : 4;
        }
        java.lang.Boolean bool2 = this.zzac;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled()) {
            return 6;
        }
        return (!this.zzh.zza(com.google.android.gms.measurement.internal.zzap.zzaz) || this.zzab == null || this.zzab.booleanValue()) ? 0 : 7;
    }

    final long zzad() {
        java.lang.Long lValueOf = java.lang.Long.valueOf(zzc().zzh.zza());
        if (lValueOf.longValue() == 0) {
            return this.zzag;
        }
        return java.lang.Math.min(this.zzag, lValueOf.longValue());
    }

    final void zzaf() {
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    final void zza(com.google.android.gms.measurement.internal.zzhi zzhiVar) {
        this.zzae++;
    }

    final void zza(com.google.android.gms.measurement.internal.zze zzeVar) {
        this.zzae++;
    }

    final void zzag() {
        this.zzaf.incrementAndGet();
    }

    protected final boolean zzah() {
        zzak();
        zzq().zzd();
        java.lang.Boolean bool = this.zzz;
        if (bool == null || this.zzaa == 0 || (bool != null && !bool.booleanValue() && java.lang.Math.abs(this.zzo.elapsedRealtime() - this.zzaa) > 1000)) {
            this.zzaa = this.zzo.elapsedRealtime();
            boolean z = true;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zzi().zzd("android.permission.INTERNET") && zzi().zzd("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).isCallerInstantApp() || this.zzh.zzx() || (com.google.android.gms.measurement.internal.zzge.zza(this.zzb) && com.google.android.gms.measurement.internal.zzla.zza(this.zzb, false))));
            this.zzz = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzi().zza(zzy().zzac(), zzy().zzad(), zzy().zzae()) && android.text.TextUtils.isEmpty(zzy().zzad())) {
                    z = false;
                }
                this.zzz = java.lang.Boolean.valueOf(z);
            }
        }
        return this.zzz.booleanValue();
    }

    public final void zzai() {
        zzq().zzd();
        zzb(zzaj());
        java.lang.String strZzab = zzy().zzab();
        android.util.Pair<java.lang.String, java.lang.Boolean> pairZza = zzc().zza(strZzab);
        if (!this.zzh.zzi().booleanValue() || ((java.lang.Boolean) pairZza.second).booleanValue() || android.text.TextUtils.isEmpty((java.lang.CharSequence) pairZza.first)) {
            zzr().zzw().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!zzaj().zzg()) {
            zzr().zzi().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        java.net.URL urlZza = zzi().zza(zzy().zzt().zze(), strZzab, (java.lang.String) pairZza.first, zzc().zzv.zza() - 1);
        com.google.android.gms.measurement.internal.zzin zzinVarZzaj = zzaj();
        com.google.android.gms.measurement.internal.zziq zziqVar = new com.google.android.gms.measurement.internal.zziq(this) { // from class: com.google.android.gms.measurement.internal.zzgn
            private final com.google.android.gms.measurement.internal.zzgo zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.measurement.internal.zziq
            public final void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
                this.zza.zza(str, i, th, bArr, map);
            }
        };
        zzinVarZzaj.zzd();
        zzinVarZzaj.zzaa();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(urlZza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zziqVar);
        zzinVarZzaj.zzq().zzb(new com.google.android.gms.measurement.internal.zzip(zzinVarZzaj, strZzab, urlZza, null, null, zziqVar));
    }

    final /* synthetic */ void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzr().zzi().zza("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i), th);
            return;
        }
        zzc().zzu.zza(true);
        if (bArr.length == 0) {
            zzr().zzw().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            java.lang.String strOptString = jSONObject.optString("deeplink", "");
            java.lang.String strOptString2 = jSONObject.optString("gclid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (android.text.TextUtils.isEmpty(strOptString)) {
                zzr().zzw().zza("Deferred Deep Link is empty.");
                return;
            }
            com.google.android.gms.measurement.internal.zzla zzlaVarZzi = zzi();
            zzlaVarZzi.zzb();
            if (android.text.TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = zzlaVarZzi.zzn().getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                zzr().zzi().zza("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.zzq.zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
            com.google.android.gms.measurement.internal.zzla zzlaVarZzi2 = zzi();
            if (android.text.TextUtils.isEmpty(strOptString) || !zzlaVarZzi2.zza(strOptString, dOptDouble)) {
                return;
            }
            zzlaVarZzi2.zzn().sendBroadcast(new android.content.Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (org.json.JSONException e) {
            zzr().zzf().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }
}
