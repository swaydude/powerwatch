package com.google.android.gms.common.config;

/* JADX INFO: loaded from: classes.dex */
public abstract class GservicesValue<T> {
    private static final java.lang.Object sLock = new java.lang.Object();
    private static com.google.android.gms.common.config.GservicesValue.zza zzbm;
    private static int zzbn;
    private static android.content.Context zzbo;
    private static java.util.HashSet<java.lang.String> zzbp;
    protected final java.lang.String mKey;
    protected final T zzbq;
    private T zzbr = null;

    /* JADX INFO: Access modifiers changed from: private */
    interface zza {
        java.lang.Long getLong(java.lang.String str, java.lang.Long l);

        java.lang.String getString(java.lang.String str, java.lang.String str2);

        java.lang.Boolean zza(java.lang.String str, java.lang.Boolean bool);

        java.lang.Float zza(java.lang.String str, java.lang.Float f);

        java.lang.Integer zza(java.lang.String str, java.lang.Integer num);
    }

    public static boolean isInitialized() {
        synchronized (sLock) {
        }
        return false;
    }

    protected abstract T zzd(java.lang.String str);

    private static boolean zzi() {
        synchronized (sLock) {
        }
        return false;
    }

    protected GservicesValue(java.lang.String str, T t) {
        this.mKey = str;
        this.zzbq = t;
    }

    public void override(T t) {
        android.util.Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzbr = t;
        synchronized (sLock) {
            zzi();
        }
    }

    public void resetOverride() {
        this.zzbr = null;
    }

    public final T get() {
        T t = this.zzbr;
        if (t != null) {
            return t;
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.Object obj = sLock;
        synchronized (obj) {
        }
        synchronized (obj) {
            zzbp = null;
            zzbo = null;
            try {
            } catch (java.lang.Throwable th) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        try {
            T tZzd = zzd(this.mKey);
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return tZzd;
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                T tZzd2 = zzd(this.mKey);
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return tZzd2;
            } catch (java.lang.Throwable th2) {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
    }

    @java.lang.Deprecated
    public final T getBinderSafe() {
        return get();
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Boolean> value(java.lang.String str, boolean z) {
        return new com.google.android.gms.common.config.zza(str, java.lang.Boolean.valueOf(z));
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Long> value(java.lang.String str, java.lang.Long l) {
        return new com.google.android.gms.common.config.zzb(str, l);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Integer> value(java.lang.String str, java.lang.Integer num) {
        return new com.google.android.gms.common.config.zzc(str, num);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Float> value(java.lang.String str, java.lang.Float f) {
        return new com.google.android.gms.common.config.zzd(str, f);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.String> value(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.common.config.zze(str, str2);
    }
}
