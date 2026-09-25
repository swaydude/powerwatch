package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class a {
    public static boolean a = false;
    private static java.lang.String b = "BaiduApiAuth";

    public static java.lang.String a() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[2];
        return stackTraceElement.getFileName() + "[" + stackTraceElement.getLineNumber() + "]";
    }

    public static void a(java.lang.String str) {
        if (!a || java.lang.Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        android.util.Log.d(b, a() + ";" + str);
    }

    public static void b(java.lang.String str) {
        if (java.lang.Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        android.util.Log.i(b, str);
    }

    public static void c(java.lang.String str) {
        if (!a || java.lang.Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        android.util.Log.e(b, a() + ";" + str);
    }
}
