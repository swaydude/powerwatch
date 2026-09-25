package com.google.android.gms.common.stats;

/* JADX INFO: loaded from: classes.dex */
public class StatsUtils {
    public static java.lang.String getEventKey(android.content.Context context, android.content.Intent intent) {
        return java.lang.String.valueOf(((long) java.lang.System.identityHashCode(intent)) | (((long) java.lang.System.identityHashCode(context)) << 32));
    }

    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf((((long) android.os.Process.myPid()) << 32) | ((long) java.lang.System.identityHashCode(wakeLock))));
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
    }

    static java.util.List<java.lang.String> zza(java.util.List<java.lang.String> list) {
        if (list != null && list.size() == 1 && "com.google.android.gms".equals(list.get(0))) {
            return null;
        }
        return list;
    }

    static java.lang.String zzi(java.lang.String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }
}
