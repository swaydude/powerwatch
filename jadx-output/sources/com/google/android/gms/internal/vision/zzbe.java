package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbe<T> {
    private static android.content.Context zze = null;
    private static boolean zzfz = false;
    private static com.google.android.gms.internal.vision.zzcu<com.google.android.gms.internal.vision.zzcn<com.google.android.gms.internal.vision.zzba>> zzga;
    private final java.lang.String name;
    private final com.google.android.gms.internal.vision.zzbk zzgb;
    private final T zzgc;
    private volatile int zzge;
    private volatile T zzgf;
    private static final java.lang.Object zzfy = new java.lang.Object();
    private static final java.util.concurrent.atomic.AtomicInteger zzgd = new java.util.concurrent.atomic.AtomicInteger();

    public static void init(android.content.Context context) {
        synchronized (zzfy) {
            android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zze != context) {
                com.google.android.gms.internal.vision.zzaq.zzx();
                com.google.android.gms.internal.vision.zzbj.zzx();
                com.google.android.gms.internal.vision.zzav.zzaa();
                zzgd.incrementAndGet();
                zze = context;
                zzga = com.google.android.gms.internal.vision.zzcx.zza(com.google.android.gms.internal.vision.zzbd.zzfx);
            }
        }
    }

    abstract T zza(java.lang.Object obj);

    public static void maybeInit(android.content.Context context) {
        synchronized (zzfy) {
            if (zze == null) {
                init(context);
            }
        }
    }

    static void zzab() {
        zzgd.incrementAndGet();
    }

    private zzbe(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, T t) {
        this.zzge = -1;
        if (zzbkVar.zzgk == null && zzbkVar.zzgl == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzbkVar.zzgk != null && zzbkVar.zzgl != null) {
            throw new java.lang.IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzgb = zzbkVar;
        this.name = str;
        this.zzgc = t;
    }

    private final java.lang.String zze(java.lang.String str) {
        if (str != null && str.isEmpty()) {
            return this.name;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.name);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
    }

    public final java.lang.String zzac() {
        return zze(this.zzgb.zzgn);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:13:0x003b, B:29:0x0064, B:28:0x0062, B:14:0x0040, B:16:0x0046, B:19:0x004d, B:22:0x0054, B:25:0x005b, B:30:0x0069, B:31:0x0070, B:32:0x0071), top: B:39:0x000b }] */
    public final T get() {
        T tZzad;
        int i = zzgd.get();
        if (this.zzge < i) {
            synchronized (this) {
                if (this.zzge < i) {
                    if (zze == null) {
                        throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    com.google.android.gms.internal.vision.zzcn<com.google.android.gms.internal.vision.zzba> zzcnVar = zzga.get();
                    if (zzcnVar.isPresent()) {
                        java.lang.String strZza = zzcnVar.get().zza(this.zzgb.zzgl, this.zzgb.zzgk, this.zzgb.zzgn, this.name);
                        if (strZza != null) {
                            tZzad = zza(strZza);
                        } else {
                            tZzad = this.zzgc;
                        }
                    } else if (this.zzgb.zzgp) {
                        tZzad = zzae();
                        if (tZzad == null && (tZzad = zzad()) == null) {
                            tZzad = this.zzgc;
                        }
                    } else {
                        tZzad = zzad();
                        if (tZzad == null && (tZzad = zzae()) == null) {
                            tZzad = this.zzgc;
                        }
                    }
                    this.zzgf = tZzad;
                    this.zzge = i;
                }
            }
        }
        return this.zzgf;
    }

    @javax.annotation.Nullable
    private final T zzad() {
        com.google.android.gms.internal.vision.zzau zzauVarZzb;
        java.lang.Object objZzb;
        boolean z = false;
        if (!this.zzgb.zzgq) {
            java.lang.String str = (java.lang.String) com.google.android.gms.internal.vision.zzav.zze(zze).zzb("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
            if (str != null && com.google.android.gms.internal.vision.zzal.zzeu.matcher(str).matches()) {
                z = true;
            }
        }
        if (!z) {
            if (this.zzgb.zzgl != null) {
                if (!com.google.android.gms.internal.vision.zzbc.zza(zze, this.zzgb.zzgl)) {
                    zzauVarZzb = null;
                } else if (this.zzgb.zzgr) {
                    android.content.ContentResolver contentResolver = zze.getContentResolver();
                    java.lang.String lastPathSegment = this.zzgb.zzgl.getLastPathSegment();
                    java.lang.String packageName = zze.getPackageName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(lastPathSegment).length() + 1 + java.lang.String.valueOf(packageName).length());
                    sb.append(lastPathSegment);
                    sb.append("#");
                    sb.append(packageName);
                    zzauVarZzb = com.google.android.gms.internal.vision.zzaq.zza(contentResolver, com.google.android.gms.internal.vision.zzbb.getContentProviderUri(sb.toString()));
                } else {
                    zzauVarZzb = com.google.android.gms.internal.vision.zzaq.zza(zze.getContentResolver(), this.zzgb.zzgl);
                }
            } else {
                zzauVarZzb = com.google.android.gms.internal.vision.zzbj.zzb(zze, this.zzgb.zzgk);
            }
            if (zzauVarZzb != null && (objZzb = zzauVarZzb.zzb(zzac())) != null) {
                return zza(objZzb);
            }
        } else if (android.util.Log.isLoggable("PhenotypeFlag", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(zzac());
            android.util.Log.d("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new java.lang.String("Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    @javax.annotation.Nullable
    private final T zzae() {
        if (!this.zzgb.zzgo && (this.zzgb.zzgs == null || this.zzgb.zzgs.apply(zze).booleanValue())) {
            java.lang.Object objZzb = com.google.android.gms.internal.vision.zzav.zze(zze).zzb(this.zzgb.zzgo ? null : zze(this.zzgb.zzgm));
            if (objZzb != null) {
                return zza(objZzb);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zza(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.vision.zzbf(zzbkVar, str, java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> com.google.android.gms.internal.vision.zzbe<T> zza(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, T t, com.google.android.gms.internal.vision.zzbh<T> zzbhVar) {
        return new com.google.android.gms.internal.vision.zzbi(zzbkVar, str, t, zzbhVar);
    }

    static final /* synthetic */ com.google.android.gms.internal.vision.zzcn zzaf() {
        new com.google.android.gms.internal.vision.zzaz();
        return com.google.android.gms.internal.vision.zzaz.zzf(zze);
    }

    /* synthetic */ zzbe(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.vision.zzbg zzbgVar) {
        this(zzbkVar, str, obj);
    }
}
