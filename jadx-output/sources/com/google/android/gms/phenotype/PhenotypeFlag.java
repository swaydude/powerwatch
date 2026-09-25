package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class PhenotypeFlag<T> {
    private static final java.lang.Object zzak = new java.lang.Object();
    private static android.content.Context zzal = null;
    private static boolean zzam = false;
    private static java.lang.Boolean zzan;
    private final com.google.android.gms.phenotype.PhenotypeFlag.Factory zzao;
    final java.lang.String zzap;
    private final java.lang.String zzaq;
    private final T zzar;
    private T zzas;

    public static class Factory {
        private final java.lang.String zzax;
        private final android.net.Uri zzay;
        private final java.lang.String zzaz;
        private final java.lang.String zzba;
        private final boolean zzbb;
        private final boolean zzbc;

        public Factory(android.net.Uri uri) {
            this(null, uri, "", "", false, false);
        }

        private Factory(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
            this.zzax = str;
            this.zzay = uri;
            this.zzaz = str2;
            this.zzba = str3;
            this.zzbb = z;
            this.zzbc = z2;
        }

        public com.google.android.gms.phenotype.PhenotypeFlag<java.lang.String> createFlag(java.lang.String str, java.lang.String str2) {
            return com.google.android.gms.phenotype.PhenotypeFlag.zza(this, str, str2);
        }

        public com.google.android.gms.phenotype.PhenotypeFlag.Factory withGservicePrefix(java.lang.String str) {
            boolean z = this.zzbb;
            if (z) {
                throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new com.google.android.gms.phenotype.PhenotypeFlag.Factory(this.zzax, this.zzay, str, this.zzba, z, this.zzbc);
        }

        public com.google.android.gms.phenotype.PhenotypeFlag.Factory withPhenotypePrefix(java.lang.String str) {
            return new com.google.android.gms.phenotype.PhenotypeFlag.Factory(this.zzax, this.zzay, this.zzaz, str, this.zzbb, this.zzbc);
        }
    }

    interface zza<V> {
        V zzh();
    }

    private PhenotypeFlag(com.google.android.gms.phenotype.PhenotypeFlag.Factory factory, java.lang.String str, T t) {
        this.zzas = null;
        if (factory.zzax == null && factory.zzay == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (factory.zzax != null && factory.zzay != null) {
            throw new java.lang.IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzao = factory;
        java.lang.String strValueOf = java.lang.String.valueOf(factory.zzaz);
        java.lang.String strValueOf2 = java.lang.String.valueOf(str);
        this.zzaq = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
        java.lang.String strValueOf3 = java.lang.String.valueOf(factory.zzba);
        java.lang.String strValueOf4 = java.lang.String.valueOf(str);
        this.zzap = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new java.lang.String(strValueOf3);
        this.zzar = t;
    }

    /* synthetic */ PhenotypeFlag(com.google.android.gms.phenotype.PhenotypeFlag.Factory factory, java.lang.String str, java.lang.Object obj, com.google.android.gms.phenotype.zzr zzrVar) {
        this(factory, str, obj);
    }

    public static void maybeInit(android.content.Context context) {
        android.content.Context applicationContext;
        com.google.android.gms.internal.phenotype.zzh.maybeInit(context);
        if (zzal == null) {
            com.google.android.gms.internal.phenotype.zzh.init(context);
            synchronized (zzak) {
                if ((android.os.Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (zzal != context) {
                    zzan = null;
                }
                zzal = context;
            }
            zzam = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.phenotype.PhenotypeFlag<java.lang.String> zza(com.google.android.gms.phenotype.PhenotypeFlag.Factory factory, java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.phenotype.zzs(factory, str, str2);
    }

    private static <V> V zza(com.google.android.gms.phenotype.PhenotypeFlag.zza<V> zzaVar) {
        try {
            return zzaVar.zzh();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzaVar.zzh();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean zza(final java.lang.String str, boolean z) {
        final boolean z2 = false;
        if (zzf()) {
            return ((java.lang.Boolean) zza(new com.google.android.gms.phenotype.PhenotypeFlag.zza(str, z2) { // from class: com.google.android.gms.phenotype.zzq
                private final java.lang.String zzav;
                private final boolean zzaw = false;

                {
                    this.zzav = str;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                public final java.lang.Object zzh() {
                    return java.lang.Boolean.valueOf(com.google.android.gms.internal.phenotype.zzf.zza(com.google.android.gms.phenotype.PhenotypeFlag.zzal.getContentResolver(), this.zzav, this.zzaw));
                }
            })).booleanValue();
        }
        return false;
    }

    @javax.annotation.Nullable
    private final T zzd() {
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzap);
            android.util.Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new java.lang.String("Bypass reading Phenotype values for flag: "));
        } else if (this.zzao.zzay != null) {
            final com.google.android.gms.phenotype.zza zzaVarZza = com.google.android.gms.phenotype.zza.zza(zzal.getContentResolver(), this.zzao.zzay);
            java.lang.String str = (java.lang.String) zza(new com.google.android.gms.phenotype.PhenotypeFlag.zza(this, zzaVarZza) { // from class: com.google.android.gms.phenotype.zzo
                private final com.google.android.gms.phenotype.PhenotypeFlag zzat;
                private final com.google.android.gms.phenotype.zza zzau;

                {
                    this.zzat = this;
                    this.zzau = zzaVarZza;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                public final java.lang.Object zzh() {
                    return this.zzau.zza().get(this.zzat.zzap);
                }
            });
            if (str != null) {
                return zza(str);
            }
        } else {
            if (this.zzao.zzax == null || !(android.os.Build.VERSION.SDK_INT < 24 || zzal.isDeviceProtectedStorage() || ((android.os.UserManager) zzal.getSystemService(android.os.UserManager.class)).isUserUnlocked())) {
                return null;
            }
            android.content.SharedPreferences sharedPreferences = zzal.getSharedPreferences(this.zzao.zzax, 0);
            if (sharedPreferences.contains(this.zzap)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    private final T zze() {
        java.lang.String str;
        if (this.zzao.zzbb || !zzf() || (str = (java.lang.String) zza(new com.google.android.gms.phenotype.PhenotypeFlag.zza(this) { // from class: com.google.android.gms.phenotype.zzp
            private final com.google.android.gms.phenotype.PhenotypeFlag zzat;

            {
                this.zzat = this;
            }

            @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
            public final java.lang.Object zzh() {
                return this.zzat.zzg();
            }
        })) == null) {
            return null;
        }
        return zza(str);
    }

    private static boolean zzf() {
        if (zzan == null) {
            android.content.Context context = zzal;
            if (context == null) {
                return false;
            }
            zzan = java.lang.Boolean.valueOf(androidx.core.content.PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzan.booleanValue();
    }

    public T get() {
        if (zzal == null) {
            throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.zzao.zzbc) {
            T tZze = zze();
            if (tZze != null) {
                return tZze;
            }
            T tZzd = zzd();
            if (tZzd != null) {
                return tZzd;
            }
        } else {
            T tZzd2 = zzd();
            if (tZzd2 != null) {
                return tZzd2;
            }
            T tZze2 = zze();
            if (tZze2 != null) {
                return tZze2;
            }
        }
        return this.zzar;
    }

    public abstract T zza(android.content.SharedPreferences sharedPreferences);

    public abstract T zza(java.lang.String str);

    final /* synthetic */ java.lang.String zzg() {
        return com.google.android.gms.internal.phenotype.zzf.zza(zzal.getContentResolver(), this.zzaq, (java.lang.String) null);
    }
}
