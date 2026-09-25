package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzy {
    private static java.util.HashMap<java.lang.String, java.lang.String> zzcu;
    private static java.lang.Object zzcz;
    private static boolean zzda;
    private static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static final android.net.Uri zzcq = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzcr = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzcs = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzct = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzcv = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzcw = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> zzcx = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Float> zzcy = new java.util.HashMap<>();
    private static java.lang.String[] zzdb = new java.lang.String[0];

    public static long getLong(android.content.ContentResolver contentResolver, java.lang.String str, long j) {
        java.lang.Object objZzb = zzb(contentResolver);
        long j2 = 0;
        java.lang.Long lValueOf = (java.lang.Long) zza((java.util.HashMap<java.lang.String, long>) zzcx, str, 0L);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        java.lang.String strZza = zza(contentResolver, str, (java.lang.String) null);
        if (strZza != null) {
            try {
                long j3 = java.lang.Long.parseLong(strZza);
                lValueOf = java.lang.Long.valueOf(j3);
                j2 = j3;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        zza(objZzb, zzcx, str, lValueOf);
        return j2;
    }

    private static <T> T zza(java.util.HashMap<java.lang.String, T> map, java.lang.String str, T t) {
        synchronized (com.google.android.gms.internal.clearcut.zzy.class) {
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
        synchronized (com.google.android.gms.internal.clearcut.zzy.class) {
            zza(contentResolver);
            java.lang.Object obj = zzcz;
            if (zzcu.containsKey(str)) {
                java.lang.String str3 = zzcu.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : zzdb) {
                if (str.startsWith(str4)) {
                    if (!zzda || zzcu.isEmpty()) {
                        zzcu.putAll(zza(contentResolver, zzdb));
                        zzda = true;
                        if (zzcu.containsKey(str)) {
                            java.lang.String str5 = zzcu.get(str);
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
        android.database.Cursor cursorQuery = contentResolver.query(zzcq, null, null, strArr, null);
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
        if (zzcu == null) {
            zzct.set(false);
            zzcu = new java.util.HashMap<>();
            zzcz = new java.lang.Object();
            zzda = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new com.google.android.gms.internal.clearcut.zzz(null));
            return;
        }
        if (zzct.getAndSet(false)) {
            zzcu.clear();
            zzcv.clear();
            zzcw.clear();
            zzcx.clear();
            zzcy.clear();
            zzcz = new java.lang.Object();
            zzda = false;
        }
    }

    private static void zza(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.clearcut.zzy.class) {
            if (obj == zzcz) {
                zzcu.put(str, str2);
            }
        }
    }

    private static <T> void zza(java.lang.Object obj, java.util.HashMap<java.lang.String, T> map, java.lang.String str, T t) {
        synchronized (com.google.android.gms.internal.clearcut.zzy.class) {
            if (obj == zzcz) {
                map.put(str, t);
                zzcu.remove(str);
            }
        }
    }

    public static boolean zza(android.content.ContentResolver contentResolver, java.lang.String str, boolean z) {
        java.lang.Object objZzb = zzb(contentResolver);
        java.util.HashMap<java.lang.String, java.lang.Boolean> map = zzcv;
        java.lang.Boolean bool = (java.lang.Boolean) zza(map, str, java.lang.Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String strZza = zza(contentResolver, str, (java.lang.String) null);
        if (strZza != null && !strZza.equals("")) {
            if (zzcr.matcher(strZza).matches()) {
                bool = true;
                z = true;
            } else if (zzcs.matcher(strZza).matches()) {
                bool = false;
                z = false;
            } else {
                android.util.Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strZza + "\") as boolean");
            }
        }
        zza(objZzb, map, str, bool);
        return z;
    }

    private static java.lang.Object zzb(android.content.ContentResolver contentResolver) {
        java.lang.Object obj;
        synchronized (com.google.android.gms.internal.clearcut.zzy.class) {
            zza(contentResolver);
            obj = zzcz;
        }
        return obj;
    }
}
