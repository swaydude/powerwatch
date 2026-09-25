package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzx {
    private static volatile com.google.android.gms.internal.measurement.zzx zzb = null;
    private static java.lang.Boolean zzh = null;
    private static java.lang.Boolean zzi = null;
    private static boolean zzj = false;
    private static java.lang.Boolean zzk = null;
    private static java.lang.String zzl = "use_dynamite_api";
    private static java.lang.String zzm = "allow_remote_dynamite";
    private static boolean zzn = false;
    private static boolean zzo = false;
    protected final com.google.android.gms.common.util.Clock zza;
    private final java.lang.String zzc;
    private final java.util.concurrent.ExecutorService zzd;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zze;
    private java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzhn, com.google.android.gms.internal.measurement.zzx.zzb>> zzf;
    private int zzg;
    private boolean zzp;
    private java.lang.String zzq;
    private com.google.android.gms.internal.measurement.zzm zzr;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    class zzd implements android.app.Application.ActivityLifecycleCallbacks {
        zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbc(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbe(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbd(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbg(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbf(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbi(this, activity, zzkVar));
            android.os.Bundle bundleZzb = zzkVar.zzb(50L);
            if (bundleZzb != null) {
                bundle.putAll(bundleZzb);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.zzx.this.zza(new com.google.android.gms.internal.measurement.zzbh(this, activity));
        }
    }

    public static com.google.android.gms.internal.measurement.zzx zza(android.content.Context context) {
        return zza(context, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (android.os.Bundle) null);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    abstract class zza implements java.lang.Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;

        zza(com.google.android.gms.internal.measurement.zzx zzxVar) {
            this(true);
        }

        abstract void zza() throws android.os.RemoteException;

        protected void zzb() {
        }

        zza(boolean z) {
            this.zza = com.google.android.gms.internal.measurement.zzx.this.zza.currentTimeMillis();
            this.zzb = com.google.android.gms.internal.measurement.zzx.this.zza.elapsedRealtime();
            this.zzc = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.google.android.gms.internal.measurement.zzx.this.zzp) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.measurement.zzx.this.zza(e, false, this.zzc);
                zzb();
            }
        }
    }

    public static com.google.android.gms.internal.measurement.zzx zza(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (zzb == null) {
            synchronized (com.google.android.gms.internal.measurement.zzx.class) {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzx(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    static class zzb extends com.google.android.gms.internal.measurement.zzr {
        private final com.google.android.gms.measurement.internal.zzhn zza;

        zzb(com.google.android.gms.measurement.internal.zzhn zzhnVar) {
            this.zza = zzhnVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
            this.zza.onEvent(str, str2, bundle, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        public final int zza() {
            return java.lang.System.identityHashCode(this.zza);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    static class zzc extends com.google.android.gms.internal.measurement.zzr {
        private final com.google.android.gms.measurement.internal.zzho zza;

        zzc(com.google.android.gms.measurement.internal.zzho zzhoVar) {
            this.zza = zzhoVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
            this.zza.interceptEvent(str, str2, bundle, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        public final int zza() {
            return java.lang.System.identityHashCode(this.zza);
        }
    }

    public final com.google.android.gms.measurement.api.AppMeasurementSdk zza() {
        return this.zze;
    }

    private zzx(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        if (str == null || !zzc(str2, str3)) {
            this.zzc = "FA";
        } else {
            this.zzc = str;
        }
        this.zza = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzd = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
        this.zze = new com.google.android.gms.measurement.api.AppMeasurementSdk(this);
        if (!(!zzf(context) || zzk())) {
            this.zzq = null;
            this.zzp = true;
            android.util.Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!zzc(str2, str3)) {
            this.zzq = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    android.util.Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                android.util.Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.zzq = str2;
        }
        zza(new com.google.android.gms.internal.measurement.zzaa(this, str2, str3, context, bundle));
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        if (application == null) {
            android.util.Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new com.google.android.gms.internal.measurement.zzx.zzd());
        }
    }

    private static boolean zzf(android.content.Context context) {
        try {
            com.google.android.gms.common.api.internal.GoogleServices.initialize(context);
            return com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId() != null;
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzc(java.lang.String str, java.lang.String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.internal.measurement.zzx.zza zzaVar) {
        this.zzd.execute(zzaVar);
    }

    protected final com.google.android.gms.internal.measurement.zzm zza(android.content.Context context, boolean z) {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy;
        try {
            if (z) {
                versionPolicy = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION;
            } else {
                versionPolicy = com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL;
            }
            return com.google.android.gms.internal.measurement.zzl.asInterface(com.google.android.gms.dynamite.DynamiteModule.load(context, versionPolicy, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            zza((java.lang.Exception) e, true, false);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzg(android.content.Context context) {
        return com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(android.content.Context context) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.Exception exc, boolean z, boolean z2) {
        this.zzp |= z;
        if (z) {
            android.util.Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zza(5, "Error with data collection. Data lost.", exc, (java.lang.Object) null, (java.lang.Object) null);
        }
        android.util.Log.w(this.zzc, "Error with data collection. Data lost.", exc);
    }

    private static boolean zzk() {
        try {
            java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public final void zza(com.google.android.gms.measurement.internal.zzho zzhoVar) {
        zza(new com.google.android.gms.internal.measurement.zzaj(this, zzhoVar));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhnVar);
        zza(new com.google.android.gms.internal.measurement.zzaw(this, zzhnVar));
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhnVar);
        zza(new com.google.android.gms.internal.measurement.zzax(this, zzhnVar));
    }

    public final void zza(java.lang.String str, android.os.Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, java.lang.Long.valueOf(j));
    }

    private final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, java.lang.Long l) {
        zza(new com.google.android.gms.internal.measurement.zzba(this, l, str, str2, bundle, z, z2));
    }

    public final void zza(java.lang.String str, java.lang.String str2) {
        zza((java.lang.String) null, str, (java.lang.Object) str2, false);
    }

    public final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        zza(str, str2, obj, true);
    }

    private final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zza(new com.google.android.gms.internal.measurement.zzaz(this, str, str2, obj, z));
    }

    public final void zza(android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.measurement.zzbb(this, bundle));
    }

    public final void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.measurement.zzz(this, str, str2, bundle));
    }

    public final java.util.List<android.os.Bundle> zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzac(this, str, str2, zzkVar));
        java.util.List<android.os.Bundle> list = (java.util.List) com.google.android.gms.internal.measurement.zzk.zza(zzkVar.zzb(5000L), java.util.List.class);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public final void zza(java.lang.String str) {
        zza(new com.google.android.gms.internal.measurement.zzab(this, str));
    }

    public final void zza(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        zza(new com.google.android.gms.internal.measurement.zzae(this, activity, str, str2));
    }

    public final void zza(boolean z) {
        zza(new com.google.android.gms.internal.measurement.zzad(this, z));
    }

    public final void zzb() {
        zza(new com.google.android.gms.internal.measurement.zzag(this));
    }

    public final void zza(long j) {
        zza(new com.google.android.gms.internal.measurement.zzaf(this, j));
    }

    public final void zzb(long j) {
        zza(new com.google.android.gms.internal.measurement.zzai(this, j));
    }

    public final void zzb(java.lang.String str) {
        zza(new com.google.android.gms.internal.measurement.zzah(this, str));
    }

    public final void zzc(java.lang.String str) {
        zza(new com.google.android.gms.internal.measurement.zzak(this, str));
    }

    public final java.lang.String zzc() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzam(this, zzkVar));
        return zzkVar.zza(500L);
    }

    public final java.lang.String zzd() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzal(this, zzkVar));
        return zzkVar.zza(50L);
    }

    public final long zze() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzao(this, zzkVar));
        java.lang.Long l = (java.lang.Long) com.google.android.gms.internal.measurement.zzk.zza(zzkVar.zzb(500L), java.lang.Long.class);
        if (l == null) {
            long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int i = this.zzg + 1;
            this.zzg = i;
            return jNextLong + ((long) i);
        }
        return l.longValue();
    }

    public final java.lang.String zzf() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzan(this, zzkVar));
        return zzkVar.zza(500L);
    }

    public final java.lang.String zzg() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzaq(this, zzkVar));
        return zzkVar.zza(500L);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> zza(java.lang.String str, java.lang.String str2, boolean z) {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzap(this, str, str2, z, zzkVar));
        android.os.Bundle bundleZzb = zzkVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap map = new java.util.HashMap(bundleZzb.size());
        for (java.lang.String str3 : bundleZzb.keySet()) {
            java.lang.Object obj = bundleZzb.get(str3);
            if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zza(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        zza(new com.google.android.gms.internal.measurement.zzas(this, false, 5, str, obj, null, null));
    }

    public final android.os.Bundle zza(android.os.Bundle bundle, boolean z) {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzar(this, bundle, zzkVar));
        if (z) {
            return zzkVar.zzb(5000L);
        }
        return null;
    }

    public final int zzd(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzau(this, str, zzkVar));
        java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.measurement.zzk.zza(zzkVar.zzb(10000L), java.lang.Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final java.lang.String zzh() {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzat(this, zzkVar));
        return zzkVar.zza(120000L);
    }

    public final java.lang.String zzi() {
        return this.zzq;
    }

    public final java.lang.Object zza(int i) {
        com.google.android.gms.internal.measurement.zzk zzkVar = new com.google.android.gms.internal.measurement.zzk();
        zza(new com.google.android.gms.internal.measurement.zzav(this, zzkVar, i));
        return com.google.android.gms.internal.measurement.zzk.zza(zzkVar.zzb(15000L), java.lang.Object.class);
    }

    public final void zzb(boolean z) {
        zza(new com.google.android.gms.internal.measurement.zzay(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzi(android.content.Context context) {
        synchronized (com.google.android.gms.internal.measurement.zzx.class) {
            try {
                if (zzh == null || zzi == null) {
                    if (zza(context, "app_measurement_internal_disable_startup_flags")) {
                        zzh = false;
                        zzi = false;
                        return;
                    }
                    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    zzh = java.lang.Boolean.valueOf(sharedPreferences.getBoolean(zzl, false));
                    zzi = java.lang.Boolean.valueOf(sharedPreferences.getBoolean(zzm, false));
                    android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove(zzl);
                    editorEdit.remove(zzm);
                    editorEdit.apply();
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                zzh = false;
                zzi = false;
            }
        }
    }

    public static boolean zzb(android.content.Context context) {
        zzi(context);
        synchronized (com.google.android.gms.internal.measurement.zzx.class) {
            if (!zzj) {
                try {
                    try {
                        java.lang.String str = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, "measurement.dynamite.enabled", "");
                        if ("true".equals(str)) {
                            zzk = true;
                        } else if ("false".equals(str)) {
                            zzk = false;
                        } else {
                            zzk = null;
                        }
                        zzj = true;
                    } catch (java.lang.Exception e) {
                        android.util.Log.e("FA", "Unable to call SystemProperties.get()", e);
                        zzk = null;
                        zzj = true;
                    }
                } catch (java.lang.Throwable th) {
                    zzj = true;
                    throw th;
                }
            }
        }
        java.lang.Boolean bool = zzk;
        if (bool == null) {
            bool = zzh;
        }
        return bool.booleanValue();
    }

    private static boolean zza(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        try {
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
