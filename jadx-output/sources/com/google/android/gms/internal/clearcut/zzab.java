package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzab {
    private static final java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.internal.clearcut.zzab> zzde = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.lang.String[] zzdl = {"key", "value"};
    private final android.net.Uri uri;
    private final android.content.ContentResolver zzdf;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzdi;
    private final java.lang.Object zzdh = new java.lang.Object();
    private final java.lang.Object zzdj = new java.lang.Object();
    private final java.util.List<com.google.android.gms.internal.clearcut.zzad> zzdk = new java.util.ArrayList();
    private final android.database.ContentObserver zzdg = new com.google.android.gms.internal.clearcut.zzac(this, null);

    private zzab(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.zzdf = contentResolver;
        this.uri = uri;
    }

    public static com.google.android.gms.internal.clearcut.zzab zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.internal.clearcut.zzab> concurrentHashMap = zzde;
        com.google.android.gms.internal.clearcut.zzab zzabVar = concurrentHashMap.get(uri);
        if (zzabVar != null) {
            return zzabVar;
        }
        com.google.android.gms.internal.clearcut.zzab zzabVar2 = new com.google.android.gms.internal.clearcut.zzab(contentResolver, uri);
        com.google.android.gms.internal.clearcut.zzab zzabVarPutIfAbsent = concurrentHashMap.putIfAbsent(uri, zzabVar2);
        if (zzabVarPutIfAbsent != null) {
            return zzabVarPutIfAbsent;
        }
        zzabVar2.zzdf.registerContentObserver(zzabVar2.uri, false, zzabVar2.zzdg);
        return zzabVar2;
    }

    private final java.util.Map<java.lang.String, java.lang.String> zzi() {
        try {
            java.util.HashMap map = new java.util.HashMap();
            android.database.Cursor cursorQuery = this.zzdf.query(this.uri, zzdl, null, null, null);
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
        } catch (android.database.sqlite.SQLiteException | java.lang.SecurityException unused) {
            android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj() {
        synchronized (this.zzdj) {
            java.util.Iterator<com.google.android.gms.internal.clearcut.zzad> it = this.zzdk.iterator();
            while (it.hasNext()) {
                it.next().zzk();
            }
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> zzg() {
        java.util.Map<java.lang.String, java.lang.String> mapZzi = com.google.android.gms.internal.clearcut.zzae.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzi() : this.zzdi;
        if (mapZzi == null) {
            synchronized (this.zzdh) {
                mapZzi = this.zzdi;
                if (mapZzi == null) {
                    mapZzi = zzi();
                    this.zzdi = mapZzi;
                }
            }
        }
        return mapZzi != null ? mapZzi : java.util.Collections.emptyMap();
    }

    public final void zzh() {
        synchronized (this.zzdh) {
            this.zzdi = null;
        }
    }
}
