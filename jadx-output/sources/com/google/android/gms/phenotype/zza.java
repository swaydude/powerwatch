package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    private static final java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.phenotype.zza> zzg = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.lang.String[] zzl = {"key", "value"};
    private final android.net.Uri uri;
    private final android.content.ContentResolver zzh;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzk;
    private final java.lang.Object zzj = new java.lang.Object();
    private final android.database.ContentObserver zzi = new com.google.android.gms.phenotype.zzb(this, null);

    private zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.zzh = contentResolver;
        this.uri = uri;
    }

    public static com.google.android.gms.phenotype.zza zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.phenotype.zza> concurrentHashMap = zzg;
        com.google.android.gms.phenotype.zza zzaVar = concurrentHashMap.get(uri);
        if (zzaVar != null) {
            return zzaVar;
        }
        com.google.android.gms.phenotype.zza zzaVar2 = new com.google.android.gms.phenotype.zza(contentResolver, uri);
        com.google.android.gms.phenotype.zza zzaVarPutIfAbsent = concurrentHashMap.putIfAbsent(uri, zzaVar2);
        if (zzaVarPutIfAbsent != null) {
            return zzaVarPutIfAbsent;
        }
        zzaVar2.zzh.registerContentObserver(zzaVar2.uri, false, zzaVar2.zzi);
        return zzaVar2;
    }

    private final java.util.Map<java.lang.String, java.lang.String> zzc() {
        java.util.HashMap map = new java.util.HashMap();
        android.database.Cursor cursorQuery = this.zzh.query(this.uri, zzl, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } catch (java.lang.Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
        }
        return map;
    }

    public final java.util.Map<java.lang.String, java.lang.String> zza() {
        java.util.Map<java.lang.String, java.lang.String> mapZzc = com.google.android.gms.phenotype.PhenotypeFlag.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzc() : this.zzk;
        if (mapZzc == null) {
            synchronized (this.zzj) {
                mapZzc = this.zzk;
                if (mapZzc == null) {
                    mapZzc = zzc();
                    this.zzk = mapZzc;
                }
            }
        }
        return mapZzc;
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzk = null;
        }
    }
}
