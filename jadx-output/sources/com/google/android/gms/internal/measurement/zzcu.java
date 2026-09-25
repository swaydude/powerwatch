package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcu implements com.google.android.gms.internal.measurement.zzcb {
    private static final java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzcu> zza = new androidx.collection.ArrayMap();
    private final android.content.SharedPreferences zzb;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final java.lang.Object zzd;
    private volatile java.util.Map<java.lang.String, ?> zze;
    private final java.util.List<com.google.android.gms.internal.measurement.zzcc> zzf;

    static com.google.android.gms.internal.measurement.zzcu zza(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        if (!((!com.google.android.gms.internal.measurement.zzby.zza() || str.startsWith("direct_boot:")) ? true : com.google.android.gms.internal.measurement.zzby.zza(context))) {
            return null;
        }
        synchronized (com.google.android.gms.internal.measurement.zzcu.class) {
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzcu> map = zza;
            zzcuVar = map.get(str);
            if (zzcuVar == null) {
                zzcuVar = new com.google.android.gms.internal.measurement.zzcu(zzb(context, str));
                map.put(str, zzcuVar);
            }
        }
        return zzcuVar;
    }

    private static android.content.SharedPreferences zzb(android.content.Context context, java.lang.String str) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (com.google.android.gms.internal.measurement.zzby.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            return context.getSharedPreferences(str, 0);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private zzcu(android.content.SharedPreferences sharedPreferences) {
        android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzct
            private final com.google.android.gms.internal.measurement.zzcu zza;

            {
                this.zza = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences2, java.lang.String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzc = onSharedPreferenceChangeListener;
        this.zzd = new java.lang.Object();
        this.zzf = new java.util.ArrayList();
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final java.lang.Object zza(java.lang.String str) {
        java.util.Map<java.lang.String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        java.util.Map<java.lang.String, ?> all = this.zzb.getAll();
                        this.zze = all;
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    static synchronized void zza() {
        for (com.google.android.gms.internal.measurement.zzcu zzcuVar : zza.values()) {
            zzcuVar.zzb.unregisterOnSharedPreferenceChangeListener(zzcuVar.zzc);
        }
        zza.clear();
    }

    final /* synthetic */ void zza(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.zzd) {
            this.zze = null;
            com.google.android.gms.internal.measurement.zzcl.zza();
        }
        synchronized (this) {
            java.util.Iterator<com.google.android.gms.internal.measurement.zzcc> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
