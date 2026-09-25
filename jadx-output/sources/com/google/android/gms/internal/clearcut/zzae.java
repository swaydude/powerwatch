package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzae<T> {
    private static final java.lang.Object zzdn = new java.lang.Object();
    private static boolean zzdo = false;
    private static volatile java.lang.Boolean zzdp;
    private static volatile java.lang.Boolean zzdq;
    private static android.content.Context zzh;
    private final com.google.android.gms.internal.clearcut.zzao zzdr;
    final java.lang.String zzds;
    private final java.lang.String zzdt;
    private final T zzdu;
    private T zzdv;
    private volatile com.google.android.gms.internal.clearcut.zzab zzdw;
    private volatile android.content.SharedPreferences zzdx;

    private zzae(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, T t) {
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        if (zzaoVar.zzef == null && zzaoVar.zzeg == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzaoVar.zzef != null && zzaoVar.zzeg != null) {
            throw new java.lang.IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzdr = zzaoVar;
        java.lang.String strValueOf = java.lang.String.valueOf(zzaoVar.zzeh);
        java.lang.String strValueOf2 = java.lang.String.valueOf(str);
        this.zzdt = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
        java.lang.String strValueOf3 = java.lang.String.valueOf(zzaoVar.zzei);
        java.lang.String strValueOf4 = java.lang.String.valueOf(str);
        this.zzds = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new java.lang.String(strValueOf3);
        this.zzdu = t;
    }

    /* synthetic */ zzae(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzai zzaiVar) {
        this(zzaoVar, str, obj);
    }

    public static void maybeInit(android.content.Context context) {
        android.content.Context applicationContext;
        if (zzh == null) {
            synchronized (zzdn) {
                if ((android.os.Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (zzh != context) {
                    zzdp = null;
                }
                zzh = context;
            }
            zzdo = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> com.google.android.gms.internal.clearcut.zzae<T> zza(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, T t, com.google.android.gms.internal.clearcut.zzan<T> zzanVar) {
        return new com.google.android.gms.internal.clearcut.zzal(zzaoVar, str, t, zzanVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.clearcut.zzae<java.lang.String> zza(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.clearcut.zzak(zzaoVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.clearcut.zzae<java.lang.Boolean> zza(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.clearcut.zzaj(zzaoVar, str, java.lang.Boolean.valueOf(z));
    }

    private static <V> V zza(com.google.android.gms.internal.clearcut.zzam<V> zzamVar) {
        try {
            return zzamVar.zzp();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzamVar.zzp();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean zza(final java.lang.String str, boolean z) {
        final boolean z2 = false;
        if (zzn()) {
            return ((java.lang.Boolean) zza(new com.google.android.gms.internal.clearcut.zzam(str, z2) { // from class: com.google.android.gms.internal.clearcut.zzah
                private final java.lang.String zzea;
                private final boolean zzeb = false;

                {
                    this.zzea = str;
                }

                @Override // com.google.android.gms.internal.clearcut.zzam
                public final java.lang.Object zzp() {
                    return java.lang.Boolean.valueOf(com.google.android.gms.internal.clearcut.zzy.zza(com.google.android.gms.internal.clearcut.zzae.zzh.getContentResolver(), this.zzea, this.zzeb));
                }
            })).booleanValue();
        }
        return false;
    }

    @javax.annotation.Nullable
    private final T zzl() {
        boolean zBooleanValue;
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzds);
            android.util.Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new java.lang.String("Bypass reading Phenotype values for flag: "));
        } else if (this.zzdr.zzeg != null) {
            if (this.zzdw == null) {
                this.zzdw = com.google.android.gms.internal.clearcut.zzab.zza(zzh.getContentResolver(), this.zzdr.zzeg);
            }
            final com.google.android.gms.internal.clearcut.zzab zzabVar = this.zzdw;
            java.lang.String str = (java.lang.String) zza(new com.google.android.gms.internal.clearcut.zzam(this, zzabVar) { // from class: com.google.android.gms.internal.clearcut.zzaf
                private final com.google.android.gms.internal.clearcut.zzae zzdy;
                private final com.google.android.gms.internal.clearcut.zzab zzdz;

                {
                    this.zzdy = this;
                    this.zzdz = zzabVar;
                }

                @Override // com.google.android.gms.internal.clearcut.zzam
                public final java.lang.Object zzp() {
                    return this.zzdz.zzg().get(this.zzdy.zzds);
                }
            });
            if (str != null) {
                return zzb(str);
            }
        } else if (this.zzdr.zzef != null) {
            if (android.os.Build.VERSION.SDK_INT < 24 || zzh.isDeviceProtectedStorage()) {
                zBooleanValue = true;
            } else {
                if (zzdq == null || !zzdq.booleanValue()) {
                    zzdq = java.lang.Boolean.valueOf(((android.os.UserManager) zzh.getSystemService(android.os.UserManager.class)).isUserUnlocked());
                }
                zBooleanValue = zzdq.booleanValue();
            }
            if (!zBooleanValue) {
                return null;
            }
            if (this.zzdx == null) {
                this.zzdx = zzh.getSharedPreferences(this.zzdr.zzef, 0);
            }
            android.content.SharedPreferences sharedPreferences = this.zzdx;
            if (sharedPreferences.contains(this.zzds)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    private final T zzm() {
        java.lang.String str;
        if (this.zzdr.zzej || !zzn() || (str = (java.lang.String) zza(new com.google.android.gms.internal.clearcut.zzam(this) { // from class: com.google.android.gms.internal.clearcut.zzag
            private final com.google.android.gms.internal.clearcut.zzae zzdy;

            {
                this.zzdy = this;
            }

            @Override // com.google.android.gms.internal.clearcut.zzam
            public final java.lang.Object zzp() {
                return this.zzdy.zzo();
            }
        })) == null) {
            return null;
        }
        return zzb(str);
    }

    private static boolean zzn() {
        if (zzdp == null) {
            android.content.Context context = zzh;
            if (context == null) {
                return false;
            }
            zzdp = java.lang.Boolean.valueOf(androidx.core.content.PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzdp.booleanValue();
    }

    public final T get() {
        if (zzh == null) {
            throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.zzdr.zzek) {
            T tZzm = zzm();
            if (tZzm != null) {
                return tZzm;
            }
            T tZzl = zzl();
            if (tZzl != null) {
                return tZzl;
            }
        } else {
            T tZzl2 = zzl();
            if (tZzl2 != null) {
                return tZzl2;
            }
            T tZzm2 = zzm();
            if (tZzm2 != null) {
                return tZzm2;
            }
        }
        return this.zzdu;
    }

    protected abstract T zza(android.content.SharedPreferences sharedPreferences);

    protected abstract T zzb(java.lang.String str);

    final /* synthetic */ java.lang.String zzo() {
        return com.google.android.gms.internal.clearcut.zzy.zza(zzh.getContentResolver(), this.zzdt, (java.lang.String) null);
    }
}
