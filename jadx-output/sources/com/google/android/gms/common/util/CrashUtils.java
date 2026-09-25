package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CrashUtils {
    private static final java.lang.String[] zzgg = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static android.os.DropBoxManager zzgh = null;
    private static boolean zzgi = false;
    private static int zzgj = -1;
    private static int zzgk = 0;
    private static int zzgl = 0;

    public static boolean addDynamiteErrorToDropBox(android.content.Context context, java.lang.Throwable th) {
        return zza(context, th, 536870912);
    }

    private static boolean zza(android.content.Context context, java.lang.Throwable th, int i) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(th);
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
