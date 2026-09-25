package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbx implements com.google.android.gms.internal.measurement.zzcb {
    private static final java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzbx> zza = new androidx.collection.ArrayMap();
    private static final java.lang.String[] zzh = {"key", "value"};
    private final android.content.ContentResolver zzb;
    private final android.net.Uri zzc;
    private final android.database.ContentObserver zzd;
    private final java.lang.Object zze;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzf;
    private final java.util.List<com.google.android.gms.internal.measurement.zzcc> zzg;

    private zzbx(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz(this, null);
        this.zzd = zzbzVar;
        this.zze = new java.lang.Object();
        this.zzg = new java.util.ArrayList();
        this.zzb = contentResolver;
        this.zzc = uri;
        contentResolver.registerContentObserver(uri, false, zzbzVar);
    }

    public static com.google.android.gms.internal.measurement.zzbx zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.measurement.zzbx zzbxVar;
        synchronized (com.google.android.gms.internal.measurement.zzbx.class) {
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzbx> map = zza;
            zzbxVar = map.get(uri);
            if (zzbxVar == null) {
                try {
                    com.google.android.gms.internal.measurement.zzbx zzbxVar2 = new com.google.android.gms.internal.measurement.zzbx(contentResolver, uri);
                    try {
                        map.put(uri, zzbxVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzbxVar = zzbxVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzbxVar;
    }

    public final java.util.Map<java.lang.String, java.lang.String> zza() {
        java.util.Map<java.lang.String, java.lang.String> mapZze = this.zzf;
        if (mapZze == null) {
            synchronized (this.zze) {
                mapZze = this.zzf;
                if (mapZze == null) {
                    mapZze = zze();
                    this.zzf = mapZze;
                }
            }
        }
        return mapZze != null ? mapZze : java.util.Collections.emptyMap();
    }

    public final void zzb() {
        synchronized (this.zze) {
            this.zzf = null;
            com.google.android.gms.internal.measurement.zzcl.zza();
        }
        synchronized (this) {
            java.util.Iterator<com.google.android.gms.internal.measurement.zzcc> it = this.zzg.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    private final java.util.Map<java.lang.String, java.lang.String> zze() {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return (java.util.Map) com.google.android.gms.internal.measurement.zzce.zza(new com.google.android.gms.internal.measurement.zzcd(this) { // from class: com.google.android.gms.internal.measurement.zzca
                private final com.google.android.gms.internal.measurement.zzbx zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.measurement.zzcd
                public final java.lang.Object zza() {
                    return this.zza.zzd();
                }
            });
        } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException unused) {
            android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static synchronized void zzc() {
        for (com.google.android.gms.internal.measurement.zzbx zzbxVar : zza.values()) {
            zzbxVar.zzb.unregisterContentObserver(zzbxVar.zzd);
        }
        zza.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final /* synthetic */ java.lang.Object zza(java.lang.String str) {
        return zza().get(str);
    }

    final /* synthetic */ java.util.Map zzd() {
        java.util.Map map;
        android.database.Cursor cursorQuery = this.zzb.query(this.zzc, zzh, null, null, null);
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
