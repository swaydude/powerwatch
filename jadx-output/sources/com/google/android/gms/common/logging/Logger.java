package com.google.android.gms.common.logging;

/* JADX INFO: loaded from: classes.dex */
public class Logger {
    private final java.lang.String mTag;
    private final java.lang.String zzei;
    private final com.google.android.gms.common.internal.GmsLogger zzew;
    private final int zzex;

    /* JADX WARN: Illegal instructions before constructor call */
    public Logger(java.lang.String str, java.lang.String... strArr) {
        java.lang.String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            string = sb.toString();
        }
        this(str, string);
    }

    private Logger(java.lang.String str, java.lang.String str2) {
        this.zzei = str2;
        this.mTag = str;
        this.zzew = new com.google.android.gms.common.internal.GmsLogger(str);
        int i = 2;
        while (7 >= i && !android.util.Log.isLoggable(this.mTag, i)) {
            i++;
        }
        this.zzex = i;
    }

    public boolean isLoggable(int i) {
        return this.zzex <= i;
    }

    public void v(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            android.util.Log.v(this.mTag, format(str, objArr));
        }
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(3)) {
            android.util.Log.d(this.mTag, format(str, objArr));
        }
    }

    public void i(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.i(this.mTag, format(str, objArr));
    }

    public void w(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.w(this.mTag, format(str, objArr));
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(this.mTag, format(str, objArr));
    }

    public void e(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        android.util.Log.e(this.mTag, format(str, objArr), th);
    }

    public void wtf(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        android.util.Log.wtf(this.mTag, format(str, objArr), th);
    }

    public void wtf(java.lang.Throwable th) {
        android.util.Log.wtf(this.mTag, th);
    }

    private final java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.zzei.concat(str);
    }
}
