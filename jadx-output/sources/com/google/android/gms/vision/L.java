package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class L {
    public static final java.lang.String TAG = "Vision";

    public static int v(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 2)) {
            return android.util.Log.v(TAG, java.lang.String.format(str, objArr));
        }
        return 0;
    }

    public static int d(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 3)) {
            return android.util.Log.d(TAG, java.lang.String.format(str, objArr));
        }
        return 0;
    }

    public static int d(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 3)) {
            return android.util.Log.d(TAG, java.lang.String.format(str, objArr), th);
        }
        return 0;
    }

    public static int i(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 4)) {
            return android.util.Log.i(TAG, java.lang.String.format(str, objArr));
        }
        return 0;
    }

    public static int e(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 6)) {
            return android.util.Log.e(TAG, java.lang.String.format(str, objArr));
        }
        return 0;
    }

    public static int e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable(TAG, 6)) {
            return 0;
        }
        if (android.util.Log.isLoggable(TAG, 3)) {
            return android.util.Log.e(TAG, java.lang.String.format(str, objArr), th);
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        java.lang.String strValueOf = java.lang.String.valueOf(th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 2 + java.lang.String.valueOf(strValueOf).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(strValueOf);
        return android.util.Log.e(TAG, sb.toString());
    }

    public static int w(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(TAG, 5)) {
            return android.util.Log.w(TAG, java.lang.String.format(str, objArr));
        }
        return 0;
    }

    public static int w(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable(TAG, 5)) {
            return 0;
        }
        if (android.util.Log.isLoggable(TAG, 3)) {
            return android.util.Log.w(TAG, java.lang.String.format(str, objArr), th);
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        java.lang.String strValueOf = java.lang.String.valueOf(th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 2 + java.lang.String.valueOf(strValueOf).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(strValueOf);
        return android.util.Log.w(TAG, sb.toString());
    }
}
