package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class d1 {
    private static final java.lang.String a = "BF/";

    public static void a(java.lang.String str, java.lang.String str2) {
        android.util.Log.d(a + str, str2);
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e(a + str, str2, th);
    }

    public static void a(java.lang.Throwable th) {
        android.util.Log.e("BF/Exception", android.util.Log.getStackTraceString(th));
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        android.util.Log.e(a + str, str2);
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        android.util.Log.i(a + str, str2);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        android.util.Log.w(a + str, str2);
    }
}
