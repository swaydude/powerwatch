package com.baidu.platform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 621133959;

    public static boolean a(android.content.Context context) {
        return c(context);
    }

    private static int b(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 64).signatures[0].hashCode();
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    private static boolean c(android.content.Context context) {
        return b(context) == a;
    }
}
