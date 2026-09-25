package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcl<T> {
    private static android.content.Context zzb = null;
    private static boolean zzc = false;
    private static com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzcy<com.google.android.gms.internal.measurement.zzch>> zzd;
    private final com.google.android.gms.internal.measurement.zzcr zze;
    private final java.lang.String zzf;
    private final T zzg;
    private volatile int zzi;
    private volatile T zzj;
    private static final java.lang.Object zza = new java.lang.Object();
    private static final java.util.concurrent.atomic.AtomicInteger zzh = new java.util.concurrent.atomic.AtomicInteger();

    public static void zza(android.content.Context context) {
        synchronized (zza) {
            android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzb != context) {
                com.google.android.gms.internal.measurement.zzbx.zzc();
                com.google.android.gms.internal.measurement.zzcu.zza();
                com.google.android.gms.internal.measurement.zzcg.zza();
                zzh.incrementAndGet();
                zzb = context;
                zzd = com.google.android.gms.internal.measurement.zzdc.zza(com.google.android.gms.internal.measurement.zzco.zza);
            }
        }
    }

    abstract T zza(java.lang.Object obj);

    static void zza() {
        zzh.incrementAndGet();
    }

    private zzcl(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, T t) {
        this.zzi = -1;
        if (zzcrVar.zzb == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zze = zzcrVar;
        this.zzf = str;
        this.zzg = t;
    }

    private final java.lang.String zza(java.lang.String str) {
        if (str != null && str.isEmpty()) {
            return this.zzf;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzf);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
    }

    public final java.lang.String zzb() {
        return zza(this.zze.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:25:0x005e, B:27:0x0068, B:45:0x00b9, B:47:0x00c7, B:49:0x00dd, B:50:0x00e0, B:51:0x00e4, B:38:0x009a, B:40:0x00ae, B:44:0x00b7, B:23:0x0056, B:28:0x006d, B:30:0x0076, B:32:0x0088, B:34:0x0093, B:33:0x008d, B:52:0x00e9, B:53:0x00f0, B:54:0x00f1), top: B:61:0x000b }] */
    public final T zzc() {
        T tZza;
        java.lang.Object objZza;
        com.google.android.gms.internal.measurement.zzcy<com.google.android.gms.internal.measurement.zzch> zzcyVarZza;
        java.lang.String strZza;
        com.google.android.gms.internal.measurement.zzcb zzcbVarZza;
        java.lang.Object objZza2;
        int i = zzh.get();
        if (this.zzi < i) {
            synchronized (this) {
                if (this.zzi < i) {
                    android.content.Context context = zzb;
                    if (context == null) {
                        throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    java.lang.String str = (java.lang.String) com.google.android.gms.internal.measurement.zzcg.zza(context).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    if (!(str != null && com.google.android.gms.internal.measurement.zzbw.zzb.matcher(str).matches())) {
                        if (this.zze.zzb != null) {
                            zzcbVarZza = com.google.android.gms.internal.measurement.zzcj.zza(zzb, this.zze.zzb) ? com.google.android.gms.internal.measurement.zzbx.zza(zzb.getContentResolver(), this.zze.zzb) : null;
                        } else {
                            zzcbVarZza = com.google.android.gms.internal.measurement.zzcu.zza(zzb, (java.lang.String) null);
                        }
                        if (zzcbVarZza != null && (objZza2 = zzcbVarZza.zza(zzb())) != null) {
                            tZza = zza(objZza2);
                        }
                        if (tZza == null) {
                            objZza = com.google.android.gms.internal.measurement.zzcg.zza(zzb).zza(zza(this.zze.zzc));
                            if (objZza != null) {
                                tZza = zza(objZza);
                            } else {
                                tZza = null;
                            }
                            if (tZza != null) {
                                tZza = this.zzg;
                            }
                        }
                        zzcyVarZza = zzd.zza();
                        if (zzcyVarZza.zza()) {
                            strZza = zzcyVarZza.zzb().zza(this.zze.zzb, null, this.zze.zzd, this.zzf);
                            if (strZza == null) {
                                tZza = this.zzg;
                            } else {
                                tZza = zza((java.lang.Object) strZza);
                            }
                        }
                        this.zzj = tZza;
                        this.zzi = i;
                    } else if (android.util.Log.isLoggable("PhenotypeFlag", 3)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(zzb());
                        android.util.Log.d("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new java.lang.String("Bypass reading Phenotype values for flag: "));
                    }
                    tZza = null;
                    if (tZza == null) {
                        objZza = com.google.android.gms.internal.measurement.zzcg.zza(zzb).zza(zza(this.zze.zzc));
                        if (objZza != null) {
                            tZza = zza(objZza);
                        } else {
                            tZza = null;
                        }
                        if (tZza != null) {
                            tZza = this.zzg;
                        }
                    }
                    zzcyVarZza = zzd.zza();
                    if (zzcyVarZza.zza()) {
                        strZza = zzcyVarZza.zzb().zza(this.zze.zzb, null, this.zze.zzd, this.zzf);
                        if (strZza == null) {
                            tZza = this.zzg;
                        } else {
                            tZza = zza((java.lang.Object) strZza);
                        }
                    }
                    this.zzj = tZza;
                    this.zzi = i;
                }
            }
        }
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzb(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, long j) {
        return new com.google.android.gms.internal.measurement.zzcn(zzcrVar, str, java.lang.Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.measurement.zzcq(zzcrVar, str, java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.measurement.zzcl<java.lang.Double> zzb(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, double d) {
        return new com.google.android.gms.internal.measurement.zzcp(zzcrVar, str, java.lang.Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.measurement.zzcl<java.lang.String> zzb(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.measurement.zzcs(zzcrVar, str, str2);
    }

    static final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzd() {
        new com.google.android.gms.internal.measurement.zzck();
        return com.google.android.gms.internal.measurement.zzck.zza(zzb);
    }

    /* synthetic */ zzcl(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.measurement.zzcn zzcnVar) {
        this(zzcrVar, str, obj);
    }
}
