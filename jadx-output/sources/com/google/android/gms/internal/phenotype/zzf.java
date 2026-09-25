package com.google.android.gms.internal.phenotype;

/* JADX INFO: loaded from: classes.dex */
public class zzf {
    private static java.util.HashMap<java.lang.String, java.lang.String> zzbi;
    private static java.lang.Object zzbn;
    private static boolean zzbo;
    private static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static final android.net.Uri zzbe = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final java.util.regex.Pattern zzbf = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final java.util.regex.Pattern zzbg = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzbh = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzbj = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzbk = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> zzbl = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Float> zzbm = new java.util.HashMap<>();
    private static java.lang.String[] zzbp = new java.lang.String[0];

    private static <T> T zza(java.util.HashMap<java.lang.String, T> map, java.lang.String str, T t) {
        synchronized (com.google.android.gms.internal.phenotype.zzf.class) {
            if (!map.containsKey(str)) {
                return null;
            }
            T t2 = map.get(str);
            if (t2 != null) {
                t = t2;
            }
            return t;
        }
    }

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.phenotype.zzf.class) {
            zza(contentResolver);
            java.lang.Object obj = zzbn;
            if (zzbi.containsKey(str)) {
                java.lang.String str3 = zzbi.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : zzbp) {
                if (str.startsWith(str4)) {
                    if (!zzbo || zzbi.isEmpty()) {
                        zzbi.putAll(zza(contentResolver, zzbp));
                        zzbo = true;
                        if (zzbi.containsKey(str)) {
                            java.lang.String str5 = zzbi.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            android.database.Cursor cursorQuery = contentResolver.query(CONTENT_URI, null, null, new java.lang.String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        java.lang.String string = cursorQuery.getString(1);
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        zza(obj, str, string);
                        return string != null ? string : null;
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            zza(obj, str, (java.lang.String) null);
            return null;
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(android.content.ContentResolver contentResolver, java.lang.String... strArr) {
        android.database.Cursor cursorQuery = contentResolver.query(zzbe, null, null, strArr, null);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } catch (java.lang.Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return treeMap;
    }

    private static void zza(android.content.ContentResolver contentResolver) {
        if (zzbi == null) {
            zzbh.set(false);
            zzbi = new java.util.HashMap<>();
            zzbn = new java.lang.Object();
            zzbo = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new com.google.android.gms.internal.phenotype.zzg(null));
            return;
        }
        if (zzbh.getAndSet(false)) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = new java.lang.Object();
            zzbo = false;
        }
    }

    private static void zza(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.phenotype.zzf.class) {
            if (obj == zzbn) {
                zzbi.put(str, str2);
            }
        }
    }

    public static boolean zza(android.content.ContentResolver contentResolver, java.lang.String str, boolean z) {
        java.lang.Object objZzb = zzb(contentResolver);
        java.util.HashMap<java.lang.String, java.lang.Boolean> map = zzbj;
        java.lang.Boolean bool = (java.lang.Boolean) zza(map, str, java.lang.Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String strZza = zza(contentResolver, str, (java.lang.String) null);
        if (strZza != null && !strZza.equals("")) {
            if (zzbf.matcher(strZza).matches()) {
                bool = true;
                z = true;
            } else if (zzbg.matcher(strZza).matches()) {
                bool = false;
                z = false;
            } else {
                android.util.Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strZza + "\") as boolean");
            }
        }
        synchronized (com.google.android.gms.internal.phenotype.zzf.class) {
            if (objZzb == zzbn) {
                map.put(str, bool);
                zzbi.remove(str);
            }
        }
        return z;
    }

    private static java.lang.Object zzb(android.content.ContentResolver contentResolver) {
        java.lang.Object obj;
        synchronized (com.google.android.gms.internal.phenotype.zzf.class) {
            zza(contentResolver);
            obj = zzbn;
        }
        return obj;
    }
}
