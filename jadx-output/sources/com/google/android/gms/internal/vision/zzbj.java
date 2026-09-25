package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbj implements com.google.android.gms.internal.vision.zzau {
    private static final java.util.Map<java.lang.String, com.google.android.gms.internal.vision.zzbj> zzgh = new androidx.collection.ArrayMap();
    private final java.lang.Object zzfm;
    private volatile java.util.Map<java.lang.String, ?> zzfn;
    private final java.util.List<com.google.android.gms.internal.vision.zzar> zzfo;
    private final android.content.SharedPreferences zzgi;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener zzgj;

    static com.google.android.gms.internal.vision.zzbj zzb(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.vision.zzbj zzbjVar;
        android.content.SharedPreferences sharedPreferences;
        if (!((!com.google.android.gms.internal.vision.zzan.zzs() || str.startsWith("direct_boot:")) ? true : com.google.android.gms.internal.vision.zzan.isUserUnlocked(context))) {
            return null;
        }
        synchronized (com.google.android.gms.internal.vision.zzbj.class) {
            java.util.Map<java.lang.String, com.google.android.gms.internal.vision.zzbj> map = zzgh;
            zzbjVar = map.get(str);
            if (zzbjVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (com.google.android.gms.internal.vision.zzan.zzs()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                zzbjVar = new com.google.android.gms.internal.vision.zzbj(sharedPreferences);
                map.put(str, zzbjVar);
            }
        }
        return zzbjVar;
    }

    private zzbj(android.content.SharedPreferences sharedPreferences) {
        android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.vision.zzbm
            private final com.google.android.gms.internal.vision.zzbj zzha;

            {
                this.zzha = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences2, java.lang.String str) {
                this.zzha.zza(sharedPreferences2, str);
            }
        };
        this.zzgj = onSharedPreferenceChangeListener;
        this.zzfm = new java.lang.Object();
        this.zzfo = new java.util.ArrayList();
        this.zzgi = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // com.google.android.gms.internal.vision.zzau
    public final java.lang.Object zzb(java.lang.String str) {
        java.util.Map<java.lang.String, ?> all = this.zzfn;
        if (all == null) {
            synchronized (this.zzfm) {
                all = this.zzfn;
                if (all == null) {
                    all = this.zzgi.getAll();
                    this.zzfn = all;
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }

    static synchronized void zzx() {
        for (com.google.android.gms.internal.vision.zzbj zzbjVar : zzgh.values()) {
            zzbjVar.zzgi.unregisterOnSharedPreferenceChangeListener(zzbjVar.zzgj);
        }
        zzgh.clear();
    }

    final /* synthetic */ void zza(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.zzfm) {
            this.zzfn = null;
            com.google.android.gms.internal.vision.zzbe.zzab();
        }
        synchronized (this) {
            java.util.Iterator<com.google.android.gms.internal.vision.zzar> it = this.zzfo.iterator();
            while (it.hasNext()) {
                it.next().zzz();
            }
        }
    }
}
