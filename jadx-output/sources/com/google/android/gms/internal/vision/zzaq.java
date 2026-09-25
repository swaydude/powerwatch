package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaq implements com.google.android.gms.internal.vision.zzau {
    private static final java.util.Map<android.net.Uri, com.google.android.gms.internal.vision.zzaq> zzfj = new androidx.collection.ArrayMap();
    private static final java.lang.String[] zzfp = {"key", "value"};
    private final android.net.Uri uri;
    private final android.content.ContentResolver zzfk;
    private final android.database.ContentObserver zzfl;
    private final java.lang.Object zzfm;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzfn;
    private final java.util.List<com.google.android.gms.internal.vision.zzar> zzfo;

    private zzaq(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.vision.zzas zzasVar = new com.google.android.gms.internal.vision.zzas(this, null);
        this.zzfl = zzasVar;
        this.zzfm = new java.lang.Object();
        this.zzfo = new java.util.ArrayList();
        this.zzfk = contentResolver;
        this.uri = uri;
        contentResolver.registerContentObserver(uri, false, zzasVar);
    }

    public static com.google.android.gms.internal.vision.zzaq zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.vision.zzaq zzaqVar;
        synchronized (com.google.android.gms.internal.vision.zzaq.class) {
            java.util.Map<android.net.Uri, com.google.android.gms.internal.vision.zzaq> map = zzfj;
            zzaqVar = map.get(uri);
            if (zzaqVar == null) {
                try {
                    com.google.android.gms.internal.vision.zzaq zzaqVar2 = new com.google.android.gms.internal.vision.zzaq(contentResolver, uri);
                    try {
                        map.put(uri, zzaqVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzaqVar = zzaqVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzaqVar;
    }

    private final java.util.Map<java.lang.String, java.lang.String> zzu() {
        java.util.Map<java.lang.String, java.lang.String> mapZzw = this.zzfn;
        if (mapZzw == null) {
            synchronized (this.zzfm) {
                mapZzw = this.zzfn;
                if (mapZzw == null) {
                    mapZzw = zzw();
                    this.zzfn = mapZzw;
                }
            }
        }
        return mapZzw != null ? mapZzw : java.util.Collections.emptyMap();
    }

    public final void zzv() {
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

    private final java.util.Map<java.lang.String, java.lang.String> zzw() {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return (java.util.Map) com.google.android.gms.internal.vision.zzat.zza(new com.google.android.gms.internal.vision.zzaw(this) { // from class: com.google.android.gms.internal.vision.zzap
                private final com.google.android.gms.internal.vision.zzaq zzfi;

                {
                    this.zzfi = this;
                }

                @Override // com.google.android.gms.internal.vision.zzaw
                public final java.lang.Object zzt() {
                    return this.zzfi.zzy();
                }
            });
        } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException unused) {
            android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static synchronized void zzx() {
        for (com.google.android.gms.internal.vision.zzaq zzaqVar : zzfj.values()) {
            zzaqVar.zzfk.unregisterContentObserver(zzaqVar.zzfl);
        }
        zzfj.clear();
    }

    @Override // com.google.android.gms.internal.vision.zzau
    public final /* synthetic */ java.lang.Object zzb(java.lang.String str) {
        return zzu().get(str);
    }

    final /* synthetic */ java.util.Map zzy() {
        java.util.Map map;
        android.database.Cursor cursorQuery = this.zzfk.query(this.uri, zzfp, null, null, null);
        if (cursorQuery == null) {
            return java.util.Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return java.util.Collections.emptyMap();
            }
            if (count <= 256) {
                map = new androidx.collection.ArrayMap(count);
            } else {
                map = new java.util.HashMap(count, 1.0f);
            }
            while (cursorQuery.moveToNext()) {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return map;
        } finally {
            cursorQuery.close();
        }
    }
}
