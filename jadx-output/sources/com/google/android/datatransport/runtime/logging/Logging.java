package com.google.android.datatransport.runtime.logging;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Logging {
    private Logging() {
    }

    private static java.lang.String getTag(java.lang.String str) {
        return "TransportRuntime." + str;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        android.util.Log.d(getTag(str), str2);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        android.util.Log.d(getTag(str), java.lang.String.format(str2, obj));
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        android.util.Log.d(getTag(str), java.lang.String.format(str2, obj, obj2));
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        android.util.Log.d(getTag(str), java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        android.util.Log.i(getTag(str), str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e(getTag(str), str2, th);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        android.util.Log.w(getTag(str), java.lang.String.format(str2, obj));
    }
}
