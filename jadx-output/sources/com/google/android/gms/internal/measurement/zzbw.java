package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzbw {
    private static java.util.HashMap<java.lang.String, java.lang.String> zzf;
    private static java.lang.Object zzk;
    private static boolean zzl;
    public static final android.net.Uri zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static final android.net.Uri zzd = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzg = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzh = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> zzi = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Float> zzj = new java.util.HashMap<>();
    private static java.lang.String[] zzm = new java.lang.String[0];

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.measurement.zzbw.class) {
            if (zzf == null) {
                zze.set(false);
                zzf = new java.util.HashMap<>();
                zzk = new java.lang.Object();
                zzl = false;
                contentResolver.registerContentObserver(zza, true, new com.google.android.gms.internal.measurement.zzbv(null));
            } else if (zze.getAndSet(false)) {
                zzf.clear();
                zzg.clear();
                zzh.clear();
                zzi.clear();
                zzj.clear();
                zzk = new java.lang.Object();
                zzl = false;
            }
            java.lang.Object obj = zzk;
            if (zzf.containsKey(str)) {
                java.lang.String str3 = zzf.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : zzm) {
                if (str.startsWith(str4)) {
                    if (!zzl || zzf.isEmpty()) {
                        zzf.putAll(zza(contentResolver, zzm));
                        zzl = true;
                        if (zzf.containsKey(str)) {
                            java.lang.String str5 = zzf.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            android.database.Cursor cursorQuery = contentResolver.query(zza, null, null, new java.lang.String[]{str}, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    zza(obj, str, (java.lang.String) null);
                    return null;
                }
                java.lang.String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zza(obj, str, string);
                return string != null ? string : null;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    private static void zza(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.measurement.zzbw.class) {
            if (obj == zzk) {
                zzf.put(str, str2);
            }
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(android.content.ContentResolver contentResolver, java.lang.String... strArr) {
        android.database.Cursor cursorQuery = contentResolver.query(zzd, null, null, strArr, null);
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
}
