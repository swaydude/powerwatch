package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzal {
    private static java.util.HashMap<java.lang.String, java.lang.String> zzex;
    private static java.lang.Object zzfc;
    private static boolean zzfd;
    public static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static final android.net.Uri zzet = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzeu = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzev = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzew = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzey = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzez = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> zzfa = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Float> zzfb = new java.util.HashMap<>();
    private static java.lang.String[] zzfe = new java.lang.String[0];

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.vision.zzal.class) {
            if (zzex == null) {
                zzew.set(false);
                zzex = new java.util.HashMap<>();
                zzfc = new java.lang.Object();
                zzfd = false;
                contentResolver.registerContentObserver(CONTENT_URI, true, new com.google.android.gms.internal.vision.zzao(null));
            } else if (zzew.getAndSet(false)) {
                zzex.clear();
                zzey.clear();
                zzez.clear();
                zzfa.clear();
                zzfb.clear();
                zzfc = new java.lang.Object();
                zzfd = false;
            }
            java.lang.Object obj = zzfc;
            if (zzex.containsKey(str)) {
                java.lang.String str3 = zzex.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : zzfe) {
                if (str.startsWith(str4)) {
                    if (!zzfd || zzex.isEmpty()) {
                        zzex.putAll(zza(contentResolver, zzfe));
                        zzfd = true;
                        if (zzex.containsKey(str)) {
                            java.lang.String str5 = zzex.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            android.database.Cursor cursorQuery = contentResolver.query(CONTENT_URI, null, null, new java.lang.String[]{str}, null);
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
        synchronized (com.google.android.gms.internal.vision.zzal.class) {
            if (obj == zzfc) {
                zzex.put(str, str2);
            }
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(android.content.ContentResolver contentResolver, java.lang.String... strArr) {
        android.database.Cursor cursorQuery = contentResolver.query(zzet, null, null, strArr, null);
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
